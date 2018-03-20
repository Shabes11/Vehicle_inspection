package se.kth.sda.queuenum.integration;

import java.util.ArrayList;
import java.util.List;

/**
 * Datebase with list of inspections for all the cars
 */
public class DatabaseOfCheckLists {
    
    private List<CheckList> databaseOfCheckLists;
    
    /**
     * Creates database where inspections will be saved
     */
    public DatabaseOfCheckLists(){
        databaseOfCheckLists = new ArrayList<>();
    }
    
    
    /**
     * Adds check list to the database
     * @param checkList The list with inspections to perform on the car
     * @return true if check list was saved sucesfully to the datebase
     */
    public boolean addCheckListToDatabase(CheckList checkList){
        if(checkList != null){
            databaseOfCheckLists.add(checkList);
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
    public CheckList getCheckList(int index){
        
        if(databaseOfCheckLists.size() < index || databaseOfCheckLists.isEmpty()){
            return null;
        }else{
            return databaseOfCheckLists.get(index);
        }
    }
    
}
