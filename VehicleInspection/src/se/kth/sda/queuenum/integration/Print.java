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
}
