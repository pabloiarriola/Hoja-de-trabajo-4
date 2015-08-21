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
public class StackVectorTest {
    
    public StackVectorTest() {
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
     * Test of push method, of class StackVector.
     */
    @Test
    public void testPush() throws Exception {
        System.out.println("push");
        Object value = 1;
        StackVector instance = new StackVector();
        instance.push(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackVector.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        StackVector instance = new StackVector();
        instance.push(1);
        Object expResult = 1;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of vacio method, of class StackVector.
     */
    @Test
    public void testVacio() {
        System.out.println("vacio");
        StackVector instance = new StackVector();
        boolean expResult = true;
        boolean result = instance.vacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StackVector.
     */
    //@Test
    public void testToString() {
        System.out.println("toString");
        StackVector instance = new StackVector();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class StackVector.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        StackVector instance = new StackVector();
        String expResult = "Vector";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}