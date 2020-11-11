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
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {
    private String id;
    private String password;
    private String fName;
    private String lName;
    private String phoneNumber;
    private String email;
    private int guestID=111;
    static String userAccount [];
    public static File accounts= new File ("account.txt");
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
   
    
    public User(String password, String fName, String lName, String phoneNumber, String email) throws IOException {
        this.fileWriter = new FileWriter(accounts, true);
        this.id = this.generateID(phoneNumber);
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.email=email;
       
    }
    
        public User(String id, String password, String fName, String lName, String phoneNumber, String email) {
        this.fileWriter = new FileWriter(accounts, true);
        this.id = id;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.email=email;
       
    }
    
        public User() {
        this.fileWriter = new FileWriter(accounts, true);
        this.id = this.generateGuestID();
       
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
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

    public void setPassword(String password) {
        this.password = password;
        setMatch(password);
        
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
    
    public static boolean login(String id, int password) {
           int t =isUser(id);
          if(t != 0){
           return passwordCorrect(password, t);}
             
         return false;}    
    
    public void register( ) {
         
          if(noMatch())  {
        try {
            
            
            bufferedWriter.write(this.id +","+this.password+","+
                    this.fName+","+this.lName+","+this.getPhoneNumber()+","+ this.getEmail());
            bufferedWriter.write("\n");
            bufferedWriter.close();
          //  fillUserArray(); 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          } 
        
    } 

   private String generateID(String p){
        int count = p.length();
        String trim = p.trim();
        int r = (int) (Math.random()*100)+3332;
        String rID= r+""+trim.charAt(count-4)+trim.charAt(count-3)+
                trim.charAt(count-2)+trim.charAt(count-1);
         return rID;}

   private String generateGuestID(){
      
       String gID=  guestID +""+((int) (Math.random()*100)+2232);
       
       return gID;
    }
   
   public static int isUser(String testId){
           String line;
        try {
            
          BufferedReader read3 = new BufferedReader(new FileReader(accounts));
       
          while((line=read3.readLine()) != null) {
              userAccount = line.split(",");
             if(userAccount[0].equalsIgnoreCase(testId.trim())) {
                 return Integer.parseInt(userAccount[1]);
             
          }
       } read3.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
       
 
       
    return -1;}
   
      private static boolean passwordCorrect(int testPassword, int t){
     
        if(t == testPassword){
                       return true; }
   
        return false;}
      
      public boolean isGuest(){
        if(this.id.charAt(0)=='1' && this.id.charAt(1)=='1' && this.id.charAt(2)=='1')
          return true;
      return false;}
      
      //checks if there  is an account with similiar data
      public boolean noMatch(){
          String line;
        try {
            BufferedReader read2 = new BufferedReader(new FileReader(accounts));
        
       
          while((line=read2.readLine()) != null) {
              System.out.println("here");
              String s [] = line.split(",");
             if(s[4].equalsIgnoreCase(this.phoneNumber.trim()) || s[5].equalsIgnoreCase(this.email.trim())) {
                 return false;
             
          }
       }} catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;}
      
      
        public boolean setMatch(String match){
          String line;
          String setter[];
        try {
            BufferedReader read2 = new BufferedReader(new FileReader(accounts));
        
       
          while((line=read2.readLine()) != null) {
             
             setter = line.split(",");
              for (int i = 0; i < setter.length; i++) {
                  if(setter[i].equalsIgnoreCase(match.trim())) {
                 bufferedWriter.write(id);
                 return setter;
              }
             
             
          }
       }} catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;}
      
     
}
