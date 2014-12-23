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
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getC2 method, of class Player.
     */
    @Test
    public void testGetC2() {
        System.out.println("getC2");
        Player instance = new Player();
        ArrayList expResult = null;
        ArrayList result = instance.getC2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setC2 method, of class Player.
     */
    @Test
    public void testSetC2() {
        System.out.println("setC2");
        ArrayList<Card> c2 = null;
        Player instance = new Player();
        instance.setC2(c2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PlayerCards method, of class Player.
     */
    @Test
    public void testPlayerCards() {
        System.out.println("PlayerCards");
        Player instance = new Player();
        Card[] expResult = null;
        Card[] result = instance.PlayerCards();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class Player.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        Card[] c6 = null;
        Player instance = new Player();
        int expResult = 0;
        int result = instance.sum(c6);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}