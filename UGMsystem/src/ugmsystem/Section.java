/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

/**
 *
 * @author fayaldosa
 */
public class Section {
    
     private  static int ID;
     private static String Name;
     private static Commodity [] CommodityArray;

    public Section( int ID, String Name, Commodity [] CommodityArray) {
        
        this.ID=ID;
        this.Name=Name;
        this.CommodityArray=CommodityArray;
    }

     
    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Section.ID = ID;
    }

    public static String getName() {
        return Name;
    }

    public static void setName(String Name) {
        Section.Name = Name;
    }

    public static Commodity[] getCommodityArray() {
        return CommodityArray;
    }

    public static void setCommodityArray(Commodity[] CommodityArray) {
        Section.CommodityArray = CommodityArray;
    }
     
    public void browseSection(){
        
        
    }
    
    public Commodity chooseItem(int ID){
        
        return null;
    }
    
}
