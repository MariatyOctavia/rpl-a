/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviemanager;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.JFrame;

/**
 *
 * @author hp
 */
public class Beranda extends javax.swing.JFrame {
    public static Login masuk = new Login ();
    public static Register daftar = new Register ();
    public static TambahFilm tambahkanFilm = new TambahFilm();
    public static Genre kategoriFilm = new Genre();
    /**
     * Creates new form Home
     */
    public Beranda() {
        initComponents();
        aturFrame(1.0,true);
        //Connection conn = ModulDB.connectDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menuMasuk = new javax.swing.JCheckBoxMenuItem();
        menuDaftar = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        tambahFilmButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menuMasuk1 = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuDaftar1 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu2.setText("Genre");

        jMenu1.setText("User");

        menuMasuk.setSelected(true);
        menuMasuk.setText("Masuk");
        menuMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMasukActionPerformed(evt);
            }
        });
        jMenu1.add(menuMasuk);

        menuDaftar.setSelected(true);
        menuDaftar.setText("Daftar");
        menuDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftarActionPerformed(evt);
            }
        });
        jMenu1.add(menuDaftar);

        jMenu5.setText("Beranda");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jLabel12.setText("Logo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        tfSearch.setText("Search");

        tambahFilmButton.setText("Tambah Film");
        tambahFilmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahFilmButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel2.setText("Copyright© Movie Manager 2017");

        jLabel11.setText("Logo");

        jLabel13.setText("gambar search");

        jMenu6.setText("Beranda");
        jMenuBar1.add(jMenu6);

        jMenu3.setText("User");

        menuMasuk1.setText("Masuk");
        menuMasuk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMasuk1ActionPerformed(evt);
            }
        });
        jMenu3.add(menuMasuk1);
        jMenu3.add(jSeparator1);

        menuDaftar1.setText("Daftar");
        menuDaftar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftar1ActionPerformed(evt);
            }
        });
        jMenu3.add(menuDaftar1);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Genre");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tambahFilmButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2))
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tambahFilmButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      private void aturFrame(double skala, boolean tengah){
          Dimension dimensi= Toolkit.getDefaultToolkit().getScreenSize();
          setSize((int)(skala*dimensi.getWidth()),(int)(skala*dimensi.getHeight()));
          if(tengah){
              setLocation((int)((dimensi.getWidth()-getWidth())/2),(int)((dimensi.getHeight()-getHeight())/2)); 
          }
      }
    
    private void menuMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMasukActionPerformed
        // TODO add your handling code here:
        /*Login formLogin = new Login();
        formLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        formLogin.setVisible(true);*/
    }//GEN-LAST:event_menuMasukActionPerformed

    private void menuDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftarActionPerformed
        // TODO add your handling code here:
      /*  Register formRegister = new Register();
        formRegister.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        formRegister.setVisible(true);*/
    }//GEN-LAST:event_menuDaftarActionPerformed

    private void menuMasuk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMasuk1ActionPerformed
  // TODO add your handling code here:

      masuk.setVisible(true);
    }//GEN-LAST:event_menuMasuk1ActionPerformed

    private void menuDaftar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftar1ActionPerformed
        // TODO add your handling code here:
        
      daftar.setVisible(true);
    }//GEN-LAST:event_menuDaftar1ActionPerformed

    private void tambahFilmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahFilmButtonActionPerformed
        // TODO add your handling code here:
        new TambahFilm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tambahFilmButtonActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        //kategoriFilm.setVisible(true);
        if(kategoriFilm.isVisible()){
            try{
                kategoriFilm.setSelected(true);
            }catch(Exception ex){
                kategoriFilm = new Genre();
                add(kategoriFilm);
                kategoriFilm.setVisible(true);
            }
        }
    }//GEN-LAST:event_jMenu4ActionPerformed

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
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JCheckBoxMenuItem menuDaftar;
    private javax.swing.JCheckBoxMenuItem menuDaftar1;
    private javax.swing.JCheckBoxMenuItem menuMasuk;
    private javax.swing.JCheckBoxMenuItem menuMasuk1;
    private javax.swing.JButton tambahFilmButton;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
