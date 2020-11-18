/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;


import java.io.IOException;
import java.util.*;

/**
 *This class is used to create Vendor objects that sell commodities.
 * @author reemalsolami
 */
public class Vendor extends User{

    /**
     *static ArrayList attribute used to store commodities sold by vendor.
     */
    static public ArrayList<Commodity> vendorCommodity = new ArrayList<Commodity>();

    /**
     *Constructor used to create Vendor objects from this class.
     * @param id String
     * @param password String
     * @param fName String
     * @param lName String
     * @param phoneNumber String
     * @param email String
     * @throws IOException
     */
    public Vendor( String id, String password, String fName, String lName, String phoneNumber, String email) throws IOException {
        super( id, password, fName, lName, phoneNumber, email);
       
    }
   
    /**
     *Method used to create advertisement of a commodity to be sold by  
     * vendor and adds it to vendorCommodity ArrayList
     * @param item Commodity
     */
    public void createAd(Commodity item) {
        
       vendorCommodity.add(item);
    } 

}
