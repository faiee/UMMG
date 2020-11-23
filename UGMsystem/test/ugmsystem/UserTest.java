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
 * @author reemalsolami
 */
public class UserTest {

    /**
     * Test of login method, of class User.
     * @throws java.lang.Exception
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
     * Test of register method, of class User when user is have not registered before.
     * @throws java.lang.Exception
     */
    @Test
    public void testRegister1() throws Exception {
        
        User instance = new User("M1234567","Samaher","Alghamdi","0567321459","samaher123@gmail.com");
        int expResult = 1;
        int result = instance.register();
        assertEquals(expResult, result);
       
    } 

        /**
     * Test of register method, of class User when user is already registered.
     * @throws java.lang.Exception
     */
    @Test
    public void testRegister2() throws Exception {
        User instance = new User("33563459","G1234567","Reem","Alsolami","0567123459","reem123@gmail.com");
        int expResult = -1;
        int result = instance.register();
        assertEquals(expResult, result);
       
           
        
    }
}
