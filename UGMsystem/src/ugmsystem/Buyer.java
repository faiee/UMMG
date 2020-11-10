/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.util.*;

/**
 *
 * @author reemalsolami
 */
public class Buyer extends User {
    
    private ArrayList<Commodity> items = new ArrayList<Commodity>();
    private Vendor vID;

    public Buyer(Vendor vID, String id, int password, String fName, String lName, String phoneNumber) {
        super(password, fName, lName, phoneNumber);
        this.vID = vID;
    }


    public ArrayList<Commodity> getItems() {
        return items;
    }

    public Vendor getvID() {
        return vID;
    }

    public void setItems(ArrayList<Commodity> items) {
        this.items = items;
    }

    public void setvID(Vendor vID) {
        this.vID = vID;
    }
    
    public void rateVendor(Vendor vID, int rate) {
        vID.setRate(rate);
    }
    
  /*  public Order selectOrder(Order order) {
       return null;
    } */
}