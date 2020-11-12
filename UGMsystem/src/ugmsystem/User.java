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
    private ArrayList userInfo = new ArrayList();
 
   
    
    public User(String password, String fName, String lName, String phoneNumber, String email) throws IOException {
        
        this.id = this.generateID(phoneNumber);
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.email=email;
       
    }
    
        public User(String id, String password, String fName, String lName, String phoneNumber, String email) throws IOException {
        
        this.id = id;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
        this.email=email;
       
    }
    
        public User() throws IOException {
        
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
       // updatePassword(password);
        this.password = password;
        
        
    }

    public void setfName(String fName) {
      //  updateFName(fName);
        this.fName = fName;
    }

    public void setlName(String lName) {
      //  updateLName(lName);
        this.lName = lName;
    }

    public void setPhoneNumber(String phoneNumber) {
       // updatePhonenumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
       // updateEmail(email);
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
            BufferedReader read2 = new BufferedReader(new FileReader(accounts));
            String buffer [];
            FileWriter fileWriter = new FileWriter(accounts, true);;
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write(this.id +","+this.password+","+
                    this.fName+","+this.lName+","+this.getPhoneNumber()+","+ this.getEmail());
           
            bufferedWriter.write("\n");
          
            bufferedWriter.flush();
            
            
            buffer  = read2.readLine().split(",");
            System.out.println("buffer[1]"+buffer[1]);
            userInfo.add(Arrays.asList(buffer));
            
          
            
            
            
          
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
      
      
      
      
    /*    public void updatePassword(String match){
        
          String [] setter;
           try {
           
              for(int i =0 ; i<userInfo.size();i++){
                 setter= userInfo.get(i).toString().split("[\\[,\\]]");
                
                if(setter[2].trim().equals(this.password)){
                   
                    setter[2]=match;
                  }
                
                 FileWriter fileWriter = new FileWriter(accounts, false);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                
                 bufferedWriter.write(setter[1]+","+setter[2]+","+
                         setter[3]+","+setter[4]+","+setter[5]+","+setter[6]);
                 
                 bufferedWriter.write("\n");
                 bufferedWriter.close();
              
             

          }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
         
         public void updateFName(String match){
        
          String [] setter;
           try {
           
              for(int i =0 ; i<userInfo.size();i++){
                 setter= userInfo.get(i).toString().split("[\\[,\\]]");
             if(setter[3].trim().equals(this.fName)){
                    setter[3]=match;
                }
                
                
                 FileWriter fileWriter = new FileWriter(accounts, false);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                
                 bufferedWriter.write(setter[1]+","+setter[2]+","+
                         setter[3]+","+setter[4]+","+setter[5]+","+setter[6]);
                 
                 bufferedWriter.write("\n");
                 bufferedWriter.close();
              
             

          }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
      
     

         public void updateLName(String match){
        
          String [] setter;
           try {
           
              for(int i =0 ; i<userInfo.size();i++){
                 setter= userInfo.get(i).toString().split("[\\[,\\]]");
             if(setter[4].trim().equals(this.lName)){
                    setter[4]=match;
                }
                
                
                 FileWriter fileWriter = new FileWriter(accounts, false);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                
                 bufferedWriter.write(setter[1]+","+setter[2]+","+
                         setter[3]+","+setter[4]+","+setter[5]+","+setter[6]);
                 
                 bufferedWriter.write("\n");
                 bufferedWriter.close();
              
             

          }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
         
           public void updatePhonenumber(String match){
        
              String [] setter;
              try {
           
              for(int i =0 ; i<userInfo.size();i++){
                 setter= userInfo.get(i).toString().split("[\\[,\\]]");
                 if(setter[5].trim().equals(this.phoneNumber)){
                    setter[5]=match;
                     }
                
                
                 FileWriter fileWriter = new FileWriter(accounts, false);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                
                 bufferedWriter.write(setter[1]+","+setter[2]+","+
                         setter[3]+","+setter[4]+","+setter[5]+","+setter[6]);
                 
                 bufferedWriter.write("\n");
                 bufferedWriter.close();
              
             

          }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
      }
    
      
     
}         public void updateEmail(String match){
        
          String [] setter;
           try {
           
              for(int i =0 ; i<userInfo.size();i++){
                 setter= userInfo.get(i).toString().split("[\\[,\\]]");
             if(setter[6].trim().equals(this.email)){
                    setter[6]=match;
                }
                
                
                 FileWriter fileWriter = new FileWriter(accounts, false);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                
                 bufferedWriter.write(setter[1]+","+setter[2]+","+
                         setter[3]+","+setter[4]+","+setter[5]+","+setter[6]);
                 
                 bufferedWriter.write("\n");
                 bufferedWriter.close();
              
             

          }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
      }
      
     
} */


}
      
     

