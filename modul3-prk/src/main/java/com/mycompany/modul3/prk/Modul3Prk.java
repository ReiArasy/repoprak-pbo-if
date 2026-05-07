/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul3.prk;

/**
 *
 * @author HP VICTUS
 */

class Mahasiswa{
    String nama, nim;
    
    //mengubqh
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    //mengqmbil
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
 }

public class Modul3Prk {

    public static void main(String[] args) {
       Mahasiswa m1 = new Mahasiswa();
       
       //bikin dqtq
       m1.setNama("Yanto");
       m1.setNim("2345655");
       
       //ngqmbil dqtq
       System.out.println("Nqmq Mqhqsiwq   : " + m1.getNama());
       System.out.println("Nim             : " + m1.getNim());
    }
}
