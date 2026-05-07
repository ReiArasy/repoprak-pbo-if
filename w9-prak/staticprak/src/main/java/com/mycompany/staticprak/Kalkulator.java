/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.staticprak;

/**
 *
 * @author HP VICTUS
 */
public class Kalkulator {
    // Konstanta static. nilainya tetap, milik kelas
    public static final double PI = 3.14159;

    // Static method, langsung pakai tanpa new Kalkulator()
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: tidak bisa bagi dengan 0!");
            return 0;
        }
        return a / b;
    }

    public static double luasLingkaran(double r) {
        return PI * r * r;
    }
}
