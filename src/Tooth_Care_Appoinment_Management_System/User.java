
package Tooth_Care_Appoinment_Management_System;

import GUI.Login_Page;

/**
 *
 * @author Hemal Chathuranga
 */
public class User {
    
    String userID;
    String designation;
    String fName;
    String lName;
    String gender;
    String mobNumber;
    String email;
    
    public void loging(){
        
        Login_Page loging = new Login_Page();
        loging.setVisible(true);
        
    }
    
}
