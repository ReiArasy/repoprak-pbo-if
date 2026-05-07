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
        //buat objek mahasiswa
        Mahasiswa m1 = new Mahasiswa("120123", "renjiro");
        Mahasiswa m2 = new Mahasiswa("120124", "asep");
        
        //bikin objek dosen
        Dosen d = new Dosen("123456", "Pak Ardian");
        
        //asosiasi (dosen memberikan renjiro nilai 90)
        d.giveScore(m1, 90);
        
        //tampilkan hasil
        System.out.println("=================");
        System.out.println("NIM    :  "  +  m1.getNim());
        System.out.println("Nama   :  "  +  m1.getNama());
        System.out.println("Nilai  :  "  +  d.getScore(m1));
    }
}
