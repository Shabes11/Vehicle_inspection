/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleInspection.model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import se.kth.sda.vehicleInspection.model.GarageMoney;

/**
 *
 * @author tmp-sda-1161
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
     * Test of getCardMoney method, of class GarageMoney.
     */
    @Test
    public void testAccumulateCardMoney() {
        double cost = 5;
        GarageMoney instance = new GarageMoney();
        instance.accumulateCardMoney(cost);
        assertEquals(5, instance.getCardMoney(), 0.001);
        assertEquals(5, instance.getTotalMoney(), 0.001);
    }

    /**
     * Test of accumulateCashMoney method, of class GarageMoney.
     */
   
    @Test
    public void testAccumulateCashMoneyCostAndMoneyGreaterThanZero() {
        System.out.println("accumulateCashMoney");
        double moneyFromCash = 10;
        double cost = 7;
        GarageMoney instance = new GarageMoney();
        double expResult = 3 ;
        double result = instance.accumulateCashMoney(moneyFromCash, cost);
        assertEquals("",expResult, result, 0.0);
        
        
        expResult = 7;
        result = instance.getTotalMoney();
        assertEquals("",expResult,result,0.0);
    }
    
    @Test
    public void testAccumulateCashMoneyMoneylessThanZero() {
        
        double moneyFromCash = -1;
        double cost = 5;
        GarageMoney instance = new GarageMoney();
        double expResult = -6 ;
        double result = instance.accumulateCashMoney(moneyFromCash, cost);
        assertEquals("",expResult, result, 0.0);
        System.out.println("result " + result);
        expResult = 0;
        result = instance.getTotalMoney();
        assertEquals("",expResult,result,0.0);
        System.out.println("result " + result);
    }
    
    @Test
    public void testAccumulateCashMoneyMoneyZero() {
        
        double moneyFromCash = 0;
        double cost = 5;
        GarageMoney instance = new GarageMoney();
        double expResult = -5 ;
        double result = instance.accumulateCashMoney(moneyFromCash, cost);
        assertEquals("",expResult, result, 0.0);
        System.out.println("result " + result);
        expResult = 0;
        result = instance.getTotalMoney();
        assertEquals("",expResult,result,0.0);
        System.out.println("result " + result);
    }
}
