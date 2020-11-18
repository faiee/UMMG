/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.io.*;
import static ugmsystem.User.userInfo;

/**
 *This is  a class that is used  to create Buyer object when user logins in,registers in the system, enters as guest
 * @author reemalsolami
 */
public class Buyer extends User {
    
    /**
     *This constructor is  used to create buyer objects from class buyer when user logs in
     * @param id String
     * @param password String
     * @param fName String
     * @param lName String
     * @param phoneNumber String
     * @param email String
     * @throws IOException
     */
    public Buyer( String id, String password, String fName, String lName, String phoneNumber, String email) throws IOException {
        super(id,password, fName, lName, phoneNumber, email);
      
    }

    /**
     *This constructor is  used to create buyer objects from class buyer when user registers
     * @param password String
     * @param fName String
     * @param lName String
     * @param phoneNumber String
     * @param email String
     * @throws IOException
     */
    public Buyer( String password, String fName, String lName, String phoneNumber, String email) throws IOException {
        super(password, fName, lName, phoneNumber, email);
      
    }

    /**
     *This constructor is  used to create buyer objects from class buyer when user is a guest
     * @throws IOException
     */
    public Buyer() throws IOException {
        super();
    }
 
    /**
     *This method is called to find user account in accounts file when trying to login
     * @param userId String
     * @return
     * @throws IOException
     */
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