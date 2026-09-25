# Sistem Data Mahasiswa - Java  
  
Program ini merupakan program Java sederhana dengan studi kasus **Sistem Data Mahasiswa**. Program dibuat untuk memenuhi ketentuan Lab Session dengan menerapkan konsep dasar pemrograman berorientasi objek (PBO).  
Program dapat menerima data mahasiswa berupa nama, NIM, dan nilai. Data tersebut kemudian diproses untuk menampilkan informasi mahasiswa serta menentukan status kelulusan berdasarkan nilai KKM.  
  
## Tujuan  
  
Program ini dibuat untuk menerapkan beberapa konsep dasar Java, yaitu:  
1. Class dan Object  
2. Constructor  
3. Konstanta (`final`)  
4. Kondisional (`if-else`)  
5. Looping (`for`)  
6. Exception Handling (`try-catch`)  
7. Character dan String  
8. Array  
9. Object dan output program  
  
## Struktur Program  
  
Program terdiri dari dua class:  
  
### 1. `Mahasiswa.java`  
  
Class `Mahasiswa` digunakan sebagai rancangan atau cetakan object mahasiswa.  
Class ini memiliki beberapa atribut:  
- `nama` untuk menyimpan nama mahasiswa  
- `nim` untuk menyimpan NIM mahasiswa  
- `nilai` untuk menyimpan nilai mahasiswa  
  
Class `Mahasiswa` juga memiliki constructor dan dua method, yaitu:  
- `tampilkanData()` untuk menampilkan data mahasiswa  
- `cekKelulusan()` untuk menentukan status kelulusan mahasiswa  
  
### 2. `Main.java`  
  
Class `Main` merupakan class utama yang digunakan untuk menjalankan program.  
Class ini digunakan untuk:  
- menerima input dari pengguna menggunakan `Scanner`  
- mengolah data String dan Character  
- membuat object dari class `Mahasiswa`  
- menyimpan beberapa object menggunakan array  
- melakukan perulangan menggunakan `for`  
- menangani error menggunakan `try-catch`  
- menampilkan hasil program ke layar  
  
## Penerapan Ketentuan Lab Session  
  
1. Class & Object  
Program menggunakan class `Mahasiswa` sebagai rancangan untuk membuat object mahasiswa. Object dibuat menggunakan `new Mahasiswa()` dan digunakan untuk menyimpan serta mengolah data mahasiswa.  
  
2. Constructor  
Constructor terdapat pada class `Mahasiswa` dan digunakan untuk memberikan nilai awal pada object. Data yang diberikan melalui constructor adalah nama, NIM, dan nilai mahasiswa.  
  
3. Konstanta  
Program menggunakan konstanta `KKM` dengan nilai 70.  
```java
final double KKM = 70;
Konstanta tersebut digunakan sebagai batas nilai untuk menentukan apakah mahasiswa lulus atau tidak.

4. Kondisional
Program menggunakan kondisional `if-else` pada method `cekKelulusan()`. Kondisional digunakan untuk menentukan status kelulusan mahasiswa berdasarkan nilai yang diperoleh. Jika nilai mahasiswa lebih besar atau sama dengan 70, maka program menampilkan status `LULUS`. Jika nilai kurang dari 70, maka program menampilkan status `TIDAK LULUS`.

5. Looping
Program menggunakan perulangan `for` untuk menampilkan data mahasiswa yang terdapat di dalam array. Perulangan dilakukan untuk mengambil data setiap mahasiswa secara berurutan sehingga data tidak perlu ditampilkan dengan menuliskan perintah yang sama berulang kali.

6. Exception Handling
Program menggunakan `try-catch` untuk menangani kesalahan yang mungkin terjadi saat pengguna memasukkan data. Jika terjadi kesalahan pada input, program akan menangkap error tersebut dan menampilkan pesan bahwa input yang dimasukkan tidak valid.

7. Character & String
Program menggunakan beberapa fungsi Character dan String untuk mengolah data nama mahasiswa. `charAt()` digunakan untuk mengambil karakter pertama dari nama, `toUpperCase()` digunakan untuk mengubah nama menjadi huruf kapital, `substring()` digunakan untuk mengambil sebagian karakter dari nama, dan `length()` digunakan untuk mengetahui jumlah karakter dalam nama.

8. Array
Array digunakan untuk menyimpan beberapa object mahasiswa dalam satu tempat. Array yang digunakan dalam program adalah:
```java
Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];

9. Object & Output
Program menggunakan object untuk menyimpan data dari setiap mahasiswa. Object dibuat dari class `Mahasiswa` menggunakan perintah `new Mahasiswa()`. Pada program ini terdapat tiga object mahasiswa yang memiliki data nama, NIM, dan nilai yang berbeda.
Object tersebut kemudian dimasukkan ke dalam array `daftarMahasiswa`. Setelah itu, data dari setiap object ditampilkan menggunakan method `tampilkanData()`, sedangkan method `cekKelulusan()` digunakan untuk menampilkan status kelulusan berdasarkan nilai mahasiswa. Hasil dari proses tersebut ditampilkan ke layar menggunakan `System.out.println()`.

=> Alur Program
Program dimulai dengan meminta pengguna memasukkan nama, NIM, dan nilai mahasiswa. Setelah data dimasukkan, program mengolah nama menggunakan beberapa fungsi String dan Character, seperti `charAt()`, `toUpperCase()`, `substring()`, dan `length()`. Selanjutnya, program membuat object dari class `Mahasiswa` menggunakan data yang sudah dimasukkan. Program juga membuat dua object mahasiswa lainnya sebagai data tambahan. Ketiga object tersebut kemudian disimpan ke dalam array `daftarMahasiswa`. Setelah semua data tersimpan, program menggunakan perulangan `for` untuk mengambil dan menampilkan data mahasiswa satu per satu. Setiap data ditampilkan menggunakan method `tampilkanData()`, kemudian program menjalankan method `cekKelulusan()` untuk menentukan apakah mahasiswa tersebut lulus atau tidak berdasarkan nilai KKM 70. Jika proses input mengalami kesalahan, program akan menjalankan `catch` dan menampilkan pesan bahwa input yang dimasukkan tidak valid. Setelah seluruh data selesai diproses dan ditampilkan, program selesai dijalankan.
