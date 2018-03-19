package se.kth.sda.queuenum.controller;

import se.kth.sda.queuenum.integration.Display;
import se.kth.sda.queuenum.model.QueueNumber;

/**
 * This is the application's only controller. All calls to the model pass through here.
 */
public class Controller {
    private Display display;
    private QueueNumber queueNo;
    
    /**
     * Instantiates a new Controller and creates a {@link Display} object.
     */
    public Controller() {
        display = new Display();
        queueNo = new QueueNumber();
    }
    
   public int showNextNumber(){
        int no;
        queueNo.nextQueueNumber();
        no = queueNo.getCurrentNo();
       display.displayNo(no);
       return no;
    
    
    }

}
 