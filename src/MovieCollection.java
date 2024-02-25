import java.util.ArrayList;

public class MovieCollection {

    private ArrayList<Movie> movieCollection;

    public MovieCollection() {
        this.movieCollection = new ArrayList<>();
    }

    public void tilFøjMovie(String tilte, String director, int year, boolean IsInColor, double lenghtinMin, String genre) {
        movieCollection.add(new Movie(tilte, director, year, IsInColor, lenghtinMin, genre));

    }

    /*public void getMovieCollection() {
        for (Movie i : movieCollection) {
            System.out.println(i.getTilte());
        }
    }*/

    public void getMovietitles () {
        for (int i = 0; i < movieCollection.size(); i++){
            System.out.println(movieCollection.get(i).getTilte()); // du skal vælge det indeks du skal vælge
        }
    }

    public void removeMovie(String remove){
        int i = movieCollection.indexOf(remove) + 1;
        movieCollection.remove(i);
    }

    //public void changeMovie();

}





//for (Movie movieCollection : MovieCollection){
//        MovieCollection.getTitle();

//for (int i = 0; i <MovieCollection.length()-1; i++){
//    System.out.println(Movie.getTilte());

/*    public String filmIdatabase() {
        for ( int i = 0; i >= count; i++){
            System.out.println();

        }

        for (Movie i : MovieCollection) {
            System.out.println(i.getTilte());
        }
    }*/