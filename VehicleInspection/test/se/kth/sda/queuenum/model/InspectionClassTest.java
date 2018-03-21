/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.queuenum.model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.sda.queuenum.integration.CheckList;
import se.kth.sda.queuenum.integration.CheckListItem;

/**
 *
 * @author tmp-sda-1159
 */
public class InspectionClassTest {
    
    public InspectionClassTest() {
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
     * Test of performInspection method, of class InspectionClass.
     */
    @Test
    public void testPerformInspectionWhenNull() {
        
        CheckList checkList = null;
        InspectionClass instance = new InspectionClass();
        CheckList expResult = null;
        CheckList result = instance.performInspection(checkList);
        assertEquals("After input of null, it is not returning null object", expResult, result);
        
    }
    
    @Test
    public void testPerformInspectionMessageWhenNull() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalSysOut = System.out;
        System.setOut(new PrintStream(outContent));
        
//        
//        
        CheckList checkList = null;
        InspectionClass instance = new InspectionClass();
        CheckList finalCheckList = instance.performInspection(checkList);
        String expResult = "Please enter a valid registration number from option 4";
        String result = outContent.toString();
        assertTrue("After input of null, it is not returning null object", result.contains(expResult));
        
    }
    
    @Test
    public void testPerformInspectionWhenEmpty() {
        
        CheckList checkList = new CheckList();
        InspectionClass instance = new InspectionClass();
        int expResult = 0;
        CheckList checkListAfter = instance.performInspection(checkList);
        int result = checkListAfter.getCheckList().size();
        assertEquals("There should be no inspections to perform", expResult, result);
        
    }
    
    @Test
    public void testPerformInspection() {
        
        
        String input = "Fail";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        
        CheckList checkList = new CheckList();
        InspectionClass instance = new InspectionClass();
        CheckListItem item = new CheckListItem("Roof", 100);
        checkList.addObject(item);
        
        
        
       
        boolean expResult = true;
        CheckList checkListAfter = instance.performInspection(checkList);
        
        boolean result = checkListAfter.getCheckList().get(0).isInspectionStatus();
        assertEquals("The inspection was not performed", expResult, result);
        
    }
    
    
    
    
    
}
