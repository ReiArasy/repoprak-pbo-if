/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relasiantarkelas1;

/**
 *
 * @author HP VICTUS
 */
public class Dosen {
    
    // Atribut milik Dosen sendiri
    private String kodeDosen;
    private String namaDosen;
    
    // Constructor
    public Dosen(String kodeDosen, String namaDosen) {
        this.kodeDosen = kodeDosen;
        this.namaDosen = namaDosen;
    }
    
    // Getter
    public String getKodeDosen() { return this.kodeDosen; }
    public String getNamaDosen() { return this.namaDosen; }
    
    // ── KUNCI ASOSIASI ─
    // Mahasiswa masuk sebagai PARAMETER (bukan atribut kelas Dosen)
    // Dosen "menggunakan" objek Mahasiswa hanya saat method dipanggil
    
    // Method untuk memberi nilai ke mahasiswa tertentu
    public void giveScore(Mahasiswa mhs, int nilai) {
        System.out.println(this.namaDosen + " memberi nilai " + nilai 
                           + " kepada " + mhs.getNama());
        mhs.setNilai(nilai);    // panggil method milik Mahasiswa
    }
    
    // Method untuk mengambil/melihat nilai mahasiswa tertentu
    public int getScore(Mahasiswa mhs) {
        return mhs.getNilai();  // panggil method milik Mahasiswa
    }
}