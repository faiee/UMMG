/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author fayaldosa
 */
public class Commodity {

    private String ID, Price, Quantity, Name, Description, YearOfPurchase, filePic, sec;
    private boolean State;
    public static File Commodities = new File("Commodities.txt");

    public Commodity(String ID, String Price, String Quantity, String Name, String Description,
            String YearOfPurchase, boolean State) {

        this.ID = Login.vendor.getId();
        this.Price = Price;
        this.Quantity = Quantity;
        this.Name = Name;
        this.Description = Description;
        this.YearOfPurchase = YearOfPurchase;
        this.State = State;

    }

    public Commodity(String ID, String Name, String Description, String filePic, String sec) {
        this.ID = ID;
        this.Name = Name;
        this.Description = Description;
        this.filePic = filePic;
        this.sec = sec;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getYearOfPurchase() {
        return YearOfPurchase;
    }

    public void setYearOfPurchase(String YearOfPurchase) {
        this.YearOfPurchase = YearOfPurchase;
    }

    public boolean isState() {
        return State;
    }

    public void setState(boolean State) {
        this.State = State;
    }

    public static File getCommodities() {
        return Commodities;
    }

    public static void setCommodities(File Commodities) {
        Commodity.Commodities = Commodities;
    }

    public void createCommodity() {
        // if (user.isGuest() == false) {
        try {
            BufferedWriter Tw = new BufferedWriter(new FileWriter(Commodities));
            Tw.write(this.ID + "," + this.Name + "," + sec + "," + filePic + "," + this.Description);
            Tw.write("\n");          
            Login.vendor.getVendorCommodity().addAll(Arrays.asList(this));
            
            Tw.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }

        //}
    }

    public void addCommodity() {

    }

    public void editCommodity() {

    }

    public void deleteCommodity() {

    }

    public void purchaseCommodity() {

    }

    public boolean isAvailable() {

        return false;
    }

    public void advertisee() {

    }

    public void updateCommodityDatabase() {

    }

    public void addToOrder() {

    }

    public void endPurchase() {

    }

    public void checkout() {

    }

    public ChatUser ContactVendor(ChatUser Msg) {

        return null;
    }

    public ChatUser ContactBuyer(ChatUser Msg) {

        return null;
    }

}
