/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.queuenum.integration;

/**
 *
 * @author tmp-sda-1159
 */
public class CheckListItem {
    
    private String inspectionItem;
    private boolean inspectionStatus;
    private boolean inspectionResult;
    private double cost;

    
    
    public CheckListItem(String inspectionItem, double cost){
        this.inspectionItem = inspectionItem;
        this.cost = cost;
        this.inspectionStatus = false;
        this.inspectionResult = false;
        
    }

    public void setInspectionItem(String inspectionItem) {
        this.inspectionItem = inspectionItem;
    }

    public void setInspectionStatus(boolean inspectionStatus) {
        this.inspectionStatus = inspectionStatus;
    }

    public void setInspectionResult(boolean inspectionResult) {
        this.inspectionResult = inspectionResult;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    
    public String getInspectionItem() {
        return inspectionItem;
    }

    public boolean isInspectionStatus() {
        return inspectionStatus;
    }

    public boolean isInspectionResult() {
        return inspectionResult;
    }

    public double getCost() {
        return cost;
    }
    
    
    
}
