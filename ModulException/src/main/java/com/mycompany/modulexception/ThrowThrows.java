/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.modulexception;

/**
 *
 * @author HP VICTUS
 */
public class ThrowThrows {

    // THROWS: peringatan bahwa method ini bisa melempar Exception
    // Siapapun yang panggil method ini harus pakai try-catch
    public static void cekUmur(int umur) throws Exception {

        if (umur < 17) {
            // THROW: lempar error secara manual dengan pesan custom
            throw new Exception("Umur " + umur + " terlalu muda! Minimal 17 tahun.");
        }

        System.out.println("Umur " + umur + " Boleh masuk!");
    }

    public static void main(String[] args) {

        System.out.println("=== DEMO THROW & THROWS ===");

        // Karena cekUmur() pakai throws, kita wajib pakai try-catch
        try {
            cekUmur(20);  // umur valid, tidak ada error
        } catch (Exception e) {
            System.out.println("Ditolak: " + e.getMessage());
        }

        try {
            cekUmur(15);  // umur tidak valid, throw dijalankan
        } catch (Exception e) {
            System.out.println("Ditolak: " + e.getMessage());
        }

        System.out.println("Program selesai.");
    }
}
