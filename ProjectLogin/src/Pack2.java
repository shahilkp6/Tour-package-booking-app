
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahil
 */
public class Pack2 extends javax.swing.JFrame {

    /**
     * Creates new form Pack2
     */
        Connection con=null;
        Connection con1 = null;
        Connection con9 = null;
    Connection con2 = null;
    PreparedStatement pst =null;
    PreparedStatement pst1 =null;
    PreparedStatement pst2 =null;
    PreparedStatement pst3 =null;
      PreparedStatement stmt = null;
    PreparedStatement stmt1 = null;
    PreparedStatement stmt2 = null;
    
    ResultSet rs=null;
    ResultSet rs1=null;
    //ResultSet rs1 = null;
    ResultSet rs3 = null;
     ResultSet rs4 = null;
      ResultSet rs5 = null;
    String uid,duser,uid1;
    int n=0,c=0;
    
    
    public Pack2() {
        initComponents();
           Toolkit obl1= getToolkit();
        Dimension obj2= obl1.getScreenSize();
        setLocation(obj2.width/2-getWidth()/2, obj2.height/2-getHeight()/2);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(74, 74, 74));
        jPanel1.setForeground(new java.awt.Color(78, 78, 78));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        jLabel1.setText("PACK 2");

        jTextArea1.setBackground(new java.awt.Color(72, 72, 72));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(230, 230, 230));
        jTextArea1.setRows(5);
        jTextArea1.setText("Morning: Visit the Mirihi Beach, by taking a sea boat from your resort.\nThe expanse of azure waters will leave you thrilled.\nAfternoon: Shop at one of the floating markets at the islands.\nEvening: Spend the evening with a picnic basket and a blanket at\nthe glowing beach, Mudhdhoo Island.\n\nStay at : Sunrise Beach Hotel\nprice:22,000");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("add to list");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete from list");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        
        
        
           try {
            String query="SELECT * From Current";
            String q1="SELECT * From Date_Ch";
            
            String q2= "INSERT INTO `Booking_test`(`Pname`, `Pprice`, `userid`,`date`,`status`) VALUES (?,?,?,?,?)";
            con =DriverManager.getConnection("jdbc:mysql://localhost:3307/user_login","root","");
            pst = con.prepareStatement(query);
           
            
            rs=pst.executeQuery();
             
              
             if(rs.next()){
                  uid=rs.getString("Userid");
                  //System.out.print(uid);
                  // pst2.setString(3,uid);
             }
                else{
                       JOptionPane.showMessageDialog(this, "userid and password does not match");
                        }
             
             
            pst1=con.prepareStatement(q1);
            rs1=pst1.executeQuery(q1);
             
              
             if(rs1.next()){
                 duser=rs1.getString("Dch");
                 // System.out.print(duser);
                //  pst2.setString(4,duser);
             }
                else{
                       JOptionPane.showMessageDialog(this, "userid and password does not match");
                        }
            System.out.print(duser);
            System.out.print(uid);
            
            
       
        con9=DriverManager.getConnection("jdbc:mysql://localhost:3307/user_login","root","");
        String query1="SELECT COUNT(Pname) FROM `Booking_test` WHERE Pname = 'P2' and userid=? ; ";
        pst3=con9.prepareStatement(query1);
        pst3.setString(1,uid);
        rs5=pst3.executeQuery();
        rs5.next();
       
        c=rs5.getInt("COUNT(Pname)");
       
        if(c!=0)
        {
            JOptionPane.showMessageDialog(null,"This plan is already added to the list");
        }
            
            
        else{  
            
            pst2= con.prepareStatement(q2);
            pst2.setString(1,"P2");
            pst2.setInt(2,30000);
            pst2.setString(3,uid);
            pst2.setString(4,duser);
            pst2.setString(5,"not paid");
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(null, "added");
            
            New_Pac l=new New_Pac();
            l.setVisible(true);
            this.setVisible(false);
          
        }
            
         
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
      
     



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
           New_Pac l=new New_Pac();
            l.setVisible(true);
            this.setVisible(false); 

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

       
         
         try {
            //String uid1;    

            String query = "SELECT * From Current";
            String query3 = "SELECT COUNT(Pname) FROM `Booking_test` WHERE Pname=? and userid=?";

            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3307/user_login", "root", "");

            stmt1 = con1.prepareStatement(query);
            rs3 = stmt1.executeQuery();

            if (rs3.next()) {
                uid1 = rs3.getString("Userid");
                System.out.print(uid1);
                // pst2.setString(3,uid);
            } else {
                JOptionPane.showMessageDialog(this, "userid and password does not match");
            }

            System.out.println(uid1);

            stmt = con1.prepareStatement(query3);
            stmt.setString(1, "P2");
            stmt.setString(2, uid1);
            rs4 = stmt.executeQuery();
            rs4.next();

            n = rs4.getInt("COUNT(Pname)");
            System.out.println(n);
            System.out.println(uid1);

            if (n != 0) {

                String query4 = "DELETE FROM `Booking_test` where Pname=? and userid=?";
                con2=DriverManager.getConnection("jdbc:mysql://localhost:3307/user_login","root","");
                stmt2 = con2.prepareStatement(query4);
                stmt2.setString(1, "P2");
                stmt2.setString(2, uid1);
                //System.out.println("hi");
                stmt2.executeUpdate();
                JOptionPane.showMessageDialog(null, "Removed");
            } else {
                JOptionPane.showMessageDialog(null, "This plan is not in the list");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            //JOptionPane.showMessageDialog(null,e);
        }






        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Pack2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pack2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pack2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pack2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pack2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
