/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project.enkapsulasi;

/**
 *
 * @author HP VICTUS
 */
// ✅ DENGAN enkapsulasi — aman!

class Manusia {
    
    // Atribut → private (tersembunyi dari luar)
    private String nama;
    private int umur;
    
    // SETTER → method untuk MENGISI nilai atribut
    public void setNama(String a) {
        nama = a;
    }
    
    public void setUmur(int a) {
        if (a > 0) {          // bisa tambah validasi di sini!
            umur = a;
        } else {
            System.out.println("Umur tidak boleh negatif!");
        }
    }
    
    // GETTER → method untuk MENGAMBIL nilai atribut
    public String getNama() {
        return nama;
    }
    
    public int getUmur() {
        return umur;
    }
}

public class ProjectEnkapsulasi {
    public static void main(String[] args) {
        Manusia m = new Manusia();
        
        m.setNama("Budi");   // isi nama lewat setter
        m.setUmur(-20);       // isi umur lewat setter
        
        // m.umur = -999;    // ← ini akan ERROR! karena private
        
        System.out.println("Nama : " + m.getNama());  // ambil via getter
        System.out.println("Umur : " + m.getUmur());
    }
}