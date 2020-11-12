/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author reemalsolami
 */
public class Vendor extends User{
    private ArrayList<Commodity> vendorCommodity = new ArrayList<Commodity>();
    private int rate;

    public Vendor( String id, String password, String fName, String lName, String phoneNumber, String email) throws IOException {
        super( id, password, fName, lName, phoneNumber, email);
    }



    public ArrayList<Commodity> getVendorCommodity() {
        return vendorCommodity;
    }


    public int getRate() {
        return rate;
    }
    

    public void setVendorCommodity(ArrayList<Commodity> vendorCommodity) {
        this.vendorCommodity = vendorCommodity;
    }


    public void setRate(int rate) {
        this.rate = rate;
    }
    
    
   public void createAd(Commodity item) {
        
       vendorCommodity.add(item);
    } 
    
   
   
}
