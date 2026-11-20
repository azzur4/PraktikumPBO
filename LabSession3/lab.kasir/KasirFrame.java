/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirkantinuns;

import javax.swing.*;
import java.util.Locale;
/**
 *
 * @author LOQ
 */
public class KasirFrame extends JFrame {
    private JTextField txtMenu, txtHarga, txtJumlah;
    private JTextArea areaStruk;
    private JLabel lblTotal;
    private JLabel lblStatus;
    private Pesanan pesanan = new Pesanan();

    public KasirFrame() {
        setTitle("Kasir Kantin UNS");
        setSize(400, 450);
        setLayout(null);

        JLabel lblJudul = new JLabel("Kasir Kantin UNS");
        lblJudul.setBounds(20, 10, 300, 25);
        add(lblJudul);

        JLabel lblMenu = new JLabel("Nama Menu :");
        lblMenu.setBounds(20, 45, 90, 25);
        add(lblMenu);
        txtMenu = new JTextField();
        txtMenu.setBounds(120, 45, 230, 25);
        add(txtMenu);

        JLabel lblHarga = new JLabel("Harga :");
        lblHarga.setBounds(20, 75, 90, 25);
        add(lblHarga);
        txtHarga = new JTextField();
        txtHarga.setBounds(120, 75, 230, 25);
        add(txtHarga);

        JLabel lblJumlah = new JLabel("Jumlah :");
        lblJumlah.setBounds(20, 105, 90, 25);
        add(lblJumlah);
        txtJumlah = new JTextField();
        txtJumlah.setBounds(120, 105, 230, 25);
        add(txtJumlah);

        JButton btnTambah = new JButton("Tambah");
        btnTambah.setBounds(40, 140, 140, 28);
        add(btnTambah);

        JButton btnHitung = new JButton("Hitung Total");
        btnHitung.setBounds(210, 140, 140, 28);
        add(btnHitung);

        areaStruk = new JTextArea();
        areaStruk.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaStruk);
        scroll.setBounds(20, 180, 335, 120);
        add(scroll);

        lblTotal = new JLabel("Total Bayar : Rp 0");
        lblTotal.setBounds(20, 305, 300, 25);
        add(lblTotal);

        // ===== Tahap 4: tombol cetak + label status =====
        JButton btnCetak = new JButton("Cetak Struk");
        btnCetak.setBounds(20, 335, 140, 28);
        add(btnCetak);

        lblStatus = new JLabel("Status: -");
        lblStatus.setBounds(20, 370, 300, 25);
        add(lblStatus);

        // ===== Tombol Tambah =====
        btnTambah.addActionListener(e -> {
            String menu = txtMenu.getText().trim();
            String hargaStr = txtHarga.getText().trim();
            String jumlahStr = txtJumlah.getText().trim();

            if (menu.isEmpty() || hargaStr.isEmpty() || jumlahStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
                return;
            }
            try {
                double harga = Double.parseDouble(hargaStr);
                int jumlah = Integer.parseInt(jumlahStr);
                pesanan.tambahItem(harga, jumlah);
                areaStruk.append(menu + " x" + jumlah + " = Rp "
                        + format(harga * jumlah) + "\n");
                txtMenu.setText("");
                txtHarga.setText("");
                txtJumlah.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                        "Harga dan jumlah harus berupa angka!");
            }
        });

        // ===== Tombol Hitung Total =====
        btnHitung.addActionListener(e ->
            lblTotal.setText("Total Bayar : Rp " + format(pesanan.hitungTotal()))
        );

        // ===== Tombol Cetak Struk (thread baru) =====
        btnCetak.addActionListener(e -> {
            new Thread(() -> {
                SwingUtilities.invokeLater(() ->
                        lblStatus.setText("Mencetak struk..."));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                SwingUtilities.invokeLater(() ->
                        lblStatus.setText("Struk selesai"));
            }).start();
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private String format(double angka) {
        return String.format(Locale.forLanguageTag("id-ID"), "%,.0f", angka);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(KasirFrame::new);
    }
}