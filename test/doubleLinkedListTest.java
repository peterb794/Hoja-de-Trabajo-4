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
public class doubleLinkedListTest {
    
    public doubleLinkedListTest() {
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
     * Test of size method, of class doubleLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        doubleLinkedList instance = new doubleLinkedList();
        instance.push("1");
        int expResult = 1;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class doubleLinkedList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object value = "1234";
        doubleLinkedList instance = new doubleLinkedList();
        instance.push(value);
        Object expResult = "1234";
        Object result = instance.pop();
         assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class doubleLinkedList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        doubleLinkedList instance = new doubleLinkedList();
        instance.push("1");
        Object expResult = "1";
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}