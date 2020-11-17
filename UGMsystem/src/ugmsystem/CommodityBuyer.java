/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static ugmsystem.Commodity.Commodities;
import static ugmsystem.User.accounts;

/**
 *
 * @author fayaldosa
 */
public class CommodityBuyer extends javax.swing.JFrame {
    
  static CommodityBuyer color = new CommodityBuyer();
    /**
     * Creates new form CommodityBuyer
     */
    public CommodityBuyer() {
        initComponents();
        setTitle("Show Commodity");
        setLocationRelativeTo(null);
        
      
        // for search display
       
           if (Commodity.getBooksSectionAds().contains(Search.search)){
             
               
               if(Commodity.getBooksSectionAds().get(2).equalsIgnoreCase(Search.search)){
                   
                    jLabel3.setText(Commodity.getBooksSectionAds().get(2));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getBooksSectionAds().get(5));

                try {

                    BufferedImage s = ImageIO.read(CommodityBuyer.class.getResource("../Pictures/book2.png"));

                    Icon icon = new ImageIcon(s);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }
                   
                   
               }
               if(Commodity.getBooksSectionAds().get(9).contains(Search.search)){
                      jLabel3.setText(Commodity.getBooksSectionAds().get(9));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getBooksSectionAds().get(12));

                try {

                    BufferedImage s2 = ImageIO.read(Sections.class.getResource("../Pictures/book1.png"));

                    Icon icon = new ImageIcon(s2);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }

                }
                
                
                if(Commodity.getBooksSectionAds().get(16).contains(Search.search)){
                    
                           jLabel3.setText(Commodity.getBooksSectionAds().get(16));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getBooksSectionAds().get(19));

                try {

                    BufferedImage s3 = ImageIO.read(Sections.class.getResource("../Pictures/book3.png"));

                    Icon icon = new ImageIcon(s3);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                    
                    
                }
                
                  if(Commodity.getBooksSectionAds().get(23).contains(Search.search)){
                 jLabel3.setText(Commodity.getBooksSectionAds().get(23));

               jLabel5.setText("Available");
               jTextArea1.setText("\n" + "\n"
                       + Commodity.getBooksSectionAds().get(26));

               ImageIcon icon4 = new ImageIcon(Commodity.getBooksSectionAds().get(25));

               jLabel1.setIcon(icon4);
                
                  }  
          
            

        }
          if (Commodity.getClothesSectionAds().contains(Search.search)){
            
               if(Commodity.getClothesSectionAds().get(2).equalsIgnoreCase(Search.search)){
              jLabel3.setText(Commodity.getClothesSectionAds().get(2));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getClothesSectionAds().get(5));

                try {

                    BufferedImage s = ImageIO.read(CommodityBuyer.class.getResource("../Pictures/d-1.png"));

                    Icon icon = new ImageIcon(s);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }
               }
               
               
             if(Commodity.getClothesSectionAds().get(9).equalsIgnoreCase(Search.search)){
                 
                 
                  jLabel3.setText(Commodity.getClothesSectionAds().get(9));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getClothesSectionAds().get(12));

                try {

                    BufferedImage s2 = ImageIO.read(CommodityBuyer.class.getResource("../Pictures/shoes.png"));

                    Icon icon = new ImageIcon(s2);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }
   
             } 
               if(Commodity.getClothesSectionAds().get(16).equalsIgnoreCase(Search.search)){
                   
                   
                    jLabel3.setText(Commodity.getClothesSectionAds().get(16));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getClothesSectionAds().get(19));

                try {

                    BufferedImage s2 = ImageIO.read(CommodityBuyer.class.getResource("../Pictures/m.png"));

                    Icon icon = new ImageIcon(s2);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }
                  
               }
                if(Commodity.getClothesSectionAds().get(23).equalsIgnoreCase(Search.search)){
                    
                     jLabel3.setText(Commodity.getClothesSectionAds().get(23));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getClothesSectionAds().get(26));

                ImageIcon icon4 = new ImageIcon(Commodity.getClothesSectionAds().get(25));

                jLabel1.setIcon(icon4);
                    
                    
                }
            
        }
        
          
            if (Commodity.getFurnSectionAds().contains(Search.search)){
            
                
                 if(Commodity.getFurnSectionAds().get(2).equalsIgnoreCase(Search.search)){
                
                 jLabel3.setText(Commodity.getFurnSectionAds().get(2));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getFurnSectionAds().get(5));

                try {

                    BufferedImage s = ImageIO.read(CommodityBuyer.class.getResource("../Pictures/ch.png"));

                    Icon icon = new ImageIcon(s);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                 }
                
                  if(Commodity.getFurnSectionAds().get(9).equalsIgnoreCase(Search.search)){
                      jLabel3.setText(Commodity.getFurnSectionAds().get(9));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getFurnSectionAds().get(12));

                try {

                    BufferedImage s2 = ImageIO.read(CommodityBuyer.class.getResource("../Pictures/l.png"));

                    Icon icon = new ImageIcon(s2);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }
                  }
                
                if(Commodity.getFurnSectionAds().get(16).equalsIgnoreCase(Search.search)){
                    
                    jLabel3.setText(Commodity.getFurnSectionAds().get(16));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getFurnSectionAds().get(19));

                try {

                    BufferedImage s2 = ImageIO.read(CommodityBuyer.class.getResource("../Pictures/s.png"));

                    Icon icon = new ImageIcon(s2);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                } 
                    
                    
                }
                   if(Commodity.getFurnSectionAds().get(23).equalsIgnoreCase(Search.search)){
                       
                       
                jLabel3.setText(Commodity.getFurnSectionAds().get(23));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getFurnSectionAds().get(26));

                ImageIcon icon4 = new ImageIcon(Commodity.getFurnSectionAds().get(25));

                jLabel1.setIcon(icon4);
                       
                   }
                
      
        
        }
        
        
        
        
        
        
        
        
  
        
        //Sections selected & their ads

        if (Sections.check.equals(true) ) {

            if (Sections.radio1.equals(true)) {
                jLabel3.setText(Commodity.getBooksSectionAds().get(2));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getBooksSectionAds().get(5));

                try {

                    BufferedImage s = ImageIO.read(CommodityBuyer.class.getResource("../Pictures/book2.png"));

                    Icon icon = new ImageIcon(s);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (Sections.radio2.equals(true)) {
                jLabel3.setText(Commodity.getBooksSectionAds().get(9));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getBooksSectionAds().get(12));

                try {

                    BufferedImage s2 = ImageIO.read(Sections.class.getResource("../Pictures/book1.png"));

                    Icon icon = new ImageIcon(s2);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (Sections.radio3.equals(true)) {
                jLabel3.setText(Commodity.getBooksSectionAds().get(16));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getBooksSectionAds().get(19));

                try {

                    BufferedImage s3 = ImageIO.read(Sections.class.getResource("../Pictures/book3.png"));

                    Icon icon = new ImageIcon(s3);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            
           if (Sections.radio4.equals(true)) {
            
                      jLabel3.setText(Commodity.getBooksSectionAds().get(23));

               jLabel5.setText("Available");
               jTextArea1.setText("\n" + "\n"
                       + Commodity.getBooksSectionAds().get(26));

               ImageIcon icon4 = new ImageIcon(Commodity.getBooksSectionAds().get(25));

               jLabel1.setIcon(icon4);

        }
        }
       
        
        if (Sections.check2.equals(true)) {

            if (Sections.radio1.equals(true)) {
                jLabel3.setText(Commodity.getClothesSectionAds().get(2));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getClothesSectionAds().get(5));

                try {

                    BufferedImage s = ImageIO.read(CommodityBuyer.class.getResource("../Pictures/d-1.png"));

                    Icon icon = new ImageIcon(s);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            if (Sections.radio2.equals(true)) {
                jLabel3.setText(Commodity.getClothesSectionAds().get(9));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getClothesSectionAds().get(12));

                try {

                    BufferedImage s2 = ImageIO.read(CommodityBuyer.class.getResource("../Pictures/shoes.png"));

                    Icon icon = new ImageIcon(s2);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (Sections.radio3.equals(true)) {
                jLabel3.setText(Commodity.getClothesSectionAds().get(16));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getClothesSectionAds().get(19));

                try {

                    BufferedImage s2 = ImageIO.read(CommodityBuyer.class.getResource("../Pictures/m.png"));

                    Icon icon = new ImageIcon(s2);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (Sections.radio4.equals(true)) {

                jLabel3.setText(Commodity.getClothesSectionAds().get(23));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getClothesSectionAds().get(26));

                ImageIcon icon4 = new ImageIcon(Commodity.getClothesSectionAds().get(25));

                jLabel1.setIcon(icon4);

            }

        }

        if (Sections.check3.equals(true)) {

            if (Sections.radio1.equals(true)) {
                jLabel3.setText(Commodity.getFurnSectionAds().get(2));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getFurnSectionAds().get(5));

                try {

                    BufferedImage s = ImageIO.read(CommodityBuyer.class.getResource("../Pictures/ch.png"));

                    Icon icon = new ImageIcon(s);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            if (Sections.radio2.equals(true)) {
                jLabel3.setText(Commodity.getFurnSectionAds().get(9));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getFurnSectionAds().get(12));

                try {

                    BufferedImage s2 = ImageIO.read(CommodityBuyer.class.getResource("../Pictures/l.png"));

                    Icon icon = new ImageIcon(s2);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (Sections.radio3.equals(true)) {
                jLabel3.setText(Commodity.getFurnSectionAds().get(16));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getFurnSectionAds().get(19));

                try {

                    BufferedImage s2 = ImageIO.read(CommodityBuyer.class.getResource("../Pictures/s.png"));

                    Icon icon = new ImageIcon(s2);

                    jLabel1.setIcon(icon);

                } catch (IOException ex) {
                    Logger.getLogger(CommodityBuyer.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            if (Sections.radio4.equals(true)) {

                jLabel3.setText(Commodity.getFurnSectionAds().get(23));

                jLabel5.setText("Available");
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getFurnSectionAds().get(26));

                ImageIcon icon4 = new ImageIcon(Commodity.getFurnSectionAds().get(25));

                jLabel1.setIcon(icon4);

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

        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Back1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logo.jpg"))); // NOI18N

        jButton5.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButton5.setText("Chat");

        jButton6.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButton6.setText("Add ");

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(222, 89, 0));
        jLabel6.setText("Advertisement");

        jLabel8.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel8.setText("Title:");

        jLabel9.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel9.setText("State:");

        jLabel10.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel10.setText("Picture:");

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Picture here");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Add comment:");
        jScrollPane2.setViewportView(jTextArea2);

        Back1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/orangeBack2.png"))); // NOI18N
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/myAccount2.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/homeGreen.png"))); // NOI18N

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/box.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/trooly.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButton11.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButton11.setText("Buy");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextArea1.setSelectionStart(10);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(59, 59, 59)
                            .addComponent(jLabel6))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(38, 38, 38)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jButton6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(63, 63, 63)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Back1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
       
        
             
            Sections.color.getContentPane().setBackground(Color.WHITE);
        Sections.color.setVisible(true);
        this.setVisible(false);
        
        
        
        
    }//GEN-LAST:event_Back1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(CommodityBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommodityBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommodityBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommodityBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CommodityBuyer color = new CommodityBuyer();
                color.getContentPane().setBackground(Color.WHITE);
                color.setVisible(true);
      
            
        
       
         
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
