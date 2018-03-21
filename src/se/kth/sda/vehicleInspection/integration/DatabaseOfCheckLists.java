package se.kth.sda.vehicleInspection.integration;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/**
 * Datebase with list of inspections for all the cars
 */
public class DatabaseOfCheckLists {
    
    //private List<CheckList> databaseOfCheckLists;
    //private CheckList checklist;
    private HashMap<String,CheckList> databaseOfCheckLists;
    /**
     * Creates database where inspections will be saved
     */
    public DatabaseOfCheckLists(){
        databaseOfCheckLists = new HashMap<>();
        initiateChecklistDatebase();
    }
    
    
    /**
     * Adds check list to the database
     * @param checkList The list with inspections to perform on the car
     * @return true if check list was saved sucesfully to the datebase
     */
    public boolean addCheckListToDatabase(String vehicleRegNum,
                                          CheckList checkList){
        if(checkList != null){
            databaseOfCheckLists.put(vehicleRegNum,checkList);
            return true;
        }else{
            return false;
        }
    }
    
    
    /**
     * Gets check list from the database
     * 
     * @param index     Place where the check list is saved in the database
     * @return Check list with informations of inspections for a specigic car
     */
    public CheckList getCheckList(String vehicle){
        
        if(databaseOfCheckLists.containsKey(vehicle))
                {
                    return databaseOfCheckLists.get(vehicle);
                }
        return null;
    }
    
    public void initiateChecklistDatebase()
    {
        CheckListItem checklistitem1 = new CheckListItem("Engine", 100);
        CheckListItem checklistitem2 = new CheckListItem("Engine Oil", 200);
        
        CheckList checklist1 = new CheckList();
        checklist1.addObject(checklistitem1);
        checklist1.addObject(checklistitem2);
        
        //database = new DatabaseOfCheckLists();
        //database.addCheckListToDatabase("SBA447", checklist1);
        addCheckListToDatabase("SBA447", checklist1);
        
        CheckListItem checklistitem3 = new CheckListItem("Engine", 100);
        CheckListItem checklistitem4 = new CheckListItem("Engine Oil", 200);
        CheckListItem checklistitem5 = new CheckListItem("Door", 200);
        
        CheckList checklist2 = new CheckList();
        checklist2.addObject(checklistitem3);
        checklist2.addObject(checklistitem4);
        checklist2.addObject(checklistitem5);
        
//        database = new DatabaseOfCheckLists();
//        database.addCheckListToDatabase("SBA447", checklist1);
//        database.addCheckListToDatabase("SBA448", checklist2);
        addCheckListToDatabase("SBA448", checklist2);
    }
}
