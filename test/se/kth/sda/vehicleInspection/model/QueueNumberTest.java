/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleInspection.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tmp-sda-1161
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
        
        assertEquals("queue number should be increased",2,instance.getCurrentNo());
    }
}
