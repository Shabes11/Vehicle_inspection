package se.kth.sda.queuenum.startup;

/**
 * Starts the application.
 */

import se.kth.sda.queuenum.view.*;
import se.kth.sda.queuenum.controller.*;      

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
    
    
    public void createCheckList(){
//        CheckList checkList = new CheckList();
//        
//            
//            checkList.add(new CheckListItem("wheel", 20));
            
        
    }

}
