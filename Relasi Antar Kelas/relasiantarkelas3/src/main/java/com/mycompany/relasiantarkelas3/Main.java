/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relasiantarkelas3;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
        // ─ KOMPOSISI: CPU/Monitor/Mouse lahir di DALAM Komputer ─
        // Tidak ada yang namanya "new CPU()" di luar sini
        // Semua komponen diciptakan otomatis saat Komputer dibuat
        
        Komputer pc1 = new Komputer(
            "PC Gaming Ruang Lab",   // nama komputer
            "Intel Core i7", 3,      // merk CPU, kecepatan (GHz)
            "LG", 24,                // merk Monitor, ukuran (inch)
            "Logitech", "Wireless"   // merk Mouse, tipe
        );
        
        Komputer pc2 = new Komputer(
            "PC Kasir",
            "Intel Core i3", 2,
            "Samsung", 21,
            "Generic", "Wired"
        );
        
        // Tampilkan spesifikasi
        pc1.displaySpek();
        pc2.displaySpek();
        
        // dalam konsep komposisi, kita tidak pernah membuat komponen secara mandiri di luar kelas induknya.
    }
}
