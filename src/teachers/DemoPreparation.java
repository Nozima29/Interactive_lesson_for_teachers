package teachers;
import com.mysql.cj.xdevapi.Client;
import java.sql.SQLException;

public class DemoPreparation extends javax.swing.JFrame {
    int subject_id;
    public DemoPreparation(){
        initComponents();           
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMath = new javax.swing.JLabel();
        jEnglish = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jBiology = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jHistory = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPhysics = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jChemistry = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jMusic = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Choose any Categories for your Lesson");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 39));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 102, 0)));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jMath.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMath.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teachers/icons8-math-50.png"))); // NOI18N
        jMath.setText("Math");
        jMath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMathMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jMath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jMath, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jEnglish.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 102, 0)));
        jEnglish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEnglishMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("English");

        javax.swing.GroupLayout jEnglishLayout = new javax.swing.GroupLayout(jEnglish);
        jEnglish.setLayout(jEnglishLayout);
        jEnglishLayout.setHorizontalGroup(
            jEnglishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEnglishLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(25, 25, 25))
        );
        jEnglishLayout.setVerticalGroup(
            jEnglishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEnglishLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jEnglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jBiology.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 102, 0)));
        jBiology.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBiologyMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Biology");

        javax.swing.GroupLayout jBiologyLayout = new javax.swing.GroupLayout(jBiology);
        jBiology.setLayout(jBiologyLayout);
        jBiologyLayout.setHorizontalGroup(
            jBiologyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jBiologyLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(25, 25, 25))
        );
        jBiologyLayout.setVerticalGroup(
            jBiologyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jBiologyLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jBiology, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jHistory.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 102, 0)));
        jHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHistoryMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("History");

        javax.swing.GroupLayout jHistoryLayout = new javax.swing.GroupLayout(jHistory);
        jHistory.setLayout(jHistoryLayout);
        jHistoryLayout.setHorizontalGroup(
            jHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jHistoryLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(25, 25, 25))
        );
        jHistoryLayout.setVerticalGroup(
            jHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jHistoryLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel1.add(jHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        jPhysics.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 102, 0)));
        jPhysics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPhysicsMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Physics");

        javax.swing.GroupLayout jPhysicsLayout = new javax.swing.GroupLayout(jPhysics);
        jPhysics.setLayout(jPhysicsLayout);
        jPhysicsLayout.setHorizontalGroup(
            jPhysicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPhysicsLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(25, 25, 25))
        );
        jPhysicsLayout.setVerticalGroup(
            jPhysicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPhysicsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jPhysics, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jChemistry.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 102, 0)));
        jChemistry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jChemistryMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Chemistry");

        javax.swing.GroupLayout jChemistryLayout = new javax.swing.GroupLayout(jChemistry);
        jChemistry.setLayout(jChemistryLayout);
        jChemistryLayout.setHorizontalGroup(
            jChemistryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jChemistryLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jChemistryLayout.setVerticalGroup(
            jChemistryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jChemistryLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jChemistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 110, -1));

        jMusic.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 102, 0)));
        jMusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMusicMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Music");

        javax.swing.GroupLayout jMusicLayout = new javax.swing.GroupLayout(jMusic);
        jMusic.setLayout(jMusicLayout);
        jMusicLayout.setHorizontalGroup(
            jMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMusicLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jMusicLayout.setVerticalGroup(
            jMusicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMusicLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(jMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 110, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        
    }//GEN-LAST:event_jPanel2MousePressed

    private void jEnglishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEnglishMouseClicked
       subject_id = 1;
       try {
            new DisplayQuestions(subject_id).setVisible(true);
        } catch (SQLException ex) {
            ex.getCause();
        }
       closeMe();
        
        
    }//GEN-LAST:event_jEnglishMouseClicked

    private void jBiologyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBiologyMouseClicked
        subject_id = 4;
        try {
            new DisplayQuestions(subject_id).setVisible(true);
        } catch (SQLException ex) {
            ex.getCause();
        }
        closeMe();
    }//GEN-LAST:event_jBiologyMouseClicked

    private void jHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHistoryMouseClicked
        subject_id = 3;
        try {
            new DisplayQuestions(subject_id).setVisible(true);
        } catch (SQLException ex) {
            ex.getCause();
        }
        
        closeMe();
    }//GEN-LAST:event_jHistoryMouseClicked

    private void jPhysicsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPhysicsMouseClicked
        subject_id = 6;
        try {
            new DisplayQuestions(subject_id).setVisible(true);
        } catch (SQLException ex) {
            ex.getCause();
        }
        closeMe();        
    }//GEN-LAST:event_jPhysicsMouseClicked

    private void jChemistryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jChemistryMouseClicked
        subject_id = 7;
        try {
            new DisplayQuestions(subject_id).setVisible(true);
        } catch (SQLException ex) {
            ex.getCause();
        }
        
        closeMe();
    }//GEN-LAST:event_jChemistryMouseClicked

    private void jMusicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMusicMouseClicked
        subject_id = 5;
        try {
            new DisplayQuestions(subject_id).setVisible(true);
        } catch (SQLException ex) {
            ex.getCause();
        }
        
        closeMe();
    }//GEN-LAST:event_jMusicMouseClicked

    private void jMathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMathMouseClicked
        subject_id = 2;
        try {
            new DisplayQuestions(subject_id).setVisible(true);
        } catch (SQLException ex) {
            ex.getCause();
        }
        closeMe();
    }//GEN-LAST:event_jMathMouseClicked
    private void closeMe(){
    setVisible(false);
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
            java.util.logging.Logger.getLogger(DemoPreparation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoPreparation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoPreparation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoPreparation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoPreparation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jBiology;
    private javax.swing.JPanel jChemistry;
    private javax.swing.JPanel jEnglish;
    private javax.swing.JPanel jHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jMath;
    private javax.swing.JPanel jMusic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPhysics;
    // End of variables declaration//GEN-END:variables
}
