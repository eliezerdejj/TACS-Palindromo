/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palindromo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eliez
 */
public class PalindromoTest {
    
    public PalindromoTest() {
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
     * Test of ePalindromo method, of class Palindromo.
     */
    @org.junit.Test
    public void testNaoEPalindromo() {
        System.out.println("ePalindromo");
        String palavra = "HOJE";
        boolean expResult = false;
        boolean result = Palindromo.Palindromo(palavra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.Test
    public void testEPalindromo() {
        System.out.println("ePalindromo");
        String palavra = "OSSO";
        boolean expResult = true;
        boolean result = Palindromo.Palindromo(palavra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
