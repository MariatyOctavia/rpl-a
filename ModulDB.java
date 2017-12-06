/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviemanager;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static moviemanager.ModulDB.connectDB;

/**
 *
 * @author hp
 */
public class ModulDB {
//    public static int id_user;
//    public static String nama;
//    public static String password;
//    public static String email;
//    public static String level;
    private static Connection conn = null;
    
    public static Connection connectDB(){
        String path="jdbc:sqlite:database/moviemanager.db";
        if(conn == null){
        try{
            conn = DriverManager.getConnection(path);
        }
        catch(SQLException e){
            showMessageDialog(null,"Koneksi ke database gagal!","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        return conn;
    }
    
    public static ArrayList<String> selectSemuaGambar(){
        ArrayList<String> pathGambars = new ArrayList<>();
        try{ 
             Connection conn = connectDB();
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
    
    public static ArrayList<Film> selectSemuaFilm(){
        ArrayList<Film> films = new ArrayList<>();
        try{
            Connection conn = connectDB();
            String sql= "select id_film,judul, sinopsis, gambar, aktor, genre, tahun, rating,trailer FROM film , genre WHERE genre.id_genre = film.genre";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                int id_film = rs.getInt("id_film");
                String judul = rs.getString("judul");
                String sinopsis = rs.getString("sinopsis");
                String gambar = rs.getString("gambar");
                String aktor = rs.getString("aktor");
                int genre = rs.getInt("genre");
                int genre2 = rs.getInt("genre2");
                int tahun = rs.getInt("tahun");
                int rating = rs.getInt("rating");
                String trailer = rs.getString("trailer");
                Film f = new Film(id_film,judul,sinopsis,gambar,aktor,genre,genre2,tahun,rating,trailer);
                films.add(f);
            }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        } 
        return films;
    }
    
    public static boolean createFilm(String judul, String sinopsis, String pathGambar
                , String aktor,int genre,int genre2,String  tahun,String trailer){
        try{ 
            Connection conn = connectDB();
            String sql = "insert into film(judul, sinopsis, gambar, aktor,genre,genre2,tahun,trailer)"+" values(?,?,?,?,?,?,?,?)";
            java.sql.PreparedStatement st = conn.prepareStatement(sql);

            try{

                st.setString(1,judul);
                st.setString(2,sinopsis);
                st.setString(3,pathGambar);
                st.setString(4,aktor);
                st.setInt(5,genre);
                st.setInt(6,genre2);
                st.setString(7,tahun);
                st.setString(8,trailer);
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
        public static ArrayList<Film> readFilm(){
        ArrayList<Film> listFilm = new ArrayList<>();
        String sql = "SELECT * FROM film";
        try {
            Connection conn = connectDB();
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
                while(rs.next())
                {   
                    int id_film = rs.getInt("id_film");
                    String judul = rs.getString("judul");
                    String sinopsis = rs.getString("sinopsis");
                    String gambar = rs.getString("gambar");
                    String aktor = rs.getString("aktor");
                    int genre = rs.getInt("genre");
                    int genre2 = rs.getInt("genre2");
                    int tahun = rs.getInt("tahun");
                    int rating =rs.getInt("rating");
                    String trailer = rs.getString("trailer");
                    Film newFilm = new Film (id_film,judul,sinopsis,gambar,aktor,genre,genre2,tahun,rating,trailer);
                    listFilm.add(newFilm);
                }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally{
            return listFilm;
        }
    }
    public static ArrayList<Film> searchFilm(String sql){
     ArrayList<Film> listFilm = new ArrayList<>();
        try 
        {Connection conn = connectDB();
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);
                while(rs.next())
                {   
                    int id_film = rs.getInt("id_film");
                    String judul = rs.getString("judul");
                    String sinopsis = rs.getString("sinopsis");
                    String gambar = rs.getString("gambar");
                    String aktor = rs.getString("aktor");
                    int genre = rs.getInt("genre");
                    int genre2 = rs.getInt("genre2");
                    int tahun = rs.getInt("tahun");
                    int rating =rs.getInt("rating");
                    String trailer = rs.getString("trailer");
                    Film newFilm = new Film (id_film,judul,sinopsis,gambar,aktor,genre,genre2,tahun,rating,trailer);
                    listFilm.add(newFilm);
                }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally{
            return listFilm;
        }
    
}
    public static boolean editFilm(String judul,String sinopsis,String pathGambar,
            String aktor,int genre,int genre2,String tahun,String trailer,String judulLama, String aktorLama){
        try{
            Connection conn = connectDB();
        
            String sql = "update film set judul=?,sinopsis=?,gambar=?,aktor=?,genre=?,genre2=?,tahun=?,trailer=?"
                    + "where judul=? and aktor=?";
            java.sql.PreparedStatement st = conn.prepareStatement(sql);

            try{
                st.setString(1,judul);
                st.setString(2,sinopsis);
                st.setString(3,pathGambar);
                st.setString(4,aktor);
                st.setInt(5,genre);
                st.setInt(6, genre2);
                st.setString(7,trailer);
                st.setString(8,tahun);
                st.setString(9, judulLama);
                st.setString(10, aktorLama);
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
            Connection conn = connectDB();
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
            Connection conn = connectDB();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,genre);
            ResultSet rs = st.executeQuery();
            idGenre=rs.getInt("id_genre");
            
        }catch(SQLException e) {
            System.out.println(e.getMessage());
                     }
        return idGenre;
    }
    public static String ambilNamaGenre(int id){
        String namaGenre=null;
        String sql = "select nama from genre where id_genre = "+id;
        try{
            Connection conn = connectDB();
            PreparedStatement st = conn.prepareStatement(sql);
           ResultSet rs = st.executeQuery();
            namaGenre =rs.getString("nama");
            
        }catch(SQLException e) {
            System.out.println(e.getMessage());
                     }
        return namaGenre;
    }
    
    public static boolean createGenre(String nama){
        try{ 
             Connection conn = connectDB();
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
             Connection conn = connectDB();
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
             Connection conn = connectDB();
             String sql = "delete  from genre where nama= '" +nama+"'";
             java.sql.PreparedStatement st = conn.prepareStatement(sql);

             try{
                 
              
                
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
    public static boolean checkLogin(String emailEnkrip, String passEnkrip,String level){
        String sql="SELECT * FROM Userr WHERE email='"+emailEnkrip+"' AND password='"+passEnkrip+"' AND level='"+level+"' ;";
        try{  
                Connection con = connectDB();
                Statement stmt=con.createStatement();
                ResultSet result=stmt.executeQuery(sql);          
                if(result.next()){
                    return true;
                }
        }
        catch(SQLException | HeadlessException e){
            showMessageDialog(null,e.getMessage(),"Error!", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public static ArrayList<String> selectSemuaGenre(){
        ArrayList<String> genres = new ArrayList<>();
        ArrayList<String> genres2 = new ArrayList<>();       
        String sql = "select *from genre";
        try{
            Connection conn = connectDB();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                genres.add(rs.getString("nama"));
                genres2.add(rs.getString("nama"));
            }
        }catch(SQLException se){
            System.out.println(se.getMessage());    
        }
        
        return genres;
    }
    
    public static int getIndexGenre(String genre){
        int id = 0;
        String sql = "select id_genre from genre where nama = ?";
        try{
            Connection conn = connectDB();
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
    public static void registerUser(String nama,String emailEnkrip,String passEnkrip, String guest){
        try{
                Connection con = connectDB();
                String sql="INSERT  INTO userr (nama,email,password,level) VALUES('"+nama+"','"+emailEnkrip+"','"+passEnkrip+"','"+guest+"');";
                Statement stmt=con.createStatement();
                stmt.executeUpdate(sql);
                showMessageDialog(null,"User berhasil dibuat!");
            }
            catch(SQLException e){
                showMessageDialog(null,e.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
            }
    }
        public static boolean createRating(int nilai_rating,int id_film,int id_akun){
        try{ 
             Connection conn = connectDB();
             String sql = "insert into rating(nilai_rating,id_film,id_akun )"+" values(?,?,?)";
             java.sql.PreparedStatement st = conn.prepareStatement(sql);

            try{
                st.setInt(1,nilai_rating);
                st.setInt(2,id_film);
                st.setInt(3,id_akun);

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
        
    public static double readRating(int id_film){
        double rating = 0 ;
        try{ 
             Connection conn = connectDB();
             String sql = "SELECT round(AVG(nilai_rating),2) as avg from rating WHERE id_film =?";
             java.sql.PreparedStatement st = conn.prepareStatement(sql);

           
            st.setInt(1,id_film);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                rating =  rs.getDouble("avg");
            }
                
            
             //st.close();
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rating;
    }
}

    
