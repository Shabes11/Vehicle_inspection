package se.kth.sda.queuenum.controller;

import se.kth.sda.queuenum.model.*;
import se.kth.sda.queuenum.integration.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * This is the application's only controller. All calls to the model pass
 * through here.
 */
public class Controller {

    /**
     * Instantiates a new Controller and creates a {@link Display} object.
     */
    Scanner scanner = new Scanner(System.in);
    private Garage garage;
    private GarageMoney garagemoney;
    private QueueNumber queuenumber;
    DatabaseOfCheckLists database;
    CheckList checklist;
    ArrayList<CheckListItem> list;
    InspectionClass inspectionclass;
    int cost=0;    
    
    public Controller() {
        garage = new Garage();
        garagemoney = new GarageMoney();
        queuenumber = new QueueNumber();
        inspectionclass = new InspectionClass();
        initiateChecklistDatebase();
        
    }

    
    public void processCommand(String option) {
        switch (option) {
            case "1":queuenumber.displayQueueNumber();
                     queuenumber.nextQueueNumber();break;
            case "2":garage.openDoor();break;
            case "3":garage.closeDoor();break;
            case "4":processVehicleNumber();break;
            case "5":inspectionclass.performInspection(checklist);break;
            case "6":break;
            case "7": 
            
        }
    }
    public void initiateChecklistDatebase()
    {
        CheckListItem checklistitem1 = new CheckListItem("Engine", 100);
        CheckListItem checklistitem2 = new CheckListItem("Engine Oil", 200);
        
        CheckList checklist1 = new CheckList();
        checklist1.addObject(checklistitem1);
        checklist1.addObject(checklistitem2);
        
        database = new DatabaseOfCheckLists();
        database.addCheckListToDatabase("SBA447", checklist1);
        
        
        CheckListItem checklistitem3 = new CheckListItem("Engine", 100);
        CheckListItem checklistitem4 = new CheckListItem("Engine Oil", 200);
        CheckListItem checklistitem5 = new CheckListItem("Door", 200);
        
        CheckList checklist2 = new CheckList();
        checklist2.addObject(checklistitem3);
        checklist2.addObject(checklistitem4);
        checklist2.addObject(checklistitem5);
        
        database = new DatabaseOfCheckLists();
        database.addCheckListToDatabase("SBA447", checklist1);
        database.addCheckListToDatabase("SBA448", checklist2);
        
    }
    
    public void processVehicleNumber()
    {
        
        System.out.println("enter vehicle reg number");
        String vehNum = scanner.next();
        
        try {
            
            checklist = database.getCheckList(vehNum);
            list =  checklist.getCheckList();
            for (CheckListItem checklistitem:list)
            {
                cost += checklistitem.getCost();
            }

            System.out.println("Cost of vehicle inspection is " + cost);
        }
        catch(NullPointerException e){
            System.out.println("Not a valid Registration number");
        }
    }
}
