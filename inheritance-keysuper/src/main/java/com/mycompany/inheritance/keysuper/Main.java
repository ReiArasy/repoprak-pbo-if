/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance.keysuper;

/**
 *
 * @author HP VICTUS
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Membuat objek Employee ===");
        Employee emp = new Employee("Asep");
        emp.tampilNama();
        System.out.println();
        
        System.out.println("=== Create objek Manager ===");
        Manager mgr = new Manager("Adi", "Mojokerto");
        System.out.println();
        
        System.out.println("=== Info Manager ===");
        mgr.tampilInfo();
    }
}
