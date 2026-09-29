/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum04;

import java.util.ArrayList;

/**
 *
 * @author LOQ
 */
public class Library {

    ArrayList<Book> daftarBuku = new ArrayList<>();
    ArrayList<Member> daftarAnggota = new ArrayList<>();

    public Library() {
        daftarBuku = new ArrayList<>();
        daftarAnggota = new ArrayList<>();
    }

    // Menambah buku
    public void tambahBuku(Book buku) {
        daftarBuku.add(buku);
    }

    // Menambah anggota
    public void tambahAnggota(Member member) {
        daftarAnggota.add(member);
    }

    // Menampilkan semua buku
    public void tampilkanBuku() {
        System.out.println("=== DAFTAR BUKU ===");

        for (Book buku : daftarBuku) {
            buku.tampilkanInfo();
        }
    }

    // Menampilkan semua anggota
    public void tampilkanAnggota() {
        System.out.println("=== DAFTAR ANGGOTA ===");

        for (Member member : daftarAnggota) {
            member.tampilkanInfo();
        }
    }

    // Mencari buku
    public Book cariBuku(String judul) {

        for (Book buku : daftarBuku) {

            if (buku.getJudul()
                    .toLowerCase()
                    .contains(judul.toLowerCase())) {

                return buku;
            }
        }

        return null;
    }

    // Meminjam buku
    public void pinjamBuku(String id, String judul) {

        for (Member member : daftarAnggota) {

            if (member.getId().equals(id)) {

                Book buku = cariBuku(judul);

                if (buku == null) {
                    System.out.println("Buku tidak ditemukan.");
                    return;
                }

                if (!buku.isStatusKetersediaan()) {
                    System.out.println("Buku sedang dipinjam.");
                    return;
                }

                buku.setStatusKetersediaan(false);
                member.tambahPinjaman(buku);

                System.out.println("Buku berhasil dipinjam.");
                return;
            }
        }

        System.out.println("Anggota tidak ditemukan.");
    }

    // Mengembalikan buku
    public void kembalikanBuku(String id, String judul) {

        for (Member member : daftarAnggota) {

            if (member.getId().equals(id)) {

                Book buku = cariBuku(judul);

                if (buku != null) {
                    buku.setStatusKetersediaan(true);
                    member.kembalikanBuku(buku);

                    System.out.println("Buku berhasil dikembalikan.");
                }

                return;
            }
        }

        System.out.println("Anggota tidak ditemukan.");
    }
}