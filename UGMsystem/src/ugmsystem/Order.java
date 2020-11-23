/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *This is an Order class that creates order object when user  creates and pays for order
 * @author Jae
 */
public class Order {

    private String Name, ID, VenID;
    private int price;
    private String CommodityType;
    private String CommodityNo;
    public static double TotalPayment,Tax;
    /**
     *Static file object that saves all orders for user.
     */
    public static File Orders = new File("Orders.txt");

    /**
     *Static ArrayList attribute used to store all orders in one array.
     */
    public static ArrayList<String> EachOrderInfo = new ArrayList<String>();

    /**
     *
     * @param ID String
     * @param VenID String
     * @param Name String
     * @param CommodityType String
     * @param price integer
     * @param Tax double
     * @param TotalPayment double
     */
    public Order(String ID, String VenID, String Name, String CommodityType, int price, double Tax, double TotalPayment) {
        this.ID = ID;
        this.VenID=VenID;
        this.Name = Name;
        this.CommodityType = CommodityType;
        this.price = price;
        this.Tax = calculateTax(price);
        this.TotalPayment = calculatePay(price);
    }

    /**
     *Get method returns order id
     * @return string
     */
    public String getoID() {
        return ID;
    }

    /**
     *Get method returns user id
     * @return String
     */
    public String getVenID() {
        return VenID;
    }

    /**
     *Set method sets order id
     * @param ID String
     */
    public void setoID(String ID) {
        this.ID = ID;
    }

    /**
     *Get method returns commodity name
     * @return String
     */
    public String getName() {
        return Name;
    }

    /**
     *Get method returns commodity price
     * @return integer
     */
    public int getPrice() {
        return price;
    }

    /**
     *Set method sets commodity price
     * @param price integer
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     *Get method returns commodity tax
     * @return double
     */
    public double getTax() {
        return Tax;
    }

    /**
     *Set method sets commodity tax
     * @param Tax double
     */
    public void setTax(double Tax) {
        Order.Tax = Tax;
    }

    /**
     *Set method sets commodity name
     * @param Name String
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     *Get method returns commodity section
     * @return string
     */
    public String getCommodityType() {
        return CommodityType;
    }

    /**
     *Set method sets commodity section
     * @param CommodityType String
     */
    public void setCommodityType(String CommodityType) {
        this.CommodityType = CommodityType;
    }

    /**
     *Get method returns commodity id
     * @return string
     */
    public String getCommodityNo() {
        return CommodityNo;
    }

    /**
     *Set method sets commodity id
     * @param CommodityNo String
     */
    public void setCommodityNo(String CommodityNo) {
        this.CommodityNo = CommodityNo;
    }

    /**
     *Get method returns total payment
     * @return double
     */
    public double getTotalPayment() {
        return TotalPayment;
    }

    /**
     *Set method sets total payment
     * @param TotalPayment double
     */
    public void setTotalPayment(double TotalPayment) {
        this.TotalPayment = TotalPayment;
    }

    /**
     *This method used to create order for user logged in and 
     * store it in orders file. 
     */
    public void createOrder() {
        try {
            FileWriter fileWriter = new FileWriter(Orders, true);
            BufferedWriter Write = new BufferedWriter(fileWriter);
            Write.write(this.ID + "," + this.VenID + "," + this.Name + "," + this.CommodityType + "," + this.price + "," + this.Tax + "," + this.TotalPayment);
            Write.write("\n");
            Write.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *Read all content of orders file and check if the current user has an order 
     * then store all the information into the array
     * @return ArrayList
     */
    public static ArrayList<String> GetEachOrderInfo() {

        String line;

        try {

            BufferedReader read = new BufferedReader(new FileReader(Orders));
            while ((line = read.readLine()) != null) {

                String[] SplitWords = line.split(",");
                for (int i = 0; i < SplitWords.length; i++) {

                    if (line.contains(Login.vendor.getId())) {
                        EachOrderInfo.add(SplitWords[i]);
                    }
                }
            }
            read.close();
            return EachOrderInfo;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }

        return EachOrderInfo;

    }

    /**
     *This method used to calculate total payment 
     * Called in constructor
     * @param p integer
     * @return double
     */
    public static double calculatePay(int p) {
        double tax = calculateTax(p);
        TotalPayment = p + tax;
        return TotalPayment;
    }

    /**
     *This method used to calculate tax for commodity 
     * Called in constructor
     * @param p integer
     * @return double
     */
    public static double calculateTax(int p) {
        double tax = 0.0;
        tax = (p * 0.15);
        return tax;
    }

    /**
     *This method used to generates an id for order
     * @return string
     */
    public static String generateOrderID() {
        String trim = "00";
        int p = (int) (Math.random() * 100);
        String pID = trim + p;
        return pID;
    }

}
