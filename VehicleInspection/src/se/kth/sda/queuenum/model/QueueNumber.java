/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.queuenum.model;

/**
 *
 * @author tmp-sda-1161
 */
/**
 * Manages and stores queue number.
 */
public class QueueNumber {
    private int queueNo = 1;


    public void nextQueueNumber(){
        queueNo++;
    }

    public int getCurrentNo(){
        return queueNo;
    }
    
    public void displayQueueNumber(){
        System.out.println("Current Que Number is: "+getCurrentNo() );
    }
            
}
