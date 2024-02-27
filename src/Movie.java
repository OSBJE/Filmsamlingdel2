public class Movie {

    //Attributter
    private String tilte;
    private String director;
    private int year;
    private boolean IsInColor;
    private double lenghtinMin;
    private String genre;



    // method / parametre
    public Movie(String tilte, String director, int year, boolean IsInColor, double lenghtinMin, String genre) {
        this.tilte = tilte;
        this.director = director;
        this.year = year;
        this.IsInColor = IsInColor;
        this.lenghtinMin = lenghtinMin;
        this.genre = genre;
    }

    // GetterMethods

    public String getTilte() {
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

    public double getLenghtinMin() {
        return lenghtinMin;
    }


    public String getGenre() {
        return genre;
    }

    @Override
        public String toString() {
            return "Title: " + tilte +
                    ", Director: " + director +
                    ", year: " + year +
                    ", IsInColor: " + (IsInColor ? "Yes" : "No") +  //ternary operator til if-else statement.
                    ", lenghtinMin: " + lenghtinMin +
                    ", genre: " + genre;
    }


}
