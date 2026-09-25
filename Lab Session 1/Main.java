/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSession1;

import java.util.Scanner;

/**
 *
 * @author LOQ
 */
public class Main {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("======================================");
            System.out.println("       SISTEM DATA MAHASISWA");
            System.out.println("======================================");
            try {
                
                // 6. EXCEPTION HANDLING
                System.out.print("Masukkan nama mahasiswa : ");
                String nama = input.nextLine();
                
                System.out.print("Masukkan NIM mahasiswa  : ");
                String nim = input.nextLine();
                
                System.out.print("Masukkan nilai mahasiswa: ");
                double nilai = input.nextDouble();
                
                // 7. CHARACTER & STRING
                char hurufAwal = nama.charAt(0);
                String namaBesar = nama.toUpperCase();
                
                System.out.println("\n======================================");
                System.out.println("DATA MAHASISWA");
                System.out.println("======================================");
                
                System.out.println("Nama asli  : " + nama);
                System.out.println("Nama besar : " + namaBesar);
                System.out.println("Huruf awal : " + hurufAwal);
                System.out.println("Panjang nama: " + nama.length());
                
                // 8. ARRAY
                Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];
                
                // 9. OBJECT - membuat object dari class Mahasiswa
                daftarMahasiswa[0] = new Mahasiswa(nama, nim, nilai);
                
                // Object tambahan
                daftarMahasiswa[1] = new Mahasiswa(
                        "Budi",
                        "2301002",
                        80
                );
                
                daftarMahasiswa[2] = new Mahasiswa(
                        "Citra",
                        "2301003",
                        65
                );
                
                // 5. LOOPING
                System.out.println("\n======================================");
                System.out.println("DAFTAR MAHASISWA");
                System.out.println("======================================");
                
                for (int i = 0; i < daftarMahasiswa.length; i++) {
                    
                    System.out.println("\nMahasiswa ke-" + (i + 1));
                    
                    // Memanggil method dari class Mahasiswa
                    daftarMahasiswa[i].tampilkanData();
                    daftarMahasiswa[i].cekKelulusan();
                }
                
            } catch (Exception e) {
                
                // 6. EXCEPTION HANDLING
                System.out.println("\nTerjadi kesalahan!");
                System.out.println("Input yang dimasukkan tidak valid.");
            }

            }
    }
}