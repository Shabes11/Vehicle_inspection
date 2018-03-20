/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.queuenum.model;

/**
 *
 * @author tmp-sda-1178
 */
public class Door {
    
    private  boolean doorIsOpen;
    
    public Door(){
       doorIsOpen = false;  
     }
    
    
    boolean getDoorStatus(){
      return doorIsOpen;
    }
    
    
   
    public void open(){
        System.out.print("Door is open");
      doorIsOpen = true;
    }       
     
    
    public void close(){
        System.out.print("Door is close");
        doorIsOpen=false;
    }
}
