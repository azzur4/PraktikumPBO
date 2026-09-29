/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum04;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author LOQ
 */
public class LibraryService {

    private final ArrayList<Book> daftarBuku;
    private final ArrayList<Member> daftarAnggota;

    // Menyimpan jumlah buku berdasarkan kategori
    private final HashMap<String, Integer> jumlahBukuKategori;

    // Menyimpan jumlah peminjaman berdasarkan kategori
    private final HashMap<String, Integer> jumlahPinjamKategori;

    // Constructor
    public LibraryService() {
        daftarBuku = new ArrayList<>();
        daftarAnggota = new ArrayList<>();
        jumlahBukuKategori = new HashMap<>();
        jumlahPinjamKategori = new HashMap<>();
    }

    // tambah buku

    public void tambahBuku(Book book) {

        if (book == null) {
            throw new IllegalArgumentException("Data buku tidak boleh kosong.");
        }

        daftarBuku.add(book);

        String kategori = book.getKategori();

        if (jumlahBukuKategori.containsKey(kategori)) {
            jumlahBukuKategori.put(
                    kategori,
                    jumlahBukuKategori.get(kategori) + 1
            );
        } else {
            jumlahBukuKategori.put(kategori, 1);
        }
    }

    // tambah anggota

    public void tambahAnggota(Member member) {

        if (member == null) {
            throw new IllegalArgumentException(
                    "Data anggota tidak boleh kosong."
            );
        }

        daftarAnggota.add(member);
    }

    // cari buku

    private Book cariBuku(String judul) throws BookNotFoundException {

        for (Book book : daftarBuku) {

            if (book.getJudul()
                    .toLowerCase()
                    .contains(judul.toLowerCase())) {

                return book;
            }
        }

        throw new BookNotFoundException(
                "Buku dengan judul \"" + judul
                + "\" tidak ditemukan."
        );
    }

    // cari anggota

    private Member cariAnggota(String id) {

        for (Member member : daftarAnggota) {

            if (member.getId().equalsIgnoreCase(id)) {
                return member;
            }
        }

        return null;
    }

    // cari buku berdasarkan judul

    public void cariBerdasarkanJudul(String keyword) {

        boolean ditemukan = false;

        System.out.println("\n=== HASIL PENCARIAN JUDUL ===");

        for (Book book : daftarBuku) {

            if (book.getJudul()
                    .toLowerCase()
                    .contains(keyword.toLowerCase())) {

                book.tampilkanInfo();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    // cari buku berdasarkan kategori

    public void cariBerdasarkanKategori(String kategori) {

        boolean ditemukan = false;

        System.out.println("\n=== HASIL PENCARIAN KATEGORI ===");

        for (Book book : daftarBuku) {

            if (book.getKategori()
                    .toLowerCase()
                    .contains(kategori.toLowerCase())) {

                book.tampilkanInfo();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Buku dengan kategori tersebut tidak ditemukan.");
        }
    }

    // menampilkan semua buku

    public void tampilkanSemuaBuku() {

        System.out.println("\n=== DAFTAR SEMUA BUKU ===");

        if (daftarBuku.isEmpty()) {
            System.out.println("Belum ada buku.");
            return;
        }

        for (Book book : daftarBuku) {
            book.tampilkanInfo();
        }
    }
    // menampilkan semua anggota

    public void tampilkanSemuaAnggota() {

        System.out.println("\n=== DAFTAR ANGGOTA ===");

        if (daftarAnggota.isEmpty()) {
            System.out.println("Belum ada anggota.");
            return;
        }

        for (Member member : daftarAnggota) {
            member.tampilkanInfo();
        }
    }

    // meminjam buku

    public void pinjamBuku(
            String idMember,
            String judul) throws Exception {

        // Assertion
        assert idMember != null
                && !idMember.trim().isEmpty()
                : "ID anggota tidak boleh kosong";

        assert judul != null
                && !judul.trim().isEmpty()
                : "Judul buku tidak boleh kosong";

        Member member = cariAnggota(idMember);

        if (member == null) {
            throw new Exception("Anggota tidak ditemukan.");
        }

        // Maksimal 3 buku
        if (member.getDaftarPinjaman().size() >= 3) {

            throw new BorrowLimitExceededException(
                    "Anggota sudah meminjam 3 buku. "
                    + "Tidak dapat meminjam lagi."
            );
        }

        // Mencari buku
        Book book = cariBuku(judul);

        // Mengecek ketersediaan
        if (!book.isStatusKetersediaan()) {

            throw new Exception(
                    "Buku sedang dipinjam oleh anggota lain."
            );
        }

        // Mengubah status buku
        book.setStatusKetersediaan(false);

        // Menambah jumlah peminjaman
        book.tambahJumlahDipinjam();

        // Menambahkan buku ke daftar pinjaman anggota
        member.tambahPinjaman(book);

        // Menyimpan jumlah peminjaman berdasarkan kategori
        String kategori = book.getKategori();

        if (jumlahPinjamKategori.containsKey(kategori)) {

            jumlahPinjamKategori.put(
                    kategori,
                    jumlahPinjamKategori.get(kategori) + 1
            );

        } else {

            jumlahPinjamKategori.put(kategori, 1);
        }

        System.out.println("Buku berhasil dipinjam.");
    }

    // mengembalikan buku

    public void kembalikanBuku(
            String idMember,
            String judul) throws Exception {

        // Assertion
        assert idMember != null
                && !idMember.trim().isEmpty()
                : "ID anggota tidak boleh kosong";

        assert judul != null
                && !judul.trim().isEmpty()
                : "Judul buku tidak boleh kosong";

        Member member = cariAnggota(idMember);

        if (member == null) {
            throw new Exception("Anggota tidak ditemukan.");
        }

        Book book = cariBuku(judul);

        if (member.getDaftarPinjaman().contains(book)) {

            member.kembalikanBuku(book);

            book.setStatusKetersediaan(true);

            System.out.println("Buku berhasil dikembalikan.");

        } else {

            System.out.println(
                    "Buku tersebut tidak sedang dipinjam "
                    + "oleh anggota ini."
            );
        }
    }

    // analisis koleksi

    public void tampilkanAnalisis() {

        System.out.println("\n=== ANALISIS KOLEKSI BUKU ===");

        System.out.println(
                "Jumlah seluruh buku: " + daftarBuku.size()
        );

        System.out.println("\nJumlah buku berdasarkan kategori:");

        for (String kategori : jumlahBukuKategori.keySet()) {

            System.out.println(
                    "- " + kategori + ": "
                    + jumlahBukuKategori.get(kategori)
            );
        }

        System.out.println("\nJumlah peminjaman berdasarkan kategori:");

        if (jumlahPinjamKategori.isEmpty()) {

            System.out.println("Belum ada aktivitas peminjaman.");

        } else {

            for (String kategori : jumlahPinjamKategori.keySet()) {

                System.out.println(
                        "- " + kategori + ": "
                        + jumlahPinjamKategori.get(kategori)
                        + " kali"
                );
            }
        }

        System.out.println("\nJumlah buku yang sedang dipinjam:");

        int sedangDipinjam = 0;

        for (Book book : daftarBuku) {

            if (!book.isStatusKetersediaan()) {
                sedangDipinjam++;
            }
        }

        System.out.println(sedangDipinjam + " buku");

        System.out.println("\nJumlah buku yang tersedia:");

        int tersedia = 0;

        for (Book book : daftarBuku) {

            if (book.isStatusKetersediaan()) {
                tersedia++;
            }
        }

        System.out.println(tersedia + " buku");
    }
}