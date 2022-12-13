/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;

import Controller.StudentController;
import Model.Student;

/**
 *
 * @author Lenovo
 */
public class SignUpJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SignUpJFrame
     */
    public SignUpJFrame() {
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

        jLabel2 = new javax.swing.JLabel();
        jMenu3 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        f_name1 = new javax.swing.JTextField();
        email1 = new javax.swing.JTextField();
        std_contact1 = new javax.swing.JTextField();
        l_name1 = new javax.swing.JTextField();
        parents_name1 = new javax.swing.JTextField();
        parent_contact1 = new javax.swing.JTextField();
        firstname = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        femail = new javax.swing.JLabel();
        password01 = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        confirmpassword = new javax.swing.JLabel();
        signupbtn = new javax.swing.JButton();
        dateofbirth = new javax.swing.JLabel();
        g_name = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        security_ans1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        gender = new javax.swing.JLabel();
        others = new javax.swing.JRadioButton();
        ConfirmPass1 = new javax.swing.JPasswordField();
        password1 = new javax.swing.JPasswordField();
        dob1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jMenu3.setText("jMenu3");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1980, 1020));

        jPanel1.setBackground(new java.awt.Color(134, 204, 252));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        f_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_name1ActionPerformed(evt);
            }
        });
        jPanel2.add(f_name1);
        f_name1.setBounds(0, 140, 240, 40);

        email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email1ActionPerformed(evt);
            }
        });
        jPanel2.add(email1);
        email1.setBounds(0, 210, 240, 40);
        jPanel2.add(std_contact1);
        std_contact1.setBounds(270, 210, 250, 40);

        l_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_name1ActionPerformed(evt);
            }
        });
        jPanel2.add(l_name1);
        l_name1.setBounds(270, 140, 250, 40);

        parents_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parents_name1ActionPerformed(evt);
            }
        });
        jPanel2.add(parents_name1);
        parents_name1.setBounds(0, 280, 240, 40);

        parent_contact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parent_contact1ActionPerformed(evt);
            }
        });
        jPanel2.add(parent_contact1);
        parent_contact1.setBounds(270, 280, 250, 40);

        firstname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        firstname.setText("First Name:");
        jPanel2.add(firstname);
        firstname.setBounds(0, 120, 80, 17);

        lastname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lastname.setText("Last Name:");
        jPanel2.add(lastname);
        lastname.setBounds(270, 120, 100, 17);

        femail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        femail.setText("Email address:");
        jPanel2.add(femail);
        femail.setBounds(0, 190, 90, 17);

        password01.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        password01.setText("Password:");
        jPanel2.add(password01);
        password01.setBounds(0, 330, 70, 17);

        contact.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        contact.setText("Contact no:");
        jPanel2.add(contact);
        contact.setBounds(270, 190, 72, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Guardian's Contact no:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(270, 260, 160, 17);

        confirmpassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        confirmpassword.setText("Confirm password:");
        jPanel2.add(confirmpassword);
        confirmpassword.setBounds(270, 330, 130, 17);

        signupbtn.setBackground(new java.awt.Color(0, 0, 0));
        signupbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        signupbtn.setForeground(new java.awt.Color(255, 255, 255));
        signupbtn.setText("SIGN UP");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });
        jPanel2.add(signupbtn);
        signupbtn.setBounds(210, 520, 120, 60);

        dateofbirth.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dateofbirth.setText("Date of Birth:");
        jPanel2.add(dateofbirth);
        dateofbirth.setBounds(0, 400, 120, 17);

        g_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        g_name.setText("Guardian's Full Name:");
        jPanel2.add(g_name);
        g_name.setBounds(0, 260, 140, 17);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 242, 242));
        jLabel8.setText("Login");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(280, 600, 230, 25);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(242, 242, 242));
        jLabel15.setText("Already have an account? ");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(120, 600, 230, 25);

        security_ans1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                security_ans1ActionPerformed(evt);
            }
        });
        jPanel2.add(security_ans1);
        security_ans1.setBounds(320, 460, 200, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Ans:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(270, 460, 50, 30);

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 250));
        jPanel3.setLayout(null);

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel3.add(female);
        female.setBounds(0, 50, 100, 22);

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel3.add(male);
        male.setBounds(0, 30, 96, 22);

        gender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gender.setText("Gender:");
        jPanel3.add(gender);
        gender.setBounds(0, 10, 60, 17);

        buttonGroup1.add(others);
        others.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        others.setText("Other");
        others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othersActionPerformed(evt);
            }
        });
        jPanel3.add(others);
        others.setBounds(0, 70, 98, 21);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 468, 140, 100);

        ConfirmPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPass1ActionPerformed(evt);
            }
        });
        jPanel2.add(ConfirmPass1);
        ConfirmPass1.setBounds(270, 350, 250, 40);

        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });
        jPanel2.add(password1);
        password1.setBounds(0, 352, 240, 40);

        dob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob1ActionPerformed(evt);
            }
        });
        jPanel2.add(dob1);
        dob1.setBounds(0, 420, 240, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Security Question:");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your favorite colour?", "What is your Pet's name?", "What is your lucky number?" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(270, 400, 250, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(660, 30, 540, 580);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(830, 650, 240, 20);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Group 5.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-10, -200, 1650, 1160);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1347, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void security_ans1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_security_ans1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_security_ans1ActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        
        // String fname= f_name.getText();
        String f_name = f_name1.getText();
        String l_name = l_name1.getText();
        String email = email1.getText();
        String std_contact=std_contact1.getText();
        String parents_name = parents_name1.getText();
        String parent_contact = parent_contact1.getText();
        String password = new String(password1.getPassword());
        String C_pass = new String(ConfirmPass1.getPassword());
        String dob = dob1.getText();
        String security_qn = null;
        String security_ans=security_ans1.getText();
        // Object selectedItem   =security_qn.getSelectedItem();
        // if(selectedItem!=null){
        //     sq = selectedItem.toString();
        // }
//        String gender = null;
//        if(male.isSelected()){
//            gender ="male";
//        }else if(female.isSelected()){
//            gender = "female";
//        }else{
//            gender="others";
//        }
        Student s1 = new Student( f_name, l_name,  email,  std_contact,  parents_name, parent_contact,  password, C_pass,dob, security_qn, security_ans, security_ans);
        StudentController sc  = new StudentController();
        int result = sc.insertdetails(s1);
        if(result>0){
            JOptionPane.showMessageDialog(null, "Registered Successfully");
        }else{
            
            JOptionPane.showMessageDialog(null, "Registered UnSuccessfully");
        }
              // TODO add your handling code here:
    }//GEN-LAST:event_signupbtnActionPerformed

    private void parents_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parents_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parents_name1ActionPerformed

    private void l_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l_name1ActionPerformed

    private void email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email1ActionPerformed

    private void f_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_nameActionPerformed

    private void parent_contact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parent_contact1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parent_contact1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void dob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dob1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPass1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel confirmpassword;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel dateofbirth;
    private javax.swing.JTextField dob1;
    private javax.swing.JTextField email1;
    private javax.swing.JTextField f_name1;
    private javax.swing.JLabel femail;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel firstname;
    private javax.swing.JLabel g_name;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JTextField l_name1;
    private javax.swing.JLabel lastname;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton others;
    private javax.swing.JTextField parent_contact1;
    private javax.swing.JTextField parents_name1;
    private javax.swing.JLabel password01;
    private javax.swing.JPasswordField password1;
    private javax.swing.JTextField security_ans1;
    private javax.swing.JButton signupbtn;
    private javax.swing.JTextField std_contact1;
    // End of variables declaration//GEN-END:variables
}
