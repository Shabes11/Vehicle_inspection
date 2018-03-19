package se.kth.sda.queuenum.startup;

import se.kth.sda.queuenum.controller.Controller;
import se.kth.sda.queuenum.view.NextCustomerButton;

/**
 * Starts the application.
 */
public class Main {
    /**
     * This is the main method of the entire application.
     * 
     * @param args There are no command line arguments.
     */
    public static void main(String[] args) {
        Controller contr = new Controller();
        new NextCustomerButton(contr).pressButton();
        
    }

}
