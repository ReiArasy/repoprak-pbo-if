/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance.override;

/**
 *
 * @author HP VICTUS
 */


class A {
    public void tampilkanKeLayar(){
        System.out.println("Method class A dipanggill..");
    }
}

class B extends A{
    public void tampilkanKeLayar(){
       super.tampilkanKeLayar();
       System.out.println("Method class B dipanggill..");
    }
}

public class Main {
    public static void main(String[] args) {
      B ob = new B();
      ob.tampilkanKeLayar();
    }
}
