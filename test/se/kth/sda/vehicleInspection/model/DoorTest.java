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
import se.kth.sda.vehicleInspection.model.Door;

/**
 *
 * @author tmp-sda-1161
 */
public class DoorTest {
    
    public DoorTest() {
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
     * Test of getDoorStatus method, of class Door.
     */
     @Test
    public void testGetDoorStatus() {
        Door instance = new Door();
        boolean expResult = false;
        boolean result = instance.getDoorStatus();
        assertEquals("Door instance is equal to false",expResult, result);
        
    }

    /**
     * Test of open method, of class Door.
     */
    @Test
    public void testOpen() {
        Door instance = new Door();
        instance.open();
          boolean expResult = true;
          boolean result = instance.getDoorStatus();
          assertEquals("Door instance is equal to true",expResult, result);
    }

    /**
     * Test of close method, of class Door.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        Door instance = new Door();
        instance.close();
         boolean expResult = false;
         boolean result = instance.getDoorStatus();
          assertEquals("Door instance is equal to false",expResult, result);
    }
}
