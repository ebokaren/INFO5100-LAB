/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
//package BasicDesignPattern;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// *
// * @author eboka
// */
//public class SingletonPatternTest {
//    
//    public SingletonPatternTest() {
//    }
//    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getInstance method, of class SingletonPattern.
//     */
//    @Test
//    public void testGetInstance() {
//        System.out.println("getInstance");
//        SingletonPattern expResult = null;
//        SingletonPattern result = SingletonPattern.getInstance();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}

package BasicDesignPattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author eboka
 */
public class SingletonPatternTest {

    public SingletonPatternTest() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class SingletonPattern.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        
        // Get the first instance of SingletonPattern
        SingletonPattern firstInstance = SingletonPattern.getInstance();
        
        // Ensure that the first instance is not null
        assertNotNull(firstInstance, "The instance should not be null");
        
        // Get the second instance of SingletonPattern
        SingletonPattern secondInstance = SingletonPattern.getInstance();
        
        // Ensure that the second instance is the same as the first (Singleton check)
        assertSame(firstInstance, secondInstance, "Both instances should be the same");
    }
}
