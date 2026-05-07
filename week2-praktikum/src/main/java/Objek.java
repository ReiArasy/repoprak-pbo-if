/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP VICTUS
 */

class Manusia{
    private String nama;
    private int umur;
    
    public Manusia(String n, int umur){
        nama = n;
        this.umur = umur;
    }
    
    void printInfo(){
        System.out.println(nama + " berusia " + umur + " Umur");
    }
}

public class Objek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia[] orang = {
          new Manusia("Asep", 20),
          new Manusia("yusup", 21),
          new Manusia("joni", 22)
        };
        
        for (int i = 0; i < orang.length; i++){
            orang[i].printInfo();
        }
    }
    
}
