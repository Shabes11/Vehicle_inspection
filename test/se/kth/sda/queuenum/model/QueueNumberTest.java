/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.queuenum.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tmp-sda-1178
 */
public class QueueNumberTest {
    
    public QueueNumberTest() {
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
     * Test of nextQueueNumber method, of class QueueNumber.
     */
    @Test
    public void testNextQueueNumber() {
        System.out.println("nextQueueNumber");
        QueueNumber instance = new QueueNumber();
        instance.nextQueueNumber();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentNo method, of class QueueNumber.
     */
    @Test
    public void testGetCurrentNo() {
        QueueNumber instance = new QueueNumber();
        int expResult = 0;
        int result = instance.getCurrentNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
