Program Pengelolaan Nilai Mahasiswa

## 1. Deskripsi Program

Program Pengelolaan Nilai Mahasiswa merupakan aplikasi berbasis Java yang digunakan untuk menginput, mengelola, dan menampilkan data nilai mahasiswa melalui konsol. Program ini menerapkan konsep Object-Oriented Programming (OOP) serta berbagai fitur Java, seperti class, object, encapsulation, exception handling, collection, dan file I/O.

Data mahasiswa yang dimasukkan meliputi nama, NIM, dan nilai. Program kemudian menentukan grade, status kelulusan, serta menghitung rata-rata nilai seluruh mahasiswa. Hasil pengolahan data juga disimpan ke dalam file teks bernama `laporan_nilai.txt`.

## 2. Tujuan Program

- Mengelola data nilai mahasiswa melalui input konsol.
- Melakukan validasi terhadap NIM dan nilai mahasiswa.
- Menentukan grade berdasarkan nilai yang diperoleh.
- Menentukan status kelulusan mahasiswa.
- Menghitung jumlah mahasiswa dan rata-rata nilai.
- Menyimpan hasil pengolahan data ke dalam file teks.
- Menerapkan konsep OOP dan fitur-fitur pemrograman Java.

## 3. Struktur Program

Program terdiri dari dua package, yaitu `app` dan `model`, dengan susunan sebagai berikut:

- **app**
  - `Main.java` : Class utama yang menangani input data, validasi NIM, pengolahan data, penampilan hasil, perhitungan rata-rata, dan penyimpanan laporan.

- **model**
  - `Mahasiswa.java` : Class yang menyimpan atribut nama, NIM, dan nilai mahasiswa serta menyediakan method untuk menentukan grade dan status kelulusan.
  - `NilaiInvalidException.java` : Class exception khusus untuk menangani nilai mahasiswa yang berada di luar rentang 0 sampai 100.

- `pom.xml` : File konfigurasi project Maven.
- `README.md` : Dokumentasi program.
- `laporan_nilai.txt` : File laporan yang dihasilkan setelah program dijalankan.

## 4. Penjelasan Class dan Fungsinya

### a. Class Mahasiswa

Class `Mahasiswa` digunakan untuk merepresentasikan data setiap mahasiswa. Class ini memiliki tiga atribut, yaitu nama, NIM, dan nilai yang bersifat private.

Class ini juga memiliki constructor untuk menginisialisasi data, getter untuk mengakses atribut, serta method `getGrade()` untuk menentukan nilai huruf dan `isLulus()` untuk menentukan status kelulusan.

Konstanta `FINAL_PASSING_GRADE` digunakan sebagai batas nilai kelulusan, yaitu 70.

### b. Class NilaiInvalidException

Class `NilaiInvalidException` merupakan exception khusus yang dibuat dengan mewarisi class `Exception`. Class ini digunakan untuk memberikan penanganan apabila nilai mahasiswa kurang dari 0 atau lebih dari 100.

### c. Class Main

Class `Main` merupakan class utama yang menjalankan seluruh proses program. Class ini menggunakan Scanner untuk menerima input, ArrayList untuk menampung data mahasiswa, serta BufferedWriter dan FileWriter untuk menyimpan laporan ke dalam file teks.