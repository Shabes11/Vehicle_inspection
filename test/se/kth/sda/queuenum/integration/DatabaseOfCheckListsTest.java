/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.queuenum.integration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tmp-sda-1159
 */
public class DatabaseOfCheckListsTest {
    
    public DatabaseOfCheckListsTest() {
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
     * Test of addCheckListToDatabase method, of class DatabaseOfCheckLists.
     */
    @Test
    public void testAddCheckListToDatabaseWhichIsNull() {
        
        CheckList checkList = null;
        DatabaseOfCheckLists instance = new DatabaseOfCheckLists();
        boolean expResult = false;
        boolean result = instance.addCheckListToDatabase(checkList);
        assertEquals("CheckList is equal to null",expResult, result);
        
    }
    
    
   
    

    /**
     * Test of getCheckList method, of class DatabaseOfCheckLists.
     */
    @Test
    public void testGetCheckListWhenListIsEmpty() {
        
        int index = 0;
        DatabaseOfCheckLists instance = new DatabaseOfCheckLists();
        CheckList expResult = null;
        CheckList result = instance.getCheckList(index);
        assertEquals("Getting CheckList if database is empty",expResult, result);
        
    }
    
    @Test
    public void testGetCheckListWhenIndexIsOutOfBandPositive() {
        
        int index = 1;
        DatabaseOfCheckLists instance = new DatabaseOfCheckLists();
        CheckList expResult = null;
        CheckList result = instance.getCheckList(index);
        assertEquals("Getting CheckList with to big index", expResult, result);
        
    }
    
    @Test
    public void testGetCheckListWhenIndexIsOutOfBandNegative() {
        
        int index = -1;
        DatabaseOfCheckLists instance = new DatabaseOfCheckLists();
        CheckList expResult = null;
        CheckList result = instance.getCheckList(index);
        assertEquals("Getting CheckList with too small index", expResult, result);
        
    }
    
    
}
