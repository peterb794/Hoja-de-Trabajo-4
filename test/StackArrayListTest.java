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
public class StackArrayListTest {
    
    public StackArrayListTest() {
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
     * Test of push method, of class StackArrayList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = "andrea";
        StackArrayList instance = new StackArrayList();
        instance.push(item);
        Object prueba = instance.pop();
        System.out.println(prueba);
                
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackArrayList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackArrayList instance = new StackArrayList();
        instance.push("andrea");
        Object expResult = "andrea";
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class StackArrayList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackArrayList instance = new StackArrayList();
        instance.push("1");
        Object expResult = "1";
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackArrayList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackArrayList instance = new StackArrayList();
        instance.push("andrea");
        int expResult = 1;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}