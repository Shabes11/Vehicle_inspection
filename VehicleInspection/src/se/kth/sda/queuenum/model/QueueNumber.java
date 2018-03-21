package se.kth.sda.queuenum.model;

/**
 * Manages and stores queue number.
 * @author Group 2
 */
public class QueueNumber {
    private int queueNo = 1;


    /**
     * Increase the queue number
     */
    public void nextQueueNumber(){
        queueNo++;
    }

    public int getCurrentNo(){
        return queueNo;
    }
    
    /**
     * Display current queue number on the screen
     */
    public void displayQueueNumber(){
        System.out.println("Current Que Number is: "+getCurrentNo() );
    }
            
}
