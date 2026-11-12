PENGELOLAAN DATA NILAI MAHASISWA

Program ini dibuat menggunakan Java untuk mengelola data nilai mahasiswa dengan konsep Pemrograman Berorientasi Objek (PBO). Program menerima input nama, NIM, dan nilai mahasiswa. Data divalidasi, kemudian digunakan untuk menentukan grade, status kelulusan, nilai rata-rata, serta jumlah mahasiswa yang lulus dan tidak lulus. Hasilnya disimpan dalam laporan_nilai.txt.

STRUKTUR PROGRAM
praktikumPBO07
- src
  - app
    - Main.java
  - model
    - Mahasiswa.java
    - NilaiInvalidException.java
- laporan_nilai.txt
- README.md

PENJELASAN FILE
1. Main.java
Merupakan kelas utama untuk menerima input, memvalidasi data, mengolah nilai, menampilkan hasil, dan menyimpan laporan.

2. Mahasiswa.java
Digunakan untuk menyimpan nama, NIM, dan nilai mahasiswa. Memiliki method untuk menentukan grade dan status kelulusan serta konstanta FINAL_PASSING_GRADE sebesar 70.0.

3. NilaiInvalidException.java
Merupakan Custom Exception untuk menangani nilai di luar rentang 0 sampai 100.

PENERAPAN MATERI PBO
1. Package dan Class: Menggunakan package app dan model untuk mengelompokkan kelas.
2. Encapsulation: Atribut nama, NIM, dan nilai menggunakan private serta getter.
3. Final: Menggunakan FINAL_PASSING_GRADE sebagai batas kelulusan.
4. Percabangan dan Perulangan: Menggunakan if-else, for, while, dan for-each.
5. Assertion: Memeriksa agar NIM tidak kosong dengan opsi VM -ea.
6. Custom Exception: Menangani nilai yang kurang dari 0 atau lebih dari 100.
7. Manipulasi String dan Character: Menggunakan trim(), toUpperCase(), dan Character.isDigit().
8. Collection: Menggunakan ArrayList, add(), dan size() untuk mengelola objek mahasiswa.
9. Input dan Output File: Menggunakan Scanner, BufferedWriter, dan FileWriter.
10. Exception Handling: Menggunakan try-catch dan try-with-resources.

KETENTUAN GRADE DAN KELULUSAN
85 sampai 100: A
75 sampai 84: B
60 sampai 74: C
Di bawah 60: D
Nilai minimum kelulusan adalah 70. Nilai 70 atau lebih dinyatakan LULUS, sedangkan nilai di bawah 70 dinyatakan TIDAK LULUS.

HASIL PROGRAM
Program menampilkan nama, NIM, nilai, grade, status kelulusan, nilai rata-rata, jumlah mahasiswa lulus, dan jumlah mahasiswa tidak lulus. Hasil pengolahan juga disimpan dalam laporan_nilai.txt.

KESIMPULAN
Program ini dibuat untuk memenuhi tugas Pengganti Pertemuan 7 mata kuliah Pemrograman Berorientasi Objek dengan menerapkan class, object, package, encapsulation, final, percabangan, perulangan, Assertion, Custom Exception, manipulasi String, Collection, dan Java I/O.