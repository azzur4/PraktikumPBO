/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum04;

/**
 *
 * @author LOQ
 */
public class Book {


    private final String judul;
    private final String penulis;
    private final int tahunTerbit;
    private final String kategori;
    private boolean statusKetersediaan;
    private int jumlahDipinjam;

    public Book(String judul, String penulis, int tahunTerbit,
            String kategori, boolean statusKetersediaan) {

        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
        this.statusKetersediaan = statusKetersediaan;
        this.jumlahDipinjam = 0;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public boolean isStatusKetersediaan() {
        return statusKetersediaan;
    }

    public int getJumlahDipinjam() {
        return jumlahDipinjam;
    }

    public void setStatusKetersediaan(boolean status) {
        this.statusKetersediaan = status;
    }

    public void tambahJumlahDipinjam() {
        jumlahDipinjam++;
    }

    public void tampilkanInfo() {
        System.out.println("----------------------------");
        System.out.println("Judul       : " + judul);
        System.out.println("Penulis     : " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Kategori    : " + kategori);
        System.out.println("Status      : "
                + (statusKetersediaan ? "Tersedia" : "Dipinjam"));
        System.out.println("Jumlah Dipinjam: " + jumlahDipinjam);
    }
}