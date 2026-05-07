/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraksi;

/**
 *
 * @author HP VICTUS
 */
public abstract class Hewan {
    private String nama;
    
    public Hewan(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    //method diwarisi anak
    public void makan(){
        System.out.println(nama + " sedang makan.");
    }
    
    //method abstrak, wajib diisi oleh setiap anak
    public abstract void bersuara();
}
