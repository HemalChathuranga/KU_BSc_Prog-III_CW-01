
package GUI;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.Timer;
import Tooth_Care_Appoinment_Management_System.Login;
import Tooth_Care_Appoinment_Management_System.Node;
/**
 *
 * @author Hemal Chathuranga
 */
public class Login_Page extends JFrame {
    
    public Node logInput = new Node();

    /**
     * Creates new form Login
     * 
     */
    public Login_Page() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Tooth_Icon.png")));
        curDate();
        curTime();
    }
    
    //Method to get the current Date into Loging Page
    void curDate(){
        
        Date curDate = new Date();
        SimpleDateFormat sDate = new SimpleDateFormat("YYYY.MM.dd");
        lblDate.setText(sDate.format(curDate));
    }
    
    //Method to get the current Time into Loging Page
    void curTime(){
        
        new Timer(0, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                Date curDate = new Date();
                SimpleDateFormat sDate = new SimpleDateFormat("HH:mm:ss");
                lblTime.setText(sDate.format(curDate));
            }   
        }).start();  
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblLoginTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblLoginUser = new javax.swing.JLabel();
        lblLoginPW = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPW = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblDateTitle = new javax.swing.JLabel();
        lblTimeTitle = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblLoginImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        lblLoginTitle.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblLoginTitle.setForeground(new java.awt.Color(0, 204, 204));
        lblLoginTitle.setText("Tooth Care");
        jPanel2.add(lblLoginTitle);
        lblLoginTitle.setBounds(310, 20, 230, 50);
        lblLoginTitle.getAccessibleContext().setAccessibleName("lblLoginTitle");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblLoginUser.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblLoginUser.setForeground(new java.awt.Color(102, 102, 102));
        lblLoginUser.setText("User Name :");

        lblLoginPW.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblLoginPW.setForeground(new java.awt.Color(102, 102, 102));
        lblLoginPW.setText("Password :");

        txtUserName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 153, 153));
        btnLogin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setToolTipText("");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 153, 153));
        btnClear.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLoginUser)
                            .addComponent(lblLoginPW)
                            .addComponent(txtUserName)
                            .addComponent(txtPW, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblLoginUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLoginPW)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPW, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnClear)))
        );

        lblLoginUser.getAccessibleContext().setAccessibleName("lblLoginUser");
        lblLoginUser.getAccessibleContext().setAccessibleDescription("");
        lblLoginPW.getAccessibleContext().setAccessibleName("lblLoginPW");
        txtUserName.getAccessibleContext().setAccessibleName("txtUserName");
        txtPW.getAccessibleContext().setAccessibleName("txtPW");

        jPanel2.add(jPanel1);
        jPanel1.setBounds(310, 120, 250, 200);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblDateTitle.setText("Date :");

        lblTimeTitle.setText("Time :");

        lblTime.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDateTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTimeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblTimeTitle)
                        .addComponent(lblDateTitle)
                        .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(290, 350, 280, 40);

        lblLoginImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loggin1.jpg"))); // NOI18N
        lblLoginImg.setText("lblLoginImg");
        jPanel2.add(lblLoginImg);
        lblLoginImg.setBounds(-30, 0, 360, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        //Variables to keep username and password inputs from loging_page GUI
        logInput.userID = txtUserName.getText();
        logInput.password = txtPW.getText();
        logInput.next = null;
        
        /*
        * Linked List data structure build to store expected credentials for logging validations
        * search through the linkedList to find any matching credentials for entered values
        */
        Login newLogin = new Login(logInput);

        //Validations to make sure the both user name and password feilds are not empty
        if((logInput.userID.equals("") || logInput.password.equals(""))){
            JOptionPane.showMessageDialog(this, "User Name or Password cannot be blank!", "Loging Error", ERROR_MESSAGE);
        }
        //validation whether the logging details are correct
        else if((logInput.userID.equals(newLogin.getUserID())) && (logInput.password.equals(newLogin.getPassword()))){
            Home_Page homePage = new Home_Page();
            homePage.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "User Name or Password incorrect!", "Loging Error", ERROR_MESSAGE);
            txtUserName.setText("");
            txtPW.setText("");
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtUserName.setText("");
        txtPW.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateTitle;
    private javax.swing.JLabel lblLoginImg;
    private javax.swing.JLabel lblLoginPW;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblLoginUser;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTimeTitle;
    private javax.swing.JPasswordField txtPW;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}