/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphism;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
        //========================================================
        // UPCASTING, simpan objek anak ke variabel bertipe parent
        System.out.println("=== UPCASTING ===");

        Hewan h1 = new Kucing("Mimi");   // Kucing disimpan sebagai Hewan 
        Hewan h2 = new Burung("Tweety"); // Burung disimpan sebagai Hewan

        // Meski tipe variabel Hewan, method yang dipanggil adalah versi MILIK SUBCLASS masing-masing
        h1.bersuara(); // panggil versi Kucing
        h2.bersuara(); // panggil versi Burung

        System.out.println();

        //===================================
        // ── 1 array menampung semua jenis ──
        System.out.println("=== ARRAY POLYMORPHISM ===");

        Hewan[] daftarHewan = {
            new Kucing("Kitty"),
            new Burung("Polly"),
            new Kucing("Tom")
        };

        // Loop sekali, semua hewan bersuara dengan caranya masing-masing
        for (Hewan h : daftarHewan) {
            h.bersuara(); // tiap objek pakai method versinya sendiri
        }
        System.out.println();

        // =====================================================
        // DOWNCASTING, kembalikan ke tipe anak agar bisa akses
        System.out.println("=== DOWNCASTING ===");

        Hewan hewanKucing = new Kucing("Mimi");

        // Downcast dulu ke Kucing, baru bisa akses manjaManja()
        Kucing kucing = (Kucing) hewanKucing; // casting eksplisit
        kucing.manjaManja();                  // sekarang bisa
        System.out.println();

        // INSTANCEOF, cek tipe sebelum downcast 
        System.out.println("=== CEK TIPE DENGAN instanceof ===");

        for (Hewan h : daftarHewan) {
            h.bersuara();

            // Cek dulu sebelum downcast 
            if (h instanceof Kucing) {
                Kucing k = (Kucing) h;
                k.manjaManja();
            } else if (h instanceof Burung) {
                Burung b = (Burung) h;
                b.terbang();
            }
            System.out.println("---");
        }
    }
}
