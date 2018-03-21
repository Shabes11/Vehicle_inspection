/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.queuenum.model;

/**
 *
 * @author tmp-sda-1161
 */
import java.util.Date;
public class GarageMoney {
    private double moneyFromCard;
    private double moneyFromCash;
    private double totalMoney;
    Date dateofMoney;
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
    
    public void accumulateCardMoney(double cost){
        this.moneyFromCard += cost;
        accumulateTotalMoney(cost);
    }
    public double accumulateCashMoney(double moneyFromCash, double cost){
        this.moneyFromCash += cost;
        double change = moneyFromCash - cost;
        if(change > 0){
            accumulateTotalMoney(cost);
        }
        return change;
    }
    private void accumulateTotalMoney(double cost){
        this.totalMoney += cost; 
    }
    public Date getDate(){
        return dateofMoney;
    }
            
}
