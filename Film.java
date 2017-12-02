/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviemanager;

/**
 *
 * @author user
 */
public class Film {
    private String judul;
    private String sinopsis;
    private String gambar;
    private String aktor;
    private int genre;
    private int tahun;
    private int rating;
    
    public Film(String judul, String sinopsis,String gambar,String aktor,int genre,int tahun,int rating){
    this.judul = judul;
    this.sinopsis= sinopsis;
    this.gambar = gambar;
    this.aktor = aktor;
    this.genre = genre;
    this.tahun =tahun;
    this.rating = rating;
    }
    /**
     * @return the judul
     */
    public String getJudul() {
        return judul;
    }

    /**
     * @param judul the judul to set
     */
    public void setJudul(String judul) {
        this.judul = judul;
    }

    /**
     * @return the sinopsis
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * @param sinopsis the sinopsis to set
     */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    /**
     * @return the gambar
     */
    public String getGambar() {
        return gambar;
    }

    /**
     * @param gambar the gambar to set
     */
    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    /**
     * @return the genre
     */
    public int getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(int genre) {
        this.genre = genre;
    }

    /**
     * @return the tahun
     */
    public int getTahun() {
        return tahun;
    }

    /**
     * @param tahun the tahun to set
     */
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @return the aktor
     */
    public String getAktor() {
        return aktor;
    }

    /**
     * @param aktor the aktor to set
     */
    public void setAktor(String aktor) {
        this.aktor = aktor;
    }
}
