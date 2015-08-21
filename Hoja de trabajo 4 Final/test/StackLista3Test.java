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
 * @author Bryan Chang
 */
public class StackLista3Test {
    
    public StackLista3Test() {
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
     * Test of push method, of class StackLista3.
     */
    @Test
    public void testPush() throws Exception {
        System.out.println("push");
        Object value = 1;
        StackLista3 instance = new StackLista3();
        instance.push(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackLista3.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        StackLista3 instance = new StackLista3();
        instance.push(1);
        Object expResult = 1;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of vacio method, of class StackLista3.
     */
    @Test
    public void testVacio() {
        System.out.println("vacio");
        StackLista3 instance = new StackLista3();
        boolean expResult = true;
        boolean result = instance.vacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StackLista3.
     */
    //@Test
    public void testToString() {
        System.out.println("toString");
        StackLista3 instance = new StackLista3();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextPunt method, of class StackLista3.
     */
    @Test
    public void testGetNextPunt() throws Exception {
        System.out.println("getNextPunt");
        int index = 0;
        StackLista3 instance = new StackLista3();
        instance.push(1);
        instance.push(2);        
        Object expResult = 2;
        Object result = instance.getNextPunt(1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class StackLista3.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        StackLista3 instance = new StackLista3();
        String expResult = "Lista circularmente enlazada";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}