/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sorted_billing;

/**
 *
 * @author HP
 */
public class onetime extends javax.swing.JFrame implements adminscreeninterface,InventoryInterface{

    emplo emp;
    additems item;
    /**
     * Creates new form onetime
     */
    public onetime() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        sales = new javax.swing.JButton();
        empl = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        inve = new javax.swing.JButton();
        home = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        desk = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));
        jPanel4.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 255, 51));
        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin \nPanel");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel1);
        jLabel1.setBounds(560, 20, 268, 54);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s.jpeg"))); // NOI18N
        jPanel4.add(jLabel2);
        jLabel2.setBounds(0, 0, 1370, 100);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 1370, 100);

        jPanel6.setLayout(null);

        sales.setBackground(new java.awt.Color(51, 51, 51));
        sales.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        sales.setForeground(new java.awt.Color(255, 255, 255));
        sales.setText("Sales");
        sales.setBorder(null);
        sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesMouseClicked(evt);
            }
        });
        jPanel6.add(sales);
        sales.setBounds(0, 100, 130, 40);

        empl.setBackground(new java.awt.Color(51, 51, 51));
        empl.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        empl.setForeground(new java.awt.Color(255, 255, 255));
        empl.setText("employee");
        empl.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        empl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emplMouseClicked(evt);
            }
        });
        empl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emplActionPerformed(evt);
            }
        });
        jPanel6.add(empl);
        empl.setBounds(0, 170, 130, 40);

        exit.setBackground(new java.awt.Color(51, 51, 51));
        exit.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("exit");
        exit.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel6.add(exit);
        exit.setBounds(0, 370, 130, 50);

        inve.setBackground(new java.awt.Color(51, 51, 51));
        inve.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        inve.setForeground(new java.awt.Color(255, 255, 255));
        inve.setText("inventory");
        inve.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        inve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inveMouseClicked(evt);
            }
        });
        inve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inveActionPerformed(evt);
            }
        });
        jPanel6.add(inve);
        inve.setBounds(0, 240, 130, 40);

        home.setBackground(new java.awt.Color(51, 51, 51));
        home.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.setBorder(null);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel6.add(home);
        home.setBounds(0, 10, 130, 40);

        add.setBackground(new java.awt.Color(51, 51, 51));
        add.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("add items");
        add.setBorder(null);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel6.add(add);
        add.setBounds(0, 300, 130, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s.jpeg"))); // NOI18N
        jPanel6.add(jLabel3);
        jLabel3.setBounds(0, 0, 130, 670);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(0, 100, 130, 670);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Adi.png"))); // NOI18N
        desk.add(jLabel5);
        jLabel5.setBounds(520, 190, 230, 240);

        jPanel1.add(desk);
        desk.setBounds(130, 100, 1240, 670);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void inveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inveActionPerformed
        //inventory inv=new inventory();
        //inv.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_inveActionPerformed

    private void inveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inveMouseClicked
        // TODO add your handling code here:
        inventory2 invt = new inventory2();
       desk.removeAll();
       desk.add(invt).setVisible(true);
    }//GEN-LAST:event_inveMouseClicked

    private void salesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesMouseClicked
        // TODO add your handling code here:
          sale s = new sale();
       desk.removeAll();
       desk.add(s).setVisible(true);
    }//GEN-LAST:event_salesMouseClicked

    private void emplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emplMouseClicked
        // TODO add your handling code here:
          ViewEmployeesJFrame emp = new ViewEmployeesJFrame(this);
       desk.removeAll();
       desk.add(emp).setVisible(true);
    }//GEN-LAST:event_emplMouseClicked

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        frame ho = new frame();
       desk.removeAll();
       desk.add(ho).setVisible(true);

        
    }//GEN-LAST:event_homeMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
         additems ad=new additems();
        desk.removeAll();
        desk.add(ad).setVisible(true);
    }//GEN-LAST:event_addMouseClicked

    private void emplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emplActionPerformed

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
            java.util.logging.Logger.getLogger(onetime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(onetime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(onetime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(onetime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new onetime().setVisible(true);
            }
        });
    }
 public void nextButtonOnaddempPressed() {
        //open enxt frame
        emp=new emplo();
        desk.add(emp).setVisible(true);
    }
 public void addbuttonclicked(){
     item=new additems();
     desk.add(item).setVisible(true);
     this.dispose();
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JDesktopPane desk;
    private javax.swing.JButton empl;
    private javax.swing.JButton exit;
    private javax.swing.JButton home;
    private javax.swing.JButton inve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton sales;
    // End of variables declaration//GEN-END:variables

   
   
}
