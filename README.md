# Sistem Penyewaan Kendaraan

## 1. Deskripsi Program
Sistem Penyewaan Kendaraan merupakan program sederhana berbasis Java yang dibuat untuk membantu menggambarkan proses penyewaan kendaraan, khususnya mobil dan motor. Program ini dapat menampilkan informasi kendaraan serta menghitung biaya penyewaan berdasarkan jumlah hari penyewaan.
Dalam program ini, setiap kendaraan memiliki informasi berupa nama kendaraan, nomor plat, dan harga sewa per hari. Selain itu, terdapat perbedaan karakteristik antara mobil dan motor yang ditampilkan melalui masing-masing kelas. Pengguna juga dapat melihat perhitungan biaya penyewaan, termasuk perhitungan biaya dengan tambahan diskon.
Program ini dikembangkan sebagai bentuk penerapan konsep Object-Oriented Programming (OOP) dalam bahasa Java. Melalui program ini, beberapa konsep utama OOP, seperti Encapsulation, Inheritance, Polymorphism, Abstraction, dan Interface, diterapkan secara langsung dalam penyusunan kelas dan method.

## 2. Tujuan Pembuatan Program
Tujuan pembuatan program Sistem Penyewaan Kendaraan adalah sebagai berikut:
1. Memahami penerapan konsep Object-Oriented Programming (OOP) menggunakan bahasa pemrograman Java.
2. Menerapkan konsep Encapsulation untuk melindungi atribut pada setiap kelas.
3. Memahami hubungan antara superclass dan subclass melalui konsep Inheritance.
4. Menerapkan Polymorphism menggunakan method overriding dan overloading.
5. Memahami penggunaan Abstract Class dan Abstract Method dalam pembuatan struktur program.
6. Menerapkan Interface sebagai bentuk aturan method yang harus diimplementasikan oleh kelas.
7. Mengembangkan program sederhana yang memiliki hubungan antarkelas dan dapat dijalankan sesuai dengan fungsinya.

## 3. Fitur Program
Program Sistem Penyewaan Kendaraan memiliki beberapa fitur utama, yaitu:
- **Menampilkan Informasi Kendaraan**  
  Program dapat menampilkan informasi kendaraan yang terdiri dari nama kendaraan, nomor plat, harga sewa, serta informasi tambahan sesuai jenis kendaraannya.
- **Perhitungan Biaya Penyewaan**  
  Program dapat menghitung total biaya penyewaan berdasarkan harga sewa kendaraan dan jumlah hari penyewaan.
- **Perhitungan Biaya dengan Diskon**  
  Program menyediakan perhitungan biaya penyewaan menggunakan parameter tambahan berupa persentase diskon.
- **Pengelolaan Data Kendaraan**  
  Data kendaraan dikelola melalui atribut dan method yang terdapat pada masing-masing kelas.
- **Penggunaan Berbagai Jenis Kendaraan**  
  Program menggunakan dua jenis kendaraan, yaitu mobil dan motor, yang memiliki karakteristik dan implementasi method masing-masing.

## 4. Konsep Object-Oriented Programming (OOP) yang Diterapkan
Dalam pembuatan program ini, terdapat lima konsep utama OOP yang diterapkan, yaitu:

### 4.1 Encapsulation
Encapsulation merupakan konsep untuk membatasi akses langsung terhadap atribut suatu kelas. Pada program ini, atribut seperti `nama`, `nomorPlat`, dan `hargaSewa` pada kelas `Kendaraan` menggunakan access modifier `private`.
Untuk mengakses dan mengubah nilai atribut tersebut, digunakan method getter dan setter. Dengan demikian, data kendaraan dapat dikelola melalui method yang telah disediakan tanpa harus mengakses atribut secara langsung.
### 4.2 Inheritance
Inheritance merupakan konsep pewarisan sifat dan method dari suatu kelas kepada kelas turunannya. Pada program ini, kelas `Kendaraan` berperan sebagai superclass, sedangkan kelas `Mobil` dan `Motor` berperan sebagai subclass.
Kedua subclass menggunakan keyword `extends` untuk mewarisi atribut dan method dari kelas `Kendaraan`. Selain itu, constructor pada kelas turunan menggunakan keyword `super()` untuk memanggil constructor superclass.
### 4.3 Polymorphism
Polymorphism merupakan konsep yang memungkinkan suatu method memiliki bentuk perilaku yang berbeda sesuai dengan objek yang menggunakannya.
Pada program ini, Polymorphism diterapkan melalui dua cara:
- **Method Overriding:** Kelas `Mobil` dan `Motor` mengimplementasikan kembali method `tampilkanInfo()` dan `hitungBiayaSewa()` dengan isi yang disesuaikan dengan masing-masing jenis kendaraan.
- **Method Overloading:** Kelas `Kendaraan` memiliki dua method dengan nama `hitungBiayaSewa`, tetapi menggunakan parameter yang berbeda. Method pertama menerima jumlah hari, sedangkan method kedua menerima jumlah hari dan persentase diskon.
Selain itu, program menggunakan referensi superclass `Kendaraan` untuk menyimpan objek dari subclass `Mobil` dan `Motor`. Hal ini menunjukkan penerapan Runtime Polymorphism.
### 4.4 Abstraction
Abstraction merupakan konsep untuk menyembunyikan detail implementasi dan hanya menampilkan bagian penting dari suatu objek.
Pada program ini, kelas `Kendaraan` dibuat sebagai abstract class. Kelas tersebut memiliki abstract method `tampilkanInfo()` yang harus diimplementasikan oleh kelas turunannya.
Dengan adanya abstract class, kelas `Mobil` dan `Motor` memiliki struktur dasar yang sama, tetapi tetap dapat memberikan informasi sesuai dengan karakteristik masing-masing kendaraan.
### 4.5 Interface
Interface merupakan struktur yang digunakan untuk mendefinisikan method yang harus disediakan oleh kelas yang mengimplementasikannya.
Pada program ini, interface `DapatDisewa` memiliki method `hitungBiayaSewa(int hari)`. Interface tersebut kemudian diimplementasikan oleh kelas `Kendaraan` menggunakan keyword `implements`.
Dengan demikian, setiap jenis kendaraan yang merupakan turunan dari `Kendaraan` memiliki kemampuan untuk menghitung biaya penyewaan.

## 5. Struktur File Program
Program ini terdiri dari lima file Java yang memiliki fungsi masing-masing, yaitu:
1. **DapatDisewa.java**  
   Merupakan interface yang mendefinisikan method `hitungBiayaSewa(int hari)` sebagai aturan perhitungan biaya penyewaan kendaraan.
2. **Kendaraan.java**  
   Merupakan abstract class yang berfungsi sebagai superclass. Kelas ini menyimpan atribut dasar kendaraan, menyediakan getter dan setter, serta mendefinisikan abstract method `tampilkanInfo()`.
3. **Mobil.java**  
   Merupakan subclass dari `Kendaraan` yang digunakan untuk merepresentasikan kendaraan jenis mobil. Kelas ini memiliki atribut tambahan berupa jumlah kursi dan mengimplementasikan method sesuai karakteristik mobil.
4. **Motor.java**  
   Merupakan subclass dari `Kendaraan` yang digunakan untuk merepresentasikan kendaraan jenis motor. Kelas ini memiliki atribut tambahan berupa jenis motor dan mengimplementasikan method sesuai karakteristik motor.
5. **Main.java**  
   Merupakan kelas utama yang digunakan untuk menjalankan program. Di dalam kelas ini dibuat beberapa objek mobil dan motor, kemudian informasi serta biaya penyewaannya ditampilkan melalui pemanggilan method.

## 6. Alur Kerja Program
Secara umum, program Sistem Penyewaan Kendaraan berjalan melalui beberapa tahapan berikut:
1. Program dimulai melalui method `main()` yang terdapat pada kelas `Main`.
2. Program membuat objek kendaraan dari kelas `Mobil` dan `Motor`.
3. Setiap objek memiliki data berupa nama kendaraan, nomor plat, harga sewa, serta atribut tambahan sesuai jenis kendaraannya.
4. Objek kendaraan disimpan menggunakan array dengan tipe referensi superclass `Kendaraan`.
5. Program melakukan perulangan untuk menampilkan informasi setiap kendaraan melalui method `tampilkanInfo()`.
6. Program menghitung biaya penyewaan berdasarkan jumlah hari yang telah ditentukan.
7. Program juga melakukan perhitungan biaya penyewaan menggunakan method overloading dengan tambahan parameter diskon.
8. Setelah seluruh informasi dan hasil perhitungan ditampilkan, program selesai dijalankan.

## 7. Kesimpulan
Program Sistem Penyewaan Kendaraan merupakan implementasi sederhana dari konsep Object-Oriented Programming (OOP) menggunakan bahasa Java. Melalui program ini, konsep Encapsulation, Inheritance, Polymorphism, Abstraction, dan Interface diterapkan dalam beberapa kelas yang saling berhubungan.

Penggunaan superclass, subclass, abstract class, dan interface membantu membentuk struktur program yang lebih terorganisasi. Selain itu, penerapan method overriding dan overloading menunjukkan bahwa suatu method dapat memiliki perilaku yang berbeda sesuai kebutuhan program.

Dengan dibuatnya program ini, diharapkan pemahaman mengenai penerapan konsep OOP dalam Java dapat meningkat, khususnya dalam membangun program sederhana yang memiliki struktur kelas dan hubungan objek yang jelas.
