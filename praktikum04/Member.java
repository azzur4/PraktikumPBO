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
public class Member {

    private final String id;
    private final String nama;
    private final ArrayList<Book> daftarPinjaman;
    private int totalPinjaman;

    public Member(String id, String nama) {
        this.id = id;
        this.nama = nama;
        this.daftarPinjaman = new ArrayList<>();
        this.totalPinjaman = 0;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Book> getDaftarPinjaman() {
        return daftarPinjaman;
    }

    public int getTotalPinjaman() {
        return totalPinjaman;
    }

    public void tambahPinjaman(Book book) {
        daftarPinjaman.add(book);
        totalPinjaman++;
    }

    public void kembalikanBuku(Book book) {
        if (daftarPinjaman.remove(book)) {
            totalPinjaman--;
        }
    }

    public void tampilkanInfo() {
        System.out.println("----------------------------");
        System.out.println("ID Anggota : " + id);
        System.out.println("Nama       : " + nama);
        System.out.println("Total Pinjaman : " + totalPinjaman);
        
        if (!nama.isEmpty()) {
            char hurufPertama = nama.charAt(0);
            System.out.println(
            "Inisial Nama : "
            + Character.toUpperCase(hurufPertama)
    );
        if (daftarPinjaman.isEmpty()) {
            System.out.println("Buku Dipinjam : Tidak ada");
        } else {
            System.out.println("Buku Dipinjam :");

            for (Book book : daftarPinjaman) {
                System.out.println("- " + book.getJudul());
            }
        }
    }
}
}