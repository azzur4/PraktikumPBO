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

    public static final double FINAL_PASSING_GRADE = 70.0;

    private String nama;
    private String nim;
    private double nilai;

    public Mahasiswa(String nama, String nim, double nilai)
            throws NilaiInvalidException {

        this.nama = nama.trim().toUpperCase();
        this.nim = nim.trim();

        assert !this.nim.isEmpty() : "NIM tidak boleh kosong!";

        if (this.nim.isEmpty()) {
            throw new IllegalArgumentException("NIM tidak boleh kosong!");
        }

        for (int i = 0; i < this.nim.length(); i++) {
            if (!Character.isDigit(this.nim.charAt(i))) {
                throw new IllegalArgumentException(
                    "NIM hanya boleh berisi angka!"
                );
            }
        }

        if (nilai < 0 || nilai > 100) {
            throw new NilaiInvalidException(
                "Nilai harus berada di antara 0 sampai 100!"
            );
        }

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

    public String getStatus() {
        return isLulus() ? "LULUS" : "TIDAK LULUS";
    }
}