/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author nwjsh
 */
public class calender extends javax.swing.JFrame {

    /**
     * Creates new form calender
     */
    public calender() {
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
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1512, 982));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/122.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 20, 50, 40);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jButton2.setText("Universitas");
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 20, 300, 70);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton1.setText("Calandar");
        jPanel1.add(jButton1);
        jButton1.setBounds(1060, 40, 100, 40);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton3.setText("Routine");
        jPanel1.add(jButton3);
        jButton3.setBounds(400, 40, 90, 40);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton4.setText("Notices");
        jPanel1.add(jButton4);
        jButton4.setBounds(560, 40, 100, 40);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton5.setText("Attandance");
        jPanel1.add(jButton5);
        jButton5.setBounds(730, 40, 110, 40);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton6.setText("Quiz");
        jPanel1.add(jButton6);
        jButton6.setBounds(900, 40, 90, 40);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pfp.png"))); // NOI18N
        jPanel1.add(jButton7);
        jButton7.setBounds(1415, 20, 60, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1512, 110);

        jCalendar1.setBackground(new java.awt.Color(255, 255, 255));
        jCalendar1.setWeekOfYearVisible(false);
        getContentPane().add(jCalendar1);
        jCalendar1.setBounds(230, 170, 1060, 620);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bg.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1510, 980);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(calender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calender().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
