/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import static ugmsystem.Login.*;
import static ugmsystem.Vendor.vendorCommodity;

/**
 *
 * @author fayaldosa
 */
public class Commodity {

    private String vID, pID, Quantity, Name, Description, YearOfPurchase, filePic, sec;
    private int Price;
    private boolean State;
    public static File Commodities = new File("Commodities.txt");
    public static ArrayList<String> BooksSectionAds = new ArrayList<String>();
    public static ArrayList<String> ClothesSectionAds = new ArrayList<String>();
    public static ArrayList<String> FurnSectionAds = new ArrayList<String>();
    public static ArrayList<String> AdsForVendor = new ArrayList<String>();
    public static ArrayList<String> EachVendorInfo = new ArrayList<String>();
    public static ArrayList<String> UpdateDeleteInfo = new ArrayList<String>();

    public Commodity(String vID, String pID, int Price, String Quantity, String Name, String Description,
            String YearOfPurchase, boolean State) {
        this.vID = Login.vendor.getId();
        this.pID = pID;
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

    public void setYearOfPurchase(String YearOfPurchase) throws IOException {
        this.YearOfPurchase = YearOfPurchase;

    }

    public String getvID() {
        return vID;
    }

    public void setvID(String vID) throws IOException {
        vID = vID;

    }

    public String getpID() {
        return pID;
    }

    public void setpID(String pID) throws IOException {
        pID = pID;

    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) throws IOException {
        Quantity = Quantity;

    }

    public String getName() {
        return Name;
    }

    public void setName(String Name){
        Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description){
        Description = Description;
    }

    public String getFilePic() {
        return filePic;
    }

    public void setFilePic(String filePic){
        filePic = filePic;
    }

    public String getSec() {
        return sec;

    }

    public void setSec(String sec) throws IOException {
        sec = sec;

    }

    public int getPrice() {
        return Price;

    }

    public void setPrice(int Price) throws IOException {
        Price = Price;
    }

    public boolean isState() {
        return State;
    }

    public void setState(boolean State) {
        State = State;

    }

    public File getCommodities() {
        return Commodities;
    }

    public void setCommodities(File Commodities) {
        Commodity.Commodities = Commodities;
    }

    public void createCommodity() {
        try {
            FileWriter fileWriter = new FileWriter(Commodities, true);
            BufferedWriter Write = new BufferedWriter(fileWriter);
            Write.write(this.vID + "," + this.pID + "," + this.Name + "," + this.Price + "," + sec + "," + filePic + "," + this.Description+"\n");
            Vendor.vendorCommodity.add(this);

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

    public static void editCommodity(String newName, String newPrice, String newDescription) {
        ArrayList<String> Temp = new ArrayList<String>();
        try {
            try (BufferedReader file = new BufferedReader(new FileReader(Commodities))) {
                String line;
                String[] lineArr;
                while ((line = file.readLine()) != null) {
                    lineArr = line.split(",");
                    if (lineArr[0].equals(UpdateDeleteInfo.get(0))) {
                        Temp.add(UpdateDeleteInfo.get(0) + ","
                                + UpdateDeleteInfo.get(1) + ","
                                + newName + "," + newPrice + ","
                                + UpdateDeleteInfo.get(4) + ","
                                + newDescription + ","
                                + UpdateDeleteInfo.get(6));
                    } else {
                        Temp.add(line);
                    }
                }
                file.close();

            } catch (Exception ex) {
                Logger.getLogger(CommodityVendor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(CommodityVendor.class.getName()).log(Level.SEVERE, null, ex);
        }
        //
        try {
            try (PrintWriter Pfile = new PrintWriter(Commodities)) {
                for (String str : Temp) {
                    Pfile.println(str);
                }
                Pfile.close();

            } catch (Exception ex) {
                Logger.getLogger(CommodityVendor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(CommodityVendor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String generateProductID() {
        String trim = "10";
        int p = (int) (Math.random() * 100);
        String pID = trim + p;
        return pID;
    }

    public static void deleteCommodity() {
        ArrayList<String> Temp = new ArrayList<String>();
        try {
            try (BufferedReader file = new BufferedReader(new FileReader(Commodities))) {
                String line;
                String[] lineArr;
                while ((line = file.readLine()) != null) {
                    lineArr = line.split(",");
                    if (lineArr[0].equals(EachVendorInfo.get(0))) {
                        Temp.remove(EachVendorInfo.get(0)+EachVendorInfo.get(1)
                        +EachVendorInfo.get(2)+EachVendorInfo.get(3)
                        +EachVendorInfo.get(4)+EachVendorInfo.get(5)
                        +EachVendorInfo.get(6));
                    } else {
                        Temp.add(line);
                    }
                }
                file.close();

            } catch (Exception ex) {
                Logger.getLogger(CommodityVendor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(CommodityVendor.class.getName()).log(Level.SEVERE, null, ex);
        }
        //
        try {
            try (PrintWriter Pfile = new PrintWriter(Commodities)) {
                for (String str : Temp) {
                    Pfile.println(str);
                }
                Pfile.close();

            } catch (Exception ex) {
                Logger.getLogger(CommodityVendor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(CommodityVendor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void purchaseCommodity() {

    }

    public static boolean isAvailable() {

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

    public static ArrayList<String> GetEachVendorInfo() {

        String line;

        try {

            BufferedReader read = new BufferedReader(new FileReader(Commodities));
            while ((line = read.readLine()) != null) {

                String[] SplitWords = line.split(",");
                for (int i = 0; i < SplitWords.length; i++) {

                    if (line.contains(Login.vendor.getId())) {
                        EachVendorInfo.add(SplitWords[i]);
                    }
                }

            }

            read.close();
            return EachVendorInfo;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }

        return EachVendorInfo;

    }
    
    public static ArrayList<String> GetUpdateDeleteInfo() {

        String line;

        try {

            BufferedReader read = new BufferedReader(new FileReader(Commodities));
            while ((line = read.readLine()) != null) {

                String[] SplitWords = line.split(",");
                for (int i = 0; i < SplitWords.length; i++) {

                    if (line.contains(Login.vendor.getId())) {
                        UpdateDeleteInfo.add(SplitWords[i]);
                    }
                }

            }

            read.close();
            return UpdateDeleteInfo;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }

        return UpdateDeleteInfo;

    }

}
