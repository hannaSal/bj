/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hanna
 */
public class DeckTest {
    
    public DeckTest() {
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
     * Test of getC method, of class Deck.
     */
    @Test
    public void testGetC() {
        System.out.println("getC");
        Deck instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setC method, of class Deck.
     */
    @Test
    public void testSetC() {
        System.out.println("setC");
        ArrayList<Card> c = null;
        Deck instance = null;
        instance.setC(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}