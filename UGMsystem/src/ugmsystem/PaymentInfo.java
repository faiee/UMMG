/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static ugmsystem.Login.currentUser;

/**
 * This is an interface class that allows buyer to enter payment information to
 * finalize order
 *
 * @author reemalsolami
 */
public class PaymentInfo extends javax.swing.JFrame {

    // public static ArrayList<String> orderBOOK = Commodity.getBooksSectionAds();
    static PaymentInfo color = new PaymentInfo();
    static Order orders;

    /**
     * Creates new form PaymentInfo
     */
    public PaymentInfo() {
        initComponents();
        setTitle("Payment Info");
        setLocationRelativeTo(null);
        // ArrayList<String> orderBOOK = Commodity.getBooksSectionAds();
        // if he came from search bar
        // for search display
        if (Commodity.getBooksSectionAds().contains(Search.search)) {

            if (Commodity.getBooksSectionAds().get(2).equalsIgnoreCase(Search.search)) {

                jLabel3.setText("Price: "
                        + Commodity.getBooksSectionAds().get(3));

                int i = Integer.parseInt(Commodity.getBooksSectionAds().get(3));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getBooksSectionAds().get(2), Commodity.getBooksSectionAds().get(6), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));
                orders.createOrder();

            }
            if (Commodity.getBooksSectionAds().get(9).contains(Search.search)) {

                jLabel3.setText("Price: "
                        + Commodity.getBooksSectionAds().get(10));
                int i = Integer.parseInt(Commodity.getBooksSectionAds().get(10));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));

                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getBooksSectionAds().get(9), Commodity.getBooksSectionAds().get(13), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));
                orders.createOrder();
            }

            if (Commodity.getBooksSectionAds().get(16).contains(Search.search)) {

                jLabel3.setText("Price: "
                        + Commodity.getBooksSectionAds().get(17));
                int i = Integer.parseInt(Commodity.getBooksSectionAds().get(17));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getBooksSectionAds().get(16), Commodity.getBooksSectionAds().get(20), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));
                orders.createOrder();
            }

            if (Commodity.getBooksSectionAds().get(23).contains(Search.search)) {

                jLabel3.setText("Price: "
                        + Commodity.getBooksSectionAds().get(24));
                int i = Integer.parseInt(Commodity.getBooksSectionAds().get(24));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getBooksSectionAds().get(23), Commodity.getBooksSectionAds().get(27), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));

                orders.createOrder();

            }
        }
        if (Commodity.getClothesSectionAds().contains(Search.search)) {

            if (Commodity.getClothesSectionAds().get(2).equalsIgnoreCase(Search.search)) {
                jLabel3.setText("Price: "
                        + Commodity.getClothesSectionAds().get(3));
                int i = Integer.parseInt(Commodity.getClothesSectionAds().get(3));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getClothesSectionAds().get(2), Commodity.getClothesSectionAds().get(6), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));

                orders.createOrder();
            }

            if (Commodity.getClothesSectionAds().get(9).equalsIgnoreCase(Search.search)) {
                jLabel3.setText("Price: "
                        + Commodity.getClothesSectionAds().get(10));
                int i = Integer.parseInt(Commodity.getClothesSectionAds().get(10));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getClothesSectionAds().get(9), Commodity.getClothesSectionAds().get(13), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));
                orders.createOrder();

            }
            if (Commodity.getClothesSectionAds().get(16).equalsIgnoreCase(Search.search)) {

                jLabel3.setText("Price: "
                        + Commodity.getClothesSectionAds().get(17));
                int i = Integer.parseInt(Commodity.getClothesSectionAds().get(17));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getClothesSectionAds().get(16), Commodity.getClothesSectionAds().get(20), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));
                orders.createOrder();

            }
            if (Commodity.getClothesSectionAds().get(23).equalsIgnoreCase(Search.search)) {
                jLabel3.setText("Price: "
                        + Commodity.getClothesSectionAds().get(24));
                int i = Integer.parseInt(Commodity.getClothesSectionAds().get(3));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getClothesSectionAds().get(23), Commodity.getClothesSectionAds().get(27), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));

                orders.createOrder();

            }

        }

        if (Commodity.getFurnSectionAds().contains(Search.search)) {

            if (Commodity.getFurnSectionAds().get(2).equalsIgnoreCase(Search.search)) {

                jLabel3.setText("Price: "
                        + Commodity.getFurnSectionAds().get(3));
                int i = Integer.parseInt(Commodity.getFurnSectionAds().get(3));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getFurnSectionAds().get(2), Commodity.getFurnSectionAds().get(6), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));
                orders.createOrder();

            }

            if (Commodity.getFurnSectionAds().get(9).equalsIgnoreCase(Search.search)) {
                jLabel3.setText("Price: "
                        + Commodity.getFurnSectionAds().get(10));
                int i = Integer.parseInt(Commodity.getFurnSectionAds().get(10));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getFurnSectionAds().get(9), Commodity.getFurnSectionAds().get(13), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));

                orders.createOrder();
            }

            if (Commodity.getFurnSectionAds().get(16).equalsIgnoreCase(Search.search)) {

                jLabel3.setText("Price: "
                        + Commodity.getFurnSectionAds().get(17));
                int i = Integer.parseInt(Commodity.getFurnSectionAds().get(17));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getFurnSectionAds().get(16), Commodity.getFurnSectionAds().get(20), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));

                orders.createOrder();

            }
            if (Commodity.getFurnSectionAds().get(23).equalsIgnoreCase(Search.search)) {

                jLabel3.setText("Price: "
                        + Commodity.getFurnSectionAds().get(24));
                int i = Integer.parseInt(Commodity.getFurnSectionAds().get(24));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getFurnSectionAds().get(23), Commodity.getFurnSectionAds().get(27), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));
                orders.createOrder();

            }

        }

        // if he came from radio buttons
        if (Sections.check == Sections.T) {

            if (Sections.radio1 == Sections.T) {

                jLabel3.setText("Price: "
                        + Commodity.getBooksSectionAds().get(3));

                int i = Integer.parseInt(Commodity.getBooksSectionAds().get(3));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getBooksSectionAds().get(2), Commodity.getBooksSectionAds().get(6), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));
                orders.createOrder();

            }

            if (Sections.radio2 == Sections.T) {

                jLabel3.setText("Price: "
                        + Commodity.getBooksSectionAds().get(10));
                int i = Integer.parseInt(Commodity.getBooksSectionAds().get(10));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));

                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getBooksSectionAds().get(9), Commodity.getBooksSectionAds().get(13), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));
                orders.createOrder();

            }

            if (Sections.radio3 == Sections.T) {

                jLabel3.setText("Price: "
                        + Commodity.getBooksSectionAds().get(17));
                int i = Integer.parseInt(Commodity.getBooksSectionAds().get(17));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getBooksSectionAds().get(16), Commodity.getBooksSectionAds().get(20), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));
                orders.createOrder();

            }

            if (Sections.radio4 == Sections.T) {

                jLabel3.setText("Price: "
                        + Commodity.getBooksSectionAds().get(24));
                int i = Integer.parseInt(Commodity.getBooksSectionAds().get(24));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getBooksSectionAds().get(23), Commodity.getBooksSectionAds().get(27), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));

                orders.createOrder();

            }

        }

        if (Sections.check2 == Sections.T) {

            if (Sections.radio1 == Sections.T) {

                jLabel3.setText("Price: "
                        + Commodity.getClothesSectionAds().get(3));
                int i = Integer.parseInt(Commodity.getClothesSectionAds().get(3));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getClothesSectionAds().get(2), Commodity.getClothesSectionAds().get(6), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));

                orders.createOrder();

            }
            if (Sections.radio2 == Sections.T) {

                jLabel3.setText("Price: "
                        + Commodity.getClothesSectionAds().get(10));
                int i = Integer.parseInt(Commodity.getClothesSectionAds().get(10));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getClothesSectionAds().get(9), Commodity.getClothesSectionAds().get(13), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));
                orders.createOrder();

            }

            if (Sections.radio3 == Sections.T) {

                jLabel3.setText("Price: "
                        + Commodity.getClothesSectionAds().get(17));
                int i = Integer.parseInt(Commodity.getBooksSectionAds().get(17));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getClothesSectionAds().get(16), Commodity.getClothesSectionAds().get(20), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));
                orders.createOrder();

            }

            if (Sections.radio4 == Sections.T) {

                jLabel3.setText("Price: "
                        + Commodity.getClothesSectionAds().get(24));
                int i = Integer.parseInt(Commodity.getClothesSectionAds().get(24));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getClothesSectionAds().get(23), Commodity.getClothesSectionAds().get(27), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));

                orders.createOrder();

            }

        }

        if (Sections.check3 == Sections.T) {

            if (Sections.radio1 == Sections.T) {

                jLabel3.setText("Price: "
                        + Commodity.getFurnSectionAds().get(3));
                int i = Integer.parseInt(Commodity.getFurnSectionAds().get(3));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getFurnSectionAds().get(2), Commodity.getFurnSectionAds().get(6), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));
                orders.createOrder();

            }
            if (Sections.radio2 == Sections.T) {

                jLabel3.setText("Price: "
                        + Commodity.getFurnSectionAds().get(10));
                int i = Integer.parseInt(Commodity.getBooksSectionAds().get(10));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getFurnSectionAds().get(9), Commodity.getFurnSectionAds().get(13), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));

                orders.createOrder();

            }

            if (Sections.radio3 == Sections.T) {

                jLabel3.setText("Price: "
                        + Commodity.getFurnSectionAds().get(17));
                int i = Integer.parseInt(Commodity.getFurnSectionAds().get(17));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getFurnSectionAds().get(16), Commodity.getFurnSectionAds().get(20), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));

                orders.createOrder();

            }

            if (Sections.radio4 == Sections.T) {

                jLabel3.setText("Price: "
                        + Commodity.getFurnSectionAds().get(24));
                int i = Integer.parseInt(Commodity.getFurnSectionAds().get(24));
                jLabel10.setText("After VAT: " + Order.calculatePay(i));
                orders = new Order(orders.generateOrderID(), Login.vendor.getId(), Commodity.getFurnSectionAds().get(23), Commodity.getFurnSectionAds().get(27), i, (int) Order.calculateTax(i), (int) Order.calculatePay(i));
                orders.createOrder();

            }

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel1.setText("Order Details:");

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel2.setText("Please Enter Payment Information:");

        jLabel4.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel4.setText("Card Number:");

        jLabel5.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel5.setText("Expiry Date:");

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel6.setText("CVV Code:");

        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setText("Valid Card Number");
        jTextField1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setText("MM");
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3.setText("YY");
        jTextField3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setForeground(new java.awt.Color(102, 102, 102));
        jTextField4.setText("CVV");
        jTextField4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 204, 0));
        jButton2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButton2.setText("Pay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logo.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(222, 89, 0));
        jLabel8.setText("Checkout");

        Back.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/orangeBack2.png"))); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("/");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ugmsystem/STAR.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ugmsystem/STAR.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ugmsystem/STAR.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/myAccount2.png"))); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/smallHome.png"))); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Picture1logout.png"))); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Picture1mesv1.png"))); // NOI18N
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addGap(6, 6, 6)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Back)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(46, 46, 46)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(76, 76, 76)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        if (jTextField1.getText().trim().length() == 16) {
            if ((jTextField2.getText().length() == 2) && (Integer.valueOf(jTextField2.getText()) <= 12)) {
                if ((jTextField3.getText().length() == 2) && (Integer.valueOf(jTextField3.getText()) >= 20)) {
                    if (jTextField4.getText().length() == 3) {

                        JOptionPane.showMessageDialog(this, "You Have Sucessfully Placed Your Order!");
                        SuccessOrder.color.getContentPane().setBackground(Color.WHITE);
                        SuccessOrder.color.setVisible(true);
                        this.setVisible(false);

                    } else {
                        JOptionPane.showMessageDialog(this, "CVV denied! It should be 3 digits long");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "YY denied! It should be 2 digits long and greater than 20");
                }
            } else {
                JOptionPane.showMessageDialog(this, "MM denied! It should be 2 digits long and less than 12");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Card number denied! It should be 16 digits long");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Search.color.getContentPane().setBackground(Color.WHITE);
        Search.color.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

        if (currentUser.isGuest()) {
            JOptionPane.showMessageDialog(this, "You can't access this page, register first.");
        } else {

            try {
                Login.currentUser = Buyer.findUser(Login.vendor.getId());

                MyAccount.color.getContentPane().setBackground(Color.WHITE);
                MyAccount.color.setVisible(true);
                this.setVisible(false);

            } catch (IOException ex) {
                Logger.getLogger(PaymentInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

        Search.color.getContentPane().setBackground(Color.WHITE);
        Search.color.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        Login.currentUser = null;
        MainMenu.color.getContentPane().setBackground(Color.WHITE);
        MainMenu.color.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed

        if (currentUser.isGuest()) {
            JOptionPane.showMessageDialog(this, "You can't access this page, register first.");
        } else {
            try {
                Login.currentUser = Buyer.findUser(Login.vendor.getId());

                ChatPage.color.getContentPane().setBackground(Color.WHITE);
                ChatPage.color.setVisible(true);
                this.setVisible(false);

            } catch (IOException ex) {
                Logger.getLogger(PaymentInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jButton28ActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentInfo().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
