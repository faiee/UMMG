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
    
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getoID method, of class Order.
     */
    @Test
    public void testGetoID() {
        System.out.println("getoID");
        Order instance = null;
        String expResult = "";
        String result = instance.getoID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVenID method, of class Order.
     */
    @Test
    public void testGetVenID() {
        System.out.println("getVenID");
        Order instance = null;
        String expResult = "";
        String result = instance.getVenID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setoID method, of class Order.
     */
    @Test
    public void testSetoID() {
        System.out.println("setoID");
        String ID = "";
        Order instance = null;
        instance.setoID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Order.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Order instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Order.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Order instance = null;
        int expResult = 0;
        int result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Order.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        int price = 0;
        Order instance = null;
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTax method, of class Order.
     */
    @Test
    public void testGetTax() {
        System.out.println("getTax");
        Order instance = null;
        double expResult = 0.0;
        double result = instance.getTax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTax method, of class Order.
     */
    @Test
    public void testSetTax() {
        System.out.println("setTax");
        double Tax = 0.0;
        Order instance = null;
        instance.setTax(Tax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Order.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "";
        Order instance = null;
        instance.setName(Name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCommodityType method, of class Order.
     */
    @Test
    public void testGetCommodityType() {
        System.out.println("getCommodityType");
        Order instance = null;
        String expResult = "";
        String result = instance.getCommodityType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCommodityType method, of class Order.
     */
    @Test
    public void testSetCommodityType() {
        System.out.println("setCommodityType");
        String CommodityType = "";
        Order instance = null;
        instance.setCommodityType(CommodityType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCommodityNo method, of class Order.
     */
    @Test
    public void testGetCommodityNo() {
        System.out.println("getCommodityNo");
        Order instance = null;
        String expResult = "";
        String result = instance.getCommodityNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCommodityNo method, of class Order.
     */
    @Test
    public void testSetCommodityNo() {
        System.out.println("setCommodityNo");
        String CommodityNo = "";
        Order instance = null;
        instance.setCommodityNo(CommodityNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPayment method, of class Order.
     */
    @Test
    public void testGetTotalPayment() {
        System.out.println("getTotalPayment");
        Order instance = null;
        double expResult = 0.0;
        double result = instance.getTotalPayment();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalPayment method, of class Order.
     */
    @Test
    public void testSetTotalPayment() {
        System.out.println("setTotalPayment");
        double TotalPayment = 0.0;
        Order instance = null;
        instance.setTotalPayment(TotalPayment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createOrder method, of class Order.
     */
    @Test
    public void testCreateOrder() {
        System.out.println("createOrder");
        Order instance = null;
        instance.createOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetEachOrderInfo method, of class Order.
     */
    @Test
    public void testGetEachOrderInfo() {
        System.out.println("GetEachOrderInfo");
        ArrayList<String> expResult = null;
        ArrayList<String> result = Order.GetEachOrderInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePay method, of class Order.
     */
    @Test
    public void testCalculatePay() {
        System.out.println("calculatePay");
        int p = 0;
        double expResult = 0.0;
        double result = Order.calculatePay(p);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTax method, of class Order.
     */
    @Test
    public void testCalculateTax() {
        System.out.println("calculateTax");
        int p = 0;
        double expResult = 0.0;
        double result = Order.calculateTax(p);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateOrderID method, of class Order.
     */
    @Test
    public void testGenerateOrderID() {
        System.out.println("generateOrderID");
        String expResult = "";
        String result = Order.generateOrderID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
