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
        daftarPinjaman = new ArrayList<>();
        totalPinjaman = 0;
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
        daftarPinjaman.remove(book);
    }

    void tampilkanInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
