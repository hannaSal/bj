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
public class DealerTest {
    
    public DealerTest() {
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
     * Test of getDealerCards method, of class Dealer.
     */
    @Test
    public void testGetDealerCards() {
        System.out.println("getDealerCards");
        Dealer instance = new Dealer();
        ArrayList expResult = null;
        ArrayList result = instance.getDealerCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDealerCards method, of class Dealer.
     */
    @Test
    public void testSetDealerCards() {
        System.out.println("setDealerCards");
        ArrayList<Card> dealerCards = null;
        Dealer instance = new Dealer();
        instance.setDealerCards(dealerCards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DealerCards method, of class Dealer.
     */
    @Test
    public void testDealerCards() {
        System.out.println("DealerCards");
        Dealer instance = new Dealer();
        Card[] expResult = null;
        Card[] result = instance.DealerCards();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class Dealer.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        Card[] c6 = null;
        Dealer instance = new Dealer();
        int expResult = 0;
        int result = instance.sum(c6);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}