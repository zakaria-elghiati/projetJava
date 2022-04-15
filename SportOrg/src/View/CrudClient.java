package View;

import Model.ConnexionDb;
import Model.QueryDataBase;
import Model.ResultSetTableModel;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;


public class CrudClient extends javax.swing.JFrame {

    /**
     * Creates new form Crud_Terrain
     */
    println("erreur");
    ResultSet rs;
    QueryDataBase database;

    public CrudClient() {

        database = new QueryDataBase(new ConnexionDb().HOST_DB, new ConnexionDb().USERNAME_DB, new ConnexionDb().PASSWORD_DB, new ConnexionDb().IPHOST, new ConnexionDb().PORT);
        initComponents();
        table();
    }

    public void table() {
        String t[] = {"IdClient", "Nom", "Prenom", "NumTelephone"};
        rs = database.querySelect(t, "Client");
        tableClient.setModel( new ResultSetTableModel(rs));
        
    }

    void actualiser() {
        txtidclient.setText("");
        txtnomclient.setText("");
        txtprenomclient.setText("");
        txttelephone.setText("");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClient = new javax.swing.JTable();
        ReadClient = new javax.swing.JButton();
        UpdateClient = new javax.swing.JButton();
        DeleteClient = new javax.swing.JButton();
        CreateClient = new javax.swing.JButton();
        txtnomclient = new javax.swing.JTextField();
        txttelephone = new javax.swing.JTextField();
        txtidclient = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtprenomclient = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setForeground(new java.awt.Color(0, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_Client", "Nom", "Prenom", "Telephone"
            }
        ));
        jScrollPane1.setViewportView(tableClient);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 510, 140));

        ReadClient.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ReadClient.setText("Read");
        ReadClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReadClientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReadClientMouseExited(evt);
            }
        });
        ReadClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadClientActionPerformed(evt);
            }
        });
        jPanel1.add(ReadClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        UpdateClient.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UpdateClient.setText("Update");
        UpdateClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateClientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateClientMouseExited(evt);
            }
        });
        jPanel1.add(UpdateClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        DeleteClient.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteClient.setText("Delete");
        DeleteClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteClientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteClientMouseExited(evt);
            }
        });
        DeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteClientActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        CreateClient.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CreateClient.setText("Create");
        CreateClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreateClientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreateClientMouseExited(evt);
            }
        });
        CreateClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateClientActionPerformed(evt);
            }
        });
        jPanel1.add(CreateClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        jPanel1.add(txtnomclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 160, 40));
        jPanel1.add(txttelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 160, 40));
        jPanel1.add(txtidclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 320, 160, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Telephone:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 140, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nom :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 140, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id_Client :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 140, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id_Client", "Nom", "Prenom", "Telephone", " " }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 170, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Recherche par categorie :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 50, 230, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Recheche par condition :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 220, 30));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 112, 170, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Return");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 200, 100, 30));
        jPanel1.add(txtprenomclient, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 160, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prenom:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 140, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Image2.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, 1290, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReadClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReadClientActionPerformed

    private void DeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteClientActionPerformed
        // TODO add your handling code her
    }//GEN-LAST:event_DeleteClientActionPerformed

    private void CreateClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateClientMouseEntered
        CreateClient.setBackground(new Color(2, 121, 215));
        CreateClient.setForeground(Color.black);
    }//GEN-LAST:event_CreateClientMouseEntered

    private void CreateClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateClientMouseExited
        CreateClient.setBackground(Color.white);
        CreateClient.setForeground(Color.black);
    }//GEN-LAST:event_CreateClientMouseExited

    private void ReadClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReadClientMouseEntered
        ReadClient.setBackground(new Color(2, 121, 215));
        ReadClient.setForeground(Color.black);
    }//GEN-LAST:event_ReadClientMouseEntered

    private void ReadClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReadClientMouseExited
        ReadClient.setBackground(Color.white);
        ReadClient.setForeground(Color.black);
    }//GEN-LAST:event_ReadClientMouseExited

    private void UpdateClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateClientMouseEntered
        UpdateClient.setBackground(new Color(2, 121, 215));
        UpdateClient.setForeground(Color.black);
    }//GEN-LAST:event_UpdateClientMouseEntered

    private void UpdateClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateClientMouseExited
        UpdateClient.setBackground(Color.white);
        UpdateClient.setForeground(Color.black);
    }//GEN-LAST:event_UpdateClientMouseExited

    private void DeleteClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteClientMouseEntered
        DeleteClient.setBackground(new Color(2, 121, 215));
        DeleteClient.setForeground(Color.black);
    }//GEN-LAST:event_DeleteClientMouseEntered

    private void DeleteClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteClientMouseExited
        DeleteClient.setBackground(Color.white);
        DeleteClient.setForeground(Color.black);
    }//GEN-LAST:event_DeleteClientMouseExited

    private void CreateClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateClientActionPerformed
        if (txtidclient.getText().equals("") || txtnomclient.getText().equals("") || txtprenomclient.getText().equals("")
                || txttelephone.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SVP entrer les informations complete", "Message d'erreur", JOptionPane.ERROR_MESSAGE);
        } else {
            String[] colon = {"IdClient", "Nom", "Prenom", "NumTelephone"};
            String[] inf = {txtidclient.getText(), txtnomclient.getText(), txtprenomclient.getText(), txttelephone.getText()};
            System.out.println(database.queryInsert("Client", colon, inf));
            actualiser();
        }
    }//GEN-LAST:event_CreateClientActionPerformed

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
            java.util.logging.Logger.getLogger(CrudClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrudClient crudClient = new CrudClient();
                crudClient.setVisible(true);
                crudClient.setTitle("Gestion des clients");
                crudClient.setLocationRelativeTo(null);
                crudClient.setSize(1070, 630);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateClient;
    private javax.swing.JButton DeleteClient;
    private javax.swing.JButton ReadClient;
    private javax.swing.JButton UpdateClient;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable tableClient;
    private javax.swing.JTextField txtidclient;
    private javax.swing.JTextField txtnomclient;
    private javax.swing.JTextField txtprenomclient;
    private javax.swing.JTextField txttelephone;
    // End of variables declaration//GEN-END:variables
}
