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

    private static String vID, pID, Quantity, Name, Description, YearOfPurchase, filePic, sec;
    private static int Price;
    private static boolean State;
    public static File Commodities = new File("Commodities.txt");

    public static ArrayList<String> BooksSectionAds = new ArrayList<String>();
    public static ArrayList<String> ClothesSectionAds = new ArrayList<String>();
    public static ArrayList<String> FurnSectionAds = new ArrayList<String>();

    public static ArrayList<String> AdsForVendor = new ArrayList<String>();
    public static String[] AdsNamesForVendor = new String[100];

    //private static ArrayList<Commodity> vendorCommodity = new ArrayList<Commodity>();//تجربةة

    /*
    public static ArrayList<Commodity> getVendorCommodity() {
        return vendorCommodity;
    }

    public static void setVendorCommodity(ArrayList<Commodity> vendorCommodity) {
        Commodity.vendorCommodity = vendorCommodity;
    }*/
    public Commodity(String vID, String pID, int Price, String Quantity, String Name, String Description,
            String YearOfPurchase, boolean State) {

        this.vID = Login.vendor.getId();
        this.pID = generateProductID();
        this.Price = Price;
        this.Quantity = Quantity;
        this.Name = Name;
        this.Description = Description;
        this.YearOfPurchase = YearOfPurchase;
        this.State = State;

    }

    public Commodity() {

    }

    public Commodity(String vID, String pID, String Name, int Price, String filePic, String sec, String Description) {
        this.vID = Login.vendor.getId();
        this.pID = generateProductID();
        this.Name = Name;
        this.Price = Price;
        this.Description = Description;
        this.filePic = filePic;
        this.sec = sec;
    }

    public String getYearOfPurchase() {
        return YearOfPurchase;
    }

    public void setYearOfPurchase(String YearOfPurchase) {
        this.YearOfPurchase = YearOfPurchase;
    }

    public static String getvID() {
        return vID;
    }

    public static void setvID(String vID) {
        Commodity.vID = vID;
    }

    public static String getpID() {
        return pID;
    }

    public static void setpID(String pID) {
        Commodity.pID = pID;
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
            //fillArrayComodityFromFile();
            FileWriter fileWriter = new FileWriter(Commodities, true);
            BufferedWriter Write = new BufferedWriter(fileWriter);
            Write.write(this.vID + "," + this.pID + "," + this.Name + "," + this.Price + "," + sec + "," + filePic + "," + this.Description + "\n");
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
        return vID + "," + pID + "," + Name + "," + Price + "," + sec + "," + filePic + "," + Description + "\n";
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

    static void fillArrayComodityFromFile()  {
        /* String[] NAMES = new String[10];

        if (AdsForVendor.contains(Login.vendor.getId())) {
            for (int i = 0; i < NAMES.length; i++) {
                NAMES[i] = AdsForVendor.get(2);
                System.out.println(Arrays.toString(NAMES));
            }
        }*/
        String n = null;
       
        if (getAdsForVendor().contains(Login.vendor.getId())) {
                        n = getAdsForVendor().get(2);
                        System.out.println(n);
                    }
           
        }

//OUTPUT JUST RED DRESS 
  

    private String generateProductID() {
        String trim = "10";
        int p = (int) (Math.random() * 100);
        String pID = trim + p;
        return pID;
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

    public static ArrayList<String> getClothesSectionAds() {

        String line;

        try {

            BufferedReader read = new BufferedReader(new FileReader(Commodities));
            while ((line = read.readLine()) != null) {

                String[] SplitWords = line.split(",");
                for (int i = 0; i < SplitWords.length; i++) {

                    if (line.contains("Clothes")) {
                        ClothesSectionAds.add(SplitWords[i].trim());
                    }

                    if (line.contains("Furniture")) {
                        FurnSectionAds.add(SplitWords[i].trim());
                    }

                }

            }

            read.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ClothesSectionAds;

    }

    public static ArrayList<String> getBooksSectionAds() {

        String line;

        try {

            BufferedReader read = new BufferedReader(new FileReader(Commodities));
            while ((line = read.readLine()) != null) {

                String[] SplitWords = line.split(",");
                for (int i = 0; i < SplitWords.length; i++) {

                    if (line.contains("Books")) {

                        BooksSectionAds.add(SplitWords[i].trim());

                    }

                }

            }

            read.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }

        return BooksSectionAds;

    }

    public static ArrayList<String> getFurnSectionAds() {

        String line;

        try {

            BufferedReader read = new BufferedReader(new FileReader(Commodities));
            while ((line = read.readLine()) != null) {

                String[] SplitWords = line.split(",");
                for (int i = 0; i < SplitWords.length; i++) {

                    if (line.contains("Furniture")) {
                        FurnSectionAds.add(SplitWords[i].trim());
                    }

                }

            }

            read.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }

        return FurnSectionAds;

    }

    public static ArrayList<String> getAdsForVendor() {

        String line;

        try {

            BufferedReader read = new BufferedReader(new FileReader(Commodities));
            while ((line = read.readLine()) != null) {

                String[] SplitWords = line.split(",");
                for (int i = 0; i < SplitWords.length; i++) {
                    AdsForVendor.add(SplitWords[i].trim());

                }

            }

            read.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }

        return AdsForVendor;

    }

    public static String[] getAdsNamesForVendor() {

        String line;

        try {

            BufferedReader read = new BufferedReader(new FileReader(Commodities));
            while ((line = read.readLine()) != null) {
                String n = null;
                String[] SplitWords = line.split(",");
                for (int i = 0; i < SplitWords.length; i++) {
                    if (getAdsForVendor().get(i).contains(Login.vendor.getId())) {
                        n = (SplitWords[2].trim());
                        System.out.println(n);
                    }
                }
            }
            /*
            OUTPUT
            Red Dress
Harry Potter
Crime & punshiment
Brother karamazov
Vans shoes
Marvel t-shirt
white chair
led lamp
grey sofa
             */

            read.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }

        return AdsNamesForVendor;

    }

}
