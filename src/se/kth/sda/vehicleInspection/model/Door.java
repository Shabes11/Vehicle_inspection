package se.kth.sda.vehicleInspection.model;


/**
 * Responsible for opening and closing the garages's door
 *
 * @author Group 2
 */
public class Door {

    private boolean doorIsOpen;

    /**
     * Door is closed as default
     */
    public Door() {
        doorIsOpen = false;
    }

    public boolean getDoorStatus() {
        return doorIsOpen;
    }
    /**
     * Opens the door
     */
    public void open() {

        if (!doorIsOpen) {

            System.out.println(">>>Door is open<<<");
            System.out.println("");
            doorIsOpen = true;
        } else {
            System.out.println(">>>Door is already open<<<");
            System.out.println("");
        }

    }
    /**
    * Closes the door
    */
    public void close() {

        if (doorIsOpen) {
            System.out.println(">>>Door is close <<<<");
            System.out.println("");
            doorIsOpen = false;
        } else {
            System.out.println(">>>Door is already closed <<<<");
            System.out.println("");
        }

    }
}
