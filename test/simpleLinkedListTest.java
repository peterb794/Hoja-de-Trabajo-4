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
public class simpleLinkedListTest {
    
    public simpleLinkedListTest() {
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
     * Test of size method, of class simpleLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        simpleLinkedList instance = new simpleLinkedList();
        instance.push("1");
        instance.push("2");
        int expResult = 2;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class simpleLinkedList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object value = "1234";
        simpleLinkedList instance = new simpleLinkedList();
        instance.push(value);
         Object expResult = "1234";
        Object result = instance.pop();
         assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class simpleLinkedList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        simpleLinkedList instance = new simpleLinkedList();
        instance.push("1");
        Object expResult = "1";
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}