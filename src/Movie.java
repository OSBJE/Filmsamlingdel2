public class Movie {

    //Attributter
    private String title;
    private String director;
    private int year;
    private boolean IsInColor;
    private double lenghtinMin;
    private String genre;



    // method / parametre
    public Movie(String title, String director, int year, boolean IsInColor, double lenghtinMin, String genre) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.IsInColor = IsInColor;
        this.lenghtinMin = lenghtinMin;
        this.genre = genre;
    }

    // GetterMethods

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

    public double getLenghtinMin() {
        return lenghtinMin;
    }


    public String getGenre() {
        return genre;
    }

    // Setter methods;


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

    public void setLenghtinMin(double setLenghtinMin) {
        this.lenghtinMin = setLenghtinMin;
    }


    public void setGenre(String setGenre) {
        this.genre = setGenre;
    }


    @Override
        public String toString() {
            return "\n" + "Title: " + title +
                    "\n" + "Director: " + director +
                    "\n" + "year: " + year +
                    "\n" + "IsInColor: " + (IsInColor ? "Yes" : "No") +  //ternary operator til if-else statement.
                    "\n" + "lenghtinMin: " + lenghtinMin +
                    "\n" + "genre: " + genre;
    }


}
