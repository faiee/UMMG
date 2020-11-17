/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author reemalsolami
 */
public class Vendor extends User{

    /**
     *
     */
    static public ArrayList<Commodity> vendorCommodity = new ArrayList<Commodity>();
    private int rate;
    private String id;

    /**
     *
     * @param id
     * @param password
     * @param fName
     * @param lName
     * @param phoneNumber
     * @param email
     * @throws IOException
     */
    public Vendor( String id, String password, String fName, String lName, String phoneNumber, String email) throws IOException {
        super( id, password, fName, lName, phoneNumber, email);
        id=id;
    }

    /**
     *
     * @return
     */
    public static ArrayList<Commodity> getVendorCommodity() {
        return vendorCommodity;
    }

    /**
     *
     * @param vendorCommodity
     */
    public static void setVendorCommodity(ArrayList<Commodity> vendorCommodity) {
        Vendor.vendorCommodity = vendorCommodity;
    }

    /**
     *
     * @return
     */
    public int getRate() {
        return rate;
    }

    /**
     *
     * @param rate
     */
    public void setRate(int rate) {
        this.rate = rate;
    }
    
    /**
     *
     * @param item
     */
    public void createAd(Commodity item) {
        
       vendorCommodity.add(item);
    } 

    public static File getAccounts() {
        return accounts;
    }

    public static ArrayList<User> getUserInfo() {
        return userInfo;
    }

    public static void setAccounts(File accounts) {
        User.accounts = accounts;
    }

    public static void setUserInfo(ArrayList<User> userInfo) {
        User.userInfo = userInfo;
    }

    public String getId() {
        return id;
    }
    
   
   
}
