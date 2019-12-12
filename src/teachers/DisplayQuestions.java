package teachers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DisplayQuestions extends javax.swing.JFrame {
    Connection connection;
    Statement statement = null;
    ResultSet resultSet = null;
    PreparedStatement pst = null;
    int sub_id = 0;
    int count=0;
    public DisplayQuestions(int s_id) throws SQLException {
         initComponents();
         sub_id = s_id;
         display(sub_id);
         //checkAnswer();
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jQuest1 = new javax.swing.JTextField();
        jQuest2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jAnswer1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jAnswer2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jQuest3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jAnswer5 = new javax.swing.JTextField();
        jQuest4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jAnswer6 = new javax.swing.JTextField();
        jQuest5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jAnswer7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Written Form Questions");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        jLabel2.setText("5.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        jQuest1.setBorder(null);
        jQuest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuest1ActionPerformed(evt);
            }
        });
        jPanel1.add(jQuest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 430, 30));

        jQuest2.setBorder(null);
        jQuest2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuest2ActionPerformed(evt);
            }
        });
        jPanel1.add(jQuest2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 430, 30));

        jLabel3.setText("1.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jAnswer1.setBorder(null);
        jAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnswer1ActionPerformed(evt);
            }
        });
        jPanel1.add(jAnswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 430, 20));

        jSeparator1.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 280, 10));

        jAnswer2.setBorder(null);
        jAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnswer2ActionPerformed(evt);
            }
        });
        jPanel1.add(jAnswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 430, 20));

        jSeparator2.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 280, 10));

        jQuest3.setBorder(null);
        jQuest3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuest3ActionPerformed(evt);
            }
        });
        jPanel1.add(jQuest3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 430, 30));

        jLabel4.setText("2.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 280, 10));

        jAnswer5.setBorder(null);
        jAnswer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnswer5ActionPerformed(evt);
            }
        });
        jPanel1.add(jAnswer5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 430, 20));

        jQuest4.setBorder(null);
        jQuest4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuest4ActionPerformed(evt);
            }
        });
        jPanel1.add(jQuest4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 430, 30));

        jLabel5.setText("3.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 10, -1));

        jSeparator4.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 280, 10));

        jAnswer6.setBorder(null);
        jAnswer6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnswer6ActionPerformed(evt);
            }
        });
        jPanel1.add(jAnswer6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 430, 20));

        jQuest5.setBorder(null);
        jQuest5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuest5ActionPerformed(evt);
            }
        });
        jPanel1.add(jQuest5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 430, 30));

        jLabel6.setText("4.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(51, 102, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 280, 20));

        jAnswer7.setBorder(null);
        jAnswer7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnswer7ActionPerformed(evt);
            }
        });
        jPanel1.add(jAnswer7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 420, 20));

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 150, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 150, -1));

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnswer1ActionPerformed
        jAnswer1.setText("");
    }//GEN-LAST:event_jAnswer1ActionPerformed

    private void jAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnswer2ActionPerformed
        jAnswer2.setText("");
    }//GEN-LAST:event_jAnswer2ActionPerformed

    private void jQuest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuest1ActionPerformed
        jQuest1.setText("");
    }//GEN-LAST:event_jQuest1ActionPerformed

    private void jQuest3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuest3ActionPerformed
        jQuest3.setText("");
    }//GEN-LAST:event_jQuest3ActionPerformed

    private void jAnswer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnswer5ActionPerformed
        jAnswer5.setText("");
    }//GEN-LAST:event_jAnswer5ActionPerformed

    private void jQuest4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuest4ActionPerformed
        jQuest4.setText("");
    }//GEN-LAST:event_jQuest4ActionPerformed

    private void jAnswer6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnswer6ActionPerformed
        jAnswer6.setText("");
    }//GEN-LAST:event_jAnswer6ActionPerformed

    private void jQuest5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuest5ActionPerformed
        jQuest5.setText("");
    }//GEN-LAST:event_jQuest5ActionPerformed

    private void jAnswer7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnswer7ActionPerformed
        jAnswer7.setText("");
    }//GEN-LAST:event_jAnswer7ActionPerformed

    private void jQuest2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuest2ActionPerformed
        jQuest2.setText("");
    }//GEN-LAST:event_jQuest2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            checkAnswer();
        } catch (SQLException ex) {
            ex.getCause();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        closeMe();
        new DemoPreparation().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
private void checkAnswer() throws SQLException{
    final String DATABASE_URL = "jdbc:mysql://localhost:3306/InteractiveLesson";
        String[] ans = {jAnswer2.getText(),jAnswer5.getText()};
               
       try {
            connection = DriverManager.getConnection(
                    DATABASE_URL, "root", "");            
        } catch (SQLException ex) {
            ex.getSQLState();
        }
       try{           
            String QUERY = "Select answer from QA where answer=?";
            pst = connection.prepareStatement(QUERY);  
            pst.setString(1, jAnswer2.getText());
            pst.setString(1, jAnswer5.getText());
            pst.setString(1, jAnswer6.getText());
            pst.setString(1, jAnswer7.getText());
            pst.setString(1, jAnswer1.getText());
            
            resultSet = pst.executeQuery();            
            
            if(resultSet.next()){
                    count++; 
                    System.out.println(count);
                }
            if(resultSet.next()){
                    count++; 
                    System.out.println(count);
            }         
            if(resultSet.next()){
                    count++; 
                    System.out.println(count);
                }
            if(count>3){
                JOptionPane.showMessageDialog(null, "60% is correct!");
            }
            else if(count<3){
                JOptionPane.showMessageDialog(null, "Less than 60% is correct!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Well Done! 100% is correct!");
            }
            }catch (SQLException ex) {
             ex.getSQLState();
        }
       
}    
private void display(int id){
    id = sub_id;
    final String DATABASE_URL = "jdbc:mysql://localhost:3306/InteractiveLesson";             
       try {
            connection = DriverManager.getConnection(
                    DATABASE_URL, "root", "");            
        } catch (SQLException ex) {
            ex.getSQLState();
        }
        try {
        String QUERY = "select ques from QA where Sub_ID="+id;
        pst=connection.prepareStatement(QUERY);        
                                         
        statement = connection.createStatement();
        resultSet = statement.executeQuery(QUERY);
        
        if(resultSet.first()){        
           jQuest2.setText(resultSet.getString("ques"));
        }
        if(resultSet.next()){        
           jQuest3.setText(resultSet.getString("ques"));
        }
        if(resultSet.next()){        
           jQuest4.setText(resultSet.getString("ques"));
        }
        if(resultSet.next()){        
           jQuest5.setText(resultSet.getString("ques"));
        }
        if(resultSet.next()){        
           jQuest1.setText(resultSet.getString("ques"));
        }
    
    } catch (SQLException e ) {
        JOptionPane.showMessageDialog(null, e);
    
    }
}    
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
            java.util.logging.Logger.getLogger(DisplayQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new DisplayQuestions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAnswer1;
    private javax.swing.JTextField jAnswer2;
    private javax.swing.JTextField jAnswer5;
    private javax.swing.JTextField jAnswer6;
    private javax.swing.JTextField jAnswer7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jQuest1;
    private javax.swing.JTextField jQuest2;
    private javax.swing.JTextField jQuest3;
    private javax.swing.JTextField jQuest4;
    private javax.swing.JTextField jQuest5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables

    private void closeMe() {
        setVisible(false);  
    }
}
