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
    private int id_film;
    private String judul;
    private String sinopsis;
    private String gambar;
    private String aktor;
    private int genre;
    private int genre2;
    private int tahun;
    private int rating;
    private String trailer;
    
    public Film(int id_film, String judul, String sinopsis,String gambar,String aktor,int genre,int genre2,int tahun,int rating,String trailer){
    this.id_film = id_film;
    this.judul = judul;
    this.sinopsis= sinopsis;
    this.gambar = gambar;
    this.aktor = aktor;
    this.genre = genre;
    this.genre2 = genre2;
    this.tahun =tahun;
    this.rating = rating;
    this.trailer =trailer;
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

    /**
     * @return the id_film
     */
    public int getId_film() {
        return id_film;
    }

    /**
     * @param id_film the id_film to set
     */
    public void setId_film(int id_film) {
        this.id_film = id_film;
    }

    /**
     * @return the genre2
     */
    public int getGenre2() {
        return genre2;
    }

    /**
     * @param genre2 the genre2 to set
     */
    public void setGenre2(int genre2) {
        this.genre2 = genre2;
    }

    /**
     * @return the trailer
     */
    public String getTrailer() {
        return trailer;
    }

    /**
     * @param trailer the trailer to set
     */
    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
