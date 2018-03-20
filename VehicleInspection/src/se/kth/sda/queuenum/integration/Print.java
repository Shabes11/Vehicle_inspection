/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.queuenum.integration;

/**
 *
 * @author tmp-sda-1161
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Print {
    /**
     * prints receipt for the money paid by the customer
     */
    CheckList checklist;
    public void printReceipt()
    {
       //print customer name
        //total cost
        //mode of payment
        /** money rendered
         * change 
         */
    }
    
    
    /**
     * prints car inspection results after inspection.
     */
    //public void printInspectionResult(ArrayList<ChecklistItem> checklistitem)
    public void printInspectionResult(CheckList checklist)
    {   printReportHeading();
        String c0;
        String c1 = "Not Done";
        String c2;
        String c3;
        
        List<CheckListItem> checklistofcurrentcar  = checklist.getCheckList();
        
        for (CheckListItem checkListItem: checklistofcurrentcar)
        {
            c0 = checkListItem.getInspectionItem();
            if(checkListItem.isInspectionStatus())
            {
                c1 = "Done";
            }
            
            c2 = checkListItem.isInspectionResult();
            c3 = String.valueOf(checkListItem.getCost());
            System.out.printf("%-20s %-20s %-20s %-20s%n", c0, c1, c2, c3);
        }
    }
    public void printReportHeading()
    {
        String carModel;
        //System.out.println("Model :" + carModel);
        String c0 = "Inspection Item";
        String c1 = "Inspection Status";
        String c2 = "Inspection Result";
        String c3 = "Cost";
        
        System.out.printf("%-20s %-20s %-20s %-20s%n", c0, c1, c2, c3);
    }
    
    public void printReceiptHeading(){
        String c0 = "Mode of Payment";
        String c1 = "Cost Incurred";
        String c2 = "Paid Amount";
        String c3 = "Change Amount";
        
        System.out.printf("%-20s %-20s %-20s %-20s%n", c0, c1, c2, c3);
    }
    
    public void printPaymentReceipt(boolean card,double cost, double cash,
                                    double change)
    {   printReceiptHeading();
        String c0;
        String c1 = String.valueOf(cost);
        String c2;
        if (card){ c0 = "Card";
            c2 = String.valueOf(cost);
            change = 0;
        }
        else { c0 = "Cash";c2 = String.valueOf(cash);}
        String c3 = String.valueOf(change);
        System.out.printf("%-20s %-20s %-20s %-20s%n", c0, c1, c2, c3);
    }
    public void printTotalsReport(Date today,double cardPayments, 
                                  double cashPayments, double total){
        printTotalsHeading();
        SimpleDateFormat simpledateformat = new SimpleDateFormat("MM/dd/yyyy");
        
        String c0 = String.valueOf(simpledateformat.format(today));
        String c1 = String.valueOf(cardPayments);
        String c2 = String.valueOf(cashPayments);
        String c3 = String.valueOf(total);
        System.out.printf("%-20s %-20s %-20s %-20s%n", c0, c1, c2, c3);
    }
    public void printTotalsHeading(){
        String c0 = "Date";
        String c1 = "Card Payments";
        String c2 = "Cash Payments";
        String c3 = "Total Earnings";
        System.out.printf("%-20s %-20s %-20s %-20s%n", c0, c1, c2, c3);
    }
            
    
}
