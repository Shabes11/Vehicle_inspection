/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.queuenum.model;

import java.util.Date;
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
public class GarageMoneyTest {
    
    public GarageMoneyTest() {
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
     * Test of accumulateCardMoney method, of class GarageMoney.
     */
    @Test
    public void testAccumulateCardMoney() {
        System.out.println("accumulateCardMoney");
        double cost = 5;
        GarageMoney instance = new GarageMoney();
     
        instance.accumulateCardMoney(cost);
       assertEquals(5, instance.getCardMoney(), 0.001);
       assertEquals(5, instance.getTotalMoney(), 0.001);
        
        
      //  instance.accumulateCardMoney(cost);
    }

    /**
     * Test of accumulateCashMoney method, of class GarageMoney.
     */
   
     @Test
    public void testAccumulateCashMoneyCostAndMoneyGreaterThanZero() {
        System.out.println("accumulateCashMoney");
        double moneyFromCash = 10;
        double cost = 5;
        GarageMoney instance = new GarageMoney();
        double expResult = 5 ;
        double result = instance.accumulateCashMoney(moneyFromCash, cost);
        assertEquals("",expResult, result, 0.0);
    }
    
       @Test
    public void testAccumulateCashMoneyMoneylessThanZero() {
        System.out.println("accumulateCashMoney");
        double moneyFromCash = -1;
        double cost = 5;
        GarageMoney instance = new GarageMoney();
        double expResult = -6 ;
        System.out.println(expResult);
        double result = instance.accumulateCashMoney(moneyFromCash, cost);
        System.out.println(result);
        assertEquals("",expResult, result, 0.0);
        
    }
    
     @Test 
    public void testAccumulateTotalMoney() {
       
        double cost = 5;
        
       GarageMoney instance = new GarageMoney();
       assertEquals(0, instance.getTotalMoney(), 0.001);
        
        instance.accumulateTotalMoney(cost);
        double result = instance.getTotalMoney();
        assertEquals(5, result, 0.001);
        
    }
    
    
 
    
}
