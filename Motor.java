/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSession2;

/**
 *
 * @author LOQ
 */
public class Motor extends Kendaraan {

    private String jenisMotor;

    public Motor(String nama, String nomorPlat,
                 double hargaSewa, String jenisMotor) {

        super(nama, nomorPlat, hargaSewa);
        this.jenisMotor = jenisMotor;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }

    // Method Overriding
    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis Kendaraan : Motor");
        System.out.println("Nama Kendaraan  : " + getNama());
        System.out.println("Nomor Plat      : " + getNomorPlat());
        System.out.println("Jenis Motor     : " + jenisMotor);
        System.out.println("Harga Sewa      : Rp" + getHargaSewa());
    }

    // Implementasi interface
    @Override
    public double hitungBiayaSewa(int hari) {
        return getHargaSewa() * hari;
    }
}