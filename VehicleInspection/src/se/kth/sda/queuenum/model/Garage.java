package se.kth.sda.queuenum.model;
/**
 * Opens and Close the door to the garage
 * @author Group 2
 */
public class Garage {
    
    private Door door = new Door();
          
    /**
     * Calling the Door class to open the door
     */
    public void openDoor(){
        door.open();
    }
     /**
     * Calling the Door class to close the door
     */
    public void closeDoor(){
        door.close();
    }
}
