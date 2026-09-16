# 🧮 My Calculator (Android App)

Aplikasi kalkulator sederhana bergaya modern (terinspirasi dari kalkulator bawaan Android/iOS) yang dibangun secara *native* untuk platform Android. Aplikasi ini menggunakan logika matematika dasar yang efisien tanpa memerlukan *library* pihak ketiga.

## ✨ Fitur Utama

* **Operasi Aritmatika Dasar:** Mendukung Penjumlahan (+), Pengurangan (-), Perkalian (*), dan Pembagian (/).
* **Desain UI Modern & Responsif:** Menggunakan perpaduan `RelativeLayout` dan `GridLayout` untuk susunan tombol yang rapi dan proporsional di berbagai ukuran layar, dipadukan dengan tema gelap (Dark Theme).
* **Manajemen Desimal Pintar:** Mencegah *user* memasukkan titik desimal ganda dalam satu bilangan.
* **Penanganan Error (Divide by Zero):** Mencegah aplikasi *crash* saat pengguna mencoba membagi angka dengan nol (0) dengan cara menampilkan pesan "Error" pada layar.
* **Fitur Penghapusan:** Dilengkapi tombol **AC** (All Clear) untuk mereset seluruh sesi perhitungan dan **DEL** (Delete) untuk menghapus satu karakter/angka terakhir.
* **Pembersihan Angka Desimal:** Menghilangkan angka `.0` di belakang koma jika hasil perhitungan merupakan bilangan bulat (contoh: hasil `5.0` akan ditampilkan sebagai `5`).

## 🚀 Teknologi yang Digunakan

* **Bahasa Pemrograman:** Kotlin
* **Antarmuka Pengguna (UI):** XML
* **Lingkungan Pengembangan:** Android Studio

## 📂 Struktur Folder Proyek

Berikut adalah struktur direktori utama pada proyek ini:

```text
MyCalculator/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/mycalculator/
│   │   │   │   └── MainActivity.kt        # File logika utama (Kotlin)
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml  # File tampilan antarmuka (XML)
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml         # Konfigurasi warna
│   │   │   │   │   ├── strings.xml        # Konfigurasi teks statis
│   │   │   │   │   └── themes.xml         # Tema aplikasi
│   │   │   │   ├── drawable/              # Aset gambar/ikon
│   │   │   │   └── mipmap/                # Ikon peluncur aplikasi (App Icon)
│   │   │   └── AndroidManifest.xml        # Konfigurasi perizinan & komponen inti
│   └── build.gradle.kts                   # Konfigurasi dependensi level modul
├── build.gradle.kts                       # Konfigurasi dependensi level proyek
└── README.md                              # Dokumentasi proyek
