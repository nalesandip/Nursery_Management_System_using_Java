/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nms;

import static connection.connect_database.connection_string;
import static connection.connect_database.database_password;
import static connection.connect_database.database_username;
import static connection.connect_database.driver_name;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author amprojects
 */
public class customer extends javax.swing.JFrame {
int cid=0;
int tcid=0;
    /**
     * Creates new form customer
     */
    public customer() {
        initComponents();
        getid();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        phone = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        customer_id = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Cutomer Phone");

        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Close");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel5.setText("Address");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Customer Info");

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Customer ID");

        jButton3.setText("<<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Customer Name");

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(">>");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(customer_id)
                            .addComponent(jLabel3)
                            .addComponent(name)
                            .addComponent(jLabel4)
                            .addComponent(phone)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8))
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customer_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void getid()
{
    try
    {
       cid=0;
       Class.forName(driver_name);
       Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
       PreparedStatement pst=con.prepareStatement("select * from customer");
       ResultSet rs=pst.executeQuery();
       while(rs.next())
       {
           cid=rs.getInt(1);
       }
       cid=cid+1;
       customer_id.setText(String.valueOf(cid));
    }
    catch(Exception ex)
    {
        jOptionPane1.showMessageDialog(null,ex);
    }
}
public void clear_data()
{
        customer_id.setText("");
        name.setText("");
        phone.setText("");
        address.setText("");
        getid();
}
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        customer_id.setText("");
        name.setText("");
        phone.setText("");
        address.setText("");
        getid();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            if(customer_id.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Customer ID not get");
            }
            else if(name.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Please enter customer name");
            }
            else if(phone.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Please enter Customer Mobile Number");
            }
            else if(address.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Please enter customer address");
            }
            else
            {
                Class.forName(driver_name);
       Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
       PreparedStatement pst=con.prepareStatement("insert into customer values("+customer_id.getText()+",'"+name.getText()+"','"+phone.getText()+"','"+address.getText()+"')");
       int i=pst.executeUpdate();
       if(i>0)
       {
           jOptionPane1.showMessageDialog(null,"Customer record add successfully ");
           clear_data();
       }
       else
       {
           jOptionPane1.showMessageDialog(null,"Rcord add Failed try later");
       }
            }
        }
        catch(Exception ex)
        {
            jOptionPane1.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName(driver_name);
       Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
       PreparedStatement pst=con.prepareStatement("select * from customer where customer_id="+search.getText()+"");
       ResultSet rs=pst.executeQuery();
       if(rs.next())
       {
           customer_id.setText(rs.getString(1));
           name.setText(rs.getString(2));
           phone.setText(rs.getString(3));
           address.setText(rs.getString(4));
       }
       else
       {
          jOptionPane1.showMessageDialog(null,"No record found !"); 
       }
        }
        catch(Exception ex)
        {
            jOptionPane1.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try
        {
            if(customer_id.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Customer ID not get");
            }
            else if(name.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Please enter customer name");
            }
            else if(phone.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Please enter Customer Mobile Number");
            }
            else if(address.getText().equals(""))
            {
                jOptionPane1.showMessageDialog(null,"Please enter customer address");
            }
            else
            {
                Class.forName(driver_name);
       Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
       PreparedStatement pst=con.prepareStatement("update customer set customer_name='"+name.getText()+"',customer_mobile='"+phone.getText()+"',customer_address='"+address.getText()+"' where customer_id="+customer_id.getText()+"");
       int i=pst.executeUpdate();
       if(i>0)
       {
           jOptionPane1.showMessageDialog(null,"Customer record update successfully");
       }
       else
       {
           jOptionPane1.showMessageDialog(null,"Record not Update try later");
       }
            }
        }
        catch(Exception ex)
        {
            jOptionPane1.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try
        {
            if(customer_id.getText().equals(""))
            {
                 jOptionPane1.showMessageDialog(null,"Customer ID not get");
            }
            else
            {
                 Class.forName(driver_name);
       Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
       PreparedStatement pst=con.prepareStatement("delete from customer where customer_id="+customer_id.getText()+"");
       int i=pst.executeUpdate();
       if(i>0)
       {
           jOptionPane1.showMessageDialog(null,"Customer record delete successfully");
           clear_data();
       }
       else
       {
           jOptionPane1.showMessageDialog(null,"Customer record not delete try later");
       }
            }
        }
        catch(Exception ex)
        {
            jOptionPane1.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try
        {
            tcid=tcid+1;
       Class.forName(driver_name);
       Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
       PreparedStatement pst=con.prepareStatement("select * from customer where customer_id="+tcid+"");
       ResultSet rs=pst.executeQuery();
       if(rs.next())
       {
           customer_id.setText(rs.getString(1));
           name.setText(rs.getString(2));
           phone.setText(rs.getString(3));
           address.setText(rs.getString(4));
       }
       else
       {
          jOptionPane1.showMessageDialog(null,"No next record found !");
          tcid=tcid-1;
       }
        }
        catch(Exception ex)
        {
            jOptionPane1.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try
        {
            tcid=tcid-1;
       Class.forName(driver_name);
       Connection con=DriverManager.getConnection(connection_string,database_username,database_password);
       PreparedStatement pst=con.prepareStatement("select * from customer where customer_id="+tcid+"");
       ResultSet rs=pst.executeQuery();
       if(rs.next())
       {
           customer_id.setText(rs.getString(1));
           name.setText(rs.getString(2));
           phone.setText(rs.getString(3));
           address.setText(rs.getString(4));
       }
       else
       {
          jOptionPane1.showMessageDialog(null,"No next record found !");
          tcid=tcid+1;
       }
        }
        catch(Exception ex)
        {
            jOptionPane1.showMessageDialog(null,ex);
        }
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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTextField customer_id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}