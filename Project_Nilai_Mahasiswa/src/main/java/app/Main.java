/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author LOQ
 */

import model.Mahasiswa;
import model.NilaiInvalidException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        String ulang = "y";

        System.out.println("=== PROGRAM PENGELOLAAN NILAI MAHASISWA ===");

        do {
            try {
                System.out.print("\nMasukkan Nama: ");
                String nama = input.nextLine().trim();

                System.out.print("Masukkan NIM: ");
                String nim = input.nextLine().trim();

                if (nim.isEmpty()) {
                    System.out.println("NIM tidak boleh kosong!");
                    ulang = "y";
                    continue;
                }

                boolean valid = true;

                for (int i = 0; i < nim.length(); i++) {
                    if (!Character.isDigit(nim.charAt(i))) {
                        valid = false;
                        break;
                    }
                }

                if (!valid) {
                    System.out.println("NIM harus berupa angka!");
                    ulang = "y";
                    continue;
                }

                System.out.print("Masukkan Nilai: ");
                double nilai = Double.parseDouble(input.nextLine());

                Mahasiswa m = new Mahasiswa(nama, nim, nilai);
                daftarMahasiswa.add(m);

                System.out.println("Data berhasil ditambahkan!");

            } catch (NilaiInvalidException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Nilai harus berupa angka!");
            }

            System.out.print("\nTambah mahasiswa lagi? (y/t): ");
            ulang = input.nextLine();

        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("\n=== DAFTAR NILAI MAHASISWA ===");

        double total = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println("-------------------------");
            System.out.println("Nama   : " + m.getNama());
            System.out.println("NIM    : " + m.getNim());
            System.out.println("Nilai  : " + m.getNilai());
            System.out.println("Grade  : " + m.getGrade());
            System.out.println("Status : " +
                (m.isLulus() ? "Lulus" : "Tidak Lulus"));

            total += m.getNilai();
        }

        if (daftarMahasiswa.size() > 0) {
            System.out.println("-------------------------");
            System.out.println("Jumlah Mahasiswa: " +
                daftarMahasiswa.size());
            System.out.println("Rata-rata Nilai: " +
                total / daftarMahasiswa.size());
        } else {
            System.out.println("Belum ada data mahasiswa.");
        }

        // Menyimpan laporan ke file
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("laporan_nilai.txt"))) {

            writer.write("LAPORAN NILAI MAHASISWA");
            writer.newLine();

            for (Mahasiswa m : daftarMahasiswa) {
                writer.write(
                    m.getNama() + " | " +
                    m.getNim() + " | " +
                    m.getNilai() + " | " +
                    m.getGrade() + " | " +
                    (m.isLulus() ? "Lulus" : "Tidak Lulus")
                );
                writer.newLine();
            }

            System.out.println("\nLaporan berhasil disimpan!");

        } catch (IOException e) {
            System.out.println("Gagal menyimpan file: " + e.getMessage());
        }

        input.close();
    }
}