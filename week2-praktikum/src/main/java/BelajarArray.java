/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP VICTUS
 */
public class BelajarArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       //        deklarasi array lalu kita deklarasi nilai ke jumlah elemen
       int[] array1;
       array1 = new int[5];
       
       int[] array2 = new int[5];
       
       int[] array3 = {12, 0, 5, 3};
       
       array1[0] = 20;
       System.out.println("array1 indeks ke 0 :" + array1[0]);
       
       for (int i = 0; i < array3.length; i++){
           System.out.println("array 3 indeks ke-" + i + "Adalah : " + array3[i]);
       }
       
       // Array 2 Dimensi
       int[][] m;
       m = new int [4][4];
       m[0][0] = 1;
       m[1][1] = 1;
       m[2][2] = 1;
       m[3][3] = 1;
       
       for (int i = 0; i < m.length; i++){
           for (int j = 0; j < m.length; j++){
               System.out.print(m[i][j] + " ");
       }
           System.out.println("");
       }
    }
    
}
