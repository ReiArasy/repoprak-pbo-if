/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.modulexception;

/**
 *
 * @author HP VICTUS
 */
public class Finally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== DEMO FINALLY ===");

        System.out.println("-- Skenario 1: Normal --");
        try {
            System.out.println("try: kode berjalan normal");
            int hasil = 10 / 2;
            System.out.println("try: hasil = " + hasil);

        } catch (ArithmeticException e) {
            System.out.println("catch: ada error");

        } finally {
            System.out.println("finally: SELALU dijalankan!");
        }

        System.out.println();

        // ── Skenario 2: Ada error ──────────────────────────────────
        System.out.println("-- Skenario 2: Ada Error --");
        try {
            System.out.println("try: mau bagi dengan nol...");
            int hasil = 10 / 0;                    //error
            System.out.println("try: baris ini dilewati");

        } catch (ArithmeticException e) {
            System.out.println("catch: error ditangkap " + e.getMessage());

        } finally {
            System.out.println("finally: TETAP dijalankan meski ada error!");
        }

        System.out.println("Program selesai.");
    }
}
