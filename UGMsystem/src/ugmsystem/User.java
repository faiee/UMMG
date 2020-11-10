/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

/**
 *
 * @author reemalsolami
 */
import java.lang.Math;
import java.util.Scanner; 
import java.io.*; 
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {
    private String id;
    private int password;
    private String fName;
    private String lName;
    private String phoneNumber;
    private String email;
    private int guestID=0000;

    
    public User(int password, String fName, String lName, String phoneNumber) {
        this.id = this.generateID(phoneNumber);
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
    }
    
        public User() {
        this.id = this.generateGuestID();
       
    }

    public String getId() {
        return id;
    }

    public int getPassword() {
        return password;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean login(String id, int password) {
             File accounts= new File ("account.txt");
        try {
            BufferedReader read = new BufferedReader(new FileReader(accounts));
            String line;
            String array []; 
            while((line=read.readLine()) != null) {
                array =line.split(",");
               if(array[0].trim().equalsIgnoreCase(id)) {
                   if(Integer.parseInt(array[1].trim()) == password){
                       return true; }
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
             
         return false;}    
    
    public void register( ) {
        
       
        File accounts= new File ("account.txt");
        try {
            
           
            FileWriter fileWriter;
            fileWriter = new FileWriter(accounts, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(this.id +","+this.password+","+
                    this.fName+","+this.lName+","+this.getPhoneNumber());
            bufferedWriter.write("\n");
            bufferedWriter.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    } 
    public void browse() {
        
    }

    public String generateID(String p){
        int count = p.length();
        String trim = p.trim();
        int r = (int) Math.random();
        String rID= r+""+trim.charAt(count-4)+trim.charAt(count-3)+
                trim.charAt(count-2)+trim.charAt(count-1);
         return rID;}

   public String generateGuestID(){
       
       guestID++;
       
       return guestID+"" ;
    }

}
