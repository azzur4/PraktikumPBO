/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSession2;

/**
 *
 * @author LOQ
 */
public class Mobil extends Kendaraan {

    private int jumlahKursi;

    public Mobil(String nama, String nomorPlat,
                 double hargaSewa, int jumlahKursi) {

        super(nama, nomorPlat, hargaSewa);
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        if (jumlahKursi > 0) {
            this.jumlahKursi = jumlahKursi;
        }
    }

    // Method Overriding
    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis Kendaraan : Mobil");
        System.out.println("Nama Kendaraan  : " + getNama());
        System.out.println("Nomor Plat      : " + getNomorPlat());
        System.out.println("Jumlah Kursi    : " + jumlahKursi);
        System.out.println("Harga Sewa      : Rp" + getHargaSewa());
    }

    // Implementasi interface
    @Override
    public double hitungBiayaSewa(int hari) {
        return getHargaSewa() * hari;
    }
}