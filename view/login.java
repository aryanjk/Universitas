package View;

import java.sql.ResultSet;

import javax.swing.*;

import Model.Student;
import Controller.StudentController;

public class login extends javax.swing.JFrame {


    public login() {
        initComponents();
    }


    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        passText = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        bgimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1350, 700));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("E-MAIL");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 280, 110, 80);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PASSWORD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 460, 150, 50);

        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });
        getContentPane().add(emailText);
        emailText.setBounds(390, 360, 350, 60);

        passText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTextActionPerformed(evt);
            }
        });
        getContentPane().add(passText);
        passText.setBounds(390, 512, 350, 60);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("LOG IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
        
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // new dshbrd().setVisible(true);
                // String email = emailText.getText();
                // String pass = new String(passText.getPassword());
        
                // try {
                //     Student s1 = new Student(null, null, email, (Integer) null, null, null, pass, null, null, null);
                //     StudentController sc = new StudentController();
                //     ResultSet r1 = sc.login(s1);
                //     if (r1.next()) {
                //         // JOptionPane.showMessageDialog(null, "Login Success");
                //         new dshbrd().setVisible(true);
                //         // sc.changeStatus(s1);
                //         sc.updateStatus(s1);
                //     }
                // } catch (Exception e) {
        
                // }
                



            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 660, 160, 50);

        jButton2.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jButton2.setText("forget password?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 580, 120, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Don't have an account ?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(610, 820, 140, 20);

        jButton3.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        jButton3.setText("Create account.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new SignUpJFrame().setVisible(true);
                
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(600, 820, 140, 40);

        bgimg.setIcon(new javax.swing.ImageIcon("/Users/ujjwalpariyar/Downloads/universitas login 2/src/view/Frame 7.png")); // NOI18N
        getContentPane().add(bgimg);
        bgimg.setBounds(-10, 0, 1510, 980);

        pack();
    // </editor-fold>//GEN-END:initComponents

  
        // new dashboard().setVisible(true);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        new forgetpass().setVisible(true);
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        // new
    }// GEN-LAST:event_jButton3ActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_emailTextActionPerformed
        // :
    }// GEN-LAST:event_emailTextActionPerformed

    private void passTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_passTextActionPerformed
        // :
    }// GEN-LAST:event_passTextActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgimg;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passText;
    // End of variables declaration//GEN-END:variables
}
