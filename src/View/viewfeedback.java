/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
//import java.sql.Exception;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author nwjsh
 */
public class viewfeedback extends javax.swing.JFrame {
    
    Connection con;
    
    public viewfeedback() {
        initComponents();
        
        String url="jdbc:mysql://db4free.net :3306/universitas";
        String user="universitas";
        String password="30dc48eb";
        
        try{
            con=DriverManager.getConnection(url,user,password);
        }catch(Exception ex){
            System.out.println("Error : " + ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        f_table = new javax.swing.JTable();
        refresth = new javax.swing.JButton();
        bgimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(630, 670));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        heading.setFont(new java.awt.Font("Times New Roman", 1, 35)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setText("STUDENTS FEEDBACK");
        jPanel1.add(heading);
        heading.setBounds(120, 0, 400, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 90);

        f_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Feedback"
            }
        ));
        jScrollPane1.setViewportView(f_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 130, 452, 402);

        refresth.setText("Show table data");
        refresth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresthActionPerformed(evt);
            }
        });
        getContentPane().add(refresth);
        refresth.setBounds(420, 540, 120, 23);

        bgimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resizebg.png"))); // NOI18N
        getContentPane().add(bgimg);
        bgimg.setBounds(0, 0, 630, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refresthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresthActionPerformed
        String sql = "SELECT * FROM feedback";
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) f_table.getModel();
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1), rs.getString(2)});
                
            }
        }catch (Exception ex){
            System.out.println("Error : " +ex.getMessage());
        }
    }//GEN-LAST:event_refresthActionPerformed

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
            java.util.logging.Logger.getLogger(viewfeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewfeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewfeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewfeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewfeedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgimg;
    private javax.swing.JTable f_table;
    private javax.swing.JLabel heading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresth;
    // End of variables declaration//GEN-END:variables
}