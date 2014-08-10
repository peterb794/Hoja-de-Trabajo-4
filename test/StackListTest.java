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
public class StackListTest {
    
    public StackListTest() {
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
     * Test of push method, of class StackList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = "andrea";
        StackList instance = new StackList();
        int num = 1;
        instance.push(item);
        System.out.println(instance.pop());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackList instance = new StackList();
        int num = 1;
        instance.push("1");
        Object expResult = "1";
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class StackList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackList instance = new StackList();
        int num = 1;
        instance.push("23");
        Object expResult = "23";
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        int num = 1;
        StackList instance = new StackList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}