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
  
1. Class & Object  -> Class `Mahasiswa` dan object `new Mahasiswa()`
2. Constructor -> Constructor `Mahasiswa()` 
3. Konstanta -> `final double KKM = 70`  
4. Kondisional -> `if-else` pada method `cekKelulusan()`
5. Looping -> Perulangan `for` pada array mahasiswa  
6. Exception Handling -> `try-catch` untuk menangani kesalahan input  
7. Character & String -> `charAt()`, `toUpperCase()`, `substring()`, dan `length()` 
8. Array -> Array `Mahasiswa[] daftarMahasiswa`  
9. Object & Output -> Object mahasiswa dibuat dan hasil ditampilkan dengan `System.out.println()`  
 
## Alur Program 
Alur program secara sederhana adalah: 
 
```text 
Program dimulai 
      ↓ 
Input nama, NIM, dan nilai 
      ↓ 
Pengolahan Character & String 
      ↓ 
Membuat object Mahasiswa 
      ↓ 
Menyimpan object ke dalam Array 
      ↓ 
Melakukan looping 
      ↓ 
Menampilkan data mahasiswa 
      ↓ 
Mengecek status kelulusan 
      ↓ 
Program selesai buatkan bagian tabelnya dihilangkan tapi dibikin kalimat  aja
