package View;

import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author zakariae
 */
public class InscriptionReussi extends javax.swing.JFrame {

    /**
     * Creates new form insReuss
     */
    public InscriptionReussi() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cliquez = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,180));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\zakariae\\Pictures\\RASSS.jpg")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 24, -1, 99));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("L'inscription a été par succés");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 141, 328, 39));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Bienvenue sur SportOrg");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 204, 248, -1));

        jLabel4.setText("Reserver un terrain pour votre Match ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 230, -1, -1));

        jLabel5.setText("Profiter du jeu dans les meilleurs milieux");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 252, -1, -1));

        cliquez.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cliquez.setText("Cliquez ici");
        cliquez.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cliquezMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cliquezMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cliquezMouseExited(evt);
            }
        });
        jPanel2.add(cliquez, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 280, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 340, 350));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Image1.jpeg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cliquezMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliquezMouseClicked
        Acceuil acceuil = new Acceuil();
        acceuil.setVisible(true);
        acceuil.setLocationRelativeTo(null);
        acceuil.setTitle("SportOrg");
        this.dispose();
    }//GEN-LAST:event_cliquezMouseClicked

    private void cliquezMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliquezMouseEntered
        cliquez.setForeground(Color.red);
    }//GEN-LAST:event_cliquezMouseEntered

    private void cliquezMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cliquezMouseExited
        cliquez.setForeground(Color.black);
    }//GEN-LAST:event_cliquezMouseExited

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
            java.util.logging.Logger.getLogger(InscriptionReussi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscriptionReussi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscriptionReussi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscriptionReussi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InscriptionReussi inscriptionReussi = new InscriptionReussi();
                inscriptionReussi.setVisible(true);
                inscriptionReussi.setTitle("Inscription a éte validé");
                inscriptionReussi.setLocationRelativeTo(null);
                inscriptionReussi.setSize(1030, 610);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cliquez;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
