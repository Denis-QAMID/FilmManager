package ru.netology.FilmManager;

public class Film {
    private int id;
    private String image;
    private String header;
    private String genre;

    public Film( int id, String image, String header, String genre){
        this.id = id;
        this.image = image;
        this.header = header;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getHeader() {
        return header;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
