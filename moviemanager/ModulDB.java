/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviemanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author hp
 */
public class ModulDB {
    public static int id_user;
    public static String nama;
    public static String password;
    public static String email;
    public static String level;
    
    public static Connection connectDB(){
        
        String path="jdbc:sqlite:E://MovieManager/moviemanager.db";
        Connection con=null;
        try{
            con=DriverManager.getConnection(path);
        }
        catch(SQLException e){
            showMessageDialog(null,"Koneksi ke database gagal!","Error",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
}
