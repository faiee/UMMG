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
public class OrderTest {

    /**
     * Test of calculatePay method, of class Order.
     */
    @Test
    public void testCalculatePay() {
        System.out.println("************calculatePay************");
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
        System.out.println("************calculateTax************");
        int p = 150;
        double expResult = 22.5;
        double result = Order.calculateTax(p);
        assertTrue(expResult == result);

    }

}
