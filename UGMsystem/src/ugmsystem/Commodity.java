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
import static ugmsystem.Login.*;

/**
 *
 * @author fayaldosa
 */
public class Commodity {

    private static String ID, Quantity, Name, Description, YearOfPurchase, filePic, sec;
    private static int Price;
    private static String Price2;
    private static boolean State;
    public static File Commodities = new File("Commodities.txt");
    //private static ArrayList<Commodity> vendorCommodity = new ArrayList<Commodity>();//تجربةة

    /*
    public static ArrayList<Commodity> getVendorCommodity() {
        return vendorCommodity;
    }

    public static void setVendorCommodity(ArrayList<Commodity> vendorCommodity) {
        Commodity.vendorCommodity = vendorCommodity;
    }*/
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

    public Commodity(String ID, String Name, int Price, String filePic, String sec, String Description) {
        this.ID = Login.vendor.getId(); //ID;   
        this.Name = Name;
        this.Price = Price;
        this.Description = Description;
        this.filePic = filePic;
        this.sec = sec;
    }

    public Commodity(String ID, String Name, String Price2, String filePic, String sec, String Description) {
        this.ID = ID;   //Login.vendor.getId();
        this.Name = Name;
        this.Price2 = Price2;
        this.Description = Description;
        this.filePic = filePic;
        this.sec = sec;
    }

    public static String getPrice2() {
        return Price2;
    }

    public static void setPrice2(String Price2) {
        Commodity.Price2 = Price2;
    }

    public String getYearOfPurchase() {
        return YearOfPurchase;
    }

    public void setYearOfPurchase(String YearOfPurchase) {
        this.YearOfPurchase = YearOfPurchase;
    }

    public static String getID() {
        return ID;
    }

    public static void setID(String ID) {
        Commodity.ID = ID;
    }

    public static String getQuantity() {
        return Quantity;
    }

    public static void setQuantity(String Quantity) {
        Commodity.Quantity = Quantity;
    }

    public static String getName() {
        return Name;
    }

    public static void setName(String Name) {
        Commodity.Name = Name;
    }

    public static String getDescription() {
        return Description;
    }

    public static void setDescription(String Description) {
        Commodity.Description = Description;
    }

    public static String getFilePic() {
        return filePic;
    }

    public static void setFilePic(String filePic) {
        Commodity.filePic = filePic;
    }

    public static String getSec() {
        return sec;
    }

    public static void setSec(String sec) {
        Commodity.sec = sec;
    }

    public static int getPrice() {
        return Price;
    }

    public static void setPrice(int Price) {
        Commodity.Price = Price;
    }

    public static boolean isState() {
        return State;
    }

    public static void setState(boolean State) {
        Commodity.State = State;
    }

    public static File getCommodities() {
        return Commodities;
    }

    public static void setCommodities(File Commodities) {
        Commodity.Commodities = Commodities;
    }

    public void createCommodity() {

        try {
            fillArrayComodityFromFile();
            FileWriter fileWriter = new FileWriter(Commodities, true);
            BufferedWriter Write = new BufferedWriter(fileWriter);
            Write.write(this.ID + "," + this.Name + "," + this.Price + "," + sec + "," + filePic + "," + this.Description + "\n");
            Vendor.vendorCommodity.add(this);
            //vendorCommodity.add(this);//عشان نجرب 
            //Write.write(vendorCommodity.toString());
            //System.out.println(vendorCommodity.toString());
            BufferedImage image;

            Write.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        return ID + "," + Name + "," + Price + "," + sec + "," + filePic + "," + Description + "\n";
    }

    public void addCommodity() {

    }

    public void editCommodity(String newUpdate) throws IOException {
        String line;
        fillArrayComodityFromFile();
        try {
            for (int i = 0; i < Vendor.vendorCommodity.size(); i++) {
                line = Vendor.vendorCommodity.get(i).toString();
                if (line.contains(newUpdate.trim())) {
                    Vendor.vendorCommodity.set(i, this);
                }
            }
            FileWriter fileWriter = new FileWriter(Commodities, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("");
            bufferedWriter.close();

            FileWriter fileWriter2 = new FileWriter(Commodities, true);
            BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);

            for (int i = 0; i < Vendor.vendorCommodity.size(); i++) {

                bufferedWriter2.write(Vendor.vendorCommodity.get(i).toString());
                bufferedWriter2.write("\n");
            }
            bufferedWriter2.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void fillArrayComodityFromFile() throws FileNotFoundException, IOException {
        String line;
        BufferedReader read = new BufferedReader(new FileReader(Commodities));
        while ((line = read.readLine()) != null) {
            String s[] = line.split(",");
            Vendor.vendorCommodity.add(new Commodity(s[0].trim(), s[1].trim(), s[2].trim(), s[3].trim(), s[4].trim(), s[5].trim()));
            //(this.ID + "," + this.Name + "," + this.Price + "," + sec + "," + filePic + "," + this.Description + "\n");
        }
        read.close();
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

    public void ReadFile() {
        /*
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
        
        
         */

    }

}
