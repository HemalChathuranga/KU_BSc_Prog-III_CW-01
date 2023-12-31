/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Tooth_Care_Appoinment_Management_System.Patient;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author Hemal Chathuranga
 */
public class Invoice extends javax.swing.JFrame {
    
    int selectedIndexforbook = -1;
    
    //Variables to store payment details
    String appFee;
    String treatFee;
    String balance;
    String total;
    
    //Variables to store patient details
    String appID;
    String name;
    String age;
    String treat;
    String docName;
    
    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
        
//        this.appID = "Mon01";
//        this.name = "Mr. Hemal Chathuranga";
//        this.age = "28 Years";
//        this.treat = "Root Canal Therapy";
//        this.docName = "Dr. A.D. Ranasinghe";
//        
//        this.appFee = "1000";
//        this.treatFee = "2000";
//        this.total = "3500";
//        
//        generateBill();
//        this.setLocationRelativeTo(null);
    }
    
    //Overloaded constructed method to accept the patient details form Home Page
    public Invoice(Patient patientDetails, int selectedIndex) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        //Assigning values from main table to this variables
        this.selectedIndexforbook = selectedIndex;
        
        this.appID = patientDetails.appID;
        this.name = patientDetails.title + " " + patientDetails.firstName + " " + patientDetails.lastName;
        this.age = patientDetails.age + " Years";
        this.treat = patientDetails.treatment;
        this.docName = patientDetails.docName;
        
        //Set payment details to the varibales
        this.appFee = patientDetails.appFee;
        
        this.treatFee = calcTreatmentFee(treat);
        
        this.total = calcTotal();
        
        
        //Set patient details from main table into the Invoice object
        lblAppID.setText(this.appID);
        lblPName.setText(this.name);
        lblPAge.setText(this.age);
        lblTreatment.setText(this.treat);
        lblDocName.setText(this.docName);
        
        //Set Payment details according to the treatment
        lblAppFee.setText(this.appFee);
        lblTreatFee.setText(this.treatFee);
        lblTotal.setText(this.total);
        
    }
    
    //Method to get the current Date into Loging Page
    String curDate(){
        
        Date curDate = new Date();
        SimpleDateFormat sDate = new SimpleDateFormat("YYYY.MM.dd");
        return (sDate.format(curDate));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblPName = new javax.swing.JLabel();
        lblPAge = new javax.swing.JLabel();
        lblDocName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblAppID = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTreatment = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblTreatFee = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblAppFee = new javax.swing.JLabel();
        txtPayment = new javax.swing.JTextField();
        btnPrintBill = new javax.swing.JButton();
        btnViewBill1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaBill = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient's Invoice");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient's Invoice");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Patient's Name :");
        jLabel6.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Age :");
        jLabel8.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel14.setText("Doc. Name :");
        jLabel14.setToolTipText("");

        lblPName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblPName.setToolTipText("");

        lblPAge.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblPAge.setToolTipText("");

        lblDocName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblDocName.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Appoinment ID :");

        lblAppID.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAppID.setForeground(new java.awt.Color(0, 0, 0));
        lblAppID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAppID.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setText("Treatment :");
        jLabel13.setToolTipText("");

        lblTreatment.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblTreatment.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPAge, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblAppID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAppID))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTreatment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDocName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Sub Total :");
        jLabel7.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setText("Total :");
        jLabel9.setToolTipText("");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel16.setText("Balance :");
        jLabel16.setToolTipText("");

        lblTreatFee.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblTreatFee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTreatFee.setText("0");
        lblTreatFee.setToolTipText("");

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("0");
        lblTotal.setToolTipText("");

        lblBalance.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        lblBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBalance.setText("0");
        lblBalance.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Appoinment Fee :");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel17.setText("Payment :");
        jLabel17.setToolTipText("");

        lblAppFee.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblAppFee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAppFee.setText("0");
        lblAppFee.setToolTipText("");
        lblAppFee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtPayment.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        txtPayment.setForeground(new java.awt.Color(102, 0, 51));
        txtPayment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPayment.setText("0");
        txtPayment.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTreatFee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAppFee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAppFee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTreatFee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        btnPrintBill.setBackground(new java.awt.Color(0, 153, 153));
        btnPrintBill.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnPrintBill.setForeground(new java.awt.Color(255, 255, 255));
        btnPrintBill.setText("Print Bill");
        btnPrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintBillActionPerformed(evt);
            }
        });

        btnViewBill1.setBackground(new java.awt.Color(0, 153, 153));
        btnViewBill1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnViewBill1.setForeground(new java.awt.Color(255, 255, 255));
        btnViewBill1.setText("Generate Bill");
        btnViewBill1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBill1ActionPerformed(evt);
            }
        });

        txtAreaBill.setEditable(false);
        txtAreaBill.setColumns(20);
        txtAreaBill.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtAreaBill.setRows(5);
        txtAreaBill.setFocusable(false);
        jScrollPane1.setViewportView(txtAreaBill);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnViewBill1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPrintBill, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrintBill, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewBill1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintBillActionPerformed
        
        printBill();
    }//GEN-LAST:event_btnPrintBillActionPerformed

    private void btnViewBill1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBill1ActionPerformed
        
        if (txtPayment.getText().equals("0")){
            JOptionPane.showMessageDialog(this, "Please add Payment Amount.", "Appoinment Billing Error", ERROR_MESSAGE);
        }
        else{

            calcBalance(txtPayment.getText());
            txtAreaBill.setText("");
            generateBill();
            Home_Page.addCompleteActionToMainTable(selectedIndexforbook);
        }
    }//GEN-LAST:event_btnViewBill1ActionPerformed
    
    //Method to calculate the perticular amount for the tratment
    private String calcTreatmentFee(String treat){
        
        switch (treat){
            case "Cleaning":
                return "4500";
            case "Whitening":
                return "20000";
            case "Filling":
                return "4000";
            case "Nerve Filling":
                return "25000";
            case "Root Canal Therapy":
                return "25000";
        }
        
        return "0";
    }
    
    
    //Method to calculate the total amount to be paid after the appoinment fee deduction
    private String calcTotal(){
        
        return String.valueOf((Integer.parseInt(this.treatFee) - Integer.parseInt(this.appFee)));
    }
    
    //Method to calculate the balance (Payed Amount - Total bill amount)
    private void calcBalance(String payment){
        
        this.balance = String.valueOf((Integer.parseInt(payment) - Integer.parseInt(total)));
        lblBalance.setText(this.balance);
    }
    
    //Method to generate the final invoice
    private void generateBill(){
        //93
        txtAreaBill.setText(txtAreaBill.getText() + "*********************************************************************************************\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                  DENTAL SERVICES INVOICE                                  *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                  =======================                                  *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                                                                           *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                 TOOTH CARE Dental Services                                *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                         ~Nugegoda~                                        *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                      Tel: 011-123 4567                                    *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "* ----------------------------------------------------------------------------------------- *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*  DATE : " + curDate() + "                                                 Appoinment # : " + this.appID + "   *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                                                                           *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*  Patient Information                                                                      *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*      Name : " + nameAdjest() + "\t|          Age : " + this.age + "\t\t    *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                            _____________________________________                          *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                                                                           *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*  Treatment Information                                                                    *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*      Doctor/Dental Surgeon Name : " + this.docName + "                                     *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                                                                           *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*         Treatment Type\t\t\t\t\t\tAmount              *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*         ..............\t\t\t\t\t\t......              *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                                                                           *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*           <> " + treatmentAdjest() + "\t\t\t\t\t" + this.treatFee + "\t\t    *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                                                                           *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                                                  ________________         *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                              SUBTOTAL :               " + this.treatFee + "\t\t    *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                        APPOINMENT FEE :               " + appFeeAdjest() + "\t\t    *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                                                  ================         *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                                 TOTAL :               " + this.total + "\t\t    *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                                                  ================         *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                                                                           *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "* ----------------------------------------------------------------------------------------- *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                          THANK YOU !                                      *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                          Come Again                                       *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*                                                                                           *\n");
        txtAreaBill.setText(txtAreaBill.getText() + "*********************************************************************************************\n");

        
    }
    
    //Method to print the generate bill
    private void printBill(){
        
        try {
            txtAreaBill.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String treatmentAdjest(){
        
        switch (this.treat){
            case "Cleaning":
                return "Cleaning          ";
            case "Whitening":
                return "Whitening         ";
            case "Filling":
                return "Filling           ";
            case "Nerve Filling":
                return "Nerve Filling     ";
            case "Root Canal Therapy":
                return "Root Canal Therapy";
        }
        
        return "                  ";
    }
    
    private String nameAdjest(){
        
        String tempName = this.name;
        
        if((tempName.length()) < 28){
            
            do{
                tempName = tempName + " ";  
            }while (tempName.length() < 28);
            
            return tempName;
        }
        
        return tempName;
    }
    
    private String appFeeAdjest(){
        
        if(Integer.parseInt(this.treatFee) > 9999){
            
            return " " + this.appFee;
        }
        return this.appFee;
    }
    
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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrintBill;
    private javax.swing.JButton btnViewBill1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAppFee;
    private javax.swing.JLabel lblAppID;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblDocName;
    private javax.swing.JLabel lblPAge;
    private javax.swing.JLabel lblPName;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTreatFee;
    private javax.swing.JLabel lblTreatment;
    private javax.swing.JTextArea txtAreaBill;
    private javax.swing.JTextField txtPayment;
    // End of variables declaration//GEN-END:variables
}
