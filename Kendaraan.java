/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSession2;

/**
 *
 * @author LOQ
 */
public abstract class Kendaraan implements DapatDisewa {

    private String nama;
    private String nomorPlat;
    private double hargaSewa;

    public Kendaraan(String nama, String nomorPlat, double hargaSewa) {
        this.nama = nama;
        this.nomorPlat = nomorPlat;
        this.hargaSewa = hargaSewa;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorPlat(String nomorPlat) {
        this.nomorPlat = nomorPlat;
    }

    public void setHargaSewa(double hargaSewa) {
        if (hargaSewa > 0) {
            this.hargaSewa = hargaSewa;
        }
    }

    // Abstract method
    public abstract void tampilkanInfo();

    // Method Overloading
    public double hitungBiayaSewa(int hari, double diskon) {
        double total = hitungBiayaSewa(hari);
        return total - (total * diskon / 100);
    }
}