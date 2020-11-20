/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

/**
 *These are the imports needed by this class to operate
 * @author reemalsolami
 */
import java.io.*; 
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *This class is the parent of Buyer and Vendor class it contains all methods used by both of these classes
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
     * Static file object that saves all registered user accounts.
     */
    public static File accounts= new File ("account.txt");

    /**
     *Static ArrayList that reads up to date user information from file.
     */
    static protected ArrayList<User> userInfo = new ArrayList <User>();
 
    /**
     *Constructor used to make objects for newly registered users who have no id and calls generateID() method
     * @param password String
     * @param fName String
     * @param lName String
     * @param phoneNumber String
     * @param email String
     * @throws IOException calls generateID() method
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
     *Constructors used to make object of users who are already registered and are trying to login
     * @param id String
     * @param password String
     * @param fName String
     * @param lName String
     * @param phoneNumber String
     * @param email String
     * @throws IOException to avoid user input errors
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
     *Constructors used to make guest user object and calls generateGuestID() method
     * @throws IOException calls generateGuestID()
     */
    public User() throws IOException {
        
        this.id = this.generateGuestID();
       
    }

    /**
     *Accessors/get method returns user id
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     *Accessors/get method returns user password
     * @return String
     */
    public String getPassword() {
        return password;
        
    }

    /**
     *Accessors/get method returns user first name
     * @return String
     */
    public String getfName() {
        return fName;
    }

    /**
     * Accessors/get method returns user last name
     * @return String
     */
    public String getlName() {
        return lName;
    }

    /**
     * Accessors/get method returns user phone number
     * @return String
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *Accessors/get method returns user email
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     *Mutator/set method sets user id
     * @param id String
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *Mutator/set method sets user password
     * @param password String
     * @throws IOException calls update method that updates password in file 
     */
    public void setPassword(String password) throws IOException {
          
        this.password = password;
        Update(password);
        
    }

    /**
     *Mutator/set method sets user first name
     * @param fName String
     * @throws IOException calls update method that updates user first name in file
     */
    public void setfName(String fName) throws IOException {
      
        this.fName = fName;
        Update(fName);
    }

    /**
     *Mutator/set method sets user last name
     * @param lName String
     * @throws IOException calls update method that updates user last name in file
     */
    public void setlName(String lName) throws IOException {
     
        this.lName = lName;
        Update(lName);
    }

    /**
     *Mutator/set method sets user phoneNumber
     * @param phoneNumber String
     * @throws IOException calls update method that updates user phoneNumber in file
     */
    public void setPhoneNumber(String phoneNumber) throws IOException {
       
        this.phoneNumber = phoneNumber;
        Update(phoneNumber);
    }

    /**
     *Mutator/set method sets user email
     * @param email String
     * @throws IOException calls update method that updates user's email in file
     */
    public void setEmail(String email) throws IOException {
       
        this.email = email;
        Update(email);
    }
    

    /**
     *Login Method: checks if user account exits and is compatible with password
     * @param id String
     * @param password String
     * @return boolean
     * @throws IOException calls fillArrayFromFile() method that fills used array from file by using buffered reader
     */
    
    public static boolean login(String id, String password) throws IOException {
        
          fillArrayFromFile();
          String t = isUser(id);
                   
          if(!(t.equals("-1"))){
           return passwordCorrect(password, t);}
             
         return false;}    
 
    
    /**
     *Register Method: checks that no user account of same info exists 
     * then creates a new account for user and registers user's information in accounts file
     * @return integer
     * @throws IOException calls fillArrayFromFile() method that fills used array from file by using buffered reader
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


    /**
     *Generates an id for registered users
     * Called in constructor
     * @param p String
     * @return String
     */
   private String generateID(String p){
        int count = p.length();
        String trim = p.trim();
        int r = (int) (Math.random()*100)+3332;
        String rID= r+""+trim.charAt(count-4)+trim.charAt(count-3)+
                trim.charAt(count-2)+trim.charAt(count-1);
         return rID;}

   
    /**
     *Generates an id for guest users
     * Called in empty constructor
     * @return String
     */
   private String generateGuestID(){
      
       String gID=  guestID +""+((int) (Math.random()*100)+2232);
       
       return gID;
    }
   
   

    /**
     *Used by login() method above to check if user try to login is actually registered
     * @param testId String
     * @return String
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
   
      

    /**
     *Checks if user trying to register entered correct password
     * @param testPassword String
     * @param t String
     * @return boolean
     */
      private static boolean passwordCorrect(String testPassword, String t){
     
        if(t.equals(testPassword)){
                       return true; }
   
        return false;}
      

    /**
     *Checks if current user using the system is a guest or a registered user
     * @return boolean
     */
      public boolean isGuest(){
        if(this.id.charAt(0)=='1' && this.id.charAt(1)=='1' && this.id.charAt(2)=='1')
          return true;
      return false;}
      

    /**
     *Used by register() method
     * Checks if there  is an account with similar data
     * @return boolean
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
     * Method that receives update of user account information and updates file and ArrayList userInfo
     * @param newUpdate String
     * @throws IOException calls fillArrayFromFile() method that fills used array from file by using buffered reader
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

       /**
     * Override Method toString that converts user object to string
     * @return  String
     * 
     */
    @Override
      public String toString(){
       return this.id +","+this.password+","+ this.fName+","+this.lName+","+this.getPhoneNumber()+","+ this.getEmail();
      
      }
   

    /**
     *Method that is called by login to read all user accounts from file into ArrayList userInfo
     * @throws FileNotFoundException to create a file object that reads from account file
     * @throws IOException fills used static array from file by using buffered reader
     */
      public static void fillArrayFromFile() throws FileNotFoundException, IOException{
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
      
     

