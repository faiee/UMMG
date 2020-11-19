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

/**
 *
 * @author fayaldosa
 */
public class Commodity {

    private String vID, pID, Quantity, Name, Description, YearOfPurchase, filePic, sec;
    private int Price;
    private boolean State;

    /**
     *
     */
    public static File Commodities = new File("Commodities.txt");

    /**
     *Static ArrayList attribute used to store commodities that is related with Books section.
     */
    public static ArrayList<String> BooksSectionAds = new ArrayList<String>();

    /**
     *Static ArrayList attribute used to store commodities that is related with Clothes section.
     */
    public static ArrayList<String> ClothesSectionAds = new ArrayList<String>();

    /**
     *Static ArrayList attribute used to store commodities that is related with Furniture section.
     */
    public static ArrayList<String> FurnSectionAds = new ArrayList<String>();

    /**
     *Static ArrayList attribute used to store all commodities in one array.
     */
    public static ArrayList<String> AdsForVendor = new ArrayList<String>();

    /**
     *Static ArrayList attribute used to store commodities that is related with the current user who is logged in.
     */
    public static ArrayList<String> EachVendorInfo = new ArrayList<String>();

    /**
     *
     */
    public static ArrayList<String> UpdateDeleteInfo = new ArrayList<String>();

    /**
     *
     * @param vID
     * @param pID
     * @param Price
     * @param Quantity
     * @param Name
     * @param Description
     * @param YearOfPurchase
     * @param State
     */
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

    /**
     *
     */
    public Commodity() {

    }

    /**
     *
     * @param vID
     * @param pID
     * @param Name
     * @param Price
     * @param filePic
     * @param sec
     * @param Description
     */
    public Commodity(String vID, String pID, String Name, int Price, String filePic, String sec, String Description) {
        this.vID = Login.vendor.getId();
        this.pID = generateProductID();
        this.Name = Name;
        this.Price = Price;
        this.Description = Description;
        this.filePic = filePic;
        this.sec = sec;
    }

    /**
     *
     * @return
     */
    public String getYearOfPurchase() {
        return YearOfPurchase;
    }

    /**
     *
     * @param YearOfPurchase
     * @throws IOException
     */
    public void setYearOfPurchase(String YearOfPurchase) throws IOException {
        this.YearOfPurchase = YearOfPurchase;

    }

    /**
     *
     * @return
     */
    public String getvID() {
        return vID;
    }

    /**
     *
     * @param vID
     * @throws IOException
     */
    public void setvID(String vID) throws IOException {
        vID = vID;

    }

    /**
     *
     * @return
     */
    public String getpID() {
        return pID;
    }

    /**
     *
     * @param pID
     * @throws IOException
     */
    public void setpID(String pID) throws IOException {
        pID = pID;

    }

    /**
     *
     * @return
     */
    public String getQuantity() {
        return Quantity;
    }

    /**
     *
     * @param Quantity
     * @throws IOException
     */
    public void setQuantity(String Quantity) throws IOException {
        Quantity = Quantity;

    }

    /**
     *
     * @return
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param Name
     */
    public void setName(String Name) {
        Name = Name;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return Description;
    }

    /**
     *
     * @param Description
     */
    public void setDescription(String Description) {
        Description = Description;
    }

    /**
     *
     * @return
     */
    public String getFilePic() {
        return filePic;
    }

    /**
     *
     * @param filePic
     */
    public void setFilePic(String filePic) {
        filePic = filePic;
    }

    /**
     *
     * @return
     */
    public String getSec() {
        return sec;

    }

    /**
     *
     * @param sec
     * @throws IOException
     */
    public void setSec(String sec) throws IOException {
        sec = sec;

    }

    /**
     *
     * @return
     */
    public int getPrice() {
        return Price;

    }

    /**
     *
     * @param Price
     * @throws IOException
     */
    public void setPrice(int Price) throws IOException {
        Price = Price;
    }

    /**
     *
     * @return
     */
    public boolean isState() {
        return State;
    }

    /**
     *
     * @param State
     */
    public void setState(boolean State) {
        State = State;

    }

    /**
     *
     * @return
     */
    public File getCommodities() {
        return Commodities;
    }

    /**
     *
     * @param Commodities
     */
    public void setCommodities(File Commodities) {
        Commodity.Commodities = Commodities;
    }

    /**
     *
     */
    public void createCommodity() {
        try {
            FileWriter fileWriter = new FileWriter(Commodities, true);
            BufferedWriter Write = new BufferedWriter(fileWriter);
            Write.write(this.vID + "," + this.pID + "," + this.Name + "," + this.Price + "," + sec + "," + filePic + "," + this.Description);
            Write.write("\n");
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

    /**
     *
     */
    public void addCommodity() {

    }

    /**
     *
     * @param newName
     * @param newPrice
     * @param newDescription
     */
    public static void editCommodity(String newName, String newPrice, String newDescription) {
        ArrayList<String> Temp = new ArrayList<String>();
        try {
      
                String line="";
                String[] lineArr;
                for (int i = 0; i < GetUpdateDeleteInfo().size(); i++)  {
                    lineArr = line.split(",");
                    if (lineArr[0].equals(GetUpdateDeleteInfo().get(0))) {
                        Temp.add(GetUpdateDeleteInfo().get(0) + ","
                                + GetUpdateDeleteInfo().get(1) + ","
                                + newName + "," + newPrice + ","
                                + GetUpdateDeleteInfo().get(4) + ","
                                + newDescription + ","
                                + GetUpdateDeleteInfo().get(6));
                    }
                  else {
                        Temp.add(line);
                    }
                }


        FileWriter fileWriter = new FileWriter(Commodities, false);
                   BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                   bufferedWriter.write("");
                   bufferedWriter.close();
                   
                   FileWriter fileWriter2 = new FileWriter(Commodities, true);
                   BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
                   
                   for (int i = 0; i < GetUpdateDeleteInfo().size(); i++) {
                   
                   bufferedWriter2.write(GetUpdateDeleteInfo().get(i).toString());
                   bufferedWriter2.write("\n");
                  
                    }
                  bufferedWriter2.close();

            } catch (Exception ex) {
                Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 

  

    /*
    public static void editCommodity(String newName, String newPrice, String newDescription) {
        ArrayList<String> Temp = new ArrayList<String>();
        try {
            try (BufferedReader file = new BufferedReader(new FileReader(Commodities))) {
                String line;
                String[] lineArr;
                while ((line = file.readLine()) != null) {
                    lineArr = line.split(",");
                    if (lineArr[0].equals(GetUpdateDeleteInfo().get(0))) {
                        Temp.add(GetUpdateDeleteInfo().get(0) + ","
                                + GetUpdateDeleteInfo().get(1) + ","
                                + newName + "," + newPrice + ","
                                + GetUpdateDeleteInfo().get(4) + ","
                                + newDescription + ","
                                + GetUpdateDeleteInfo().get(6));
                    }else {
                        Temp.add(line);
                    }
                }
                file.close();

            } catch (Exception ex) {
                Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }
        //
        try {
            try (PrintWriter Pfile = new PrintWriter(Commodities)) {
                for (String str : Temp) {
                    Pfile.println(str);
                }
                Pfile.close();

            } catch (Exception ex) {
                Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */

    /**
     *
     * @return
     */

    public static String generateProductID() {
        String trim = "10";
        int p = (int) (Math.random() * 100);
        String pID = trim + p;
        return pID;
    }

    /**
     *
     * @param commodity
     */
    public static void deleteCommodity(String commodity) {
        ArrayList<String> Temp = new ArrayList<String>();
        try {
            try (BufferedReader file = new BufferedReader(new FileReader(Commodities))) {
                String line;
                String[] lineArr;
                while ((line = file.readLine()) != null) {
                    lineArr = line.split(",");
                    if (lineArr[0].equals(GetUpdateDeleteInfo().get(0))) {
                        Temp.remove(GetUpdateDeleteInfo().get(0) + GetUpdateDeleteInfo().get(1)
                                + commodity + GetUpdateDeleteInfo().get(3)
                                + GetUpdateDeleteInfo().get(4) + GetUpdateDeleteInfo().get(5)
                                + GetUpdateDeleteInfo().get(6));
                    } else {
                        Temp.add(line);
                    }
                }
                file.close();

            } catch (Exception ex) {
                Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }
        //
        try {
            try (PrintWriter Pfile = new PrintWriter(Commodities)) {
                for (String str : Temp) {
                    Pfile.println(str);
                }
                Pfile.close();

            } catch (Exception ex) {
                Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
            Logger.getLogger(Commodity.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     */
    public void purchaseCommodity() {

    }

    /**
     *
     * @return
     */
    public static boolean isAvailable() {

        return false;
    }

    /**
     *
     */
    public void advertisee() {

    }

    /**
     *
     */
    public void updateCommodityDatabase() {

    }

    /**
     *
     */
    public void addToOrder() {

    }

    /**
     *
     */
    public void endPurchase() {

    }

    /**
     *
     */
    public void checkout() {

    }

    /**
     *
     * @param Msg
     * @return
     */
    public ChatUser ContactVendor(ChatUser Msg) {

        return null;
    }

    /**
     *
     * @param Msg
     * @return
     */
    public ChatUser ContactBuyer(ChatUser Msg) {

        return null;
    }

    /**
     *This method is used to read commodities file and store all content of clothes section into array list
     * @return ArrayList 
     */
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

    /**
     *This method is used to read commodities file and store all content of book section into array list
     * @return ArrayList
     */
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

    /**
     *This method is used to read commodities file and store all content of furniture section into array list
     * @return  ArrayList
     */
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

    /**
     *Read all content of commodities file and store it into one array 
     * @return ArrayList
     */
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

    /**
     *Read all content of commodities file and check if the current user has an advertisement 
     * then store all the information of the advertisement into the array
     * @return ArrayList
     */
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

    /**
     *
     * @return
     */
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
