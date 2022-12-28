package View;

import javax.swing.*;
import Controller.Controller;
import Controller.StudentController;
import Model.Student;



public class Userlogin extends javax.swing.JFrame {


    public Userlogin() {
        initComponents();
        try{
            dob.setEditable(false);
            Gurdian_name.setEditable(false);
            guardian_contact.setEditable(false);
            contact_number.setEditable(false);
            email.setEditable(false);
            Student_name.setEditable(false);
        }catch(
            Exception e){
                e.printStackTrace();
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

        delete_btn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Gurdian_name = new javax.swing.JTextField();
        guardian_contact = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contact_number = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Student_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1512, 982));
        getContentPane().setLayout(null);

        delete_btn.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        delete_btn.setText("Delete Account");
        delete_btn.setBorder(null);
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        getContentPane().add(delete_btn);
        delete_btn.setBounds(1240, 660, 130, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/pfp.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(750, 70, 50, 50);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Contact number:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 410, 150, 30);

        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });
        getContentPane().add(dob);
        dob.setBounds(320, 590, 230, 30);

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel11.setText("Date of Birth:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(140, 590, 170, 30);

        Gurdian_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gurdian_nameActionPerformed(evt);
            }
        });
        getContentPane().add(Gurdian_name);
        Gurdian_name.setBounds(1090, 440, 230, 30);

        guardian_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardian_contactActionPerformed(evt);
            }
        });
        getContentPane().add(guardian_contact);
        guardian_contact.setBounds(1090, 540, 230, 30);

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setText("Contact number:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(910, 550, 170, 24);

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setText("Guardian");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(910, 530, 110, 20);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("Guardian's Name:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(910, 440, 160, 30);

        contact_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_numberActionPerformed(evt);
            }
        });
        getContentPane().add(contact_number);
        contact_number.setBounds(320, 410, 230, 30);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email);
        email.setBounds(320, 500, 230, 30);

        jLabel6.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel6.setText("Email:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 500, 170, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("STUDENT INFORMATION");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(520, 270, 460, 43);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Rectangle 86.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 240, 1310, 490);

        Student_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_nameActionPerformed(evt);
            }
        });
        getContentPane().add(Student_name);
        Student_name.setBounds(650, 140, 270, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/1761712 2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1510, 980);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Student_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Student_nameActionPerformed

    private void contact_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_numberActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void guardian_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardian_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardian_contactActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void Gurdian_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gurdian_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gurdian_nameActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        String Contact=contact_number.getText();
        String Email=email.getText();
        String Dob = dob.getText();
        String Gname=Gurdian_name.getText();
        String Gcontact=guardian_contact.getText();
      
        
        try{
            
            Student d1= new Student(0,0,Email,Contact,Gname,Gcontact, 0,Dob, 0,0);
//            drlistcontroller 
            StudentController sc = new StudentController();
            int del = sc.delete(d1);

                if (del > 0) {
                    System.out.println("delete inserted");
                } else {
                    System.out.println("Failed to insert data");
                }
                JOptionPane.showMessageDialog(null, "Delete Successfull.");
     
            } 
        catch (Exception e) {
                // TODO: handle exception
                JOptionPane.showMessageDialog(null, e);
                System.out.printf(null,e);
            }

        
        
    }//GEN-LAST:event_delete_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Userlogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Gurdian_name;
    private javax.swing.JTextField Student_name;
    private javax.swing.JTextField contact_number;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField guardian_contact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
