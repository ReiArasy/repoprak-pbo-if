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
    
    //atribut bersifat private (enkapsulasi)
    private String nim;
    private String nama;
    private int nilai;
    
    public Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
        this.nilai = 0; //default nilai 0
    }
    
    //setter
    public void setNilai(int nilai){
        this.nilai = nilai;
    }
    
    //getter
    public String getNim(){
        return this.nim;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getNilai(){
        return this.nilai;
    }
}
