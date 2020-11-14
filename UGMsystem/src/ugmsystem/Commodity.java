/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author fayaldosa
 */
public class Commodity {

    private String ID, Quantity, Name, Description, YearOfPurchase, filePic, sec;
    private int Price;
    private boolean State;
    public static File Commodities = new File("Commodities.txt");
    private static ArrayList<Commodity> vendorCommodity = new ArrayList<Commodity>();//تجربةة
    private static String [] Ads=new String[300];

    public static String[] getAds() {
        return Ads;
    }

    public static void setAds(String[] Ads) {
        Commodity.Ads = Ads;
    }

    public static ArrayList<Commodity> getVendorCommodity() {
        return vendorCommodity;
    }

    public static void setVendorCommodity(ArrayList<Commodity> vendorCommodity) {
        Commodity.vendorCommodity = vendorCommodity;
    }
    
   

    public Commodity(String ID, int Price, String Quantity, String Name, String Description,
            String YearOfPurchase, boolean State) {

        this.ID = Login.vendor.getId();
        this.Price = Price;
        this.Quantity = Quantity;
        this.Name = Name;
        this.Description = Description;
        this.YearOfPurchase = YearOfPurchase;
        this.State = State;

    }

    
    public Commodity() {
    
    }
    public Commodity(String ID, String Name, String Description, String filePic, String sec, int Price) {
        this.ID =  ID;   //Login.vendor.getId();
        this.Name = Name;
        this.Price = Price;
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

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
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
            FileWriter fileWriter = new FileWriter(Commodities, true);
            BufferedWriter Write = new BufferedWriter(fileWriter);
            Write.write(this.ID + "," + this.Name + "," + this.Price + "," + sec + "," + filePic + "," + this.Description + "\n");
            //Login.vendor.getVendorCommodity().add(this);
            vendorCommodity.add(this);//عشان نجرب 
            //Write.write(vendorCommodity.toString());
            //System.out.println(vendorCommodity.toString());
            BufferedImage image;
         //  image =ImageIO.read(filePic);
                 
         //  ImageIO.write(image, "jpg", new File (filePic));
            
            
            Write.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }

        //}
    }

    @Override
    public String toString() {
        return ID + "," + Name + "," + Price + "," + sec + "," + filePic + "," + Description + "\n";
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
    
    public void ReadFile(){
        
        String line;
         try {
             
        
           BufferedReader read = new BufferedReader(new FileReader(Commodities));   
            while((line=read.readLine()) != null) {
                
               String SplitWords[]= line.split(" ,");  
               Ads=SplitWords.clone();
            }
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        
        
    }
    
   
    
    

}
