/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relasiantarkelas2;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
        
         // Objek Mahasiswa dibuat SENDIRI dulu (berdiri sendiri)
        Mahasiswa m1 = new Mahasiswa("13011001", "Budi");
        Mahasiswa m2 = new Mahasiswa("13011002", "Siti");
        Mahasiswa m3 = new Mahasiswa("13011003", "Andi");
        
        // Objek Jurusan dibuat sendiri juga
        Jurusan j1 = new Jurusan("IF", "Informatika");
        Jurusan j2 = new Jurusan("SI", "Sistem Informasi");
        
        // Mahasiswa dimasukkan ke Jurusan (AGREGASI terjadi di sini)
        // m1 dan m2 masuk ke Informatika
        j1.addMahasiswa(m1);
        j1.addMahasiswa(m2);
        
        // m3 masuk ke Sistem Informasi
        j2.addMahasiswa(m3);
        
        // Tampilkan isi jurusan
        j1.displayMahasiswa();
        j2.displayMahasiswa();
        
        // - AGREGASI: Mahasiswa tetap ada walau jurusan dihapus ─
        // m1 masih bisa diakses langsung, tidak ikut "musnah" dengan jurusan
        System.out.println("\nMahasiswa m1 masih bisa diakses langsung:");
        System.out.println("Nama: " + m1.getNama());
    }
}
