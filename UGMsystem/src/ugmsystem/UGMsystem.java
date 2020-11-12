/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static ugmsystem.User.accounts;

/**
 *
 * @author reemalsolami
 */
public class UGMsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
      BufferedReader read2 = new BufferedReader(new FileReader(accounts));
       FileWriter fileWriter = new FileWriter(accounts, false);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); 
      
      String line ;
      while((line=read2.readLine())!=null){
          bufferedWriter.write(" "); 
      } 
          

    
    
    }
    
}
