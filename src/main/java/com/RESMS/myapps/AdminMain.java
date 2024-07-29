/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.RESMS.myapps;

import com.RESMS.libs.fileSystem.Read;
import com.RESMS.libs.object.Buyer;
import com.RESMS.libs.object.Cash;
import com.RESMS.libs.object.Employee;
import com.RESMS.libs.object.IData;
import com.RESMS.libs.object.Installment;
import com.RESMS.libs.object.Offer;
import com.RESMS.libs.object.PaymentMethod;
import com.RESMS.libs.object.Property;
import com.RESMS.libs.object.Reservation;
import com.RESMS.libs.object.Transaction;
import com.RESMS.mainMenu.MenuFrame;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Rayleen Morales
 */
public class AdminMain extends javax.swing.JFrame {

    public class GradientPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g.create();
        int w = getWidth();
        int h = getHeight();

        GradientPaint gp = new GradientPaint(
                0, 0, new Color(2, 48, 71),
                0, h, new Color(142, 202, 230));

        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);

        g2d.dispose();
        }
    }
    
    public AdminMain() {
        initComponents();
    }
    
    public class CSVReportGenerator{
        
    public void generateCSVReport(ArrayList<IData> items, String filePath) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                Class<?> currentClass = null;
                ArrayList<PaymentMethod> paymentMethods = new ArrayList<>();

                // for non-offer items; get payment method
                for (IData item : items) {
                    if (item instanceof Offer) {
                        Offer offer = (Offer) item;
                        paymentMethods.add(offer.getPaymentMethod());
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
                        writer.write(item.toCSV());
                        writer.newLine();
                    }
                }

                // for payment method
                if (!paymentMethods.isEmpty()) {
                    writer.newLine();
                    currentClass = null; // reset current class
                    for (PaymentMethod paymentMethod : paymentMethods) {
                        if (currentClass == null || !paymentMethod.getClass().equals(currentClass)) {
                            writer.newLine();
                            writeHeader(writer, paymentMethod);
                            currentClass = paymentMethod.getClass();
                        }
                        writer.write(paymentMethod.toCSV());
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
                writer.write("Installment Payment ID, Total Amount, Downpayment, Interest Rate, Number of Years");
            }
            // Add headers for other classes similarly
            writer.newLine();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DashboardBackground1 = new javax.swing.JPanel();
        Menu = new GradientPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(379, 40), new java.awt.Dimension(200, 200));
        Ascend = new javax.swing.JLabel();
        PropertiesLabel = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(379, 10), new java.awt.Dimension(200, 200));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(379, 2), new java.awt.Dimension(200, 200));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(379, 10), new java.awt.Dimension(200, 200));
        MenuButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        RegisterNewAgentButton = new javax.swing.JButton();
        GenerateReportButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESMS | ASCEND - Main Page");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 900));

        DashboardBackground1.setBackground(new java.awt.Color(255, 255, 255));
        DashboardBackground1.setPreferredSize(new java.awt.Dimension(1600, 900));
        DashboardBackground1.setRequestFocusEnabled(false);

        Menu.setBackground(new java.awt.Color(2, 48, 71));
        Menu.setMaximumSize(new java.awt.Dimension(379, 1024));
        Menu.setMinimumSize(new java.awt.Dimension(379, 1024));
        Menu.setPreferredSize(new java.awt.Dimension(379, 1024));
        Menu.add(filler4);

        Ascend.setFont(new java.awt.Font("Segoe UI Variable", 1, 55)); // NOI18N
        Ascend.setForeground(new java.awt.Color(255, 255, 255));
        Ascend.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Ascend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/house-chimney.png"))); // NOI18N
        Ascend.setText("ASCEND");
        Ascend.setIconTextGap(15);
        Menu.add(Ascend);

        PropertiesLabel.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        PropertiesLabel.setForeground(new java.awt.Color(255, 255, 255));
        PropertiesLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PropertiesLabel.setText("PROPERTIES");
        PropertiesLabel.setIconTextGap(15);
        Menu.add(PropertiesLabel);
        Menu.add(filler7);

        filler5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Menu.add(filler5);
        Menu.add(filler6);

        MenuButton.setBackground(new java.awt.Color(61, 131, 164));
        MenuButton.setFont(MenuButton.getFont().deriveFont(MenuButton.getFont().getStyle() | java.awt.Font.BOLD, MenuButton.getFont().getSize()+12));
        MenuButton.setForeground(new java.awt.Color(255, 255, 255));
        MenuButton.setText("     Main Menu");
        MenuButton.setToolTipText("");
        MenuButton.setBorder(null);
        MenuButton.setBorderPainted(false);
        MenuButton.setContentAreaFilled(false);
        MenuButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuButton.setMinimumSize(new java.awt.Dimension(379, 59));
        MenuButton.setPreferredSize(new java.awt.Dimension(379, 59));
        MenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuButtonMouseExited(evt);
            }
        });
        MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonActionPerformed(evt);
            }
        });
        Menu.add(MenuButton);
        Menu.add(filler1);

        RegisterNewAgentButton.setBackground(new java.awt.Color(36, 79, 99));
        RegisterNewAgentButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        RegisterNewAgentButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterNewAgentButton.setText("Register New Account");
        RegisterNewAgentButton.setBorder(null);
        RegisterNewAgentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterNewAgentButtonActionPerformed(evt);
            }
        });

        GenerateReportButton.setBackground(new java.awt.Color(36, 79, 99));
        GenerateReportButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        GenerateReportButton.setForeground(new java.awt.Color(255, 255, 255));
        GenerateReportButton.setText("Generate Report");
        GenerateReportButton.setBorder(null);
        GenerateReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateReportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DashboardBackground1Layout = new javax.swing.GroupLayout(DashboardBackground1);
        DashboardBackground1.setLayout(DashboardBackground1Layout);
        DashboardBackground1Layout.setHorizontalGroup(
            DashboardBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardBackground1Layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 576, Short.MAX_VALUE)
                .addComponent(RegisterNewAgentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GenerateReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        DashboardBackground1Layout.setVerticalGroup(
            DashboardBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardBackground1Layout.createSequentialGroup()
                .addContainerGap(790, Short.MAX_VALUE)
                .addGroup(DashboardBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterNewAgentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GenerateReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DashboardBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, 1592, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DashboardBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1616, 908));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuButtonMouseEntered
        this.MenuButton.setBackground(new Color(36, 79, 99 ));
        this.MenuButton.setContentAreaFilled(true);
    }//GEN-LAST:event_MenuButtonMouseEntered

    private void MenuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuButtonMouseExited
        this.MenuButton.setContentAreaFilled(false);
    }//GEN-LAST:event_MenuButtonMouseExited

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonActionPerformed
        // TODO add your handling code here:
        MenuFrame newForm = new MenuFrame(); 
        newForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuButtonActionPerformed

    private void RegisterNewAgentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterNewAgentButtonActionPerformed
        // TODO add your handling code here:
        AdminRegisterNewAccount newForm = new AdminRegisterNewAccount(); 
        newForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegisterNewAgentButtonActionPerformed

    private void GenerateReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReportButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<IData> allData = new ArrayList<>();
        allData.addAll(Read.getEmployees());
        allData.addAll(Read.getBuyers());
        allData.addAll(Read.getProperties());
        allData.addAll(Read.getReservations());
        allData.addAll(Read.getOffers());
        allData.addAll(Read.getTransactions());
        
        CSVReportGenerator reportGenerator = new CSVReportGenerator();
        
        reportGenerator.generateCSVReport(allData, "Admin_ReportGenerated.csv");
        
    }//GEN-LAST:event_GenerateReportButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ascend;
    private javax.swing.JPanel DashboardBackground1;
    private javax.swing.JButton GenerateReportButton;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton MenuButton;
    private javax.swing.JLabel PropertiesLabel;
    private javax.swing.JButton RegisterNewAgentButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    // End of variables declaration//GEN-END:variables
}
