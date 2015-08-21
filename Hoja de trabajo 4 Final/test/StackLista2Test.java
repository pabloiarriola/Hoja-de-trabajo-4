/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pablo Arriola
 */
public class StackLista2Test {
    
    public StackLista2Test() {
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
     * Test of push method, of class StackLista2.
     */
    @Test
    public void testPush() throws Exception {
        System.out.println("push");
        Object value = 1;
        StackLista2 instance = new StackLista2();
        instance.push(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackLista2.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        StackLista2 instance = new StackLista2();
        instance.push(1);
        Object expResult = 1;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of vacio method, of class StackLista2.
     */
    @Test
    public void testVacio() {
        System.out.println("vacio");
        StackLista2 instance = new StackLista2();
        boolean expResult = true;
        boolean result = instance.vacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StackLista2.
     */
    //@Test
    public void testToString() {
        System.out.println("toString");
        StackLista2 instance = new StackLista2();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrevPunt method, of class StackLista2.
     */
    @Test
    public void testGetPrevPunt() throws Exception {
        System.out.println("getPrevPunt");
        int index = 0;
        StackLista2 instance = new StackLista2();
        instance.push(1);
        instance.push(2);
        Object expResult = 1;
        Object result = instance.getPrevPunt(2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNextPunt method, of class StackLista2.
     */
    @Test
    public void testGetNextPunt() throws Exception {
        System.out.println("getNextPunt");
        int index = 0;
        StackLista2 instance = new StackLista2();
        instance.push(1);
        instance.push(2);
        Object expResult = 2;
        Object result = instance.getNextPunt(1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class StackLista2.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        StackLista2 instance = new StackLista2();
        String expResult = "Lista doblemente enlazada";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}