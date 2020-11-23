/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.io.File;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fayaldosa
 */
public class CommodityTest {
    
    public CommodityTest() {
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
     * Test of getClothesSectionAds method, of class Commodity
     * This test will check if the method is reading the file
     * and storing the content of CLOTHES section and only CLOTHES section into Arraylsi
     * By checking if the method includes the name of the commodity
     * that is in the CLOTHES section
     * if the method is working, it supposed to pass.
     */
    @org.junit.Test
    public void testGetClothesSectionAds() {
        System.out.println("************getClothesSectionAds************");
        ArrayList<String> expResult =  new ArrayList<>();
       expResult.add("Red Dress"); // Name of commodity that is in the CLOTHES section.

        ArrayList<String> result = Commodity.getClothesSectionAds();
        assertTrue(result.contains(expResult.get(0)));
        System.out.println("");
        System.out.println("This item is exist in the CLOTHES section");
    
    }



    /**
     * Test of getAdsForVendor method, of class Commodity
     * this test will check if the method containing the ads of specific a vendor.
     */
    @Test
    public void testGetAdsForVendor() {
  
    System.out.println("************getAdsForVendor************");
     
        String S="33537777";
        ArrayList<String> result = Commodity.getAdsForVendor();
        assertFalse(result.get(0).equals(S));
        
        System.out.println("");
        System.out.println("This VENDOR ID does not have any advertisements");
        System.out.println("");
       
    }
    
    
    
    
    
    
    
    
 
    
}
