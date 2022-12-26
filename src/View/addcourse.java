/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
//import java.sql.Exception;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nwjsh
 */
public class addcourse extends javax.swing.JFrame {
    Connection con;
    
    
    public addcourse() {
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
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CTable = new javax.swing.JTable();
        Course_Name = new javax.swing.JTextField();
        Course_Code = new javax.swing.JTextField();
        Course_description = new javax.swing.JScrollPane();
        Course_Description = new javax.swing.JTextArea();
        view_btn = new javax.swing.JButton();
        Course_Duration = new javax.swing.JTextField();
        submit_btn = new javax.swing.JButton();
        Back_btn = new javax.swing.JButton();
        blurr = new javax.swing.JLabel();
        bgimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 649));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADD NEW COURSE");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 0, 340, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 440, 70);

        jPanel2.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Year");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 0, 30, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(300, 300, 50, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel1.setText("Course Description :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 340, 160, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel2.setText("Course Name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 130, 110, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel3.setText("Course Code :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 200, 110, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel4.setText("Course Duration :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 270, 130, 30);

        CTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course", "Code", "Duration", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CTable);
        if (CTable.getColumnModel().getColumnCount() > 0) {
            CTable.getColumnModel().getColumn(0).setResizable(false);
            CTable.getColumnModel().getColumn(0).setPreferredWidth(15);
            CTable.getColumnModel().getColumn(1).setResizable(false);
            CTable.getColumnModel().getColumn(1).setPreferredWidth(7);
            CTable.getColumnModel().getColumn(2).setResizable(false);
            CTable.getColumnModel().getColumn(2).setPreferredWidth(7);
            CTable.getColumnModel().getColumn(3).setResizable(false);
            CTable.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(510, 70, 452, 440);

        Course_Name.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        Course_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Course_NameActionPerformed(evt);
            }
        });
        getContentPane().add(Course_Name);
        Course_Name.setBounds(120, 160, 230, 40);

        Course_Code.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        Course_Code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Course_CodeActionPerformed(evt);
            }
        });
        getContentPane().add(Course_Code);
        Course_Code.setBounds(120, 230, 230, 40);

        Course_Description.setColumns(20);
        Course_Description.setRows(5);
        Course_description.setViewportView(Course_Description);

        getContentPane().add(Course_description);
        Course_description.setBounds(120, 370, 234, 130);

        view_btn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        view_btn.setText("View");
        view_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_btnActionPerformed(evt);
            }
        });
        getContentPane().add(view_btn);
        view_btn.setBounds(850, 540, 110, 50);

        Course_Duration.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        Course_Duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Course_DurationActionPerformed(evt);
            }
        });
        getContentPane().add(Course_Duration);
        Course_Duration.setBounds(120, 300, 170, 40);

        submit_btn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        submit_btn.setText("Add Course");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(submit_btn);
        submit_btn.setBounds(320, 550, 110, 50);

        Back_btn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Back_btn.setText("Back");
        Back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_btnActionPerformed(evt);
            }
        });
        getContentPane().add(Back_btn);
        Back_btn.setBounds(60, 550, 80, 50);

        blurr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/bgblur.png"))); // NOI18N
        blurr.setText("jLabel2");
        getContentPane().add(blurr);
        blurr.setBounds(20, 20, 440, 610);

        bgimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/resizebg.png"))); // NOI18N
        getContentPane().add(bgimg);
        bgimg.setBounds(0, -11, 1000, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Course_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Course_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Course_NameActionPerformed

    private void Course_CodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Course_CodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Course_CodeActionPerformed

    private void Course_DurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Course_DurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Course_DurationActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String C_Name = Course_Name.getText();
        String C_Code = Course_Code.getText();
        String C_Duration=Course_Duration.getText();
        String C_Description=Course_Description.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://db4free.net:3306/universitas","universitas","30dc48eb");
            
            Statement stm=con.createStatement();
            String sql="INSERT INTO add_course VALUES('"+C_Name+"','"+C_Code+"','"+C_Duration+"','"+C_Description+"')";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"New course added successfully");
            con.close();
             
            
        }catch(Exception e){
               
        }   
    }
    private void Back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Back_btnActionPerformed

    private void view_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_btnActionPerformed
        String sql = "SELECT * FROM add_course";
        try{
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) CTable.getModel();
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)});
                
            }
        }catch (Exception ex){
            System.out.println("Error : " +ex.getMessage());
        }
    }//GEN-LAST:event_view_btnActionPerformed

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
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addcourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_btn;
    private javax.swing.JTable CTable;
    private javax.swing.JTextField Course_Code;
    private javax.swing.JTextArea Course_Description;
    private javax.swing.JTextField Course_Duration;
    private javax.swing.JTextField Course_Name;
    private javax.swing.JScrollPane Course_description;
    private javax.swing.JLabel bgimg;
    private javax.swing.JLabel blurr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton submit_btn;
    private javax.swing.JButton view_btn;
    // End of variables declaration//GEN-END:variables
}
