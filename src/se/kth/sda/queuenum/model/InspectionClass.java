package se.kth.sda.queuenum.model;

import java.util.List;
import se.kth.sda.queuenum.integration.CheckList;
import se.kth.sda.queuenum.integration.CheckListItem;
import se.kth.sda.queuenum.integration.DatabaseOfCheckLists;

/**
 * Creates CheckList with inspections and perform car inspections
 */
public class InspectionClass {
    
    
    
    /**
     * 
     * @param checkList  The list with inspections to perform on the car
     * @return Updated check list with the tasks that were performed on the car
     */
    public CheckList inspectionsToPerform(CheckList checkList){
        checkList = performInspection(checkList);
        writeCheckList(checkList);
        
        
        return checkList;
    }
    
    /**
     * Performs every single car inspection and update if the inspection was performed and if it was sucessfull
     * 
     * @param checkList  The list with inspections to perform on the car
     * @return Updated check list with the tasks that were performed on the car
     */
    public CheckList performInspection(CheckList checkList){
        List<CheckListItem> inspectionsToPerform = checkList.getCheckList();
        
        for(int i = 0; i < inspectionsToPerform.size(); i++){
            System.out.println("inspection performed: " + inspectionsToPerform.get(i).getInspectionItem() + "  cost: " + inspectionsToPerform.get(i).getCost());
            inspectionsToPerform.get(i).setInspectionStatus(true);
            inspectionsToPerform.get(i).setInspectionResult(true);
            System.out.println("was it successful: " + inspectionsToPerform.get(i).isInspectionResult() + "\n");
        }
        
       return checkList;
    }
    
    
    /**
     * Writes check list to the datebase
     * 
     * @param checkList  The list with inspections performed on the car
     * @return true if check list was saved sucesfully to the datebase
     */
    public boolean writeCheckList(CheckList checkList){
        boolean isCheckListSaved = false;
        
        DatabaseOfCheckLists databaseOfCheckList = new DatabaseOfCheckLists();
        
        
        isCheckListSaved = databaseOfCheckList.addCheckListToDatabase(checkList);
        if(isCheckListSaved){
            System.out.println("CheckList was saved successfully saved to the database\n");
        }
        
        return isCheckListSaved;
    }
    
}
