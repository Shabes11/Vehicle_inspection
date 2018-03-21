/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.queuenum.view;
import se.kth.sda.queuenum.controller.*;
/**
 *
 * @author tmp-sda-1161
 */
import java.util.Scanner;
public class ApplicationView {
    
    private Controller controller;
    Scanner scanner;
    double cost = 0;
    boolean cardPayment;
    public ApplicationView(Controller cont)
    {
        controller = cont;
        scanner = new Scanner(System.in);
        
    }
    
    public void applicationView()
    {
        showMenu();
        String userInput = scanner.next();
        
        String vehNum = "";
        while(!userInput.equals("9")){
            switch(userInput){
                case "1":controller.controlQueueNumber();break;
                case "2":controller.controlOpenDoor();break;
                case "3":controller.controlCloseDoor();break;
                case "4":processVehicleNumber();break;
                case "5":
                            if(cost!= 0){
                                processPayment();break;
                            }
                            else{
                                System.out.println("Vehicle not verified");
                                break;
                            }
                            
                case "6":controller.controlPrintPaymentReceipt(cardPayment);
                        break;
                case "7":controller.controlperformInspection();break;
                case "8":controller.controlPrintInspectionResult();break;
                case "9":break;
            }
            showMenu();
            userInput = scanner.next();
        }
        controller.controlprintTotalsReport();
    }
    
    public void showMenu()
    {
        System.out.println("********************************************");
        System.out.println("<< Welcome to Car Inspection Company >> ");
        System.out.println("**********<< Main Menu >>*****************");
        System.out.println(">> 1 : Show Queue number");
        System.out.println(">> 2 : Open Door");
        System.out.println(">> 3 : Close Door");
        System.out.println(">> 4 : Verify Vehicle Reg Number");
        System.out.println(">> 5 : Process Payment");
        System.out.println(">> 6 : Print Payment Receipt");
        System.out.println(">> 7 : Start Inspection");
        System.out.println(">> 8 : Print Inspection Result");
        System.out.println(">> 9 : Exit and Print Today's Collection");
        System.out.println("************************************************** ");
        System.out.println("<<<< Please enter the required no from the list above >>>> ");
        System.out.print(">> ");
        
    }
    public void processPayment(){
        System.out.println("1 : Card Payment");
        System.out.println("2 : Cash Payment");
        String paymentOption = scanner.next();
        if (paymentOption.equals("1")){
            cardPayment=true;
            System.out.print("Enter card Number :");
            String cardNumber = scanner.next();
            if(controller.controlProcessCardPayment(cardNumber)){
                System.out.println("Card Payment Successfull");
            }
        }
        else if (paymentOption.equals("2")){
            cardPayment = false;
            System.out.print("Enter cash tendered by customer :");
            String tenderedMoney = scanner.next();
            double tenderedMoneyDouble = Double.valueOf(tenderedMoney);
            double change = controller.controlProcessCashPayment(tenderedMoneyDouble);
            if (change < 0){
                System.out.println("Money paid by customer is not sufficient");
            }
            else{
                System.out.println("Change returned :" + change);
                System.out.println("Cash Payment successful");
            }
        }
    }
    public void processVehicleNumber(){
        System.out.println("enter vehicle reg number");
        String vehNum = scanner.next();
        cost = controller.controlProcessVehicleNumber(vehNum);
        if (cost == 0){
            System.out.println("Not a valid Registration number");
        }
        else{
            System.out.println("Cost of vehicle inspection is " + cost);
        }
    }
            
}
