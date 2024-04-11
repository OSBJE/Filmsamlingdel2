package domain_model;

import java.util.Comparator;

public class Movie implements Comparable<Movie>{

    //****************** ATTRIBUTES **************************************************//
    private String title;
    private String director;
    private int year;
    private boolean IsInColor;
    private double lengthinMin;
    private String genre;



    // ***************** Constructor *********************************************** ///
    public Movie(String title, String director, int year, boolean IsInColor, double lengthinMin, String genre) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.IsInColor = IsInColor;
        this.lengthinMin = lengthinMin;
        this.genre = genre;
    }

    /// ************************* Getter methods **********************************////

    public String getTitle() {
        return title;
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

    public double getLengthinMin() {
        return lengthinMin;
    }

    public String getGenre() {
        return genre;
    }



/// ************************* Setter methods **********************************////

    public void setTitle(String setTitle) {
        this.title = setTitle;
    }

    public void setDirector(String setDirector) {
        this.director = setDirector;
    }

    public void setYear(int setYear) {
        this.year = setYear;
    }

    public void setIsInColor(boolean setIsInColor) {
        this.IsInColor = setIsInColor;
    }

    public void setLengthinMin(double setLenghtinMin) {
        this.lengthinMin = setLenghtinMin;
    }

    public void setGenre(String setGenre) {
        this.genre = setGenre;
    }

    // -- Helper methods to get string output -- //
    @Override
        public String toString() {
            return "\n" + "Title: " + title +
                    "\n" + "Director: " + director +
                    "\n" + "year: " + year +
                    "\n" + "IsInColor: " + (IsInColor ? "Yes" : "No") +  //ternary operator til if-else statement.
                    "\n" + "lenghtinMin: " + lengthinMin +
                    "\n" + "genre: " + genre +"\n";
    }

    // -- Helper methods to save file -- //
    public String saveFormat() {
        return title + "," + director + "," + year + "," + IsInColor + "," + lengthinMin + "," + genre;
    }

    // -- Compare methods -- //

    @Override
    //lav seperat comparator for hver attribut istedet
    public int compareTo(Movie o) {
        return Comparator.comparing(Movie::getTitle)
                .thenComparing(Movie::getDirector)
                .thenComparing(Movie::getYear)
                .thenComparing(Movie::getIsInColor)
                .thenComparing(Movie::getLengthinMin)
                .thenComparing(Movie::getGenre)
                .compare(this,o);
    }
}
