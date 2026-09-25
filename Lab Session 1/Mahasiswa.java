/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSession1;

/**
 *
 * @author LOQ
 */
public class Mahasiswa {

    // POIN 1 - CLASS & OBJECT
    String nama;
    String nim;
    double nilai;

    // POIN 3 - KONSTANTA
    final double KKM = 70;

    // POIN 2 - CONSTRUCTOR
    public Mahasiswa(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // POIN 1 - METHOD 1
    public void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai : " + nilai);
    }

    // POIN 1 & 4 - METHOD 2 dan KONDISIONAL
    public void cekKelulusan() {
        if (nilai >= KKM) {
            System.out.println("Status: LULUS");
        } else {
            System.out.println("Status: TIDAK LULUS");
        }
    }
}