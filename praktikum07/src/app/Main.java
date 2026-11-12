/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author LOQ
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import model.Mahasiswa;
import model.NilaiInvalidException;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        int jumlahMahasiswa = 0;

        System.out.println("==================================");
        System.out.println("   PROGRAM PENGELOLAAN NILAI");
        System.out.println("          MAHASISWA");
        System.out.println("==================================");

        while (jumlahMahasiswa <= 0) {
            System.out.print("Masukkan jumlah mahasiswa: ");

            try {
                jumlahMahasiswa = Integer.parseInt(input.nextLine());

                if (jumlahMahasiswa <= 0) {
                    System.out.println(
                        "Jumlah mahasiswa harus lebih dari 0!"
                    );
                }

            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }

        for (int i = 0; i < jumlahMahasiswa; i++) {

            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            boolean dataValid = false;

            while (!dataValid) {

                try {
                    System.out.print("Nama mahasiswa: ");
                    String nama = input.nextLine().trim();

                    if (nama.isEmpty()) {
                        System.out.println("Nama tidak boleh kosong!");
                        continue;
                    }

                    System.out.print("NIM: ");
                    String nim = input.nextLine().trim();

                    System.out.print("Nilai: ");
                    double nilai = Double.parseDouble(input.nextLine());

                    Mahasiswa mahasiswa =
                        new Mahasiswa(nama, nim, nilai);

                    daftarMahasiswa.add(mahasiswa);

                    System.out.println("Data berhasil ditambahkan!");
                    dataValid = true;

                } catch (NilaiInvalidException e) {

                    System.out.println(
                        "Kesalahan nilai: " + e.getMessage()
                    );

                } catch (NumberFormatException e) {

                    System.out.println("Nilai harus berupa angka!");

                } catch (IllegalArgumentException e) {

                    System.out.println(
                        "Kesalahan data: " + e.getMessage()
                    );
                }
            }
        }

        System.out.println("\n==============================================");
        System.out.println("           DAFTAR NILAI MAHASISWA");
        System.out.println("==============================================");

        System.out.printf("%-20s %-15s %-10s %-8s %-15s%n",
                "Nama", "NIM", "Nilai", "Grade", "Status");

        System.out.println("--------------------------------------------------------------");

        double totalNilai = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (Mahasiswa m : daftarMahasiswa) {

            System.out.printf("%-20s %-15s %-10.2f %-8s %-15s%n",
                    m.getNama(),
                    m.getNim(),
                    m.getNilai(),
                    m.getGrade(),
                    m.getStatus());

            totalNilai += m.getNilai();

            if (m.isLulus()) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        double rataRata = totalNilai / daftarMahasiswa.size();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Jumlah mahasiswa  : " + daftarMahasiswa.size());
        System.out.printf("Rata-rata nilai   : %.2f%n", rataRata);
        System.out.println("Jumlah lulus      : " + jumlahLulus);
        System.out.println("Jumlah tidak lulus: " + jumlahTidakLulus);

        try (BufferedWriter writer =
                new BufferedWriter(
                    new FileWriter("laporan_nilai.txt"))) {

            writer.write("==============================================");
            writer.newLine();
            writer.write("          LAPORAN NILAI MAHASISWA");
            writer.newLine();
            writer.write("==============================================");
            writer.newLine();
            writer.newLine();

            writer.write(String.format("%-20s %-15s %-10s %-8s %-15s",
                    "Nama", "NIM", "Nilai", "Grade", "Status"));

            writer.newLine();

            writer.write("--------------------------------------------------------------");
            writer.newLine();

            for (Mahasiswa m : daftarMahasiswa) {

                writer.write(String.format(
                        "%-20s %-15s %-10.2f %-8s %-15s",
                        m.getNama(),
                        m.getNim(),
                        m.getNilai(),
                        m.getGrade(),
                        m.getStatus()
                ));

                writer.newLine();
            }

            writer.write("--------------------------------------------------------------");
            writer.newLine();

            writer.write("Jumlah mahasiswa  : " + daftarMahasiswa.size());
            writer.newLine();

            writer.write(String.format(
                    "Rata-rata nilai   : %.2f", rataRata
            ));

            writer.newLine();
            writer.write("Jumlah lulus      : " + jumlahLulus);
            writer.newLine();
            writer.write("Jumlah tidak lulus: " + jumlahTidakLulus);
            writer.newLine();

            writer.write("==============================================");
            writer.newLine();

            System.out.println("\nLaporan berhasil disimpan!");
            System.out.println("Nama file: laporan_nilai.txt");

        } catch (IOException e) {

            System.out.println(
                "Terjadi kesalahan saat menyimpan file: " + e.getMessage()
            );
        }

        input.close();

        System.out.println("\nProgram selesai.");
    }
}