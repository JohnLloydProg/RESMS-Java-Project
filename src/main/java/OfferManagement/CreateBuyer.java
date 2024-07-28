/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package OfferManagement;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Audrize Cruz
 */
public class CreateBuyer extends javax.swing.JFrame {

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
    public CreateBuyer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DashboardBackground = new javax.swing.JPanel();
        ListOfBuyers = new javax.swing.JLabel();
        Arrow = new javax.swing.JLabel();
        Menu = new GradientPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(379, 40), new java.awt.Dimension(200, 200));
        Ascend = new javax.swing.JLabel();
        PropertiesLabel = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(379, 10), new java.awt.Dimension(200, 200));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(379, 2), new java.awt.Dimension(200, 200));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(379, 10), new java.awt.Dimension(200, 200));
        MenuButton = new javax.swing.JButton();
        ManageBuyerButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        BuyerInfo = new javax.swing.JPanel();
        BuyerInfoBox = new javax.swing.JPanel();
        BuyerInfoLabel = new javax.swing.JLabel();
        BuyerInfoForm = new javax.swing.JPanel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(550, 15), new java.awt.Dimension(200, 200));
        FirstNameLabel = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        LastNameLabel = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 900));

        DashboardBackground.setBackground(new java.awt.Color(255, 255, 255));

        ListOfBuyers.setFont(new java.awt.Font("Segoe UI", 1, 64)); // NOI18N
        ListOfBuyers.setForeground(new java.awt.Color(2, 48, 71));
        ListOfBuyers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angle-small-right.png"))); // NOI18N
        ListOfBuyers.setIconTextGap(7);

        Arrow.setFont(new java.awt.Font("Segoe UI", 1, 64)); // NOI18N
        Arrow.setForeground(new java.awt.Color(2, 48, 71));
        Arrow.setText("Create Buyer");
        Arrow.setIconTextGap(7);

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

        ManageBuyerButton.setBackground(new java.awt.Color(61, 131, 134));
        ManageBuyerButton.setFont(ManageBuyerButton.getFont().deriveFont(ManageBuyerButton.getFont().getStyle() | java.awt.Font.BOLD, ManageBuyerButton.getFont().getSize()+12));
        ManageBuyerButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageBuyerButton.setText("     Manage Buyers");
        ManageBuyerButton.setBorder(null);
        ManageBuyerButton.setBorderPainted(false);
        ManageBuyerButton.setContentAreaFilled(false);
        ManageBuyerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ManageBuyerButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ManageBuyerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ManageBuyerButton.setMinimumSize(new java.awt.Dimension(379, 59));
        ManageBuyerButton.setPreferredSize(new java.awt.Dimension(379, 59));
        ManageBuyerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ManageBuyerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ManageBuyerButtonMouseExited(evt);
            }
        });
        ManageBuyerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageBuyerButtonActionPerformed(evt);
            }
        });
        Menu.add(ManageBuyerButton);
        Menu.add(filler1);

        BuyerInfo.setToolTipText("");
        BuyerInfo.setMaximumSize(new java.awt.Dimension(550, 600));
        BuyerInfo.setMinimumSize(new java.awt.Dimension(550, 600));
        BuyerInfo.setPreferredSize(new java.awt.Dimension(500, 600));
        BuyerInfo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        BuyerInfoBox.setBackground(new java.awt.Color(61, 131, 164));
        BuyerInfoBox.setToolTipText("");
        BuyerInfoBox.setPreferredSize(new java.awt.Dimension(1110, 68));

        BuyerInfoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BuyerInfoLabel.setForeground(new java.awt.Color(255, 255, 255));
        BuyerInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BuyerInfoLabel.setText("Buyer Information");
        BuyerInfoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BuyerInfoLabel.setPreferredSize(new java.awt.Dimension(1110, 68));

        javax.swing.GroupLayout BuyerInfoBoxLayout = new javax.swing.GroupLayout(BuyerInfoBox);
        BuyerInfoBox.setLayout(BuyerInfoBoxLayout);
        BuyerInfoBoxLayout.setHorizontalGroup(
            BuyerInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1110, Short.MAX_VALUE)
            .addGroup(BuyerInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BuyerInfoBoxLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BuyerInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        BuyerInfoBoxLayout.setVerticalGroup(
            BuyerInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
            .addGroup(BuyerInfoBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BuyerInfoBoxLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BuyerInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        BuyerInfo.add(BuyerInfoBox);

        BuyerInfoForm.setBackground(new java.awt.Color(241, 241, 241));
        BuyerInfoForm.setMaximumSize(new java.awt.Dimension(1110, 595));
        BuyerInfoForm.setMinimumSize(new java.awt.Dimension(1110, 595));
        BuyerInfoForm.setPreferredSize(new java.awt.Dimension(1110, 595));
        BuyerInfoForm.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 5));
        BuyerInfoForm.add(filler8);

        FirstNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FirstNameLabel.setText("First Name");
        FirstNameLabel.setPreferredSize(new java.awt.Dimension(1070, 35));
        BuyerInfoForm.add(FirstNameLabel);

        FirstName.setMinimumSize(new java.awt.Dimension(500, 22));
        FirstName.setPreferredSize(new java.awt.Dimension(1070, 35));
        FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameActionPerformed(evt);
            }
        });
        BuyerInfoForm.add(FirstName);

        LastNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LastNameLabel.setText("Last Name");
        LastNameLabel.setPreferredSize(new java.awt.Dimension(1070, 35));
        BuyerInfoForm.add(LastNameLabel);

        LastName.setMinimumSize(new java.awt.Dimension(500, 22));
        LastName.setPreferredSize(new java.awt.Dimension(1070, 35));
        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });
        BuyerInfoForm.add(LastName);

        BuyerInfo.add(BuyerInfoForm);

        SaveButton.setBackground(new java.awt.Color(36, 79, 99));
        SaveButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton.setText("SAVE");
        SaveButton.setBorder(null);
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DashboardBackgroundLayout = new javax.swing.GroupLayout(DashboardBackground);
        DashboardBackground.setLayout(DashboardBackgroundLayout);
        DashboardBackgroundLayout.setHorizontalGroup(
            DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                        .addComponent(Arrow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ListOfBuyers, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(569, 624, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DashboardBackgroundLayout.createSequentialGroup()
                        .addGroup(DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuyerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        DashboardBackgroundLayout.setVerticalGroup(
            DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Arrow)
                    .addComponent(ListOfBuyers, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuyerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 2541, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DashboardBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DashboardBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1616, 908));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuButtonActionPerformed

    private void MenuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuButtonMouseExited
       this.MenuButton.setContentAreaFilled(false);
    }//GEN-LAST:event_MenuButtonMouseExited

    private void MenuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuButtonMouseEntered
       this.MenuButton.setBackground(new Color(36, 79, 99 ));
       this.MenuButton.setContentAreaFilled(true);
    }//GEN-LAST:event_MenuButtonMouseEntered

    private void ManageBuyerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageBuyerButtonActionPerformed
        DisplayBuyers newForm = new DisplayBuyers(); 
        newForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_ManageBuyerButtonActionPerformed

    private void ManageBuyerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBuyerButtonMouseExited
        this.ManageBuyerButton.setContentAreaFilled(false);
    }//GEN-LAST:event_ManageBuyerButtonMouseExited

    private void ManageBuyerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBuyerButtonMouseEntered
       this.ManageBuyerButton.setBackground(new Color(36, 79, 99 ));
       this.ManageBuyerButton.setContentAreaFilled(true);
    }//GEN-LAST:event_ManageBuyerButtonMouseEntered

    private void FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameActionPerformed

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CreateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateBuyer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arrow;
    private javax.swing.JLabel Ascend;
    private javax.swing.JPanel BuyerInfo;
    private javax.swing.JPanel BuyerInfoBox;
    private javax.swing.JPanel BuyerInfoForm;
    private javax.swing.JLabel BuyerInfoLabel;
    private javax.swing.JPanel DashboardBackground;
    private javax.swing.JTextField FirstName;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField LastName;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JLabel ListOfBuyers;
    private javax.swing.JButton ManageBuyerButton;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton MenuButton;
    private javax.swing.JLabel PropertiesLabel;
    private javax.swing.JButton SaveButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    // End of variables declaration//GEN-END:variables
}
