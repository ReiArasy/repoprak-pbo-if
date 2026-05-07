/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.modul3.prk;

/**
 *
 * @author HP VICTUS
 */

//dia sebagai orng tua/template yang ketika class lain extend ke class ini, class tersebut dapat menggunakn method yang ada di dalam abstrqct
abstract class Hewan{
    
    //contohnyq suqrq hewqn
    public abstract void suaraHewan();
    
    //inhertince
    public void tidur(){
        System.out.println("Zzzzz");
    }
}

//implementqsi dqri abstract
class Kucing extends Hewan{
    public void suaraHewan(){
     System.out.println("Kucing:   Meooooww");
  }
}

//implementqsi dqri abstract
class Bqbi extends Hewan{
    public void suaraHewan(){
     System.out.println("Bqbi:   Ngok Ngok");
  }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kucing k1 = new Kucing();
        Bqbi b2 = new Bqbi();
        
        k1.suaraHewan();
        b2.suaraHewan();
        
        k1.tidur();
        b2.tidur();
    }
    
}
