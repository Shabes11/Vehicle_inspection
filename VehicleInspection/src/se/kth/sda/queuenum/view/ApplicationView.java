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
    
    public ApplicationView(Controller cont)
    {
        controller = cont;
    }
    
    public void applicationView()
    {
        showMenu();
        Scanner scanner;
        scanner = new Scanner(System.in);
        String userInput = scanner.next();
        
        String vehNum = "";
        while(!userInput.equals("8"))
        {
            
            controller.processCommand(userInput);
            
            
            showMenu();
            userInput = scanner.next();
           
        }
        
        
    }
    public void showMenu()
    {
        System.out.println("**********************************");
        System.out.println("Welcome to Car Inspection Company");
        System.out.println(">> 1 : Show Queue number");
        System.out.println(">> 2 : Open Door");
        System.out.println(">> 3 : Close Door");
        System.out.println(">> 4 : Enter Vehicle Reg Number");
        System.out.println(">> 5 : Start Inspection");
        System.out.println(">> 6 : Process Payment");
        System.out.println(">> 7 : Print Receipts");
        System.out.println(">> 8 : Exit");
        System.out.print(">> ");
        
    }
}
