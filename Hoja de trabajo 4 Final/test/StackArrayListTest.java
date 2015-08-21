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
    public void testPush() throws Exception {
        System.out.println("push");
        Object value = 1;
        StackArrayList instance = new StackArrayList();
        instance.push(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackArrayList.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        StackArrayList instance = new StackArrayList();
        instance.push(1);
        Object expResult = 1;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of vacio method, of class StackArrayList.
     */
    @Test
    public void testVacio() {
        System.out.println("vacio");
        StackArrayList instance = new StackArrayList();
        boolean expResult = true;
        boolean result = instance.vacio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StackArrayList.
     */
    //@Test
    public void testToString() {
        System.out.println("toString");
        StackArrayList instance = new StackArrayList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class StackArrayList.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        StackArrayList instance = new StackArrayList();
        String expResult = "ArrayList";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}