/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.util.*;
/**
 *
 * @author Jae
 */
public class Chat {
    private String Message;
    private int SourceID;
    private int DestinationID;

    public Chat(String Message, int SourceID, int DestinationID) {
        this.Message = Message;
        this.SourceID = SourceID;
        this.DestinationID = DestinationID;
    }

    //Get and set
    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public int getSourceID() {
        return SourceID;
    }

    public void setSourceID(int SourceID) {
        this.SourceID = SourceID;
    }

    public int getDestinationID() {
        return DestinationID;
    }

    public void setDestinationID(int DestinationID) {
        this.DestinationID = DestinationID;
    }
   //Method
    public String getSenderName(){
        return "";
    }
    
    public String getContent(){
       return ""; 
    }
}
