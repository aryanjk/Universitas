/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.sql.*;
import javax.swing.*;
import java.sql.DriverManager;
/**
 *
 * @author krishal
 */
public class registerHostel extends javax.swing.JFrame {

    /**
     * Creates new form registerHostel
     */
    public registerHostel() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ctn = new javax.swing.JTextField();
        f_name = new javax.swing.JTextField();
        l_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bgimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1512, 825));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 260, 200, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("last Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 350, 200, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Contact Number");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 440, 270, 50);

        ctn.setBackground(new java.awt.Color(204, 204, 204));
        ctn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ctn.setPreferredSize(new java.awt.Dimension(64, 35));
        ctn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctnActionPerformed(evt);
            }
        });
        jPanel1.add(ctn);
        ctn.setBounds(540, 440, 260, 40);

        f_name.setBackground(new java.awt.Color(204, 204, 204));
        f_name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        f_name.setPreferredSize(new java.awt.Dimension(64, 35));
        f_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_nameActionPerformed(evt);
            }
        });
        jPanel1.add(f_name);
        f_name.setBounds(450, 270, 260, 40);

        l_name.setBackground(new java.awt.Color(204, 204, 204));
        l_name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        l_name.setPreferredSize(new java.awt.Dimension(64, 35));
        l_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_nameActionPerformed(evt);
            }
        });
        jPanel1.add(l_name);
        l_name.setBounds(450, 360, 260, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("REGISTRATION FOR HOSTEL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 110, 710, 90);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\krishal\\OneDrive\\Documents\\NetBeansProjects\\register for hostel\\src\\view\\logo 1.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 40, 260, 70);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUBMIT");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(600, 570, 140, 50);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1350, 40, 90, 28);

        bgimg.setIcon(new javax.swing.ImageIcon("C:\\Users\\krishal\\OneDrive\\Documents\\NetBeansProjects\\register for hostel\\src\\view\\Group 53.png")); // NOI18N
        bgimg.setPreferredSize(new java.awt.Dimension(1512, 825));
        jPanel1.add(bgimg);
        bgimg.setBounds(0, 0, 1512, 820);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctnActionPerformed

    private void f_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_nameActionPerformed

    private void l_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String fistname = f_name.getText();
        String lastname = l_name.getText();
        String contact = ctn.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/universitas","universitas","30dc48eb");
            
            Statement stm=con.createStatement();
            String sql="INSERT INTO Hostel VALUES('"+fistname+"','"+lastname+"','"+contact+"')";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Registered successfully");
            con.close();
            
            
        }catch(Exception e){
               
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(registerHostel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerHostel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerHostel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerHostel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerHostel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgimg;
    private javax.swing.JTextField ctn;
    private javax.swing.JTextField f_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField l_name;
    // End of variables declaration//GEN-END:variables
}
