package se.kth.sda.queuenum.startup;

import java.util.ArrayList;
import java.util.List;
import se.kth.sda.queuenum.integration.CheckList;
import se.kth.sda.queuenum.integration.CheckListItem;
import se.kth.sda.queuenum.model.InspectionClass;


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
        Main main = new Main();
        
        CheckList audiCheckList = main.createCheckList();
        main.inspectionsPerformed(audiCheckList);
        
    }
    
    
    public CheckList inspectionsPerformed(CheckList checkList){
        InspectionClass inspection = new InspectionClass();
        inspection.inspectionsToPerform(checkList);
        
        return checkList;
    }
    
    
    public CheckList createCheckList(){
        CheckList checkList = new CheckList();
        List<CheckListItem> list = new ArrayList<>();
        
        list.add(new CheckListItem("wheel", 12));
        list.add(new CheckListItem("roof", 22));
        list.add(new CheckListItem("light", 32));
            
        checkList.setCheckList(list);
        
        
        return checkList;
        
    }

}
