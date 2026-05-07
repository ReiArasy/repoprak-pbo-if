/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sample;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import sample.Vector2d;

/**
 *
 * @author HP VICTUS
 */
public class Vector2dTest {
    
    public Vector2dTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }
    
    //test case
    @Test
    public void testScalarMultiplication(){
        System.out.println("ScaklarMultiplication");
        Double k = 2.0;
        
        Vector2d instance = new Vector2d(1.0, 1.0);
        Vector2d expResult = new Vector2d(2.0, 2.0);
        //fitur apa yang mau kita test
        Vector2d result = instance.scalarMultiplication(k);
        //apakah variable pertama dan kedua sama, jika tidak sama returnya false
        assertEquals(expResult.getX(), result.getX());
        assertEquals(expResult.getY(), result.getY());
    }
    
    @Test
    public void testEquals(){
        System.out.println("equals");
        Object obj = new Vector2d(1.0, 1.0);
        Vector2d instance = new Vector2d(1.0, 1.0);
    }
}
