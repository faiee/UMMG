/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ugmsystem;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static ugmsystem.Login.currentUser;
import static ugmsystem.Search.search;
import static ugmsystem.Sections.check;
import static ugmsystem.Sections.check2;
import static ugmsystem.Sections.check3;

/**
 *This is an interface class that displays advertisement details for buyer
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

              
               jTextArea1.setText("\n" + "\n"
                       + Commodity.getBooksSectionAds().get(26));

               ImageIcon icon4 = new ImageIcon(Commodity.getBooksSectionAds().get(25));

               jLabel1.setIcon(icon4);
                
                  }  
          
            

        }
          if (Commodity.getClothesSectionAds().contains(Search.search)){
            
               if(Commodity.getClothesSectionAds().get(2).equalsIgnoreCase(Search.search)){
              jLabel3.setText(Commodity.getClothesSectionAds().get(2));

               
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

               
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getClothesSectionAds().get(26));

                ImageIcon icon4 = new ImageIcon(Commodity.getClothesSectionAds().get(25));

                jLabel1.setIcon(icon4);
                    
                    
                }
            
        }
        
          
            if (Commodity.getFurnSectionAds().contains(Search.search)){
            
                
                 if(Commodity.getFurnSectionAds().get(2).equalsIgnoreCase(Search.search)){
                
                 jLabel3.setText(Commodity.getFurnSectionAds().get(2));
               
                  
              
            
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

               
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getFurnSectionAds().get(26));

                ImageIcon icon4 = new ImageIcon(Commodity.getFurnSectionAds().get(25));

                jLabel1.setIcon(icon4);
                       
                   }
                
      
        
        }
        
   
        
        //Sections selected & their ads

        if (Sections.check==Sections.T ) {

            if (Sections.radio1==Sections.T) {
                jLabel3.setText(Commodity.getBooksSectionAds().get(2));
             
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

            if (Sections.radio2==Sections.T) {
                jLabel3.setText(Commodity.getBooksSectionAds().get(9));

                
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

            if (Sections.radio3==Sections.T) {
                jLabel3.setText(Commodity.getBooksSectionAds().get(16));

               
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
            
           if (Sections.radio4==Sections.T) {
            
                      jLabel3.setText(Commodity.getBooksSectionAds().get(23));

              
               jTextArea1.setText("\n" + "\n"
                       + Commodity.getBooksSectionAds().get(26));

               ImageIcon icon4 = new ImageIcon(Commodity.getBooksSectionAds().get(25));

               jLabel1.setIcon(icon4);

        }
        }
       
        
        if (Sections.check2==Sections.T) {

            if (Sections.radio1==Sections.T) {
                jLabel3.setText(Commodity.getClothesSectionAds().get(2));

               
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
            if (Sections.radio2==Sections.T) {
                jLabel3.setText(Commodity.getClothesSectionAds().get(9));

               
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

            if (Sections.radio3==Sections.T) {
                jLabel3.setText(Commodity.getClothesSectionAds().get(16));

               
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

            if (Sections.radio4==Sections.T) {

                jLabel3.setText(Commodity.getClothesSectionAds().get(23));

               
                jTextArea1.setText("\n" + "\n"
                        + Commodity.getClothesSectionAds().get(26));

                ImageIcon icon4 = new ImageIcon(Commodity.getClothesSectionAds().get(25));

                jLabel1.setIcon(icon4);

            }

        }

        if (Sections.check3==Sections.T) {

            if (Sections.radio1==Sections.T) {
                jLabel3.setText(Commodity.getFurnSectionAds().get(2));

              
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
            if (Sections.radio2==Sections.T) {
                jLabel3.setText(Commodity.getFurnSectionAds().get(9));

               
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

            if (Sections.radio3==Sections.T) {
                jLabel3.setText(Commodity.getFurnSectionAds().get(16));

                
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

            if (Sections.radio4==Sections.T) {

                jLabel3.setText(Commodity.getFurnSectionAds().get(23));

               
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

        jPanel1 = new javax.swing.JPanel();
        Back1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Back1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/orangeBack2.png"))); // NOI18N
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jButton5.setText("Chat");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Write comment"));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel8.setText("Title");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setSelectionStart(10);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/myAccount2.png"))); // NOI18N
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/smallHome.png"))); // NOI18N
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Picture1logout.png"))); // NOI18N
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Picture1mesv1.png"))); // NOI18N
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Picture here");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel10.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel10.setText("Picture");

        jButton6.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jButton6.setText("Add ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));

        jButton11.setFont(new java.awt.Font("Gadugi", 0, 16)); // NOI18N
        jButton11.setText("Buy");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel9.setText("Details");

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(222, 89, 0));
        jLabel6.setText("Advertisement");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(Back1)
                        .addGap(408, 408, 408))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton11)
                    .addComponent(jButton6))
                .addGap(52, 52, 52)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed

        Sections.color.getContentPane().setBackground(Color.WHITE);
        Sections.color.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_Back1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

          PaymentInfo c = null;
     
        if(currentUser.isGuest()){
         JOptionPane.showMessageDialog(this, "You can't access this page, register first.");
        }
         
        
      else{
            try {
            Login.currentUser = Buyer.findUser(Login.vendor.getId());
        
        } catch (IOException ex) {
            Logger.getLogger(Sections.class.getName()).log(Level.SEVERE, null, ex);
        }
 
         // if he came from the search bar 
        
        if (Commodity.getAdsForVendor().contains(search)){
        
         if (c== null){
              c=new PaymentInfo();
          }
          c.setVisible(true);
          this.setVisible(false);
        
        }  
            
  
  // Radio buttons info
           if (check==Sections.T) {

      if (Sections.radio1==Sections.T){
              
              if (c== null){
              c=new PaymentInfo();
          }
          c.setVisible(true);
          this.setVisible(false);
                
            }
      
         if (Sections.radio2==Sections.T){
              
            if (c== null){
              c=new PaymentInfo();
          }
          c.setVisible(true);
          this.setVisible(false);
                
            }
         
           if (Sections.radio3==Sections.T){
              
            if (c== null){
              c=new PaymentInfo();
          }
          c.setVisible(true);
          this.setVisible(false);
                
            }
             if (Sections.radio4==Sections.T){
              
            if (c== null){
              c=new PaymentInfo();
          }
          c.setVisible(true);
          this.setVisible(false);
                
            }

           }

           
           if (check2==Sections.T) {

      if (Sections.radio1==Sections.T){
              
            if (c== null){
              c=new PaymentInfo();
          }
          c.setVisible(true);
          this.setVisible(false);
                
            }
      
         if (Sections.radio2==Sections.T){
              
             if (c== null){
              c=new PaymentInfo();
          }
          c.setVisible(true);
          this.setVisible(false);
                
            }
         
           if (Sections.radio3==Sections.T){
              
              if (c== null){
              c=new PaymentInfo();
          }
          c.setVisible(true);
          this.setVisible(false);
                
            }
             if (Sections.radio4==Sections.T){
              
              if (c== null){
              c=new PaymentInfo();
          }
          c.setVisible(true);
          this.setVisible(false);
                
            }

           }

              if (check3==Sections.T) {

      if (Sections.radio1==Sections.T){
              
             if (c== null){
              c=new PaymentInfo();
          }
          c.setVisible(true);
          this.setVisible(false);
                
            }
      
         if (Sections.radio2==Sections.T){
              
               if (c== null){
              c=new PaymentInfo();
          }
          c.setVisible(true);
          this.setVisible(false);
            }
         
           if (Sections.radio3==Sections.T){
              
            if (c== null){
              c=new PaymentInfo();
          }
          c.setVisible(true);
          this.setVisible(false);
                
            }
             if (Sections.radio4==Sections.T){
              
            if (c== null){
              c=new PaymentInfo();
          }
          c.setVisible(true);
          this.setVisible(false);
                
            }

           }
        
        
        }
      
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

     if(currentUser.isGuest()){
         JOptionPane.showMessageDialog(this, "You can't add comment, register first.");
        }
     else{
        
 String text = jTextField1.getText();
     if (!text.isEmpty()){
         
         JOptionPane.showMessageDialog(this, "Your comment is successfully added ");
     }
    if (text.isEmpty()) JOptionPane.showMessageDialog(this, "You didn't enter any text!");
     }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if(currentUser.isGuest()){
         JOptionPane.showMessageDialog(this, "You can't access this page, register first.");
        }
         
        
       else{
        try {
            Login.currentUser = Buyer.findUser(Login.vendor.getId());

           ChatUser.color.getContentPane().setBackground(Color.WHITE);
        ChatUser.color.setVisible(true);
        this.setVisible(false);

        } catch (IOException ex) {
            Logger.getLogger(Sections.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
         
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed

        if(currentUser.isGuest()){
            JOptionPane.showMessageDialog(this, "You can't access this page, register first.");
        }

        else{
            try {
                Login.currentUser = Buyer.findUser(Login.vendor.getId());

                ChatPage.color.getContentPane().setBackground(Color.WHITE);
                ChatPage.color.setVisible(true);
                this.setVisible(false);

            } catch (IOException ex) {
                Logger.getLogger(Sections.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed

        Login.currentUser = null;
        MainMenu.color.getContentPane().setBackground(Color.WHITE);
        MainMenu.color.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed

        Search.color.getContentPane().setBackground(Color.WHITE);
        Search.color.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        if(currentUser.isGuest()){
            JOptionPane.showMessageDialog(this, "You can't access this page, register first.");
        }

        else{

            try {
                Login.currentUser = Buyer.findUser(Login.vendor.getId());

                MyAccount.color.getContentPane().setBackground(Color.WHITE);
                MyAccount.color.setVisible(true);
                this.setVisible(false);

            } catch (IOException ex) {
                Logger.getLogger(Sections.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton37ActionPerformed

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
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
