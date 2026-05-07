/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relasiantarkelas1;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
         // Buat objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("13011001", "Budi");
        Mahasiswa m2 = new Mahasiswa("13011002", "Siti");
        
        // Buat objek Dosen
        Dosen d = new Dosen("D001", "Pak Anton");
        
        // Dosen memberi nilai ke mahasiswa (ASOSIASI terjadi di sini)
        // Objek m1 dan m2 dikirim sebagai parameter ke method Dosen
        d.giveScore(m1, 90);
        d.giveScore(m2, 85);
        
        // Tampilkan hasil
        System.out.println("====================");
        System.out.println("NIM   : " + m1.getNim());
        System.out.println("Nama  : " + m1.getNama());
        System.out.println("Nilai : " + d.getScore(m1));
        System.out.println("====================");
        System.out.println("NIM   : " + m2.getNim());
        System.out.println("Nama  : " + m2.getNama());
        System.out.println("Nilai : " + d.getScore(m2));
    }
}
