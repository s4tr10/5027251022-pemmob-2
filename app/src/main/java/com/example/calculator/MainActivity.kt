package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvDisplay: TextView
    private var isNewOperator = true
    private var oldNumber = ""
    private var operator = "+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDisplay = findViewById(R.id.tvDisplay)
    }

    // Fungsi dipanggil saat tombol angka (0-9) dan titik (.) ditekan
    fun onDigitClick(view: View) {
        if (isNewOperator) {
            tvDisplay.text = ""
        }
        isNewOperator = false

        val button = view as Button
        val buttonText = button.text.toString()
        var currentDisplay = tvDisplay.text.toString()

        // Mencegah dua titik desimal dalam satu angka
        if (buttonText == "." && currentDisplay.contains(".")) return

        // Jika layar masih "0" dan user menekan angka (bukan titik), timpa "0"
        if (currentDisplay == "0" && buttonText != ".") {
            currentDisplay = ""
        }

        tvDisplay.text = currentDisplay + buttonText
    }

    // Fungsi dipanggil saat tombol operator (+, -, *, /) ditekan
    fun onOperatorClick(view: View) {
        val button = view as Button
        operator = button.text.toString()
        oldNumber = tvDisplay.text.toString()
        isNewOperator = true
    }

    // Fungsi dipanggil saat "=" ditekan
    fun onEqualClick(view: View) {
        val newNumber = tvDisplay.text.toString()
        var result = 0.0

        if (oldNumber.isNotEmpty() && newNumber.isNotEmpty()) {
            when (operator) {
                "+" -> result = oldNumber.toDouble() + newNumber.toDouble()
                "-" -> result = oldNumber.toDouble() - newNumber.toDouble()
                "*" -> result = oldNumber.toDouble() * newNumber.toDouble()
                "/" -> {
                    // Pencegahan dibagi dengan 0
                    if(newNumber.toDouble() != 0.0) {
                        result = oldNumber.toDouble() / newNumber.toDouble()
                    } else {
                        tvDisplay.text = "Error"
                        isNewOperator = true
                        return
                    }
                }
            }

            // Hapus ".0" di belakang hasil jika bulat (contoh: 5.0 jadi 5)
            val resultStr = result.toString()
            if (resultStr.endsWith(".0")) {
                tvDisplay.text = resultStr.replace(".0", "")
            } else {
                tvDisplay.text = resultStr
            }

            isNewOperator = true
        }
    }

    // Menghapus semua (AC)
    fun onClearClick(view: View) {
        tvDisplay.text = "0"
        oldNumber = ""
        operator = ""
        isNewOperator = true
    }

    // Menghapus satu angka terakhir (DEL)
    fun onDeleteClick(view: View) {
        val text = tvDisplay.text.toString()
        if (text.isNotEmpty() && text != "0" && text != "Error") {
            tvDisplay.text = text.substring(0, text.length - 1)
            if (tvDisplay.text.isEmpty()) {
                tvDisplay.text = "0"
                isNewOperator = true
            }
        }
    }
}