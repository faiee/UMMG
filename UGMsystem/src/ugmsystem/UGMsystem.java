/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static ugmsystem.Commodity.Commodities;
import static ugmsystem.User.accounts;

/**
 *
 * @author reemalsolami
 */
public class UGMsystem {
public static User user;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
     /* BufferedReader read2 = new BufferedReader(new FileReader(accounts));
       FileWriter fileWriter = new FileWriter(accounts, false);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); 
      
      String line ;
      while((line=read2.readLine())!=null){
          bufferedWriter.write(" "); 
      } */
          /*
     User r = new User("12345", "reem","moh","0567899879","g@h.com");
     
        r.register();
        System.out.println("User pass before"+ r.getPassword());
       // r.setPassword("1");
        
        r.setfName("rrrr");
       // r.setPhoneNumber("0786");
       // r.setEmail("reem@gmail.com");
     
       System.out.println("User pass after"+ r.getPassword());

*/
          Scanner sc= new Scanner(System.in); 
          int AdID=sc.nextInt();
          
          System.out.println("ENTER ID: "+AdID);
              
          /*
               if (user.isGuest() == false) {
            try {
                BufferedWriter Tw = new BufferedWriter(new FileWriter(Commodities));
                String filePic = FileChooser.pickAFile();
                Tw.write(this.ID+","+this.Name+","+Section.getName()+","+filePic+","+this.Description);
                Tw.write("\n");
                Tw.flush();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
*/
    }
    
}
