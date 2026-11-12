### 1. Deskripsi Program
Program ini dibuat menggunakan Java untuk mengelola data nilai siswa. Pengguna dapat memasukkan jumlah siswa, nama, dan nilai melalui keyboard. Program akan menentukan status kelulusan berdasarkan nilai minimal 70. Data yang dimasukkan akan disimpan ke dalam file laporan_nilai.txt. Setelah itu, program membaca kembali isi file dan menampilkannya di console.

### 2. Fitur Program
1. Memasukkan jumlah siswa.
2. Memasukkan nama dan nilai setiap siswa.
3. Menentukan status kelulusan siswa.
4. Menghitung rata-rata nilai seluruh siswa.
5. Menghitung jumlah siswa yang lulus dan tidak lulus.
6. Menyimpan data ke file laporan_nilai.txt.
7. Membaca kembali isi file dan menampilkannya di console.

### 3. Ketentuan Kelulusan

| Nilai | Keterangan |
|---|---|
| 70 ke atas | Lulus |
| Di bawah 70 | Tidak Lulus |

### 4. Komponen Java yang Digunakan

| Komponen | Kegunaan |
|---|---|
| Scanner | Membaca input dari keyboard. |
| FileWriter | Menulis data ke file. |
| BufferedWriter | Membantu proses penulisan file. |
| FileReader | Membaca isi file. |
| BufferedReader | Membaca file baris demi baris. |
| readLine() | Membaca setiap baris sampai data habis. |
| try-catch | Menangani kesalahan program. |
| IOException | Menangani kesalahan saat membaca atau menulis file. |

### 5. File Output
Program menghasilkan file laporan_nilai.txt yang berisi:
- Nama siswa.
- Nilai siswa.
- Status kelulusan.
- Rata-rata nilai kelas.
- Jumlah siswa yang lulus.
- Jumlah siswa yang tidak lulus.

### 6. Pembacaan File
Setelah proses penulisan selesai, program membuka kembali file laporan_nilai.txt menggunakan FileReader dan BufferedReader.

Isi file dibaca baris demi baris menggunakan readLine() sampai tidak ada data lagi, kemudian ditampilkan ke console.

### 7. Penanganan Kesalahan
Program menggunakan try-catch untuk menangani kesalahan saat membaca dan menulis file. Penggunaan try-with-resources dapat membantu menutup file secara otomatis setelah proses selesai.

### 8. Kesimpulan
Program ini menerapkan dasar pemrograman Java procedural/fungsional untuk mengelola data nilai siswa. Program dapat menerima input, menentukan kelulusan, menghitung rata-rata, menyimpan data ke file, serta membaca kembali isi file untuk ditampilkan ke console.
