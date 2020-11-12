/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static ugmsystem.User.accounts;
import static ugmsystem.User.userAccount;

/**
 *
 * @author reemalsolami
 */
public class Buyer extends User {
    
    private ArrayList<Commodity> items = new ArrayList<Commodity>();
   

    public Buyer( String id, String password, String fName, String lName, String phoneNumber, String email) throws IOException {
        super(id,password, fName, lName, phoneNumber, email);
      
    }

   public Buyer( String password, String fName, String lName, String phoneNumber, String email) throws IOException {
        super(password, fName, lName, phoneNumber, email);
      
    }

    public Buyer() throws IOException {
        super();
    }

   
    public ArrayList<Commodity> getItems() {
        return items;
    }

    
    public void setItems(ArrayList<Commodity> items) {
        this.items = items;
    }

    
    public void rateVendor(Vendor vID, int rate) {
        vID.setRate(rate);
    }
    
  /*  public Order selectOrder(Order order) {
       return null;
    } */
        public static Buyer findUser( String userId, int password){
         
       
       
            BufferedReader read3 = null;
        try {
            String line;
            read3 = new BufferedReader(new FileReader(accounts));
            while((line=read3.readLine()) != null) {
                userAccount = line.split(",");
                if(userAccount[0].equalsIgnoreCase(userId.trim())) {
                    return new Buyer ( User.userAccount[0] , User.userAccount[1],User.userAccount[2],
                            User.userAccount[3], User.userAccount[4], User.userAccount[5]);
                    
                }
            }} catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                read3.close();
            } catch (IOException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    return null; }
        

}