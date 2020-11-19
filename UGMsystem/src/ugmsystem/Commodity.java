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

    private String vID, pID, Name, Description, filePic, sec;
    private int Price;

    /**
     *Static file object that saves all commodities for users.
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
     *Static ArrayList attribute used to store commodities for update or delete.
     */
    public static ArrayList<String> UpdateDeleteInfo = new ArrayList<String>();

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
     *Get method returns user id
     * @return String
     */
    public String getvID() {
        return vID;
    }

    /**
     *Set method sets user id
     * @param vID
     * @throws IOException
     */
    public void setvID(String vID) throws IOException {
        vID = vID;

    }

    /**
     *Get method returns product/commodity id
     * @return string
     */
    public String getpID() {
        return pID;
    }

    /**
     *Set method sets product/commodity id
     * @param pID
     * @throws IOException
     */
    public void setpID(String pID) throws IOException {
        pID = pID;

    }

    /**
     *Get method returns commodity name
     * @return string
     */
    public String getName() {
        return Name;
    }

    /**
     *Set method sets commodity name
     * @param Name
     */
    public void setName(String Name) {
        Name = Name;
    }

    /**
     *Get method returns commodity description
     * @return string
     */
    public String getDescription() {
        return Description;
    }

    /**
     *Set method sets ommodity description
     * @param Description
     */
    public void setDescription(String Description) {
        Description = Description;
    }

    /**
     *Get method returns commodity picture
     * @return string
     */
    public String getFilePic() {
        return filePic;
    }

    /**
     *Set method sets ommodity picture
     * @param filePic
     */
    public void setFilePic(String filePic) {
        filePic = filePic;
    }

    /**
     *Get method returns commodity section
     * @return string
     */
    public String getSec() {
        return sec;

    }

    /**
     *Set method sets ommodity section
     * @param sec
     * @throws IOException
     */
    public void setSec(String sec) throws IOException {
        sec = sec;

    }

    /**
     *Get method returns commodity price
     * @return integer
     */
    public int getPrice() {
        return Price;

    }

    /**
     *Set method sets ommodity price
     * @param Price
     * @throws IOException
     */
    public void setPrice(int Price) throws IOException {
        Price = Price;
    }

    /**
     *Get method returns commodity file
     * @return file
     */
    public File getCommodities() {
        return Commodities;
    }

    /**
     *Set method sets ommodity file
     * @param Commodities
     */
    public void setCommodities(File Commodities) {
        Commodity.Commodities = Commodities;
    }

    /**
     *This method used to create commodity for vendor logged in and 
     * store it in commodities file and on vendor commodity array list. 
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

    /**
     *Override Method toString that converts commodity object to string
     * @return  String
     */
    @Override
    public String toString() {
        return vID + "," + pID + "," + Name + "," + Price + "," + sec + "," + filePic + "," + Description + "\n";
    }
    
    /**
     *This method used to receive update of vendor commodity information and updates file and ArrayList UpdateDeleteInfo.
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
     * This method used to generates an id for commodity
     * Called in constructor
     * @return String
     */

    public static String generateProductID() {
        String trim = "10";
        int p = (int) (Math.random() * 100);
        String pID = trim + p;
        return pID;
    }

    /**
     *This method used to delete vendor commodity information and updates file and ArrayList UpdateDeleteInfo.
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
     *Read all content of commodities file and check if the current user has an advertisement 
     * to update or delete then store all the information of the advertisement into the array
     * @return ArrayList 
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
