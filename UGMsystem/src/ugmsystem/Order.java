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
 *
 * @author Jae
 */
public class Order {

    private String Name, ID, VenID, Description;
    private int price;
    private String Date;
    private String SaleLicense;
    private Commodity PurchaseCom;
    private String CommodityType;//section
    private String CommodityNo;//Product id
    public static double TotalPayment, Tax;
    public static Order o;
    public static File Orders = new File("Orders.txt");
    public static ArrayList<String> EachOrderInfo = new ArrayList<String>();

    public Order(String ID, String VenID, String Name, String CommodityType, int price, double Tax, double TotalPayment) {
        this.ID = ID;
        this.VenID=VenID;
        this.Name = Name;
        this.CommodityType = CommodityType;
        this.price = price;
        this.Tax = calculateTax(price);
        this.TotalPayment = calculatePay(price);
    }

    public Order() {

    }

    //Get and set
    public String getoID() {
        return ID;
    }

    public String getVenID() {
        return VenID;
    }

    public void setoID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTax() {
        return Tax;
    }

    public void setTax(double Tax) {
        Order.Tax = Tax;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getSaleLicense() {
        return SaleLicense;
    }

    public void setSaleLicense(String SaleLicense) {
        this.SaleLicense = SaleLicense;
    }

    public Commodity getPurchaseCom() {
        return PurchaseCom;
    }

    public void setPurchaseCom(Commodity PurchaseCom) {
        this.PurchaseCom = PurchaseCom;
    }

    public String getCommodityType() {
        return CommodityType;
    }

    public void setCommodityType(String CommodityType) {
        this.CommodityType = CommodityType;
    }

    public String getCommodityNo() {
        return CommodityNo;
    }

    public void setCommodityNo(String CommodityNo) {
        this.CommodityNo = CommodityNo;
    }

    public double getTotalPayment() {
        return TotalPayment;
    }

    public void setTotalPayment(double TotalPayment) {
        this.TotalPayment = TotalPayment;
    }

    //Method
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

    public static double calculatePay(int p) {
        double tax = 0.0;
        tax = (p * 0.15);
        TotalPayment = p + tax;
        return TotalPayment;
    }

    public static double calculateTax(int p) {
        double tax = 0.0;
        tax = (p * 0.15);
        return tax;
    }

    public static String generateOrderID() {
        String trim = "00";
        int p = (int) (Math.random() * 100);
        String pID = trim + p;
        return pID;
    }

    public boolean isAccepted() {
        return true;
    }

    public void deleteOrder() {

    }

    public void shipOrder() {

    }

    public boolean Payment() {
        return true;
    }

    public void orderDelivered() {

    }

    public void endOrderProcess() {

    }

    public double totalPayment(Commodity PurchaseCom) {
        return 0;
    }
}
