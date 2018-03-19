/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor

 */
package se.kth.sda.queuenum.model;

/**
 *
 * @author tmp-sda-1178
 */
public class Garage {
    private Door door = new Door();
    
    
    Garage(){
    
    }
    
    public boolean openDoor(){
        if (door.getDoorStatus() == true){
            door.open();
            return true;
        }
        else {
            return false;}
       }
    
    public boolean closeDoor(){
      if(customer.customerCameIn() == true){
        door.close();
        return true;
      }
      else{ 
          return false;
      }
    
    }
}
