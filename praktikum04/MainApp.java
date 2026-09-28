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
            Library library = new Library();
            
            // Data buku
            library.tambahBuku(new Book(
                    "Pemrograman Java",
                    "Budi ",
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
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                
                try {
                    
                    pilihan = Integer.parseInt(input.nextLine());
                    
                    switch (pilihan) {
                        
                        case 1 -> library.tampilkanBuku();
                            
                        case 2 -> library.tampilkanAnggota();
                            
                        case 3 -> {
                            System.out.print("Masukkan judul buku: ");
                            String judul = input.nextLine();
                            
                            Book buku = library.cariBuku(judul);
                            
                            if (buku != null) {
                                buku.tampilkanInfo();
                            } else {
                                System.out.println("Buku tidak ditemukan.");
                            }
                        }
                            
                        case 4 -> {
                            System.out.print("ID anggota: ");
                            String id = input.nextLine();
                            
                            System.out.print("Judul buku: ");
                            String judulPinjam = input.nextLine();
                            
                            library.pinjamBuku(id, judulPinjam);
                        }
                            
                        case 5 -> {
                            System.out.print("ID anggota: ");
                            String idKembali = input.nextLine();
                            
                            System.out.print("Judul buku: ");
                            String judulKembali = input.nextLine();
                            
                            library.kembalikanBuku(
                                    idKembali,
                                    judulKembali
                            );
                        }
                            
                        case 0 -> System.out.println("Program selesai.");
                            
                        default -> System.out.println("Menu tidak tersedia.");
                    }
                    
                } catch (NumberFormatException e) {
                    
                    System.out.println(
                            "Input harus berupa angka."
                    );
                }
                
            } while (pilihan != 0);
        }
    }
}