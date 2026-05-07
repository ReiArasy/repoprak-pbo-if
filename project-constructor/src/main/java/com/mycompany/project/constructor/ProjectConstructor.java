/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project.constructor;

/**
 *
 * @author HP VICTUS
 */
class Manusia {
    
    private String nama;
    private int umur;
    
    // ── CONSTRUCTOR 1: default (tanpa parameter) ──────────────────
    public Manusia() {
        // tidak isi apa-apa, atribut akan bernilai null/0
        System.out.println("Objek Manusia dibuat (kosong)");
    }
    
    // ─CONSTRUCTOR 2: dengan 1 parameter
    public Manusia(String a) {
        nama = a;
        System.out.println("Objek Manusia dibuat dengan nama: " + nama);
    }
    
    // CONSTRUCTOR 3: dengan 2 parameter 
    public Manusia(String a, int b) {
        nama = a;
        umur = b;
        System.out.println("Objek Manusia dibuat: " + nama + ", " + umur + " tahun");
    }
    
    // Getter
    public String getNama() { return nama; }
    public int getUmur()    { return umur; }
    
    public void setNama(String a) { 
        nama = a; 
    }
    
    public void setUmur(int b) { 
        umur = b; 
    }
   
}

public class ProjectConstructor {
    public static void main(String[] args) {
        
        // Pakai constructor 1 → langsung kosong
        Manusia m1 = new Manusia();
        m1.setNama("Markonah");   // baru diisi manual via setter
        m1.setUmur(76);
        
        // Pakai constructor 2 → langsung isi nama saat dibuat
        Manusia m2 = new Manusia("Mat Conan");
        // umur tidak diisi → nilainya 0 (default int)
        
        // Pakai constructor 3 → langsung isi nama + umur saat dibuat
        Manusia m3 = new Manusia("Bajuri", 13);
        
        System.out.println("------- Hasil -------");
        System.out.println("Nama: " + m1.getNama() + ", Umur: " + m1.getUmur());
        System.out.println("Nama: " + m2.getNama() + ", Umur: " + m2.getUmur());
        System.out.println("Nama: " + m3.getNama() + ", Umur: " + m3.getUmur());
    }
}
