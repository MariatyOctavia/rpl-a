/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviemanager;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
        updateFilm();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tambahFilmButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabBeranda = new javax.swing.JTable();
        pilihGenre = new javax.swing.JComboBox<>();
        jbCari = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(789, 248));
        setMinimumSize(new java.awt.Dimension(789, 248));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("jLabel1");

        tfSearch.setText("Search");
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel2.setText("Copyright© Movie Manager 2017");

        jLabel11.setText("Logo");

        tambahFilmButton.setText("Tambah Film");
        tambahFilmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahFilmButtonActionPerformed(evt);
            }
        });

        jTabBeranda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Judul Fim", "Sinopsis", "gambar", "aktor", "genre", "tahun"
            }
        ));
        jTabBeranda.setMinimumSize(new java.awt.Dimension(300, 64));
        jScrollPane2.setViewportView(jTabBeranda);

        pilihGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih...", "Judul", "Sinopsis", "Genre" }));
        pilihGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihGenreActionPerformed(evt);
            }
        });

        jbCari.setText("Cari");
        jbCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCariActionPerformed(evt);
            }
        });

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
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(131, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(63, 63, 63)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(pilihGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tambahFilmButton)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahFilmButton)
                    .addComponent(pilihGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCari))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(391, 391, 391)
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
        new Login().setVisible(true);
        this.dispose();
      
    }//GEN-LAST:event_menuMasuk1ActionPerformed

    private void menuDaftar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftar1ActionPerformed
        // TODO add your handling code here:
        
      daftar.setVisible(true);
    }//GEN-LAST:event_menuDaftar1ActionPerformed

    private void tambahFilmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahFilmButtonActionPerformed

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        updateFilm();
        
        JPopupMenu menupop = new JPopupMenu();
        JMenuItem menuitem = new JMenuItem("Edit/Hapus film"); 
        menuitem.addActionListener((ActionEvent e) -> {
            if(jTabBeranda.getSelectedRow() > -1){
                int rowIdx = jTabBeranda.getSelectedRow();
                TableModel model = jTabBeranda.getModel();
                String pJudul = (String) model.getValueAt(rowIdx, 0);
                String pSinopsis = (String) model.getValueAt(rowIdx, 1);
                String pGambar= (String) model.getValueAt(rowIdx, 2);
                String pAktor = (String) model.getValueAt(rowIdx, 3);
                int pGenre = ModulDB.getGenre((String) model.getValueAt(rowIdx, 4));
                String pTahun = (String) model.getValueAt(rowIdx, 5);
                Film film = new Film(pJudul,pSinopsis,pGambar,pAktor,pGenre,pTahun);
                film.setVisible(true);//To change body of generated methods, choose Tools | Templates.
                this.dispose();
                //updateFilm();
            }
        });
        menupop.add(menuitem);
        jTabBeranda.setComponentPopupMenu(menupop);
    }//GEN-LAST:event_formWindowOpened

    
    
    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchActionPerformed

    private void pilihGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilihGenreActionPerformed

    private void jbCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCariActionPerformed
        // TODO add your handling code here:
        
        String sql = null;
        String keyword=tfSearch.getText();
        if(pilihGenre.getSelectedIndex()== 1){
            sql= "select judul, sinopsis, gambar, aktor, nama, tahun FROM film , genre WHERE genre.id_genre = film.genre and judul like '%"+keyword+"%'";
            
        }
        else if(pilihGenre.getSelectedIndex()== 2){
            sql= "select judul, sinopsis, gambar, aktor, nama, tahun FROM film , genre WHERE genre.id_genre = film.genre and sinopsis like '%"+keyword+"%'";
        }
        else if(pilihGenre.getSelectedIndex() == 3){
            sql= "select judul, sinopsis, gambar, aktor, nama, tahun FROM film , genre WHERE genre.nama like '%"+keyword+"%'and genre.id_genre = film.genre";
        }
        else{
            sql="select judul, sinopsis, gambar, aktor, nama, tahun FROM film inner join genre on film.genre = genre.id_genre where judul like"+"'%"+keyword+"%'"+"or sinopsis like "+"'%"+keyword+"%'"+"or aktor like"+"'%"+keyword+"%'"+"or nama like"+"'%"+keyword+"%'"+"or tahun like"+"'%"+keyword+"%'";
        }
            try{
            Connection conn = ModulDB.connectDB();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel)jTabBeranda.getModel();
            model.setRowCount(0);
         
            
             while(rs.next()){
              
                Object obj[] = new Object[6];
                obj[0]  = rs.getString("judul");
                obj[1]  = rs.getString("sinopsis");
                obj[2]  = rs.getString("gambar");
                obj[3]  = rs.getString("aktor");
                obj[4]  = rs.getString("nama");
                obj[5]  = rs.getString("tahun");
                
                 //btn.addActionListener(new Film(judul,sinopsis,aktor));
                 
                 
                model.addRow(obj);

               
            
            
        } 
        }catch(SQLException e) {
            System.out.println(e.getMessage());
                     }
      
        //}
    }//GEN-LAST:event_jbCariActionPerformed

    public void updateFilm(){
        
        try{
            Connection conn = ModulDB.connectDB();
            String sql= "select judul, sinopsis, gambar, aktor, nama, tahun FROM film , genre WHERE genre.id_genre = film.genre";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel)jTabBeranda.getModel();
            model.setRowCount(0);
         
            
             while(rs.next()){
              
                Object obj[] = new Object[6];
                obj[0]  = rs.getString("judul");
                obj[1]  = rs.getString("sinopsis");
                obj[2]  = rs.getString("gambar");
                obj[3]  = rs.getString("aktor");
                obj[4]  = rs.getString("nama");
                obj[5]  = rs.getString("tahun");
//                JButton btn = new JButton(judul);
//                 //btn.addActionListener(new Film(judul,sinopsis,aktor));
//                 add(btn);
                 
                model.addRow(obj);

               
            
            
        } 
        }catch(SQLException e) {
            System.out.println(e.getMessage());
                     }
        
    }
//        private void cariFilm(String keyword){
//        try{
        //String sql="SELECT judul, genre, sinopsis FROM film WHERE judul LIKE '%"+keyword+"%' OR genre LIKE '%"+keyword+"%'  OR sinopsis LIKE '%"+keyword+"%'";
//            Connection con=ModulDB.connectDB();
//            Statement stmt=con.createStatement();
//            ResultSet result=stmt.executeQuery(sql);
//            DefaultTableModel model=(DefaultTableModel)jTabBeranda.getModel();
//            model.setRowCount(0);
//            while(result.next()){
//                Vector row=new Vector();
//                row.add(result.getString("judul"));
//                row.add(result.getString("genre"));
//                row.add(result.getString("sinopsis"));
//                model.addRow(row);
//            }
//            //con.close();
//            jTabBeranda.setModel(model);
//        }
//        catch(SQLException e){
//            showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
//        }
//    }
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTabBeranda;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbCari;
    private javax.swing.JCheckBoxMenuItem menuDaftar;
    private javax.swing.JCheckBoxMenuItem menuDaftar1;
    private javax.swing.JCheckBoxMenuItem menuMasuk;
    private javax.swing.JCheckBoxMenuItem menuMasuk1;
    private javax.swing.JComboBox<String> pilihGenre;
    private javax.swing.JButton tambahFilmButton;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
