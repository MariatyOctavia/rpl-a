/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviemanager;


import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;

/**
 *
 * @author hp
 */
public class Beranda extends javax.swing.JFrame {
       private ArrayList<Film> listFilm = new ArrayList<>();

       public static enum STATE_LOGIN {USER,ADMIN,NONE};
       private STATE_LOGIN stateLogin = STATE_LOGIN.NONE;
       private String nama;
    /**
     * Creates new form BerandaUser
     */
    public Beranda(STATE_LOGIN stateLogin, String nama) {
        initComponents();
        this.stateLogin= stateLogin;
        jBack.setVisible(false);
        this.nama = nama;
        
        switch(stateLogin){
            case ADMIN: btTambahFilm.setVisible(true);
                        btTambahGenre.setVisible(true);
                        btLogout.setVisible(true);
                        menuUser.setVisible(false);
                        welcome.setText("Selamat datang " +nama +" :)");
                        break;
            case USER:  btTambahFilm.setVisible(false);
                        btTambahGenre.setVisible(false);
                        btLogout.setVisible(true);
                        menuUser.setVisible(false);
                        welcome.setText("Selamat datang " +nama);
                        break;
            case NONE:  menuUser.setVisible(true);
                        welcome.setText("Selamat datang " +nama);
                        break;
                        
        }
        pnlFilm.setLayout(new GridLayout(0,5));
        //this.getContentPane().setBackground(Color.WHITE);// untuk ser warna background
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfSearch = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btTambahFilm = new javax.swing.JButton();
        pilihGenre = new javax.swing.JComboBox<>();
        btTambahGenre = new javax.swing.JButton();
        pnlFilm = new javax.swing.JPanel();
        jBack = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        btLogout = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        menuMasuk1 = new javax.swing.JCheckBoxMenuItem();
        menuDaftar1 = new javax.swing.JCheckBoxMenuItem();
        menuGenre = new javax.swing.JMenu();
        menuRomance = new javax.swing.JMenuItem();
        menuHoror = new javax.swing.JMenuItem();
        menuAction = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });

        jLabel11.setText("Logo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel2.setText("Copyright© Movie Manager 2017");

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btTambahFilm.setText("Tambah Film");
        btTambahFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahFilmActionPerformed(evt);
            }
        });

        pilihGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih...", "Judul", "Sinopsis", "Genre" }));
        pilihGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihGenreActionPerformed(evt);
            }
        });

        btTambahGenre.setText("Tambah Genre");
        btTambahGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahGenreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFilmLayout = new javax.swing.GroupLayout(pnlFilm);
        pnlFilm.setLayout(pnlFilmLayout);
        pnlFilmLayout.setHorizontalGroup(
            pnlFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlFilmLayout.setVerticalGroup(
            pnlFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });

        welcome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        welcome.setText("Selamat datang, ");

        btLogout.setText("Logout");
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });

        menuUser.setText("User");

        menuMasuk1.setSelected(true);
        menuMasuk1.setText("Masuk");
        menuMasuk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMasuk1ActionPerformed(evt);
            }
        });
        menuUser.add(menuMasuk1);

        menuDaftar1.setSelected(true);
        menuDaftar1.setText("Daftar");
        menuDaftar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftar1ActionPerformed(evt);
            }
        });
        menuUser.add(menuDaftar1);

        jMenuBar1.add(menuUser);

        menuGenre.setText("Genre");

        menuRomance.setText("Romance");
        menuRomance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRomanceActionPerformed(evt);
            }
        });
        menuGenre.add(menuRomance);

        menuHoror.setText("Horor");
        menuHoror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHororActionPerformed(evt);
            }
        });
        menuGenre.add(menuHoror);

        menuAction.setText("Action");
        menuAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionActionPerformed(evt);
            }
        });
        menuGenre.add(menuAction);

        jMenuBar1.add(menuGenre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(welcome)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pilihGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBack)
                        .addGap(27, 27, 27)
                        .addComponent(btLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btTambahFilm)
                                .addGap(57, 57, 57)
                                .addComponent(btTambahGenre))
                            .addComponent(pnlFilm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel11))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pilihGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)
                                .addComponent(jBack))
                            .addGap(3, 3, 3)))
                    .addComponent(btLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTambahFilm)
                    .addComponent(btTambahGenre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        btTambahFilm.setVisible(false);
        btTambahGenre.setVisible(false);
        //pnlFilm.setBackground(Color.white);
        btLogout.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMasuk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMasuk1ActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuMasuk1ActionPerformed

    private void menuDaftar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftar1ActionPerformed
        // TODO add your handling code here:
        new Register().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuDaftar1ActionPerformed

    private void menuRomanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRomanceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_menuRomanceActionPerformed

    private void menuHororActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHororActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuHororActionPerformed

    private void menuActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_menuActionActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        updateFilm();
        switch(stateLogin){
            case ADMIN: btTambahFilm.setVisible(true);
                        btTambahGenre.setVisible(true);
            case USER:  btLogout.setVisible(true);
                        break;
            default:    break;
        }
    }//GEN-LAST:event_formWindowOpened

    private void pilihGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihGenreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jBack.setVisible(true);
        String sql = null;
        String keyword=tfSearch.getText();
        if(pilihGenre.getSelectedIndex()== 1){
            sql= "select * FROM film , genre WHERE genre.id_genre = film.genre and judul like '%"+keyword+"%'";
            
        }
        else if(pilihGenre.getSelectedIndex()== 2){
            sql= "select * FROM film , genre WHERE genre.id_genre = film.genre and sinopsis like '%"+keyword+"%'";
        }
        else if(pilihGenre.getSelectedIndex() == 3){
            sql= "select * FROM film , genre "
                    + "WHERE genre.nama like '%"+keyword+"%' and genre.id_genre = film.genre "
                    + "or genre.nama like '%"+keyword+"%' and genre.id_genre = film.genre2";
        }
        else{
            sql="select * FROM film inner join genre on film.genre = genre.id_genre where judul like"+"'%"+keyword+"%'"+"or sinopsis like "+"'%"+keyword+"%'"+"or aktor like"+"'%"+keyword+"%'"+"or nama like"+"'%"+keyword+"%'"+"or tahun like"+"'%"+keyword+"%'";
        }
        listFilm.clear();
        pnlFilm.removeAll();
        listFilm = ModulDB.searchFilm(sql);
        
        GridBagConstraints gbcPnlFilm = new GridBagConstraints();
        gbcPnlFilm.insets = new Insets(0,0,0,0);
        
        if(listFilm != null){
            for(Film f : listFilm){
                JPanel panel = new JPanel();
                panel.setMinimumSize(new Dimension(100,170));
                panel.setPreferredSize(new Dimension(100,180));
                
                GridBagLayout gblPnlFilm = new GridBagLayout();
                panel.setLayout(gblPnlFilm);
                
                String url = "images/" + f.getGambar();
                final Film newFilm = f;
                BufferedImage img = null;
                System.out.println(url);
                try {
                    img = ImageIO.read(new File(url));
                } catch (IOException ex) {
                    Logger.getLogger(Beranda.class.getName()).log(Level.SEVERE, null, ex);
                }
                Image scaled = img.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
                JLabel newLabel = new JLabel();
                newLabel.setPreferredSize(new Dimension(100,200));
                newLabel.setText(f.getJudul() + " (" + Integer.toString(f.getTahun()) + ")");
                newLabel.setIcon(new ImageIcon(scaled));
                newLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
                newLabel.setHorizontalTextPosition(SwingConstants.CENTER);
                newLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                
                newLabel.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if(e.getButton() == MouseEvent.BUTTON1){
                            InfoFilm info = new InfoFilm(newFilm,stateLogin, nama);
                            info.setVisible(true);
                            Beranda.this.dispose();
                            updateFilm();
                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                    }
                });
                pnlFilm.add(newLabel,gbcPnlFilm);
                
                JLabel newLabel2 = new JLabel();
                newLabel2.setText(ModulDB.ambilNamaGenre(f.getGenre())+","+ModulDB.ambilNamaGenre(f.getGenre2()));
                newLabel2.setHorizontalTextPosition(SwingConstants.RIGHT);
                
                gbcPnlFilm.fill = GridBagConstraints.BOTH;
                gbcPnlFilm.gridx = 0;
                gbcPnlFilm.gridy = 0;
                gbcPnlFilm.gridheight = 1;
                gbcPnlFilm.gridwidth = 1;
                gbcPnlFilm.weightx = 1;
                gbcPnlFilm.weighty = 1;
                panel.add(newLabel,gbcPnlFilm);

                gbcPnlFilm.fill = GridBagConstraints.BOTH;
                gbcPnlFilm.gridx = 0;
                gbcPnlFilm.gridy = 1;
                gbcPnlFilm.gridheight = 1;
                gbcPnlFilm.gridwidth = 1;
                gbcPnlFilm.weightx = 1;
                gbcPnlFilm.weighty = 1;
                
                panel.add(newLabel2,gbcPnlFilm);
                
                JPopupMenu menupop = new JPopupMenu();
                JMenuItem menuitem = new JMenuItem("Edit/Hapus film"); 
         
                menuitem.addActionListener((ActionEvent e) -> {
                        EditHapusFilm edits = new EditHapusFilm(this,true,f.getJudul(),f.getSinopsis(),
                        f.getGambar(),f.getAktor(),f.getGenre(),f.getGenre2(),Integer.toString(f.getTahun()),f.getTrailer());
                        edits.setVisible(true);//To change body of generated methods, choose Tools | Templates.
                        updateFilm();
                });
                menupop.add(menuitem);
                if(stateLogin == STATE_LOGIN.ADMIN)panel.setComponentPopupMenu(menupop);              
                pnlFilm.add(panel);
            }
        
                pnlFilm.revalidate();
                pnlFilm.repaint();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        // TODO add your handling code here:
        updateFilm();
        jBack.setVisible(false);
    }//GEN-LAST:event_jBackActionPerformed

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchActionPerformed

    private void btTambahGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahGenreActionPerformed
        // TODO add your handling code here:
        TambahGenre tambahGenre = new TambahGenre(this, true);
        tambahGenre.setVisible(true);
        updateFilm();
    }//GEN-LAST:event_btTambahGenreActionPerformed

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        // TODO add your handling code here:
        switch(stateLogin){
            case ADMIN: updateFilm();
            case USER:  btTambahFilm.setVisible(false);
                        btTambahGenre.setVisible(false);
                        btLogout.setVisible(false);
                        menuUser.setVisible(true);
                        stateLogin = STATE_LOGIN.NONE;
                        welcome.setText("Selamat datang Guest");
                        break;
            default:    break;
        }
    }//GEN-LAST:event_btLogoutActionPerformed

    private void btTambahFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahFilmActionPerformed

        TambahFilm tambah = new TambahFilm(this, true);
        tambah.setVisible(true);
        updateFilm();
    }//GEN-LAST:event_btTambahFilmActionPerformed

    /**
     * @param args the command line arguments
     */
    
        public void updateFilm(){
        listFilm.clear();
        pnlFilm.removeAll();
        listFilm = ModulDB.readFilm();
        GridBagConstraints gbcPnlFilm = new GridBagConstraints();
        gbcPnlFilm.insets = new Insets(0,0,0,0);
        if(listFilm != null){
            int x = 0;
            int y = 0;
            for(Film f : listFilm){
                JPanel panel = new JPanel();
                panel.setMinimumSize(new Dimension(100,170));
                panel.setPreferredSize(new Dimension(100,180));
                
                GridBagLayout gblPnlFilm = new GridBagLayout();
                panel.setLayout(gblPnlFilm);
                
                String url = "images/" + f.getGambar();
                final Film newFilm = f;
                BufferedImage img = null;
                System.out.println(url);
                try {
                    img = ImageIO.read(new File(url));
                } catch (IOException ex) {
                    Logger.getLogger(Beranda.class.getName()).log(Level.SEVERE, null, ex);
                }
                Image scaled = img.getScaledInstance(100, 150, Image.SCALE_SMOOTH);
                JLabel newLabel = new JLabel();
                newLabel.setPreferredSize(new Dimension(100,200));
                newLabel.setText(f.getJudul() + " (" + Integer.toString(f.getTahun()) + ")");
                newLabel.setIcon(new ImageIcon(scaled));
                newLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
                newLabel.setHorizontalTextPosition(SwingConstants.CENTER);
                newLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                
                newLabel.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if(e.getButton() == MouseEvent.BUTTON1){
                            InfoFilm info = new InfoFilm(newFilm,stateLogin, nama);
                            info.setVisible(true);
                            Beranda.this.dispose();
                            updateFilm();
                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                    }
                });
                pnlFilm.add(newLabel,gbcPnlFilm);
                
                JLabel newLabel2 = new JLabel();
                newLabel2.setText(ModulDB.ambilNamaGenre(f.getGenre())+","+ModulDB.ambilNamaGenre(f.getGenre2()));
                newLabel2.setHorizontalTextPosition(SwingConstants.RIGHT);
                
                gbcPnlFilm.fill = GridBagConstraints.BOTH;
                gbcPnlFilm.gridx = 0;
                gbcPnlFilm.gridy = 0;
                gbcPnlFilm.gridheight = 1;
                gbcPnlFilm.gridwidth = 1;
                gbcPnlFilm.weightx = 1;
                gbcPnlFilm.weighty = 1;
                panel.add(newLabel,gbcPnlFilm);

                gbcPnlFilm.fill = GridBagConstraints.BOTH;
                gbcPnlFilm.gridx = 0;
                gbcPnlFilm.gridy = 1;
                gbcPnlFilm.gridheight = 1;
                gbcPnlFilm.gridwidth = 1;
                gbcPnlFilm.weightx = 1;
                gbcPnlFilm.weighty = 1;
                
                panel.add(newLabel2,gbcPnlFilm);
                
                JPopupMenu menupop = new JPopupMenu();
                JMenuItem menuitem = new JMenuItem("Edit/Hapus film"); 
         
                menuitem.addActionListener((ActionEvent e) -> {
                        EditHapusFilm edits = new EditHapusFilm(this,true,f.getJudul(),f.getSinopsis(),
                        f.getGambar(),f.getAktor(),f.getGenre(),f.getGenre2(),Integer.toString(f.getTahun()),f.getTrailer());
                        edits.setVisible(true);//To change body of generated methods, choose Tools | Templates.
                        updateFilm();
                });
                menupop.add(menuitem);
                if(stateLogin == STATE_LOGIN.ADMIN)panel.setComponentPopupMenu(menupop);              
                pnlFilm.add(panel);
            }
        
                pnlFilm.revalidate();
                pnlFilm.repaint();
        }
    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
              Beranda b = new Beranda(STATE_LOGIN.NONE, "Guest");
              b.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btTambahFilm;
    private javax.swing.JButton btTambahGenre;
    private javax.swing.JButton jBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAction;
    private javax.swing.JCheckBoxMenuItem menuDaftar1;
    private javax.swing.JMenu menuGenre;
    private javax.swing.JMenuItem menuHoror;
    private javax.swing.JCheckBoxMenuItem menuMasuk1;
    private javax.swing.JMenuItem menuRomance;
    private javax.swing.JMenu menuUser;
    private javax.swing.JComboBox<String> pilihGenre;
    private javax.swing.JPanel pnlFilm;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
