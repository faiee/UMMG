/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jae
 */
public class UserTest {

    /**
     * Test of login method, of class User.
     */
    @Test
    public void testLogin() throws Exception {
    
        String id = "33536666";
        String password = "A1234567";
        boolean expResult = true;
        boolean result = User.login(id, password);
        assertEquals(expResult, result);
    }

    /**
     * Test of register method, of class User.
     */
    @Test
    public void testRegister() throws Exception {
        User instance = new User("M1234567","Samaher","Alghamdi","0567321459","samaher123@gmail.com");
        int expResult = 1;
        int result = instance.register();
    
        if(result==1)
        {
          assertEquals(expResult, result);
        }
        else
        {
            System.out.println("User Account With Same Information Already Exists! Please Specify New User Information.");
            assertTrue(result==-1);
        }
    }

    
}
