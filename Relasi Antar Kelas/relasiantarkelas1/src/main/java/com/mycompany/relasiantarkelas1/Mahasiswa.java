/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relasiantarkelas1;

/**
 *
 * @author HP VICTUS
 */
public class Mahasiswa {
    
    // Atribut (private = enkapsulasi)
    private String nim;
    private String nama;
    private int nilai;          // atribut nilai yang akan diisi oleh Dosen
    
    // Constructor
    public Mahasiswa(String nim, String nama) {
        this.nim  = nim;
        this.nama = nama;
        this.nilai = 0;         // default nilai = 0 saat objek dibuat
    }
    
    // Setter
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
    // Getter
    public String getNim()   { return this.nim; }
    public String getNama()  { return this.nama; }
    public int getNilai()    { return this.nilai; }
}