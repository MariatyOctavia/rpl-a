/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviemanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author hp
 */
public class ModulDB {
    public static int id_akun;
    public static String nama;
    public static String password;
    public static String email;
    public static String level;
    private static Connection con=null;
    
    public static Connection connectDB(){
        
        
        String path="jdbc:sqlite:E://moviemanager.db";
        if(con==null){
        //Connection con=null;
        try{
            con=DriverManager.getConnection(path);
            System.out.println("sukses");
        }
        catch(SQLException e){
            showMessageDialog(null,"Koneksi ke database gagal!","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        return con;
    }
    
    public static ArrayList<String> selectSemuaFilm(){
        ArrayList<String> pathGambars = new ArrayList<>();
        try{ 
             Connection conn = ModulDB.connectDB();
             String sql = "select * from film;";
             
             java.sql.Statement st = conn.createStatement();
             
             java.sql.ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 pathGambars.add(rs.getString("gambar"));
             }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return pathGambars;
        
        
    } 
    
    public static boolean createFilm(String judul, String sinopsis, String pathGambar
                , String aktor,int genre, String  tahun){
        try{ 
             Connection conn = ModulDB.connectDB();
             String sql = "insert into film(judul, sinopsis, gambar, aktor,genre,tahun)"+" values(?,?,?,?,?,?)";
             java.sql.PreparedStatement st = conn.prepareStatement(sql);

             try{
                 
                 st.setString(1,judul);
                 st.setString(2,sinopsis);
                 st.setString(3,pathGambar);
                 st.setString(4,aktor);
                 st.setInt(5,genre);
                 st.setString(6,tahun);
                 
                 int count  = st.executeUpdate();
                 
                 if(count > 0){
                     return true;
                 }
             }catch(SQLException se){
                System.out.println(se.getMessage());
             }
             //st.close();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return false;
    }

    /**
     *
     * @param judul
     * @param Sinopsis
     * @param path
     * @return
     */
    public static boolean editFilm(String judul,String sinopsis,String pathGambar,
            String aktor,int genre,String tahun,String judulLama, String aktorLama){
         try{ 

             Connection conn = ModulDB.connectDB();
             String sql = "update film set judul=?,sinopsis=?,gambar=?,aktor=?,genre=?,tahun=?"
                     + "where judul=? and aktor=?";
             java.sql.PreparedStatement st = conn.prepareStatement(sql);

             try{
                 
                 st.setString(1,judul);
                 st.setString(2,sinopsis);
                 st.setString(3,pathGambar);
                 st.setString(4,aktor);
                 st.setInt(5,genre);
                 st.setString(6,tahun);
                 st.setString(7, judulLama);
                 st.setString(8, aktorLama);
                 int count  = st.executeUpdate();
                 
                 if(count > 0){
                     return true;
                 }
             }catch(SQLException se){
                System.out.println(se.getMessage());
             }
             //st.close();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
         return false;
    }
    public static boolean hapusFilm(String judulLama, String aktorLama){
       try{ 
             Connection conn = ModulDB.connectDB();
              String sql = "delete from film where judul=? and aktor=?";
             java.sql.PreparedStatement st = conn.prepareStatement(sql);
                 st.setString(1, judulLama);
                 st.setString(2, aktorLama);
                 int count  = st.executeUpdate();
         if(count > 0){
                     return true;
                 }
    }catch (SQLException se){
                System.out.println(se.getMessage());
             }
       return false;
    }
    
    public static int getGenre(String genre){
        int idGenre = 0;
        String sql = "select id_genre from genre where nama=?";
        try{
            Connection conn = ModulDB.connectDB();
            PreparedStatement st = conn.prepareStatement(sql);
           st.setString(1,genre);
           ResultSet rs = st.executeQuery();
            idGenre=rs.getInt("id_genre");
            
        }catch(SQLException e) {
            System.out.println(e.getMessage());
                     }
        return idGenre;
    }
    public static boolean createGenre(String nama){
                try{ 
             Connection conn = ModulDB.connectDB();
             String sql = "insert into genre(nama)"+" values(?)";
             java.sql.PreparedStatement st = conn.prepareStatement(sql);

             try{
                 
                 st.setString(1,nama);
                
                 int count  = st.executeUpdate();
                 
                 if(count > 0){
                     return true;
                 }
             }catch(SQLException se){
                System.out.println(se.getMessage());
             }
             //st.close();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
                return false;
    }
    public static boolean editGenre(String nama, String nama_lama){
        try{ 
             Connection conn = ModulDB.connectDB();
             String sql = "update genre set nama=? where nama=?";
             java.sql.PreparedStatement st = conn.prepareStatement(sql);

             try{
                 
                 st.setString(1,nama);
                 st.setString(2,nama_lama);
                 int count  = st.executeUpdate();
                 
                 if(count > 0){
                     return true;
                 }
             }catch(SQLException se){
                System.out.println(se.getMessage());
             }
             //st.close();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
                return false;
    }
       public static boolean hapusGenre(String nama){
                try{ 
             Connection conn = ModulDB.connectDB();
             String sql = "delete  from genre where nama=?";
             java.sql.PreparedStatement st = conn.prepareStatement(sql);

             try{
                 
                 st.setString(1,nama);
              
                
                 int count  = st.executeUpdate();
                 
                 if(count > 0){
                     return true;
                 }
             }catch(SQLException se){
                System.out.println(se.getMessage());
             }
             //st.close();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
                return false;
    }
    
}
