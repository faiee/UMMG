/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jae
 */
public class OrderTest {

    /**
     * Test of calculatePay method, of class Order.
     */
    @Test
    public void testCalculatePay() {
        int p = 500;
        double expResult = 575.0;
        double result = Order.calculatePay(p);
        assertTrue(expResult == result);
    }

    /**
     * Test of calculateTax method, of class Order.
     */
    @Test
    public void testCalculateTax() {
        int p = 150;
        double expResult = 22.5;
        double result = Order.calculateTax(p);
        assertTrue(expResult == result);

    }

    
}
