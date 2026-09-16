# 📱 Tugas-Pemweb-Beda-Halaman (Android App)

Aplikasi ini adalah proyek Android berbasis **Kotlin** yang mendemonstrasikan perpindahan dan pengelolaan data antar halaman (*Activity*). Aplikasi ini awalnya dirancang berdasarkan konsep pengiriman data teks sederhana[cite: 2], namun telah dikembangkan menjadi aplikasi profil mahasiswa dengan antarmuka yang modern dan fungsionalitas tingkat lanjut[cite: 1].

## ✨ Fitur Utama

*   **Desain Material Modern:** Menggunakan `TextInputLayout` dan `CardView` untuk tampilan *form* dan kartu profil yang elegan.
*   **Explicit Intent:** Mengirim kumpulan data kompleks (Nama, NRP, Jurusan, Gender, dan URI Foto) dari halaman input[cite: 2] menuju halaman hasil profil[cite: 1].
*   **Akses Galeri (Image Picker):** Memanfaatkan `ActivityResultLauncher` untuk memilih foto profil secara aman dari memori perangkat pengguna.
*   **Implicit Intent (Bagikan Data):** Menyediakan fitur *Share* menggunakan `ACTION_SEND` untuk mengirim teks profil ke aplikasi lain seperti WhatsApp atau Gmail.
*   **Manajemen Siklus Hidup (Lifecycle):** Menerapkan fungsi `finish()` untuk menutup halaman dengan aman dan pembuktian pembersihan memori melalui pengamatan logcat pada `onDestroy()`.
*   **Validasi Input:** Pencegahan *error* dengan memastikan kolom wajib isi tidak dibiarkan kosong oleh pengguna.

## 🚀 Teknologi yang Digunakan

*   **Bahasa Pemrograman:** Kotlin
*   **Platform Utama:** Android SDK
*   **Desain Antarmuka:** XML (Material Design Components)
*   **Lingkungan Pengembangan:** Android Studio

## 💡 Cara Menjalankan Aplikasi

1.  Unduh atau lakukan *clone* pada repositori ini ke dalam komputer Anda.
2.  Buka folder proyek **Tugas-Pemweb-Beda-Halaman** menggunakan aplikasi **Android Studio**.
3.  Tunggu beberapa saat hingga proses sinkronisasi **Gradle** selesai sepenuhnya.
4.  Jalankan aplikasi dengan menekan tombol **Run (Shift + F10)**.
5.  Pilih *Emulator* bawaan atau hubungkan *smartphone* Android fisik Anda melalui kabel USB.
