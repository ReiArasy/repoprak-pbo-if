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
    
    //atribut milik dosen (enkapsulasi)
    private String kodeDosen;
    private String namaDosen;
    
    //constructor
    public Dosen(String kodeDosen, String namaDosen){
        this.kodeDosen = kodeDosen;
        this.namaDosen = namaDosen;
    }
    
    public String getKodeDosen(){
        return this.kodeDosen;
    }
    
    public String getNamaDosen(){
        return this.namaDosen;
    }
    
    //method untuk memberikan nilai ke mahasiswa
    public void giveScore(Mahasiswa mhs, int nilai){
        mhs.setNilai(nilai);
        
        System.out.println(this.namaDosen + " memberi nilai " + nilai
                           + " kepada " + mhs.getNama());
    }
    
    //method untuk mengambil/melihat nilai mahasiswa 
    public int getScore(Mahasiswa mhs){
        return mhs.getNilai();
    }
}
