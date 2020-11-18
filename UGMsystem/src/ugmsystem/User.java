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
import java.io.*; 
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author reemalsolami
 */
public class User {
    private String id;
    private String password;
    private String fName;
    private String lName;
    private String phoneNumber;
    private String email;
    private int guestID=111;

    /**
     *
     */
    public static File accounts= new File ("account.txt");

    /**
     *
     */
    static protected ArrayList<User> userInfo = new ArrayList <User>();
 
    /**
     *
     * @param password
     * @param fName
     * @param lName
     * @param phoneNumber
     * @param email
     * @throws IOException
     */
    public User(String password, String fName, String lName, String phoneNumber, String email) throws IOException {
        
        this.id = this.generateID(phoneNumber);
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.email=email;
       
    }
    
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
    public User(String id, String password, String fName, String lName, String phoneNumber, String email) throws IOException {
        
        this.id = id;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.email=email;
       
    }
    
    /**
     *
     * @throws IOException
     */
    public User() throws IOException {
        
        this.id = this.generateGuestID();
       
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
        
    }

    /**
     *
     * @return
     */
    public String getfName() {
        return fName;
    }

    /**
     *
     * @return
     */
    public String getlName() {
        return lName;
    }

    /**
     *
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @param password
     * @throws IOException
     */
    public void setPassword(String password) throws IOException {
          
        this.password = password;
        Update(password);
        
    }

    /**
     *
     * @param fName
     * @throws IOException
     */
    public void setfName(String fName) throws IOException {
      
        this.fName = fName;
        Update(fName);
    }

    /**
     *
     * @param lName
     * @throws IOException
     */
    public void setlName(String lName) throws IOException {
     
        this.lName = lName;
        Update(lName);
    }

    /**
     *
     * @param phoneNumber
     * @throws IOException
     */
    public void setPhoneNumber(String phoneNumber) throws IOException {
       
        this.phoneNumber = phoneNumber;
        Update(phoneNumber);
    }

    /**
     *
     * @param email
     * @throws IOException
     */
    public void setEmail(String email) throws IOException {
       
        this.email = email;
        Update(email);
    }
    
    
   //Login Method: checks if user account exits and is compatible with password

    /**
     *
     * @param id
     * @param password
     * @return
     * @throws IOException
     */
    
    public static boolean login(String id, String password) throws IOException {
        
          fillArrayFromFile();
          //ArrayList<String> VendorInfo = Commodity.GetEachVendorInfo();  
          String t = isUser(id);
                   
          if(!(t.equals("-1"))){
           return passwordCorrect(password, t);}
             
         return false;}    
    
    
    //Register Method: checks that no user account of same info exists 
    //then creates a new account for user and registers user's information in accounts file

    /**
     *
     * @return
     * @throws IOException
     */
    
    public int register( ) throws IOException {

         fillArrayFromFile();
          if(noMatch())  {
              
        try {
            
            int n;
            FileWriter fileWriter = new FileWriter(accounts, true);;
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            userInfo.add(this);
            n=userInfo.size();
            
            
            bufferedWriter.write(userInfo.get(n-1).toString());
            bufferedWriter.write("\n");
            bufferedWriter.flush();
           
           
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return 1;
         
          } else{ return -1;} 
        
    } 

    //Generates an id for registered users
   private String generateID(String p){
        int count = p.length();
        String trim = p.trim();
        int r = (int) (Math.random()*100)+3332;
        String rID= r+""+trim.charAt(count-4)+trim.charAt(count-3)+
                trim.charAt(count-2)+trim.charAt(count-1);
         return rID;}

   //Generates an id for guest users
   private String generateGuestID(){
      
       String gID=  guestID +""+((int) (Math.random()*100)+2232);
       
       return gID;
    }
   
   
   //Used by login() method above to check if user try to login is actually regiestered

    /**
     *
     * @param testId
     * @return
     */
   public static String isUser(String testId){
           String line;
           String [] setter;
       
          for (int i = 0; i < userInfo.size(); i++)  {
              line= userInfo.get(i).toString();
             
             if(line.contains(testId.trim())) {
                 setter = line.split(",");
                 
                 return setter[1].trim();
             }    
          }
       
    return "-1";}
   
      //checks if user trying to register entered correct password
      private static boolean passwordCorrect(String testPassword, String t){
     
        if(t.equals(testPassword)){
                       return true; }
   
        return false;}
      
      //checks if current user using the system is a guest or a registered user

    /**
     *
     * @return
     */
      public boolean isGuest(){
        if(this.id.charAt(0)=='1' && this.id.charAt(1)=='1' && this.id.charAt(2)=='1')
          return true;
      return false;}
      
      
      //Used by register() method
      //checks if there  is an account with similiar data

    /**
     *
     * @return
     */
      public boolean noMatch(){
          String line;
        try {
            BufferedReader read2 = new BufferedReader(new FileReader(accounts));
            
       
            while((line=read2.readLine()) != null) {
            
            String s [] = line.split(",");
            if(s[4].equalsIgnoreCase(this.phoneNumber.trim()) || s[5].equalsIgnoreCase(this.email.trim())) {
                 return false;
             
          }
       } read2.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;}
      
    /**
     *
     * @param newUpdate
     * @throws IOException
     */
    public void Update(String newUpdate) throws IOException{
          String line;
          fillArrayFromFile();
         
        try 
        {
        
          for (int i = 0; i < userInfo.size(); i++)  {
            line= userInfo.get(i).toString();
             if(line.contains(newUpdate.trim())) {
                 userInfo.set(i, this);
             }    
          } 
                   FileWriter fileWriter = new FileWriter(accounts, false);
                   BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                   bufferedWriter.write("");
                   bufferedWriter.close();
                   
                   FileWriter fileWriter2 = new FileWriter(accounts, true);
                   BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
                   
                   for (int i = 0; i < userInfo.size(); i++) {
                   
                   bufferedWriter2.write(userInfo.get(i).toString());
                   bufferedWriter2.write("\n");
                  
                    }
                  bufferedWriter2.close();
                   
                   
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
      } 
    }

      
    @Override
      public String toString(){
       return this.id +","+this.password+","+ this.fName+","+this.lName+","+this.getPhoneNumber()+","+ this.getEmail();
      
      }
      
      
      //Method that is called by login to read all user accounts from file into array
      static void fillArrayFromFile() throws FileNotFoundException, IOException{
          String line;
          
          BufferedReader read2 = new BufferedReader(new FileReader(accounts));
            
          while((line=read2.readLine()) != null) {
            
            String s [] = line.split(",");
            if(isUser(s[0]).equals("-1")){
            userInfo.add(new User(s[0].trim(), s[1].trim(), s[2].trim(), s[3].trim(), s[4].trim(), s[5].trim()));
            }
            }
          read2.close();
      }


}
      
     

