/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviemanager;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author user
 */
public class TambahGenre extends javax.swing.JDialog {

    /**
     * Creates new form TambahGenre2
     */
    public TambahGenre(java.awt.Frame parent, boolean modal) {
        super(parent, true);
        
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

        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuMasuk1 = new javax.swing.JCheckBoxMenuItem();
        menuDaftar1 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabGenre = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        tfTambah = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        menuMasuk2 = new javax.swing.JCheckBoxMenuItem();
        menuDaftar2 = new javax.swing.JCheckBoxMenuItem();
        jMenu6 = new javax.swing.JMenu();

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Genre Film");

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Genre");

        jLabel11.setText("Logo");

        jTabGenre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Daftar Genre"
            }
        ));
        jTabGenre.setMinimumSize(new java.awt.Dimension(300, 64));
        jScrollPane2.setViewportView(jTabGenre);

        jButton1.setText("Tambah Genre");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTambahActionPerformed(evt);
            }
        });

        jButton2.setText("Batal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jMenu5.setText("User");

        menuMasuk2.setSelected(true);
        menuMasuk2.setText("Masuk");
        menuMasuk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMasuk2ActionPerformed(evt);
            }
        });
        jMenu5.add(menuMasuk2);

        menuDaftar2.setSelected(true);
        menuDaftar2.setText("Daftar");
        menuDaftar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDaftar2ActionPerformed(evt);
            }
        });
        jMenu5.add(menuDaftar2);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Genre");
        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel10))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(113, 113, 113)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2)
                            .addGap(41, 41, 41)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel11)
                    .addGap(20, 20, 20)
                    .addComponent(jLabel10)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMasuk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMasuk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMasuk1ActionPerformed

    private void menuDaftar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDaftar1ActionPerformed

    private void menuMasuk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMasuk2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMasuk2ActionPerformed

    private void menuDaftar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDaftar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDaftar2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean isSuccess = ModulDB.createGenre(tfTambah.getText());

        if(isSuccess){
            JOptionPane.showMessageDialog(this,"Genre berhasil ditambahkan dan tersimpan di database",
                "Genre Berhasil Ditambahkan",JOptionPane.INFORMATION_MESSAGE);
            
            updateGenre();

        }
        else{
            JOptionPane.showMessageDialog(this,"Genre gagal ditambahkan",
                "Error: Terjadi Kesalahan",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTambahActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Beranda(Beranda.STATE_LOGIN.ADMIN,"Admin").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        JPopupMenu menupop = new JPopupMenu();
        JMenuItem menuitem = new JMenuItem("Edit/Hapus Genre"); 
        
        menuitem.addActionListener((ActionEvent e) -> {
            if(jTabGenre.getSelectedRow() > -1){
                int rowIdx = jTabGenre.getSelectedRow();
                TableModel model = jTabGenre.getModel();
                String pNama = (String) model.getValueAt(rowIdx, 0);   
                EditHapusGenre genre= new EditHapusGenre((JFrame)this.getParent(),true,pNama, pNama);
                genre.setVisible(true);//To change body of generated methods, choose Tools | Templates.
                updateGenre();
            }
        });
        menupop.add(menuitem);
        jTabGenre.setComponentPopupMenu(menupop);
        updateGenre();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
        public void updateGenre(){
            ArrayList<String> genres = ModulDB.selectSemuaGenre();
        
            DefaultTableModel model = (DefaultTableModel)jTabGenre.getModel();
            model.setRowCount(0);
         
            for(String genre:genres){
                Object obj[] = new Object[1];
                obj[0]  = genre;
         
//                JButton btn = new JButton(judul);
//                 //btn.addActionListener(new Film(judul,sinopsis,aktor));
//                 add(btn);
                 
                model.addRow(obj);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TambahGenre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahGenre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahGenre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahGenre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TambahGenre dialog = new TambahGenre(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabGenre;
    private javax.swing.JCheckBoxMenuItem menuDaftar1;
    private javax.swing.JCheckBoxMenuItem menuDaftar2;
    private javax.swing.JCheckBoxMenuItem menuMasuk1;
    private javax.swing.JCheckBoxMenuItem menuMasuk2;
    private javax.swing.JTextField tfTambah;
    // End of variables declaration//GEN-END:variables
}
