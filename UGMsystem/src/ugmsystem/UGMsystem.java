/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

/**
 *
 * @author fayaldosa
 */
public class UGMsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       
       User r = new User(12, "Sara", "Ahmed", "0542907964");
       r.register();
       User u = new User(11, "Reem", "Alsolami", "0555555555");
        u.register();
        
        System.out.println(u.login(u.getId(),99999)); 
        
        
    }
    
}
