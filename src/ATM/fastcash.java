/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ATM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Poojan
 */
public class fastcash extends javax.swing.JFrame {

    /**
     * Creates new form fastcash
     */
    public fastcash() {
        initComponents();
    }

    public fastcash(int AccNum) {
        initComponents();
        MyAccNum = AccNum;
      //  AccNumLbl.setText(""+AccNum); 
        getBalance();
    }
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null,Rs1=null;
    Statement St = null,St1=null;
    int OldBalance;
    int MyAccNum;
    private void getBalance()
    {
        
        String Query = "Select * from Accounttbl where AccNum='"+MyAccNum+"'";
        
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            St1 = con.createStatement();
            Rs1 = St1.executeQuery(Query);
            if(Rs1.next())
            {
             OldBalance = Rs1.getInt(9);
             BalLbl.setText(""+OldBalance);
            }
            else
            {
               
            }
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(this,e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rs1 = new javax.swing.JButton();
        rs2 = new javax.swing.JButton();
        rs4 = new javax.swing.JButton();
        rs5 = new javax.swing.JButton();
        rs3 = new javax.swing.JButton();
        rs6 = new javax.swing.JButton();
        BalLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Backbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("          MYCODE BANK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("FAST CASH");

        rs1.setBackground(new java.awt.Color(102, 102, 102));
        rs1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        rs1.setForeground(new java.awt.Color(255, 255, 255));
        rs1.setText("Rs 100");
        rs1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs1MouseClicked(evt);
            }
        });
        rs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs1ActionPerformed(evt);
            }
        });

        rs2.setBackground(new java.awt.Color(102, 102, 102));
        rs2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        rs2.setForeground(new java.awt.Color(255, 255, 255));
        rs2.setText("Rs 500");
        rs2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs2MouseClicked(evt);
            }
        });
        rs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs2ActionPerformed(evt);
            }
        });

        rs4.setBackground(new java.awt.Color(102, 102, 102));
        rs4.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        rs4.setForeground(new java.awt.Color(255, 255, 255));
        rs4.setText("Rs 2000 ");
        rs4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs4MouseClicked(evt);
            }
        });
        rs4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs4ActionPerformed(evt);
            }
        });

        rs5.setBackground(new java.awt.Color(102, 102, 102));
        rs5.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        rs5.setForeground(new java.awt.Color(255, 255, 255));
        rs5.setText("Rs 5000");
        rs5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs5MouseClicked(evt);
            }
        });
        rs5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs5ActionPerformed(evt);
            }
        });

        rs3.setBackground(new java.awt.Color(102, 102, 102));
        rs3.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        rs3.setForeground(new java.awt.Color(255, 255, 255));
        rs3.setText("Rs 1000");
        rs3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs3MouseClicked(evt);
            }
        });
        rs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs3ActionPerformed(evt);
            }
        });

        rs6.setBackground(new java.awt.Color(102, 102, 102));
        rs6.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        rs6.setForeground(new java.awt.Color(255, 255, 255));
        rs6.setText("Rs 10000");
        rs6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs6MouseClicked(evt);
            }
        });
        rs6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rs6ActionPerformed(evt);
            }
        });

        BalLbl.setBackground(new java.awt.Color(255, 255, 255));
        BalLbl.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        BalLbl.setForeground(new java.awt.Color(255, 51, 51));
        BalLbl.setText("Balance ");

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setText("Your Balance :");

        Backbtn.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        Backbtn.setText("BACK");
        Backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackbtnMouseClicked(evt);
            }
        });
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rs1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rs2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rs3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(99, 99, 99))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rs5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rs4)
                            .addComponent(rs6))
                        .addGap(61, 61, 61))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rs1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rs2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(rs3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(rs4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rs5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rs6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(Backbtn)
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs1ActionPerformed

    private void rs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs2ActionPerformed

    private void rs4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs4ActionPerformed

    private void rs5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs5ActionPerformed

    private void rs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs3ActionPerformed

    private void rs6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rs6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rs6ActionPerformed

    private void rs1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs1MouseClicked
        // TODO add your handling code here:
        
        if(OldBalance <100)
          {
             JOptionPane.showMessageDialog(this,"Not Enough Balance Available In your Account");
          }
          else
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = con.prepareStatement(Query);
            ps.setInt(1,OldBalance-100);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch(Exception e)
            {
               JOptionPane.showMessageDialog(this,e);
            }
            getBalance();
        }
        
    }//GEN-LAST:event_rs1MouseClicked

    private void rs2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs2MouseClicked
        // TODO add your handling code here:
        
        if(OldBalance < 500)
          {
             JOptionPane.showMessageDialog(this,"Not Enough Balance Available In your Account");
          }
          else
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = con.prepareStatement(Query);
            ps.setInt(1,OldBalance-500);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch(Exception e)
            {
               JOptionPane.showMessageDialog(this,e);
            }
            getBalance();
        }
        
    }//GEN-LAST:event_rs2MouseClicked

    private void rs3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs3MouseClicked
        // TODO add your handling code here:
        
        if(OldBalance <1000)
          {
             JOptionPane.showMessageDialog(this,"Not Enough Balance Available In your Account");
          }
          else
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = con.prepareStatement(Query);
            ps.setInt(1,OldBalance-1000);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch(Exception e)
            {
               JOptionPane.showMessageDialog(this,e);
            }
            getBalance();
        }
        
    }//GEN-LAST:event_rs3MouseClicked

    private void rs4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs4MouseClicked
        // TODO add your handling code here:
        
        if(OldBalance <2000)
          {
             JOptionPane.showMessageDialog(this,"Not Enough Balance Available In your Account");
          }
          else
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = con.prepareStatement(Query);
            ps.setInt(1,OldBalance-2000);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch(Exception e)
            {
               JOptionPane.showMessageDialog(this,e);
            }
            getBalance();
        }
        
    }//GEN-LAST:event_rs4MouseClicked

    private void rs5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs5MouseClicked
        // TODO add your handling code here:
        
        if(OldBalance <5000)
          {
             JOptionPane.showMessageDialog(this,"Not Enough Balance Available In your Account");
          }
          else
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = con.prepareStatement(Query);
            ps.setInt(1,OldBalance-5000);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch(Exception e)
            {
               JOptionPane.showMessageDialog(this,e);
            }
            getBalance();
        }
        
    }//GEN-LAST:event_rs5MouseClicked

    private void rs6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs6MouseClicked
        // TODO add your handling code here:
        
        if(OldBalance <10000)
          {
             JOptionPane.showMessageDialog(this,"Not Enough Balance Available In your Account");
          }
          else
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps = con.prepareStatement(Query);
            ps.setInt(1,OldBalance-10000);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate()==1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Missing Information");
            }
            } catch(Exception e)
            {
               JOptionPane.showMessageDialog(this,e);
            }
            getBalance();
        }
        
    }//GEN-LAST:event_rs6MouseClicked

    private void BackbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbtnMouseClicked
        // TODO add your handling code here:
        new mainmenu(MyAccNum).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackbtnMouseClicked

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackbtnActionPerformed

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
            java.util.logging.Logger.getLogger(fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fastcash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fastcash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backbtn;
    private javax.swing.JLabel BalLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton rs1;
    private javax.swing.JButton rs2;
    private javax.swing.JButton rs3;
    private javax.swing.JButton rs4;
    private javax.swing.JButton rs5;
    private javax.swing.JButton rs6;
    // End of variables declaration//GEN-END:variables
}
