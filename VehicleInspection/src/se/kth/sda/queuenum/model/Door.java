/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.queuenum.model;


/*
    
     * @author tmp-sda-1178
 */
public class Door {

    private boolean doorIsOpen;

    public Door() {
        doorIsOpen = false;
    }

    boolean getDoorStatus() {
        return doorIsOpen;
    }

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
