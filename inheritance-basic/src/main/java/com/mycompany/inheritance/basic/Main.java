/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance.basic;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
       //objek parent
       A superclass = new A();
       superclass.x = 3;
       superclass.y = 4;
       
       System.out.println("=== Objek dari Superclass A ===");
       superclass.tampilXY();
       
       System.out.println();
       
       //Objek child
       B subclass = new B();
       
       subclass.x = 5;
       subclass.y = 10;
       subclass.z = 5;
       
       System.out.println("=== Objek dari Subclass B ===");
       subclass.tampilXY(); //method warisan dari A
       subclass.jumlahXYZ(); //method milik B
    }
}
