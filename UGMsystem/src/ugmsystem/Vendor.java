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
public class Vendor {
    private ArrayList<Commodity> vendorCommodity = new ArrayList<Commodity>();
    private Buyer bID;
    private String stateLicense;

    public Vendor(Buyer bID, String stateLicense) {
        this.bID = bID;
        this.stateLicense = stateLicense;
    }

    public ArrayList<Commodity> getVendorCommodity() {
        return vendorCommodity;
    }

    public Buyer getbID() {
        return bID;
    }

    public String getStateLicense() {
        return stateLicense;
    }

    public void setVendorCommodity(ArrayList<Commodity> vendorCommodity) {
        this.vendorCommodity = vendorCommodity;
    }

    public void setbID(Buyer bID) {
        this.bID = bID;
    }

    public void setStateLicense(String stateLicense) {
        this.stateLicense = stateLicense;
    }
    
   public void createAd(Commodity item) {
        
    } 
    
}
