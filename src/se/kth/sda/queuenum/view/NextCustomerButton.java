package se.kth.sda.queuenum.view;

import se.kth.sda.queuenum.controller.Controller;

/**
 * Pressing this button increments the displayed queue number.
 */
public class NextCustomerButton {
    private Controller contr;
    
    /**
     * Instantiates an object using the specified controller for system operations.
     * 
     * @param contr The controller used for all system operations.
     */
    public NextCustomerButton(Controller contr) {
        this.contr = contr;
        
    }
    
    public void pressButton(){
       contr.showNextNumber();
    
    }
    

}
