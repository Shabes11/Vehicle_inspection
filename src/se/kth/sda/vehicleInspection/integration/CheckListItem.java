/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleInspection.integration;

/**
 *
 * @author tmp-sda-1159
 */
public class CheckListItem {
    
    private String inspectionItem;
    private boolean inspectionStatus;
    private String inspectionResult;
    private double cost;

    
    
    public CheckListItem(String inspectionItem, double cost){
        this.inspectionItem = inspectionItem;
        this.cost = cost;
        this.inspectionStatus = false;
        this.inspectionResult = "Fail";
        
    }

    public void setInspectionItem(String inspectionItem) {
        this.inspectionItem = inspectionItem;
    }

    public void setInspectionStatus(boolean inspectionStatus) {
        this.inspectionStatus = inspectionStatus;
    }

    public void setInspectionResult(String inspectionResult) {
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

    public String isInspectionResult() {
        return inspectionResult;
    }

    public double getCost() {
        return cost;
    }
    
    
    
}
