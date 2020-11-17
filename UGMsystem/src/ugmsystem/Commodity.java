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
    public static ArrayList<String> EachVendorInfo = new ArrayList<String>();

    public static ArrayList<String> com = new ArrayList<String>();

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
    
    public static void setName(String Name) throws IOException {
        Commodity.Name = Name;
        editCommodity(Name);
    }
    
    public static String getDescription() {
        return Description;
    }
    
    public static void setDescription(String Description) throws IOException {
        Commodity.Description = Description;
        editCommodity(Description);
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
    
    public static void setPrice(int Price) throws IOException {
        Commodity.Price = Price;
        editCommodity(String.valueOf(Price));
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
            FileWriter fileWriter = new FileWriter(Commodities, true);
            BufferedWriter Write = new BufferedWriter(fileWriter);
            Write.write(this.vID + "," + this.pID + "," + this.Name + "," + this.Price + "," + sec + "," + filePic + "," + this.Description + "\n");
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
    
    public static void editCommodity(String newUpdate) throws IOException {
        String line;
        //fillArrayComodityFromFile();
         Commodity c = new Commodity(vID, pID, Name, Price, filePic, sec, Description);
        try {
            for (int i = 0; i < Vendor.vendorCommodity.size(); i++) {
                line = Vendor.vendorCommodity.get(i).toString();
                if (line.contains(newUpdate.trim())) {
                   
                   Vendor.vendorCommodity.set(i, c);
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
    
    static void fillArrayComodityFromFile() {
        String line;
        
        try {
            BufferedReader read = new BufferedReader(new FileReader(Commodities));
            while ((line = read.readLine()) != null) {
                String SplitWords[] = line.split(",");
                // for (int i = 0; i < SplitWords.length; i++) {
                Vendor.vendorCommodity.add(new Commodity(SplitWords[0].trim(), SplitWords[1].trim(), SplitWords[2].trim(),
                        Integer.valueOf(SplitWords[3].trim()), SplitWords[4].trim(), SplitWords[5].trim(), SplitWords[6].trim()));

                // }
                System.out.println(Vendor.getVendorCommodity());
            }
            
            read.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
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
    
    public static boolean isAvailable() {
        
        
        return false ;
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
                        
                        EachVendorInfo.add(SplitWords[i].trim());
                    }
                }
                
            }
            
            read.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return EachVendorInfo;
        
    }
    
    public static ArrayList<String> getCom() {
        
        String line;
        
        try {
            
            BufferedReader read = new BufferedReader(new FileReader(Commodities));
            while ((line = read.readLine()) != null) {
                
                String[] SplitWords = line.split(",");
                for (int i = 0; i < SplitWords.length; i++) {
                    com.add(SplitWords[i].trim());
                    
                }
                
            }
            
            read.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return com;
        
    }
    
}
