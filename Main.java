/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSession2;

/**
 *
 * @author LOQ
 */
public class Main {

    public static void main(String[] args) {

        // Membuat 4 objek kendaraan
        Mobil mobil1 = new Mobil(
            "Toyota Avanza", "R 1234 AB", 350000, 7
        );

        Mobil mobil2 = new Mobil(
            "Honda Brio", "R 5678 CD", 300000, 5
        );

        Motor motor1 = new Motor(
            "Honda Vario", "R 1111 EF", 100000, "Matic"
        );

        Motor motor2 = new Motor(
            "Yamaha NMAX", "R 2222 GH", 150000, "Matic"
        );

        // Runtime Polymorphism
        Kendaraan[] daftarKendaraan = {
            mobil1, mobil2, motor1, motor2
        };

        int lamaSewa = 2;

        System.out.println("==================================");
        System.out.println("     SISTEM PENYEWAAN KENDARAAN");
        System.out.println("==================================");

        for (Kendaraan kendaraan : daftarKendaraan) {

            kendaraan.tampilkanInfo();

            System.out.println("Lama Sewa       : " + lamaSewa + " hari");

            System.out.println("Total Biaya     : Rp"
                + kendaraan.hitungBiayaSewa(lamaSewa));

            System.out.println("----------------------------------");
        }

        // Contoh Method Overloading dengan diskon
        System.out.println("\n=== PERHITUNGAN DENGAN DISKON ===");

        double totalDiskon = mobil1.hitungBiayaSewa(2, 10);

        System.out.println("Kendaraan       : " + mobil1.getNama());
        System.out.println("Lama Sewa       : 2 hari");
        System.out.println("Diskon          : 10%");
        System.out.println("Total Bayar     : Rp" + totalDiskon);

        System.out.println("==================================");
        System.out.println("     TERIMA KASIH");
        System.out.println("==================================");
    }
}