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
public class Commodity {
   
    private  static int ID, Price, Quantity;
    private  static String Name, Description, YearOfPurchase;
    private static boolean State;

    public Commodity(int ID, int Price, int Quantity, String Name, String Description, 
            String YearOfPurchase, boolean State) {
    
    this.ID= ID;
    this.Price= Price;
    this.Quantity=Quantity;
    this.Name= Name;
    this.Description=Description;
    this.YearOfPurchase=YearOfPurchase;
    this.State=State;
    
    }

    
    
    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Commodity.ID = ID;
    }

    public static int getPrice() {
        return Price;
    }

    public static void setPrice(int Price) {
        Commodity.Price = Price;
    }

    public static int getQuantity() {
        return Quantity;
    }

    public static void setQuantity(int Quantity) {
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

    public static String getYearOfPurchase() {
        return YearOfPurchase;
    }

    public static void setYearOfPurchase(String YearOfPurchase) {
        Commodity.YearOfPurchase = YearOfPurchase;
    }

    public static boolean isState() {
        return State;
    }

    public static void setState(boolean State) {
        Commodity.State = State;
    }
    
    public void createCommodity(){
        
    }
    
    public void addCommodity(){
        
    }
    
    public void editCommodity(){
        
    }
    
    public void deleteCommodity(){
        
    }
    
    public void purchaseCommodity(){
        
    }
    
    public boolean isAvailable(){
        
        
        return false;
    }
    
    public void advertisee(){
        
        
    }
    
    public void updateCommodityDatabase(){
        
        
    }
    
    public void addToOrder(){
        
        
    }
    
    public void endPurchase(){
        
    }
    
    public void checkout(){
        
        
    }
    /*
    public Chat ContactVendor(Msg: Chat){
        
        return;
    }
    
    public Chat ContactBuyer(Msg: Chat){
        
        return;
    }

*/
}
