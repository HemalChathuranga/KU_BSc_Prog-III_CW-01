
package Tooth_Care_Appoinment_Management_System;

/**
 *
 * @author Hemal Chathuranga
 */
public class Login {

    
    private Node credentials;
    private String userID;
    private String password;
    
    private LinkedList useridAndPass = new LinkedList();
    
    
    public Login(){
    
    }
    
    //Overloaded constructor to accept the values from Loggin GUI
    public Login(Node credentials){
        
        createLogingList();
        
        if(useridAndPass.search(credentials) == null){
            this.userID = "";
            this.password="";
        }
        else{
            this.userID = useridAndPass.search(credentials).userID;
            this.password = useridAndPass.search(credentials).password;
        }
    }
    
    
    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }
    
    //Method to create few user loging credentials to make system run
    private void createLogingList(){
        
        useridAndPass.insert("Hemal", "123");
        useridAndPass.insert("Chathuranga", "456");
        useridAndPass.insert("Hasani", "789");
    
    }
    
    
}
