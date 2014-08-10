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
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of guardar method, of class Calculadora.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        String pruba = "andrea";
        Calculadora instance = new Calculadora("2 3 +" ,"1");
        instance.guardar();
        int result = instance.operaciones();
        int expected = 5;
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of operaciones method, of class Calculadora.
     */
    @Test
    public void testOperaciones() {
        System.out.println("operaciones");
        Calculadora instance = new Calculadora("2 3 +" ,"1");
        int expResult = 5;
        int result = instance.operaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}