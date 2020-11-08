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

    private int ID;
    private String Name;
    private String Date;
    private String SaleLicense;
    private Commodity PurchaseCom;
    private String CommodityType;
    private int CommodityNo;
    private double TotalPayment;

    public Order(int ID, String Name, String Date, String SaleLicense, Commodity PurchaseCom, String CommodityType, int CommodityNo, double TotalPayment) {
        this.ID = ID;
        this.Name = Name;
        this.Date = Date;
        this.SaleLicense = SaleLicense;
        this.PurchaseCom = PurchaseCom;
        this.CommodityType = CommodityType;
        this.CommodityNo = CommodityNo;
        this.TotalPayment = TotalPayment;
    }

    //Get and set
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public int getCommodityNo() {
        return CommodityNo;
    }

    public void setCommodityNo(int CommodityNo) {
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
