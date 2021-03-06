/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviemanager;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class InfoFilm extends javax.swing.JFrame {
    private Film film;
    private String fileVideo = "";
    private String nama = "";
    
    private Beranda.STATE_LOGIN stateLogin;
    /**
     * Creates new form InfoFilm
     */
    public InfoFilm() {
        initComponents();

    }

    InfoFilm(Film newFilm,Beranda.STATE_LOGIN stateLogin, String nama) {
        this();
        this.film = newFilm;
        double rat = ModulDB.readRating(film.getId_film());
        this.lblRating.setText(""+rat);
        this.stateLogin= stateLogin;
        this.nama = nama;
            switch(stateLogin){
            case ADMIN: bntng1.setVisible(false);
                        bntng2.setVisible(false);
                        bntng3.setVisible(false);
                        bntng4.setVisible(false);
                        bntng5.setVisible(false);
                        break;
            case USER:  bntng1.setVisible(true);
                        bntng2.setVisible(true);
                        bntng3.setVisible(true);
                        bntng4.setVisible(true);
                        bntng5.setVisible(true);
                        break;
            case NONE:  bntng1.setVisible(false);
                        bntng2.setVisible(false);
                        bntng3.setVisible(false);
                        bntng4.setVisible(false);
                        bntng5.setVisible(false);
                        break;
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

        txtGambar = new javax.swing.JLabel();
        Judul = new javax.swing.JLabel();
        tfJudul = new javax.swing.JLabel();
        tfAktor = new javax.swing.JLabel();
        Judul1 = new javax.swing.JLabel();
        Judul2 = new javax.swing.JLabel();
        tfGenre = new javax.swing.JLabel();
        Tahun = new javax.swing.JLabel();
        tfTahun = new javax.swing.JLabel();
        Rating = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfSinopsis = new javax.swing.JTextArea();
        bntng1 = new javax.swing.JButton();
        bntng2 = new javax.swing.JButton();
        bntng3 = new javax.swing.JButton();
        bntng4 = new javax.swing.JButton();
        bntng5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblRating = new javax.swing.JLabel();
        tfGenre2 = new javax.swing.JLabel();
        btnTrailer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtGambar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Judul.setText("Judul :");

        tfJudul.setText("ini thor");

        tfAktor.setText("ryan");

        Judul1.setText("Aktor :");

        Judul2.setText("Genre :");

        tfGenre.setText("Romance ");

        Tahun.setText("Tahun :");

        tfTahun.setText("2019");

        Rating.setText("Rating :");

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfSinopsis.setEditable(false);
        tfSinopsis.setColumns(20);
        tfSinopsis.setLineWrap(true);
        tfSinopsis.setRows(5);
        tfSinopsis.setWrapStyleWord(true);
        jScrollPane1.setViewportView(tfSinopsis);

        bntng1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintanggelep.png"))); // NOI18N
        bntng1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntng1ActionPerformed(evt);
            }
        });

        bntng2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintanggelep.png"))); // NOI18N
        bntng2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntng2ActionPerformed(evt);
            }
        });

        bntng3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintanggelep.png"))); // NOI18N
        bntng3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntng3ActionPerformed(evt);
            }
        });

        bntng4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintanggelep.png"))); // NOI18N
        bntng4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntng4ActionPerformed(evt);
            }
        });

        bntng5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintanggelep.png"))); // NOI18N
        bntng5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntng5ActionPerformed(evt);
            }
        });

        lblRating.setText("dssdjsdj");

        tfGenre2.setText("Romance ");

        btnTrailer.setText("Open Trailer");
        btnTrailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrailerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Judul, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Judul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Judul2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAktor, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tahun)
                                .addGap(18, 18, 18)
                                .addComponent(tfTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Rating)
                                .addGap(10, 10, 10)
                                .addComponent(lblRating, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfGenre2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(6, 6, 6)
                                        .addComponent(bntng1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bntng2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bntng3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bntng4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bntng5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Judul)
                    .addComponent(tfJudul))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfAktor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Judul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfGenre2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfGenre)
                        .addComponent(Judul2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tahun)
                    .addComponent(tfTahun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Rating)
                        .addComponent(jLabel1))
                    .addComponent(bntng5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntng4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntng3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntng2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntng1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTrailer)
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setData();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Beranda(stateLogin, nama).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bntng1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntng1ActionPerformed
        // TODO add your handling code here:
        boolean isSuccess = ModulDB.createRating(1,film.getId_film(),User.getId_akun());
        if(isSuccess){
                bntng1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png")));
        }
        else{
            JOptionPane.showMessageDialog(this,"rating gagal ditambahkan",
                "Error: Terjadi Kesalahan",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bntng1ActionPerformed

    private void bntng2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntng2ActionPerformed
        // TODO add your handling code here:
        boolean isSuccess = ModulDB.createRating(2,film.getId_film(),User.getId_akun());
            if(isSuccess){
                bntng1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png"))); 
                bntng2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png")));
            }
            else{
            JOptionPane.showMessageDialog(this,"rating gagal ditambahkan",
                "Error: Terjadi Kesalahan",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bntng2ActionPerformed

    private void bntng3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntng3ActionPerformed
        // TODO add your handling code here:
        boolean isSuccess = ModulDB.createRating(3,film.getId_film(),User.getId_akun());
            if(isSuccess){
                bntng1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png"))); 
                bntng2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png")));
                bntng3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png"))); 
            }
            else{
            JOptionPane.showMessageDialog(this,"rating gagal ditambahkan",
                "Error: Terjadi Kesalahan",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bntng3ActionPerformed

    private void bntng4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntng4ActionPerformed
        // TODO add your handling code here:
         boolean isSuccess = ModulDB.createRating(4,film.getId_film(),User.getId_akun());
            if(isSuccess){
                bntng1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png"))); 
                bntng2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png"))); 
                bntng3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png")));
                bntng4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png"))); 
            }
            else{
            JOptionPane.showMessageDialog(this,"rating gagal ditambahkan",
                "Error: Terjadi Kesalahan",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bntng4ActionPerformed

    private void bntng5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntng5ActionPerformed
        // TODO add your handling code here:
         boolean isSuccess = ModulDB.createRating(5,film.getId_film(),User.getId_akun());
            if(isSuccess){
                bntng1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png"))); 
                bntng2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png"))); 
                bntng3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png")));
                bntng4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png"))); 
                bntng5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanager/bintang.png"))); 

            }
            else{
            JOptionPane.showMessageDialog(this,"rating gagal ditambahkan",
                "Error: Terjadi Kesalahan",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bntng5ActionPerformed

    private void btnTrailerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrailerActionPerformed
        // TODO add your handling code here:
        try{
            Desktop.getDesktop().open(new File(fileVideo));
        }catch(IOException ex){
           System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnTrailerActionPerformed
    private void setData() {
        String url = "images/" + film.getGambar();
        BufferedImage img = null;
                try {
                    img = ImageIO.read(new File(url));
                } catch (IOException ex) {
                    Logger.getLogger(Beranda.class.getName()).log(Level.SEVERE, null, ex);
                }
        fileVideo = "trailer/" +film.getTrailer();
           
        Image scaled = img.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaled);
        tfJudul.setText(film.getJudul());
        tfAktor.setText(film.getAktor());
        tfGenre.setText(ModulDB.ambilNamaGenre(film.getGenre()));
        tfGenre2.setText(ModulDB.ambilNamaGenre(film.getGenre2()));
        tfTahun.setText(Integer.toString(film.getTahun()));
        txtGambar.setIcon(icon);
        tfSinopsis.setText(film.getSinopsis());
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
            java.util.logging.Logger.getLogger(InfoFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoFilm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Judul;
    private javax.swing.JLabel Judul1;
    private javax.swing.JLabel Judul2;
    private javax.swing.JLabel Rating;
    private javax.swing.JLabel Tahun;
    private javax.swing.JButton bntng1;
    private javax.swing.JButton bntng2;
    private javax.swing.JButton bntng3;
    private javax.swing.JButton bntng4;
    private javax.swing.JButton bntng5;
    private javax.swing.JButton btnTrailer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel tfAktor;
    private javax.swing.JLabel tfGenre;
    private javax.swing.JLabel tfGenre2;
    private javax.swing.JLabel tfJudul;
    private javax.swing.JTextArea tfSinopsis;
    private javax.swing.JLabel tfTahun;
    private javax.swing.JLabel txtGambar;
    // End of variables declaration//GEN-END:variables
}
