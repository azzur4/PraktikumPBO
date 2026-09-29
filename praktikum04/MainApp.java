/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum04;

import java.util.Scanner;

/**
 *
 * @author LOQ
 */
public class MainApp {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            LibraryService library = new LibraryService();

            // Data buku
            library.tambahBuku(new Book(
                    "Pemrograman Java",
                    "Budi",
                    2023,
                    "Pemrograman",
                    true
            ));

            library.tambahBuku(new Book(
                    "Basis Data",
                    "Naila",
                    2022,
                    "Database",
                    true
            ));

            library.tambahBuku(new Book(
                    "Algoritma dan Struktur Data",
                    "Karina",
                    2024,
                    "Pemrograman",
                    true
            ));

            // Data anggota
            library.tambahAnggota(
                    new Member("M001", "Indah")
            );

            library.tambahAnggota(
                    new Member("M002", "Dita")
            );

            int pilihan = -1;

            do {

                System.out.println("\n=== SISTEM PERPUSTAKAAN MINI ===");
                System.out.println("1. Tampilkan buku");
                System.out.println("2. Tampilkan anggota");
                System.out.println("3. Cari buku");
                System.out.println("4. Pinjam buku");
                System.out.println("5. Kembalikan buku");
                System.out.println("6. Analisis koleksi");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");

                try {

                    pilihan = Integer.parseInt(input.nextLine());

                    switch (pilihan) {

                        case 1 -> library.tampilkanSemuaBuku();

                        case 2 -> library.tampilkanSemuaAnggota();

                        case 3 -> {
                            System.out.print("Masukkan judul buku: ");
                            String judul = input.nextLine();

                            library.cariBerdasarkanJudul(judul);
                        }

                        case 4 -> {
                            System.out.print("ID anggota: ");
                            String id = input.nextLine();

                            System.out.print("Judul buku: ");
                            String judulPinjam = input.nextLine();

                            try {
                                library.pinjamBuku(id, judulPinjam);
                            } catch (BookNotFoundException e) {
                                System.out.println(e.getMessage());
                            } catch (BorrowLimitExceededException e) {
                                System.out.println(e.getMessage());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        case 5 -> {
                            System.out.print("ID anggota: ");
                            String idKembali = input.nextLine();

                            System.out.print("Judul buku: ");
                            String judulKembali = input.nextLine();

                            try {
                                library.kembalikanBuku(
                                        idKembali,
                                        judulKembali
                                );
                            } catch (BookNotFoundException e) {
                                System.out.println(e.getMessage());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        case 6 -> library.tampilkanAnalisis();

                        case 0 -> System.out.println("Program selesai.");

                        default -> System.out.println("Menu tidak tersedia.");
                    }

                } catch (NumberFormatException e) {

                    System.out.println(
                            "Input harus berupa angka."
                    );

                } catch (AssertionError e) {

                    System.out.println(
                            "Validasi gagal: " + e.getMessage()
                    );
                }

            } while (pilihan != 0);
        }
    }
}