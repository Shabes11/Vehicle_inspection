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
    private DatabaseOfCheckLists database;
    private CheckList checklist;
    private ArrayList<CheckListItem> list;
    private InspectionClass inspectionclass;
    private Print print;
    private PaymentAuthorization paymentAuthorization;
    double cost=0;    
    double change = 0;
    double tenderedCash;
    
    public Controller() {
        garage = new Garage();
        garagemoney = new GarageMoney();
        queuenumber = new QueueNumber();
        inspectionclass = new InspectionClass();
        print = new Print();
        database = new DatabaseOfCheckLists();
        paymentAuthorization = new PaymentAuthorization();
    }
    
    public void controlQueueNumber(){
        queuenumber.displayQueueNumber();
        queuenumber.nextQueueNumber();
    }
    
    public void controlOpenDoor(){
        garage.openDoor();
    }
    
    public void controlCloseDoor(){
        garage.closeDoor();
    }
    
    public double controlProcessVehicleNumber(String vehNum)
    {
        try {
            checklist = database.getCheckList(vehNum);
            list =  checklist.getCheckList();
            for (CheckListItem checklistitem:list){
                cost += checklistitem.getCost();
            }
        }
        catch(NullPointerException e){
            System.out.println("No Checklist found");
        }
        return cost;
    }
    
    public boolean controlProcessCardPayment(String cardNumber){
        if(paymentAuthorization.cardAuthorization(cardNumber))
        {
            garagemoney.accumulateCardMoney(cost);
            return true;
        }
        return false;
    }
    
    
    public double controlProcessCashPayment(double tenderedMoney){
        tenderedCash = tenderedMoney;
        return change = garagemoney.accumulateCashMoney(tenderedMoney,cost);
    }
    
    public void controlperformInspection(){
        inspectionclass.performInspection(checklist);
    }
    
    public void controlPrintInspectionResult(){
        print.printInspectionResult(checklist);
    }
    
    public void controlPrintPaymentReceipt(boolean card){
        print.printPaymentReceipt(card,cost,tenderedCash,change);
                
    }
    
    public void controlprintTotalsReport(){
        print.printTotalsReport(garagemoney.getDate(),
                                garagemoney.getCardMoney(),
                                garagemoney.getCashMoney(),
                                garagemoney.getTotalMoney());
    }
            
 }
