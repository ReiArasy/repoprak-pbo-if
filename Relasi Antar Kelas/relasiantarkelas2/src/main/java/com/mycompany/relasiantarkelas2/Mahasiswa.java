package com.mycompany.relasiantarkelas2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP VICTUS
 */
public class Mahasiswa {
    
    private String nim;
    private String nama;          
    
    // Constructor
    public Mahasiswa(String nim, String nama) {
        this.nim  = nim;
        this.nama = nama;
    }
 
    // Getter
    public String getNim()   { return this.nim; }
    public String getNama()  { return this.nama; }
}
