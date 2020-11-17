/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.util.*;

/**
 *
 * @author Jae
 */
public class Order {

    private String Name,oID,vID,Description;
    private int price;
    private String Date;
    private String SaleLicense;
    private Commodity PurchaseCom;
    private String CommodityType;//section
    private String CommodityNo;//Product id
    public static double TotalPayment;
    

    public Order(String ID, String Name, String Date, String SaleLicense, Commodity PurchaseCom, String CommodityType, String CommodityNo, double TotalPayment) {
        this.oID = oID;
        this.Name = Name;
        this.Date = Date;
        this.SaleLicense = SaleLicense;
        this.PurchaseCom = PurchaseCom;
        this.CommodityType = CommodityType;
        this.CommodityNo = CommodityNo;
        this.TotalPayment = TotalPayment;
    }

    public Order(String Name, String oID, String vID, String Description, int price, String CommodityType, String CommodityNo) {
        this.Name = Commodity.getName();
        this.oID = generateOrderID();
        this.vID = Commodity.getvID();
        this.Description = Commodity.getDescription();
        this.price = Commodity.getPrice();
        this.CommodityType = Commodity.getSec();
        this.CommodityNo = Commodity.getpID();
    }

    //Get and set

    public String getoID() {
        return oID;
    }

    public void setoID(String oID) {
        this.oID = oID;
    }

    public String getName() {
        return Name;
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
        
  
    }
    
    public static double calculatePay(int p) {
        double tax=0.0;
        tax = (p * 0.15);
        TotalPayment= p+tax;
        return TotalPayment;
    }
    
    
    private String generateOrderID() {
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
