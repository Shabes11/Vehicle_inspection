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
    
    private List<CheckListItem> checkList;
    
    public CheckList(){
        checkList = new ArrayList<>();
    }

    public List<CheckListItem> getCheckList() {
        return checkList;
    }

    public void setCheckList(List<CheckListItem> checkList) {
        this.checkList = checkList;
    }
    
    
    public void addObject(CheckListItem newObject){
        
    }
}
