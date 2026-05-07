/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modulexception;

/**
 *
 * @author HP VICTUS
 */
public class TryCatch {

    public static void main(String[] args) {
      
        System.out.println("=== TANPA TRY-CATCH ===");
//        int hasil = 10 / 0;
        System.out.println("(Baris ini tidak akan muncul kalau ada crash)");
        System.out.println();

        
        System.out.println("=== DENGAN TRY-CATCH ===");
        try {
            int hasil = 10 / 0;                         
            System.out.println("Hasil: " + hasil);     

        } catch (Exception e) {
            System.out.println("Error ditangkap: " + e.getMessage());
        }

        // Program tetap lanjut setelah try-catch
        System.out.println("Program tetap jalan setelah error ditangkap!");
        System.out.println();

    
        System.out.println("=== MULTIPLE CATCH ===");
        int[] angka = {10, 20, 30};
        try {
            // Simulasi 2 kemungkinan error
            int pembagi = angka[0] - 10;   //hasilnya 0
            int hasil   = 100 / pembagi;   //bagi 0, ArithmeticException
            System.out.println(angka[5]);  //index tidak ada, ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBounds: " + e.getMessage());
        }
        System.out.println("Selesai.");
        
    }
}
