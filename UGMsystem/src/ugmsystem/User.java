/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

/**
 *
 * @author reemalsolami
 */
public class User {
    private String id;
    private int password;
    private String fName;
    private String lName;
    private int phoneNumber;
    private String email;

    public User(String id, int password, String fName, String lName, int phoneNumber) {
        this.id = id;
        this.password = password;
        this.fName = fName;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public int getPassword() {
        return password;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void login(String id, int password) {
        
    }    
    
    public void register(String id, int password, String fName, String lName, int phoneNumber) {
        
        
    } 
    public void browse() {
        
    }
}
