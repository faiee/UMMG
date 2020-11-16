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
public class BuyerTest {


    /**
     * Test of findUser method, of class Buyer.
     * @throws java.lang.Exception
     */
    @Test
    public void testFindUser() throws Exception {
        
        String userId = "33536996";
        Buyer expResult = new Buyer ("33536996","D1234567","Anas","Khaled","0566666667","anas@gmail.com");
        Buyer result = Buyer.findUser(userId);
        
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getPassword(), result.getPassword());
        assertEquals(expResult.getfName(), result.getfName());
        assertEquals(expResult.getlName(), result.getlName());
        assertEquals(expResult.getPhoneNumber(), result.getPhoneNumber());
        assertEquals(expResult.getEmail(), result.getEmail());
        
    }
    
}
