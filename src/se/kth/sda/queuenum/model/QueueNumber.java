package se.kth.sda.queuenum.model;

/**
 * Manages and stores queue number.
 */
public class QueueNumber {
    private int queueNo = 0;


public void nextQueueNumber(){
    queueNo++;
}

public int getCurrentNo(){
    return queueNo;
}


}