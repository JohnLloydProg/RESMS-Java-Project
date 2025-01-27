/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.RESMS.mainMenu;

import java.awt.Color;
import com.RESMS.libs.object.*;
import com.RESMS.libs.fileSystem.Read;
import com.RESMS.myapps.AdminMain;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author JohnLloydProg
 */
public class Report extends javax.swing.JFrame {
    
    private Employee employee;
    /**
     * Creates new form Report
     */
    public class CSVReportGenerator{
        
    public void generateCSVReport(ArrayList<IData> items, String filePath) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                Class<?> currentClass = null;
                ArrayList<Cash> cash = new ArrayList<>();
                ArrayList<Installment> installment = new ArrayList<>();

                // for non-offer items; get payment method
                for (IData item : items) {
                    if (item instanceof Offer) {
                        Offer offer = (Offer) item;
                        if (offer.getPaymentMethod() instanceof Cash) {
                            cash.add((Cash) offer.getPaymentMethod());
                        }else {
                            installment.add((Installment) offer.getPaymentMethod());
                        }
                        if (currentClass == null || !item.getClass().equals(currentClass)) {
                            writer.newLine();
                            writeHeader(writer, item);
                            currentClass = item.getClass();
                        }
                        writer.write(offer.toCSV());
                        writer.newLine();
                    } else {
                        if (currentClass == null || !item.getClass().equals(currentClass)) {
                            writer.newLine();
                            writeHeader(writer, item);
                            currentClass = item.getClass();
                        }
                        if (item instanceof Property) {
                            Property propertyData = (Property) item;
                            String csvData = propertyData.getId() + ",";
                            if (propertyData.getOwner() != null) {
                                csvData += propertyData.getOwner().getId() + ",";
                            }else {
                                csvData += "null,";
                            }
                            csvData += propertyData.getLot() + "," + propertyData.getBlock() + "," + propertyData.getSRP() + "," + propertyData.getSize() + "," + propertyData.getDescription() + ",";
                            if (propertyData.getReservation() != null) {
                                csvData += propertyData.getReservation().getId();
                            }else {
                                csvData += "null";
                            }
                            writer.write(csvData);
                        }else {
                            writer.write(item.toCSV());
                        }
                        writer.newLine();
                    }
                }
                
                if (!cash.isEmpty()) {
                    writer.newLine();
                    currentClass = null; // reset current class
                    for (Cash cashData : cash) {
                        if (currentClass == null || !cashData.getClass().equals(currentClass)) {
                            writer.newLine();
                            writeHeader(writer, cashData);
                            currentClass = cashData.getClass();
                        }
                        writer.write(cashData.toCSV());
                        writer.newLine();
                    }
                }
                
                if (!installment.isEmpty()) {
                    writer.newLine();
                    currentClass = null; // reset current class
                    for (Installment installmentData : installment) {
                        if (currentClass == null || !installmentData.getClass().equals(currentClass)) {
                            writer.newLine();
                            writeHeader(writer, installmentData);
                            currentClass = installmentData.getClass();
                        }
                        writer.write(installmentData.toCSV());
                        writer.newLine();
                    }
                }

                System.out.println("CSV report generated successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while generating the CSV report.");
                e.printStackTrace();
            }
        } 

    private void writeHeader(BufferedWriter writer, Object item) throws IOException {
            if (item instanceof Employee) {
                writer.write("Employee ID, Last Name, First Name, Credentials, Password");
            } else if (item instanceof Buyer) {
                writer.write("Buyer ID, Last Name, First Name");
            } else if (item instanceof Property) {
                writer.write("Property ID, Owner, Lot, Block, SRP, Size, Description, Reservation");
            } else if (item instanceof Reservation) {
                writer.write("Reservation ID, Buyer ID, Price, Due Date");
            } else if (item instanceof Offer) {
                writer.write("Offer ID, Currency, Property ID");
            } else if (item instanceof Transaction) {
                writer.write("Transaction ID, Agent ID, Buyer ID, Offer ID");
            } else if (item instanceof Cash) {
                writer.write("Cash Payment ID, Final Price");
            } else if (item instanceof Installment) {
                writer.write("Installment Payment ID, Total Amount, Downpayment, Interest Rate, Number of Payments");
            }
            // Add headers for other classes similarly
            writer.newLine();
        }
    }
    public Report() {
        initComponents();
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.employee = Employee.getUser();
        if (this.employee.getCredentials().contentEquals("Agent")) {
            this.agentTransactionReport(this.employee);
        }else {
            this.adminTransactionReport();
        }
        this.reservationReport();
        this.propertyReport();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void adminTransactionReport() {
        for (Employee employee : Read.getEmployees()) {
            if (employee.getCredentials().contentEquals("Agent")) {
                this.agentTransactionReport(employee);
            }
        }
    }
    
    private void agentTransactionReport(Employee employee) {
        ArrayList<Transaction> transactions = Read.getTransactions();
        String report = "Employee Id: " + employee.getId() + "\n";
        report += "Employee Name: " + employee.getFirstName() + " " + employee.getLastName() + "\n";
        report += "----------Transactions-----------\n";
        Buyer buyer;
        Property property;
        Offer offer;
        for (Transaction transactionData : transactions) {
            if (transactionData.getAgent().getId().contentEquals(employee.getId())) {
                offer = transactionData.getOffer();
                property = offer.getCurrentProperty();
                buyer = transactionData.getBuyer();
                report += "Transaction Id: " + transactionData.getId() + "\n";
                report += "Buyer: " + buyer.getFirstName() + " " + buyer.getLastName() + "\n";
                report += "Property: Lot " + property.getLot() + " Block " + property.getBlock() + "\n";
                report += "Property Size: " + property.getSize() + "\n";
                report += "Final Price: " + offer.getPaymentMethod().getFinalPrice() + " " + offer.getCurrency() + "\n";
                if (offer.getPaymentMethod() instanceof Installment) {
                    Installment paymentMethod = (Installment) offer.getPaymentMethod();
                    report += paymentMethod.getPaymentDetails() + "\n";
                }
                report += "\n";
            }
        }
        this.reportArea.setText(this.reportArea.getText() + report);
    }
    
    private void reservationReport() {
        String report = "----------Reservations-----------\n";
        ArrayList<Property> properties = Read.getProperties();
        ArrayList<Offer> offers = Read.getOffers();
        for (Property propertyData : properties) {
            Reservation reservation = propertyData.getReservation();
            if (reservation != null) {
                Buyer buyer = reservation.getBuyer();
                report += "Property: Lot " + propertyData.getLot() + " Block " + propertyData.getBlock() + "\n";
                report += "Property Size: " + propertyData.getSize() + "\n";
                report += "Property SRP: " + propertyData.getSRP() + "\n";
                report += "Buyer: "+ buyer.getFirstName() + " " + buyer.getLastName() + "\n";
                report += "Reservation Fee: " + reservation.getPrice() + "\n";
                report += "Due Date: " + reservation.getDueDate() + "\n";
                report += "Offers:\n";
                for (Offer offerData: offers) {
                    if (offerData.getCurrentProperty().getId().contentEquals(propertyData.getId())) {
                        report += "    " + offerData.getId() + ":" + offerData.getPaymentMethod().getFinalPrice() + " " + offerData.getCurrency() + "(";
                        if (offerData.getPaymentMethod() instanceof Cash) {
                            report += "Cash)\n";
                        }else {
                            report += "Installment)\n";
                        }
                    }
                }
                report += "\n";
            }
        }
        this.reportArea.setText(this.reportArea.getText() + report);
    }
    
    private void propertyReport() {
        String report = "----------Properties-----------\n";
        ArrayList<Property> properties = Read.getProperties();
        for (Property propertyData : properties) {
            if (propertyData.getReservation() == null) {
                report += "Property: Lot " + propertyData.getLot() + " Block " + propertyData.getBlock() + "\n";
                report += "Property Size: " + propertyData.getSize() + "\n";
                report += "Property SRP: " + propertyData.getSRP() + "\n";
                report += "\n";
            }
        }
        this.reportArea.setText(this.reportArea.getText() + report);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportArea = new javax.swing.JTextArea();
        saveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(620, 720));

        jPanel1.setPreferredSize(new java.awt.Dimension(590, 100));

        reportArea.setColumns(20);
        reportArea.setRows(5);
        jScrollPane1.setViewportView(reportArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        saveBtn.setBackground(new java.awt.Color(142, 202, 230));
        saveBtn.setFont(new java.awt.Font("Inter_FXH", 0, 24)); // NOI18N
        saveBtn.setText("Save Report");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Inter_FXH", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 48, 71));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        ArrayList<IData> allData = new ArrayList<>();
        allData.addAll(Read.getEmployees());
        allData.addAll(Read.getBuyers());
        allData.addAll(Read.getProperties());
        allData.addAll(Read.getReservations());
        allData.addAll(Read.getOffers());
        allData.addAll(Read.getTransactions());
        
        CSVReportGenerator reportGenerator = new CSVReportGenerator();
        
        reportGenerator.generateCSVReport(allData, "Admin_ReportGenerated.csv");
    }//GEN-LAST:event_saveBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea reportArea;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
