/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.w4.praktikum;

/**
 *
 * @author HP VICTUS
 */

class Manusia{
    
   // atribut (private) tersembunyi dari luar
   private String nama;
   private int umur;
   
   //setter, method untuk mengisi nilai atribut
   public void setNama(String a){
       nama = a;
   }
   
   public void setUmur(int a){
//       umur = a;
        if (a > 0){
            umur = a;
        } else {
            System.out.println("Umur tidak boleh negatif");
        }
   }
   
   //getter, method untuk mengambil nilai atribut
   public String getNama(){
       return nama;
   }
   
   public int getUmur(){
       return umur;
   }
}

public class W4Praktikum {
    public static void main(String[] args) {
      Manusia m = new Manusia();
      
      m.setNama("Asep");
      m.setUmur(20);
      m.setUmur(-20);
      
      System.out.println("Nama : " + m.getNama());
      System.out.println("Umur : " + m.getUmur());
    }
}
