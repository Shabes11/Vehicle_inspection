package se.kth.sda.vehicleInspection.model;
import java.util.Date;

/**
 * Strores and accepts money
 * @author Group 2
 */

public class GarageMoney {
    
    private double moneyFromCard;
    private double moneyFromCash;
    private double totalMoney;
    Date dateofMoney;
    /**
     * Set the date for today's date
     */
    public GarageMoney(){
        dateofMoney = new Date();
    }
    public double getCardMoney(){
        return moneyFromCard;
    }
    public double getCashMoney(){
        return moneyFromCash;
    }
    public double getTotalMoney(){
        return totalMoney;
    }
    
    /**
     * Accepts money from the card and adding it to total money
     * @param cost The amount the customer is charged
     */
    public void accumulateCardMoney(double cost){
        this.moneyFromCard += cost;
        accumulateTotalMoney(cost);
    }
    /**
     * Calculates the change the customer should receive back
     * @param moneyFromCash Money received from the customer
     * @param cost  Cost of the inspection
     * @return Change for the customer
     */
    public double accumulateCashMoney(double moneyFromCash, double cost){
        
        double change = moneyFromCash - cost;
        if(change >= 0){
            this.moneyFromCash += cost;
            accumulateTotalMoney(cost);
        }
        return change;
    }

    /**
     * Adds money to the business cash
     * @param cost Cost of the inspection
     */
    private void accumulateTotalMoney(double cost){
        this.totalMoney += cost; 
    }

    public Date getDate(){
        return dateofMoney;
    }
        
}
