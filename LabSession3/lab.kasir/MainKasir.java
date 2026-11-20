/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirkantinuns;

/**
 *
 * @author LOQ
 */
public class MainKasir {

    public static void main(String[] args) {
        // ===== TAHAP 1: Uji Pesanan =====
        Pesanan p = new Pesanan();
        p.tambahItem(15000, 2); // Nasi Goreng
        p.tambahItem(5000, 3);  // Es Teh
        System.out.println("Setelah 2 menu -> Total: " + p.hitungTotal()); // 45000

        p.tambahItem(25000, 1); // Ayam Bakar
        System.out.println("Subtotal: " + p.getSubtotal());             // 70000
        System.out.println("Total: " + p.hitungTotal());                // 63000
        p.reset();

        // ===== TAHAP 2: Dua Kasir =====
        Kasir dina = new Kasir("Dina");
        Kasir eko = new Kasir("Eko");
        dina.start();
        eko.start();

        try {
            dina.join();
            eko.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Semua pelanggan selesai dilayani");
    }
}
