/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TA3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adriantesore
 */
public class ContadorPalabraTest {
    
    public ContadorPalabraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of contadorPalabras method, of class ContadorPalabra.
     */
    @Test
    public void testContadorPalabras() {
        System.out.println("contadorPalabras");
        String palabra = "  9999  Hola como estas 123perro gato2 macri   gato   123sa    ***";
        ContadorPalabra instance = new ContadorPalabra();
        int expResult = 8;
        int result = instance.contadorPalabras(palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
