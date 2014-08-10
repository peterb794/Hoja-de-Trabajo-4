/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andreabarrera
 */
public class circularLinkedListTest {
    
    /**
     *
     */
    public circularLinkedListTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of size method, of class circularLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        circularLinkedList instance = new circularLinkedList();
        instance.push("1");
        int expResult = 1;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class circularLinkedList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object value = "andrea";
        circularLinkedList instance = new circularLinkedList();
        instance.push(value);
        Object expResult = "andrea";
        Object result = instance.pop();
         assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class circularLinkedList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        circularLinkedList instance = new circularLinkedList();
        instance.push("andrea134");
        Object expResult = "andrea134";
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}