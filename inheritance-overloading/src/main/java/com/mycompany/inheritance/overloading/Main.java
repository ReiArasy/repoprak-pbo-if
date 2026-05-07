/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance.overloading;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
        Lagu lagu1 = new Lagu();
        Lagu lagu2 = new Lagu();
        
        //ver 1
        lagu1.isiParam("Sempurna");
        
        //ver 2
        lagu2.isiParam("XXL", "Lany");
        
        lagu1.cetakKeLayar();
        lagu2.cetakKeLayar();
    }
}
