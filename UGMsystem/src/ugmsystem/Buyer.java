/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import static ugmsystem.User.userInfo;

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
 
    
    public static Buyer findUser( String userId) throws IOException{
         
           fillArrayFromFile();
           String line;
           String [] setter;
       
          for (int i = 0; i < userInfo.size(); i++)  {
              line= userInfo.get(i).toString();
             if(line.contains(userId.trim())) {
                 setter = line.split(",");
                 return new Buyer ( setter[0] , setter[1],setter[2],
                            setter[3], setter[4], setter[5]);
             }    
          }
        
    
    return null; }
        

}