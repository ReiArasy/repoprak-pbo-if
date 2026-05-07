/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.modul3;

/**
 *
 * @author HP VICTUS
 */
abstract class Hewan{
    
    public abstract void suaraHewan(); //kosongin bodynya
    
    public void tidur(){
        System.out.println("Zzzzzzz");
    }
}

class Kucing extends Hewan {
    
    public void suaraHewan(){
        System.out.println("Kucing biang : meong meong meong");
    }
}

class Sapi extends Hewan {
    
    public void suaraHewan(){
        System.out.println("Sapi bilang : Moo Mooo");
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kucing myKucing = new Kucing();
        Sapi mySapi = new Sapi();
        
        myKucing.suaraHewan();
        mySapi.suaraHewan();
        
        myKucing.tidur();
        mySapi.tidur();
    }
    
}
