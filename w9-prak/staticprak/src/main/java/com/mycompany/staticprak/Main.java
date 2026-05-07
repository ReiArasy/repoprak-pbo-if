/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.staticprak;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== STATIC VARIABEL ===");

        // Sebelum buat objek apapun
        System.out.println("Total mahasiswa: " + Mahasiswa.getTotalMahasiswa()); // 0

        Mahasiswa m1 = new Mahasiswa("Budi", "001");
        System.out.println("Total mahasiswa: " + Mahasiswa.getTotalMahasiswa()); // 1

        Mahasiswa m2 = new Mahasiswa("Siti", "002");
        Mahasiswa m3 = new Mahasiswa("Andi", "003");
        System.out.println("Total mahasiswa: " + Mahasiswa.getTotalMahasiswa()); // 3

        // Static variabel berubah, semua objek lihat nilai yang sama
        System.out.println("Via m1: " + Mahasiswa.getTotalMahasiswa()); 
        System.out.println("Via m2: " + Mahasiswa.getTotalMahasiswa()); 
        System.out.println();

        System.out.println("=== STATIC METHOD ===");

        // Panggil langsung via nama kelas, TANPA new Kalkulator()!
        System.out.println("5 + 3 = " + Kalkulator.tambah(5, 3));
        System.out.println("5 - 3 = " + Kalkulator.kurang(5, 3));
        System.out.println("5 × 3 = " + Kalkulator.kali(5, 3));
        System.out.println("9 ÷ 4 = " + Kalkulator.bagi(9, 4));
        System.out.printf("Luas lingkaran r= 7 : %.2f%n", Kalkulator.luasLingkaran(7));
    }
}
