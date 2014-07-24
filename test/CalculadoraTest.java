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
        String texto = "andrea";
        Calculadora instance = new Calculadora(texto);
        instance.guardar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of operaciones method, of class Calculadora.
     */
    @Test
    public void testOperaciones() {
        System.out.println("operaciones");
        String texto = "1 + 2";
        Calculadora instance = new Calculadora(texto);
        int expResult = 3;
        int result = instance.operaciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}