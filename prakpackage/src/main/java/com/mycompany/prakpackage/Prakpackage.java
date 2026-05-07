/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prakpackage;

import com.mycompany.prakpackage.hargapulsa.hargapulsa; //import karena beda package
import com.mycompany.prakpackage.hargatoken.hargatoken; //import karena beda package

/**
 *
 * @author HP VICTUS
 */
public class Prakpackage {
    public static void main(String[] args) {
            hargapulsa objPulsa = new hargapulsa();
            objPulsa.info();
            
            hargatoken objToken = new hargatoken();
            objToken.info();
    }
}
