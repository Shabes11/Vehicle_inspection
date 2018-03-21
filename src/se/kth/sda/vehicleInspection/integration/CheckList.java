/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.queuenum.integration;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tmp-sda-1159
 */
public class CheckList {
    
    private ArrayList<CheckListItem> checkList;
    
    public CheckList(){
        checkList = new ArrayList<>();
    }

    public ArrayList<CheckListItem> getCheckList() {
        return checkList;
    }

    public void setCheckList(ArrayList<CheckListItem> checkList) {
        this.checkList = checkList;
    }
    
    
    public void addObject(CheckListItem newObject){
        checkList.add(newObject);
    }
}
