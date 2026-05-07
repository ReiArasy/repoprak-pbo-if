/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.staticprak;

/**
 *
 * @author HP VICTUS
 */
public class Mahasiswa {
    private String nama;
    private String nim;

    // STATIC VARIABEL
    // Milik KELAS, bukan milik objek
    // Satu nilai untuk semua objek Mahasiswa, Dipakai untuk menghitung total mahasiswa yang sudah dibuat
    private static int totalMahasiswa = 0;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim  = nim;

        // Setiap kali objek baru dibuat, counter naik
        totalMahasiswa++;
    }

    public String getNama() { 
        return nama; 
    }
    
    public String getNim()  { 
        return nim; 
    }

    // STATIC METHOD 
    // Bisa dipanggil tanpa buat objek dulu
    // Hanya boleh akses static variabel/method lain
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }

    public static void resetTotal() {
        totalMahasiswa = 0;
        System.out.println("Counter direset ke 0.");
    }
}
