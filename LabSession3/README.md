Kasir Kantin UNS
Aplikasi kasir sederhana berbasis Java Swing yang dibuat untuk Praktikum PBO Kelas 3B, Pertemuan 11 (Multithreading) dan Pertemuan 12 (GUI Programming). Aplikasi dikerjakan bertahap dari Tahap 1 sampai Tahap 4, dan seluruh class berada dalam satu package, yaitu lab.kasir.

Deskripsi
Kantin UNS membutuhkan aplikasi kasir sederhana berbasis jendela. Kasir memasukkan nama menu, harga, dan jumlah, lalu aplikasi menghitung total bayar. Jika subtotal lebih dari Rp 50.000, pelanggan mendapat diskon 10 persen. Selain itu, aplikasi memiliki simulasi dua kasir yang melayani pelanggan secara bersamaan dan fitur cetak struk yang tidak membuat jendela macet.

Struktur Project
Project terdiri dari empat file di dalam package lab.kasir:
Pesanan.java berisi logika perhitungan pesanan (Tahap 1).
Kasir.java berisi class kasir yang berjalan sebagai thread (Tahap 2).
MainKasir.java berisi program utama untuk menguji Tahap 1 dan Tahap 2.
KasirFrame.java berisi tampilan GUI dan fitur cetak struk (Tahap 3 dan Tahap 4).

Tahap 1: Class Logika
Class Pesanan menyimpan satu atribut subtotal bertipe double yang dibuat private sebagai penerapan enkapsulasi. Nilainya hanya bisa diubah dan dibaca lewat method.
Method tambahItem(harga, jumlah) menambahkan hasil harga dikali jumlah ke subtotal, sedangkan getSubtotal() membaca nilainya. Method hitungTotal() mengembalikan subtotal dikurangi diskon 10 persen jika subtotal lebih dari 50.000, dan mengembalikan subtotal apa adanya jika tidak. Method reset() mengembalikan subtotal ke 0.
Pengujian dilakukan di MainKasir dengan tiga menu: Nasi Goreng (15.000 x 2), Es Teh (5.000 x 3), dan Ayam Bakar (25.000 x 1). Setelah dua menu pertama, total adalah 45.000 tanpa diskon. Setelah menu ketiga, subtotal menjadi 70.000 dan total menjadi 63.000 karena mendapat diskon 10 persen. Hasil ini sesuai dengan yang diharapkan.

Tahap 2: Dua Kasir sebagai Thread
Class Kasir meng-extend Thread. Pada method run(), kasir mencetak kalimat "Kasir (nama) melayani pelanggan ke-(i)" sebanyak lima kali, dengan jeda 500 milidetik di setiap pelanggan menggunakan Thread.sleep(500).
Di MainKasir, dibuat dua kasir, yaitu Dina dan Eko, lalu keduanya dijalankan dengan start() sehingga berjalan bersamaan. Setelah itu dipanggil join() untuk kedua kasir agar thread main menunggu sampai keduanya selesai, baru mencetak "Semua pelanggan selesai dilayani".
Program dijalankan dua kali untuk melihat apakah urutan output selalu sama. Hasilnya, urutan output Dina dan Eko bisa berbeda di setiap percobaan. Hal ini terjadi karena penjadwalan thread diatur oleh JVM dan sistem operasi, bukan oleh programmer, sehingga tidak ada jaminan thread mana yang tampil lebih dulu. Sementara itu, kalimat "Semua pelanggan selesai dilayani" selalu muncul paling akhir karena join() memaksa main menunggu kedua kasir selesai.

Tahap 3: Tampilan GUI Kasir
Class KasirFrame meng-extend JFrame dan dibuat dengan Java Swing. Layout diatur menjadi null sehingga posisi setiap komponen ditentukan manual dengan setBounds(). Komponen yang dibuat meliputi judul, field Nama Menu, Harga, dan Jumlah, tombol Tambah dan Hitung Total, area struk berupa JTextArea, serta label Total Bayar.
Tombol Tambah mengambil isi field harga dan jumlah, memanggil pesanan.tambahItem(...), menulis satu baris ke area struk, lalu mengosongkan field. Tombol Hitung Total menampilkan hasil pesanan.hitungTotal() pada label total.
Untuk validasi, jika ada field yang kosong atau harga dan jumlah bukan angka, aplikasi menampilkan pesan peringatan dengan JOptionPane.showMessageDialog. Konversi angka dibungkus try-catch untuk menangani NumberFormatException.
Dengan data uji dari Tahap 1, label total menampilkan Rp 63.000 setelah ketiga menu ditambahkan.

Tahap 4: Tombol Cetak Struk dengan Thread
Pada tahap ini ditambahkan tombol Cetak Struk dan sebuah label status di bawah jendela. Saat tombol ditekan, label menampilkan "Mencetak struk...", menunggu 2 detik, lalu berubah menjadi "Struk selesai".
Penantian 2 detik dilakukan di thread baru yang dijalankan dengan start(). Jika penantian dilakukan langsung di thread GUI, jendela akan macet selama 2 detik. Dengan thread terpisah, tombol Tambah dan Hitung Total tetap bisa ditekan selama proses cetak berjalan. Perubahan teks label dilakukan lewat SwingUtilities.invokeLater agar tetap aman terhadap thread GUI.

Cara Menjalankan
Buka project di NetBeans. Untuk Tahap 1 dan 2, klik kanan MainKasir.java lalu pilih Run File (Shift+F6). Untuk Tahap 3 dan 4, klik kanan KasirFrame.java lalu pilih Run File (Shift+F6).

Kesimpulan
Aplikasi Kasir Kantin UNS berhasil dibuat sesuai Tahap 1 sampai Tahap 4. Logika pesanan menghitung total dengan diskon 10 persen untuk subtotal di atas Rp 50.000, dua kasir berjalan bersamaan sebagai thread, GUI Swing berfungsi lengkap dengan validasi input, dan fitur cetak struk berjalan di thread terpisah sehingga jendela tetap responsif.