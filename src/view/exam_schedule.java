/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author nwjsh
 */
public class exam_schedule extends javax.swing.JFrame {

    /**
     * Creates new form exam_schedule
     */
    public exam_schedule() {
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
        jLabel2 = new javax.swing.JLabel();
        universitas_btn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        routine_btn = new javax.swing.JButton();
        notice_btn = new javax.swing.JButton();
        attandance_btn = new javax.swing.JButton();
        quiz_btn = new javax.swing.JButton();
        calandar_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        calandar = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1512, 982));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/122.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 30, 50, 34);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pfp.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1420, 30, 50, 49);

        universitas_btn.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        universitas_btn.setText("Universitas");
        universitas_btn.setBorder(null);
        universitas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universitas_btnActionPerformed(evt);
            }
        });
        jPanel1.add(universitas_btn);
        universitas_btn.setBounds(50, 20, 300, 70);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(1410, 20, 70, 70);

        routine_btn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        routine_btn.setText("Routine");
        routine_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routine_btnActionPerformed(evt);
            }
        });
        jPanel1.add(routine_btn);
        routine_btn.setBounds(400, 40, 90, 40);

        notice_btn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        notice_btn.setText("Notice");
        notice_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notice_btnActionPerformed(evt);
            }
        });
        jPanel1.add(notice_btn);
        notice_btn.setBounds(560, 40, 90, 40);

        attandance_btn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        attandance_btn.setText("Attandance");
        attandance_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attandance_btnActionPerformed(evt);
            }
        });
        jPanel1.add(attandance_btn);
        attandance_btn.setBounds(720, 40, 110, 40);

        quiz_btn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        quiz_btn.setText("Quiz");
        quiz_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quiz_btnActionPerformed(evt);
            }
        });
        jPanel1.add(quiz_btn);
        quiz_btn.setBounds(900, 40, 90, 40);

        calandar_btn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        calandar_btn.setText("Calendar");
        calandar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calandar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(calandar_btn);
        calandar_btn.setBounds(1060, 40, 100, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1510, 110);

        jButton1.setText("Exam Schedules");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(670, 720, 150, 40);

        calandar.setDecorationBackgroundColor(new java.awt.Color(134, 204, 252));
        calandar.setWeekOfYearVisible(false);
        calandar.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                calandarComponentAdded(evt);
            }
        });
        getContentPane().add(calandar);
        calandar.setBounds(180, 190, 1140, 590);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bg.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 1510, 980);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void universitas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universitas_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_universitas_btnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void routine_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routine_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routine_btnActionPerformed

    private void notice_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notice_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notice_btnActionPerformed

    private void attandance_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attandance_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attandance_btnActionPerformed

    private void quiz_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quiz_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quiz_btnActionPerformed

    private void calandar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calandar_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calandar_btnActionPerformed

    private void calandarComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_calandarComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_calandarComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new exam().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(exam_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exam_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exam_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exam_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exam_schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attandance_btn;
    private com.toedter.calendar.JCalendar calandar;
    private javax.swing.JButton calandar_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton notice_btn;
    private javax.swing.JButton quiz_btn;
    private javax.swing.JButton routine_btn;
    private javax.swing.JButton universitas_btn;
    // End of variables declaration//GEN-END:variables
}
