package se.kth.sda.queuenum.startup;

/**
 * Starts the application.
 */

import se.kth.sda.vehicleInspection.view.*;
import se.kth.sda.vehicleInspection.controller.*;      

public class Main {
    /**
     * This is the main method of the entire application.
     * 
     * @param args There are no command line arguments.
     */
    public static void main(String[] args) {
        Controller cont = new Controller();
        ApplicationView applicationView = new ApplicationView(cont);
        applicationView.applicationView();
    }
}
