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
public class CreateOffer extends javax.swing.JFrame {

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
    public CreateOffer() {
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
        ListOfOffers = new javax.swing.JLabel();
        Arrow = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        Menu = new GradientPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(379, 40), new java.awt.Dimension(200, 200));
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(379, 10), new java.awt.Dimension(200, 200));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(379, 2), new java.awt.Dimension(200, 200));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(379, 10), new java.awt.Dimension(200, 200));
        MenuButton = new javax.swing.JButton();
        ManageBuyerButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        ModeOfPayment = new javax.swing.JPanel();
        ModeOfPaymentBox = new javax.swing.JPanel();
        ModeOfPaymentLabel = new javax.swing.JLabel();
        ModeOfPaymentForm = new javax.swing.JPanel();
        CashLabel = new javax.swing.JLabel();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(550, 5), new java.awt.Dimension(200, 200));
        CFinalPriceLabel = new javax.swing.JLabel();
        CFinalPrice = new javax.swing.JTextField();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(550, 5), new java.awt.Dimension(200, 200));
        InstallmentLabel = new javax.swing.JLabel();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(550, 5), new java.awt.Dimension(200, 200));
        DownpaymentLabel = new javax.swing.JLabel();
        Downpayment = new javax.swing.JTextField();
        InterestLabel = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 50), new java.awt.Dimension(135, 50), new java.awt.Dimension(32767, 50));
        NumberOfYearsLabel = new javax.swing.JLabel();
        Interest = new javax.swing.JTextField();
        NumberOfYears = new javax.swing.JTextField();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(550, 5), new java.awt.Dimension(200, 200));
        IFinalPriceLabel = new javax.swing.JLabel();
        IFinalPrice = new javax.swing.JTextField();
        TotalAmountLabel = new javax.swing.JLabel();
        TotalAmount = new javax.swing.JTextField();
        OfferDetails = new javax.swing.JPanel();
        OfferDetailsBox = new javax.swing.JPanel();
        OfferDetailsLabel = new javax.swing.JLabel();
        OfferDetailsForm = new javax.swing.JPanel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(200, 200), new java.awt.Dimension(550, 15), new java.awt.Dimension(200, 200));
        OfferPriceLabel = new javax.swing.JLabel();
        OfferPrice = new javax.swing.JTextField();
        CurrencyLabel = new javax.swing.JLabel();
        Currency = new javax.swing.JComboBox<>();
        DiscountLabel = new javax.swing.JLabel();
        Discount = new javax.swing.JTextField();
        BuyerLabel = new javax.swing.JLabel();
        Buyer = new javax.swing.JComboBox<>();
        PaymentMethodLabel = new javax.swing.JLabel();
        PaymentMethod = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 900));

        DashboardBackground.setBackground(new java.awt.Color(255, 255, 255));
        DashboardBackground.setPreferredSize(new java.awt.Dimension(1600, 900));

        ListOfOffers.setFont(new java.awt.Font("Segoe UI", 1, 64)); // NOI18N
        ListOfOffers.setForeground(new java.awt.Color(2, 48, 71));
        ListOfOffers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angle-small-right.png"))); // NOI18N
        ListOfOffers.setIconTextGap(7);

        Arrow.setFont(new java.awt.Font("Segoe UI", 1, 64)); // NOI18N
        Arrow.setForeground(new java.awt.Color(2, 48, 71));
        Arrow.setText("Create Offer");
        Arrow.setIconTextGap(7);

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

        Menu.setBackground(new java.awt.Color(2, 48, 71));
        Menu.setMaximumSize(new java.awt.Dimension(379, 1024));
        Menu.setMinimumSize(new java.awt.Dimension(379, 1024));
        Menu.setPreferredSize(new java.awt.Dimension(379, 1024));
        Menu.add(filler4);

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 55)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/house-chimney.png"))); // NOI18N
        jLabel3.setText("ASCEND");
        jLabel3.setIconTextGap(15);
        Menu.add(jLabel3);

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("PROPERTIES");
        jLabel5.setIconTextGap(15);
        Menu.add(jLabel5);
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

        ModeOfPayment.setToolTipText("");
        ModeOfPayment.setMaximumSize(new java.awt.Dimension(550, 600));
        ModeOfPayment.setMinimumSize(new java.awt.Dimension(550, 600));
        ModeOfPayment.setPreferredSize(new java.awt.Dimension(500, 600));
        ModeOfPayment.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        ModeOfPaymentBox.setBackground(new java.awt.Color(61, 131, 164));
        ModeOfPaymentBox.setToolTipText("");
        ModeOfPaymentBox.setPreferredSize(new java.awt.Dimension(500, 68));

        ModeOfPaymentLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ModeOfPaymentLabel.setForeground(new java.awt.Color(255, 255, 255));
        ModeOfPaymentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModeOfPaymentLabel.setText("Mode Of Payment");
        ModeOfPaymentLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout ModeOfPaymentBoxLayout = new javax.swing.GroupLayout(ModeOfPaymentBox);
        ModeOfPaymentBox.setLayout(ModeOfPaymentBoxLayout);
        ModeOfPaymentBoxLayout.setHorizontalGroup(
            ModeOfPaymentBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModeOfPaymentBoxLayout.createSequentialGroup()
                .addComponent(ModeOfPaymentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );
        ModeOfPaymentBoxLayout.setVerticalGroup(
            ModeOfPaymentBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModeOfPaymentBoxLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ModeOfPaymentLabel)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        ModeOfPayment.add(ModeOfPaymentBox);

        ModeOfPaymentForm.setBackground(new java.awt.Color(241, 241, 241));
        ModeOfPaymentForm.setPreferredSize(new java.awt.Dimension(500, 600));
        ModeOfPaymentForm.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 5));

        CashLabel.setBackground(new java.awt.Color(61, 131, 164));
        CashLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CashLabel.setForeground(new java.awt.Color(2, 48, 71));
        CashLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CashLabel.setText("Cash");
        CashLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ModeOfPaymentForm.add(CashLabel);
        ModeOfPaymentForm.add(filler10);

        CFinalPriceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CFinalPriceLabel.setText("Final Price");
        ModeOfPaymentForm.add(CFinalPriceLabel);

        CFinalPrice.setMinimumSize(new java.awt.Dimension(500, 22));
        CFinalPrice.setPreferredSize(new java.awt.Dimension(455, 35));
        CFinalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CFinalPriceActionPerformed(evt);
            }
        });
        ModeOfPaymentForm.add(CFinalPrice);
        ModeOfPaymentForm.add(filler11);

        InstallmentLabel.setBackground(new java.awt.Color(61, 131, 164));
        InstallmentLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        InstallmentLabel.setForeground(new java.awt.Color(2, 48, 71));
        InstallmentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InstallmentLabel.setText("Installment");
        InstallmentLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ModeOfPaymentForm.add(InstallmentLabel);
        ModeOfPaymentForm.add(filler12);

        DownpaymentLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DownpaymentLabel.setText("Downpayment");
        ModeOfPaymentForm.add(DownpaymentLabel);

        Downpayment.setMinimumSize(new java.awt.Dimension(500, 22));
        Downpayment.setPreferredSize(new java.awt.Dimension(455, 35));
        Downpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownpaymentActionPerformed(evt);
            }
        });
        ModeOfPaymentForm.add(Downpayment);

        InterestLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InterestLabel.setText("Interest");
        ModeOfPaymentForm.add(InterestLabel);
        ModeOfPaymentForm.add(filler2);

        NumberOfYearsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NumberOfYearsLabel.setText("Number of Years");
        ModeOfPaymentForm.add(NumberOfYearsLabel);

        Interest.setMinimumSize(new java.awt.Dimension(220, 22));
        Interest.setPreferredSize(new java.awt.Dimension(215, 35));
        Interest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterestActionPerformed(evt);
            }
        });
        ModeOfPaymentForm.add(Interest);

        NumberOfYears.setMinimumSize(new java.awt.Dimension(205, 35));
        NumberOfYears.setPreferredSize(new java.awt.Dimension(215, 35));
        NumberOfYears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberOfYearsActionPerformed(evt);
            }
        });
        ModeOfPaymentForm.add(NumberOfYears);
        ModeOfPaymentForm.add(filler13);

        IFinalPriceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IFinalPriceLabel.setText("Final Price");
        ModeOfPaymentForm.add(IFinalPriceLabel);

        IFinalPrice.setMinimumSize(new java.awt.Dimension(500, 22));
        IFinalPrice.setPreferredSize(new java.awt.Dimension(455, 35));
        IFinalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IFinalPriceActionPerformed(evt);
            }
        });
        ModeOfPaymentForm.add(IFinalPrice);

        TotalAmountLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TotalAmountLabel.setText("Total Amount");
        ModeOfPaymentForm.add(TotalAmountLabel);

        TotalAmount.setMinimumSize(new java.awt.Dimension(500, 22));
        TotalAmount.setPreferredSize(new java.awt.Dimension(455, 35));
        TotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalAmountActionPerformed(evt);
            }
        });
        ModeOfPaymentForm.add(TotalAmount);

        ModeOfPayment.add(ModeOfPaymentForm);

        OfferDetails.setToolTipText("");
        OfferDetails.setMaximumSize(new java.awt.Dimension(550, 600));
        OfferDetails.setMinimumSize(new java.awt.Dimension(550, 600));
        OfferDetails.setPreferredSize(new java.awt.Dimension(500, 600));
        OfferDetails.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 5));

        OfferDetailsBox.setBackground(new java.awt.Color(61, 131, 164));
        OfferDetailsBox.setToolTipText("");
        OfferDetailsBox.setPreferredSize(new java.awt.Dimension(500, 68));

        OfferDetailsLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        OfferDetailsLabel.setForeground(new java.awt.Color(255, 255, 255));
        OfferDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OfferDetailsLabel.setText("Offer Details");
        OfferDetailsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout OfferDetailsBoxLayout = new javax.swing.GroupLayout(OfferDetailsBox);
        OfferDetailsBox.setLayout(OfferDetailsBoxLayout);
        OfferDetailsBoxLayout.setHorizontalGroup(
            OfferDetailsBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OfferDetailsBoxLayout.createSequentialGroup()
                .addComponent(OfferDetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );
        OfferDetailsBoxLayout.setVerticalGroup(
            OfferDetailsBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OfferDetailsBoxLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(OfferDetailsLabel)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        OfferDetails.add(OfferDetailsBox);

        OfferDetailsForm.setBackground(new java.awt.Color(241, 241, 241));
        OfferDetailsForm.setPreferredSize(new java.awt.Dimension(500, 600));
        OfferDetailsForm.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 5));
        OfferDetailsForm.add(filler8);

        OfferPriceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        OfferPriceLabel.setText("Offer Price");
        OfferDetailsForm.add(OfferPriceLabel);

        OfferPrice.setMinimumSize(new java.awt.Dimension(500, 22));
        OfferPrice.setPreferredSize(new java.awt.Dimension(455, 35));
        OfferPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfferPriceActionPerformed(evt);
            }
        });
        OfferDetailsForm.add(OfferPrice);

        CurrencyLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CurrencyLabel.setText("Currency");
        OfferDetailsForm.add(CurrencyLabel);

        Currency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Philippine Peso", "US Dollar" }));
        Currency.setPreferredSize(new java.awt.Dimension(455, 35));
        OfferDetailsForm.add(Currency);

        DiscountLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DiscountLabel.setText("Discount");
        OfferDetailsForm.add(DiscountLabel);

        Discount.setMinimumSize(new java.awt.Dimension(500, 22));
        Discount.setPreferredSize(new java.awt.Dimension(455, 35));
        Discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountActionPerformed(evt);
            }
        });
        OfferDetailsForm.add(Discount);

        BuyerLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BuyerLabel.setText("Buyer");
        OfferDetailsForm.add(BuyerLabel);

        Buyer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "John Doe" }));
        Buyer.setPreferredSize(new java.awt.Dimension(455, 35));
        OfferDetailsForm.add(Buyer);

        PaymentMethodLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PaymentMethodLabel.setText("Payment Method");
        OfferDetailsForm.add(PaymentMethodLabel);

        PaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Installment" }));
        PaymentMethod.setToolTipText("");
        PaymentMethod.setPreferredSize(new java.awt.Dimension(455, 35));
        PaymentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentMethodActionPerformed(evt);
            }
        });
        OfferDetailsForm.add(PaymentMethod);

        OfferDetails.add(OfferDetailsForm);

        javax.swing.GroupLayout DashboardBackgroundLayout = new javax.swing.GroupLayout(DashboardBackground);
        DashboardBackground.setLayout(DashboardBackgroundLayout);
        DashboardBackgroundLayout.setHorizontalGroup(
            DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                                .addComponent(Arrow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ListOfOffers, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 562, Short.MAX_VALUE))
                            .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                                .addComponent(OfferDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ModeOfPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
        );
        DashboardBackgroundLayout.setVerticalGroup(
            DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Arrow)
                    .addComponent(ListOfOffers, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DashboardBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OfferDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DashboardBackgroundLayout.createSequentialGroup()
                        .addComponent(ModeOfPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DashboardBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void OfferPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfferPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OfferPriceActionPerformed

    private void DiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiscountActionPerformed

    private void PaymentMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentMethodActionPerformed

    private void CFinalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CFinalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CFinalPriceActionPerformed

    private void NumberOfYearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberOfYearsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberOfYearsActionPerformed

    private void DownpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownpaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DownpaymentActionPerformed

    private void IFinalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IFinalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IFinalPriceActionPerformed

    private void InterestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InterestActionPerformed

    private void TotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalAmountActionPerformed

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
            java.util.logging.Logger.getLogger(CreateOffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateOffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateOffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateOffer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CreateOffer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arrow;
    private javax.swing.JComboBox<String> Buyer;
    private javax.swing.JLabel BuyerLabel;
    private javax.swing.JTextField CFinalPrice;
    private javax.swing.JLabel CFinalPriceLabel;
    private javax.swing.JLabel CashLabel;
    private javax.swing.JComboBox<String> Currency;
    private javax.swing.JLabel CurrencyLabel;
    private javax.swing.JPanel DashboardBackground;
    private javax.swing.JTextField Discount;
    private javax.swing.JLabel DiscountLabel;
    private javax.swing.JTextField Downpayment;
    private javax.swing.JLabel DownpaymentLabel;
    private javax.swing.JTextField IFinalPrice;
    private javax.swing.JLabel IFinalPriceLabel;
    private javax.swing.JLabel InstallmentLabel;
    private javax.swing.JTextField Interest;
    private javax.swing.JLabel InterestLabel;
    private javax.swing.JLabel ListOfOffers;
    private javax.swing.JButton ManageBuyerButton;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton MenuButton;
    private javax.swing.JPanel ModeOfPayment;
    private javax.swing.JPanel ModeOfPaymentBox;
    private javax.swing.JPanel ModeOfPaymentForm;
    private javax.swing.JLabel ModeOfPaymentLabel;
    private javax.swing.JTextField NumberOfYears;
    private javax.swing.JLabel NumberOfYearsLabel;
    private javax.swing.JPanel OfferDetails;
    private javax.swing.JPanel OfferDetailsBox;
    private javax.swing.JPanel OfferDetailsForm;
    private javax.swing.JLabel OfferDetailsLabel;
    private javax.swing.JTextField OfferPrice;
    private javax.swing.JLabel OfferPriceLabel;
    private javax.swing.JComboBox<String> PaymentMethod;
    private javax.swing.JLabel PaymentMethodLabel;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField TotalAmount;
    private javax.swing.JLabel TotalAmountLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
