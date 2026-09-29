**Sistem Perpustakaan Mini**



Sistem Perpustakaan Mini merupakan aplikasi berbasis Java yang digunakan untuk mengelola data buku dan anggota perpustakaan. Program ini dibuat dengan menerapkan konsep Object-Oriented Programming (OOP) serta beberapa fitur Java seperti ArrayList, HashMap, Exception, Assertion, Character, dan String.



Program memiliki fitur untuk menampilkan data buku dan anggota, mencari buku berdasarkan judul, melakukan peminjaman dan pengembalian buku, serta menampilkan analisis sederhana mengenai koleksi dan aktivitas peminjaman.



**Fitur Program:**

1. **Menampilkan Data Buku**
Menampilkan seluruh data buku seperti judul, penulis, tahun terbit, kategori, status ketersediaan, dan jumlah peminjaman.
2. **Menampilkan Data Anggota**
Menampilkan ID anggota, nama, total pinjaman, inisial nama, serta daftar buku yang sedang dipinjam.
3. **Pencarian Buku**
Buku dapat dicari berdasarkan judul menggunakan toLowerCase() dan constains().
4. **Peminjaman Buku**
Anggota dapat meminjam buku yang tersedia dengan batas maksimal 3 buku.
5. **Pengembalian Buku**
Buku yang sedang dipinjam dapat dikembalikan dan status buku akan berubah menjadi tersedia.
6. **Analisis Koleksi**
Menampilkan jumlah seluruh buku, jumlah buku berdasarkan kategori, jumlah peminjaman berdasarkan kategori, jumlah buku yang sedang dipinjam, dan jumlah buku yang tersedia.
7. **Exception Handling**
Digunakan untuk menangani kondisi seperti buku tidak ditemukan, batas peminjaman tercapai, dan input yang tidak sesuai.
8. **Assertion**

&#x20;  Digunakan untuk melakukan validasi terhadap ID anggota dan judul buku agar tidak kosong.



**Struktur Class:**

1. **Book**
digunakan untuk menyimpan informasi buku.
Attribute:
- judul
- penulis
- tahunTerbit
- kategori
- statusKetersediaan
- jumlahDipinjam
Class ini memiliki constructor, getter, setter, serta method untuk menampilkan informasi dan menambah jumlah pinjaman.
2. **Member**
digunakan untuk menyimpan data anggota perpustakaan.
Attribute:
- id
- nama
- daftarPinjaman
- totalPinjaman
Class ini menggunakan ArrayList<Book> untuk menyimpan daftar buku yang sedang dipinjam anggota.
3. **Library**
digunakan untuk mengelola data dan anggota secara sederhana.
Fungsinya meluputi:
- Menambah buku
- Menambah anggota
- Menampilkan daftar buku
- Menampilkan daftar anggota
- Mencari buku
- Meminjam buku
- Mengambalikan buku
4. **LibraryService**
digunakan untuk menangani pengelolaan perpustakaan yang lebih lengkap.
Fungsinya meliputi:
- Menambah buku dan anggota
- Mencari buku berdasarkan judul
- Menampilakan seluruh buku dan anggota
- Peminjaman dan pengembalian buku
- Menghitung jumlah buku berdasarkan kategori
- Menghitung jumlah peminjaman berdasarkan kategori
- Menampilkan analisis koleksi
5. **BookNotFoundException**
Class exception khusus yang digunakan ketika buku yang dicari tidak ditemukan. Class ini merupakan turunan dari Exception.
6. **BorrowLimitExceededException**
Class exception khusus yang digunakan ketika anggota telah mencapai batas maksimal 3 buku yang dapat dipinjam.Class ini juga merupakan turunan dari Exception.
7. **MainApp**
merupakan class Utama untuk menjalankan program. Class ini menggunakan Scanner untuk meneriman input pengguna dan menyediakan menu:
- Tampilakan buku
- Tampilkan anggota
- Cari buku
- Pinjam buku
- Kembalikan buku
- Analisis koleksi
- Keluar



**Alur Penggunaan Program**

Program dialankan melalui MainApp. setelah program berjalan, pengguna akan melihat menu Utama dan dapat memilih fitur yang tersedia. Pada proses peminjaman, pengguna memasukkan ID anggota dan judul buku. Sistem akan memeriksa data anggota, mencari buku, mengecek ketersediaan buku, dan mngecek batas maksimal pinjaman. Jika semua kondisi terpenuhi, buku akan ditambahkan ke daftar pinjaman anggota.

Pada proses pengembalian, system memeriksa anggota dan buku yang ingin dikembalikan. Jika buku terdapat dalam daftar pinjaman anggota, buku akan dihapus dari daftar pinjaman dan statusnya berubah menjadi tersedia.

Menu analisis digunakan untuk melihat jumlah koleksi buku, jumlah buku berdasarkan kategori, aktivitas peminjaman, serta jumlah buku yang tersedia dan sedang dipinjam.



**Konsep Pemrograman**

* Object-Oriented Programming(OOP)
* Class dan Object
* Constructor
* Encapsulation
* ArrayList
* HashMap
* Conditional dan Looping
* Exception Handling
* Assertion
* String dan Character
* Primitive dan Reference Data Type

