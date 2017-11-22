/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviemanager;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class EditHapusFilm extends javax.swing.JFrame {
    private File fileGambar = null;
                 private String judul;
             private String aktor;
             
//    private String judulFilm;
//    private String aktorFilm;
//    private String sinopsisFilm;
//    private File fileGambar = null;
    /**
     * Creates new form Film
     */
    public EditHapusFilm( String judulFilm, String sinopsisFilm,String gambar, String aktorFilm,int genre,String tahun) {
        initComponents();
        tambahGenre();
//        this.judulFilm= judulFilm;
//        this.aktorFilm = aktorFilm;
//        this.sinopsisFilm = sinopsisFilm;
        
        tfJudul.setText(judulFilm);
        tfSinopsis.setText(sinopsisFilm);
        tfAktor.setText(aktorFilm);
        tfGenre.setSelectedIndex(genre);
        tftahun.setText(tahun);
        this.judul =judulFilm;
        this.aktor =aktorFilm;
    }
        public void tambahGenre(){
        List <String> Genre1 = new ArrayList<String>();
        String sql = "select *from genre";
        Connection conn = ModulDB.connectDB();
        try{
             Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Genre1.add(rs.getString("nama"));
            }
        }catch(SQLException se){
                     System.out.println(se.getMessage());    
        }
        tfGenre.setModel(new DefaultComboBoxModel(Genre1.toArray()));
    }
    public int getIndexGenre(String genre){
        int id = 0;
        String sql = "select id_genre from genre where nama = ?";
        Connection conn = ModulDB.connectDB();
                try{
             PreparedStatement st = conn.prepareStatement(sql);
             st.setString(1,genre);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                id = rs.getInt("id_genre");
            }
        }catch(SQLException se){
                     System.out.println(se.getMessage());    
        }
        return id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfAktor = new javax.swing.JTextField();
        tfSinopsis = new javax.swing.JTextField();
        tfJudul = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        FilmBiasa = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tftahun = new javax.swing.JTextField();
        tfGenre = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuMasuk1 = new javax.swing.JCheckBoxMenuItem();
        menuDaftar1 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel6.setText("Copy right Movie Manager 2017");

        jLabel7.setText("_______________________________");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Judul      :");

        jLabel4.setText("Aktor");

        jLabel5.setText("Sinopsis :");

        tfAktor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAktorActionPerformed(evt);
            }
        });

        tfSinopsis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSinopsisActionPerformed(evt);
            }
        });

        tfJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJudulActionPerformed(evt);
            }
        });

        jButton1.setText("Ubah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        FilmBiasa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FilmBiasa.setText("Film");

        jLabel8.setText("________________________________________________");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel10.setText("Copyright© Movie Manager 2017");

        jLabel11.setText("Logo");

        jButton4.setText("browse");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setText("jLabel9");
        FilmBiasa.setVisible(false);

        jLabel12.setText("Gambar");

        jLabel13.setText("Genre");

        jLabel15.setText("tahun");

        tfGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--pilih genre--", "Romance", "Action", "Comedy", "Horror" }));
        tfGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGenreActionPerformed(evt);
            }
        });

        jButton3.setText("Batal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu3.setText("User");

        menuMasuk1.setSelected(true);
        menuMasuk1.setText("Masuk");
        menuMasuk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMasuk1ActionPerformed(evt);
            }
        });
        jMenu3.add(menuMasuk1);

        menuDaftar1.setSelected(true);
        menuDaftar1.setText("Daftar");
        menuDaftar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftar1ActionPerformed(evt);
            }
        });
        jMenu3.add(menuDaftar1);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Genre");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FilmBiasa)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel12))
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(tfJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jButton4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel9))
                                                .addComponent(tfSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tfAktor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tftahun, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(26, 26, 26)
                                        .addComponent(jButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel11)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(FilmBiasa))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)))
                .addGap(1, 1, 1)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAktor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tftahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(43, 43, 43)
                .addComponent(jLabel10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMasuk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMasuk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMasuk1ActionPerformed

    private void menuDaftar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDaftar1ActionPerformed

    private void tfAktorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAktorActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfAktorActionPerformed

    private void tfSinopsisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSinopsisActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfSinopsisActionPerformed

    private void tfJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJudulActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            String pathGambar = "";
        if(fileGambar != null){
            String fileName = tfJudul.getText() + "." +
                    ExtensionUtils.getExtension(fileGambar);
            String target = "images/" + fileName;
            
            try {
                Files.copy(fileGambar.toPath(), Paths.get(target) ,
                        REPLACE_EXISTING);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
            pathGambar = fileName;
        }
             boolean isSuccess = ModulDB.editFilm(tfJudul.getText(), tfSinopsis.getText(), 
                pathGambar, tfAktor.getText(),getIndexGenre((String)tfGenre.getSelectedItem()),tftahun.getText(),judul,aktor);
        System.out.println(tfGenre.getSelectedIndex());
        if(isSuccess){
           JOptionPane.showMessageDialog(this,"Film berhasil diedit n dan tersimpan di database",
                               "Film Berhasil Diedit",JOptionPane.INFORMATION_MESSAGE);
           new Beranda().setVisible(true);
           this.dispose();
       }
        else{
            JOptionPane.showMessageDialog(this,"Film gagal diedit",
                               "Error: Terjadi Kesalahan",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        boolean isSuccess = ModulDB.hapusFilm(judul,aktor);
        
        if(isSuccess){
           JOptionPane.showMessageDialog(this,"Film berhasil di hapus database",
                               "Film Berhasil di hapus",JOptionPane.INFORMATION_MESSAGE);
           new Beranda().setVisible(true);
           this.dispose();
       }
        else{
            JOptionPane.showMessageDialog(this,"Film gagal dihapus",
                               "Error: Terjadi Kesalahan",JOptionPane.ERROR_MESSAGE);
       }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);
         if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            //This is where a real application would openet the file.
            BufferedImage img = null;
            try {
                img = ImageIO.read(file);
                jLabel9.setVisible(true);
                jLabel9.setText(file.getName());
                
                fileGambar = file;
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
            } else {
            
        }
     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tfGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGenreActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Beranda().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(EditHapusFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditHapusFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditHapusFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditHapusFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Film().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FilmBiasa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JCheckBoxMenuItem menuDaftar1;
    private javax.swing.JCheckBoxMenuItem menuMasuk1;
    private javax.swing.JTextField tfAktor;
    private javax.swing.JComboBox<String> tfGenre;
    private javax.swing.JTextField tfJudul;
    private javax.swing.JTextField tfSinopsis;
    private javax.swing.JTextField tftahun;
    // End of variables declaration//GEN-END:variables
}