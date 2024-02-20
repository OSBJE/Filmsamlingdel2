public class Movie {

    //Attributter
    private String tilte;
    private String director;
    private int year;
    private boolean IsInColor;
    private String genre;



    // method / parametre
    public Movie(String tilte, String director, int year, boolean IsInColor, String genre) {
        this.tilte = tilte;
        this.director = director;
        this.year = year;
        this.IsInColor = IsInColor;
        this.genre = genre;
    }

    // GetterMethods

    public static String getTilte() {
        return tilte;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public boolean getIsInColor() {
        return IsInColor;
    }

    public String getGenre() {
        return genre;
    }
}
