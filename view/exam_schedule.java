
// package View;

// /**
//  *
//  * @author nwjsh
//  */
// public class exam_schedule extends javax.swing.JFrame {

//     /**
//      * Creates new form exam_schedule
//      */
//     public exam_schedule() {
//         initComponents();
//     }

//     private void initComponents() {

//         jButton1 = new javax.swing.JButton();
//         calandar = new com.toedter.calendar.JCalendar();
//         jLabel1 = new javax.swing.JLabel();

//         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//         setMinimumSize(new java.awt.Dimension(1512, 982));
//         getContentPane().setLayout(null);

//         jButton1.setText("Exam Schedules");
//         jButton1.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 jButton1ActionPerformed(evt);
//             }
//         });
//         getContentPane().add(jButton1);
//         jButton1.setBounds(1160, 680, 160, 60);

//         calandar.setDecorationBackgroundColor(new java.awt.Color(134, 204, 252));
//         calandar.setWeekOfYearVisible(false);
//         calandar.addContainerListener(new java.awt.event.ContainerAdapter() {
//             public void componentAdded(java.awt.event.ContainerEvent evt) {
//                 calandarComponentAdded(evt);
//             }
//         });
//         // getContentPane().add(calandar);
//         calandar.setBounds(180, 150, 1140, 590);

//         jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bg.png"))); // NOI18N
//         getContentPane().add(jLabel1);
//         jLabel1.setBounds(0, -20, 1510, 980);

//         pack();
//     }// </editor-fold>//GEN-END:initComponents

//     private void calandarComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_calandarComponentAdded
        
//     }//GEN-LAST:event_calandarComponentAdded

//     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//         new exam().setVisible(true);
//     }//GEN-LAST:event_jButton1ActionPerformed

//     /**
//      * @param args the command line arguments
//      */
//     public static void main(String args[]) {
//         /* Set the Nimbus look and feel */
//         //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//         /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//          * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//          */
//         try {
//             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                 if ("Nimbus".equals(info.getName())) {
//                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                 }
//             }
//         } catch (ClassNotFoundException ex) {
//             java.util.logging.Logger.getLogger(exam_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (InstantiationException ex) {
//             java.util.logging.Logger.getLogger(exam_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (IllegalAccessException ex) {
//             java.util.logging.Logger.getLogger(exam_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//             java.util.logging.Logger.getLogger(exam_schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         }
//         //</editor-fold>

//         /* Create and display the form */
//         java.awt.EventQueue.invokeLater(new Runnable() {
//             public void run() {
//                 new exam_schedule().setVisible(true);
//             }
//         });
//     }

//     // Variables declaration - do not modify//GEN-BEGIN:variables
//     private com.toedter.calendar.JCalendar calandar;
//     private javax.swing.JButton jButton1;
//     private javax.swing.JLabel jLabel1;
//     // End of variables declaration//GEN-END:variables
// }
