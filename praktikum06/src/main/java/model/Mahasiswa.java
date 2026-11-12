/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LOQ
 */
public class Mahasiswa {

    private String nama;
    private String nim;
    private double nilai;

    public static final double FINAL_PASSING_GRADE = 70.0;

    public Mahasiswa(String nama, String nim, double nilai)
            throws NilaiInvalidException {

        if (nilai < 0 || nilai > 100) {
            throw new NilaiInvalidException(
                "Nilai harus antara 0 sampai 100!"
            );
        }

        assert !nim.isEmpty() : "NIM tidak boleh kosong";

        this.nama = nama.trim().toUpperCase();
        this.nim = nim;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double getNilai() {
        return nilai;
    }

    public String getGrade() {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 75) {
            return "B";
        } else if (nilai >= 60) {
            return "C";
        } else {
            return "D";
        }
    }

    public boolean isLulus() {
        return nilai >= FINAL_PASSING_GRADE;
    }
}

