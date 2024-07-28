/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.RESMS.OfferManagement;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Audrize Cruz
 */
public class DisplayBuyers extends javax.swing.JFrame {

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
    public DisplayBuyers() {
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
        DeleteButton = new javax.swing.JButton();
        CreateButton = new javax.swing.JButton();
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
        BuyerInfoLabel = new javax.swing.JLabel();
        BuyerList = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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
        Arrow.setText("List of Buyers");
        Arrow.setIconTextGap(7);

        DeleteButton.setBackground(new java.awt.Color(36, 79, 99));
        DeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("DELETE");
        DeleteButton.setBorder(null);
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        CreateButton.setBackground(new java.awt.Color(36, 79, 99));
        CreateButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CreateButton.setForeground(new java.awt.Color(255, 255, 255));
        CreateButton.setText("CREATE");
        CreateButton.setBorder(null);
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        CreateButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CreateButtonKeyPressed(evt);
            }
        });

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

        BuyerInfo.setBackground(new java.awt.Color(241, 241, 241));
        BuyerInfo.setMaximumSize(new java.awt.Dimension(700, 700));
        BuyerInfo.setMinimumSize(new java.awt.Dimension(700, 700));
        BuyerInfo.setName(""); // NOI18N
        BuyerInfo.setPreferredSize(new java.awt.Dimension(700, 700));

        BuyerInfoLabel.setBackground(new java.awt.Color(255, 255, 255));
        BuyerInfoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BuyerInfoLabel.setForeground(new java.awt.Color(2, 48, 71));
        BuyerInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BuyerInfoLabel.setText("Buyer Information");
        BuyerInfoLabel.setFocusable(false);
        BuyerInfoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Buyer ID", "First Name", "Last Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setColumnSelectionAllowed(true);
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jTable2.getTableHeader().setReorderingAllowed(false);
        BuyerList.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout BuyerInfoLayout = new javax.swing.GroupLayout(BuyerInfo);
        BuyerInfo.setLayout(BuyerInfoLayout);
        BuyerInfoLayout.setHorizontalGroup(
            BuyerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BuyerList)
            .addGroup(BuyerInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BuyerInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        BuyerInfoLayout.setVerticalGroup(
            BuyerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuyerInfoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BuyerInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuyerList, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DashboardBackgroundLayout = new javax.swing.GroupLayout(DashboardBackground);
        DashboardBackground.setLayout(DashboardBackgroundLayout);
        DashboardBackgroundLayout.setHorizontalGroup(
            DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BuyerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                                .addComponent(Arrow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ListOfBuyers, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 465, Short.MAX_VALUE))
        );
        DashboardBackgroundLayout.setVerticalGroup(
            DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 2541, Short.MAX_VALUE)
            .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Arrow)
                    .addComponent(ListOfBuyers, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuyerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                        .addGap(632, 632, 632)
                        .addGroup(DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DashboardBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DashboardBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageBuyerButtonActionPerformed

    private void ManageBuyerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBuyerButtonMouseExited
        this.ManageBuyerButton.setContentAreaFilled(false);
    }//GEN-LAST:event_ManageBuyerButtonMouseExited

    private void ManageBuyerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBuyerButtonMouseEntered
       this.ManageBuyerButton.setBackground(new Color(36, 79, 99 ));
       this.ManageBuyerButton.setContentAreaFilled(true);
    }//GEN-LAST:event_ManageBuyerButtonMouseEntered

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        CreateBuyer newForm = new CreateBuyer(); 
        newForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void CreateButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CreateButtonKeyPressed

    }//GEN-LAST:event_CreateButtonKeyPressed

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
            java.util.logging.Logger.getLogger(DisplayBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayBuyers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new DisplayBuyers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arrow;
    private javax.swing.JLabel Ascend;
    private javax.swing.JPanel BuyerInfo;
    private javax.swing.JLabel BuyerInfoLabel;
    private javax.swing.JScrollPane BuyerList;
    private javax.swing.JButton CreateButton;
    private javax.swing.JPanel DashboardBackground;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel ListOfBuyers;
    private javax.swing.JButton ManageBuyerButton;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton MenuButton;
    private javax.swing.JLabel PropertiesLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
