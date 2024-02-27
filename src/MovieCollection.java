import java.util.ArrayList;

public class MovieCollection {

    private ArrayList<Movie> movieCollection;

    public MovieCollection() {
        this.movieCollection = new ArrayList<>();
    }

    public void tilFøjMovie(String tilte, String director, int year, boolean IsInColor, double lenghtinMin, String genre) {
        movieCollection.add(new Movie(tilte, director, year, IsInColor, lenghtinMin, genre));

    }

    public String searchMovieCollection(String tilte) {
        String result = "";
               for (Movie movie : movieCollection) {
                   if(movie.getTilte().toLowerCase().contains(tilte.toLowerCase())){
                       result += movie.toString() + "\n";
                   } else {
                    return "No movie by title " + tilte + " found.";
                   }
        } if (!result.isEmpty()) {
            return result;
        } else {
                   return "You haven't added any movies to your collection";
        }
    }

    public void getMovietitles () {
        for (int i = 0; i <= movieCollection.size() - 1; i++){
            System.out.println(movieCollection.get(i).getTilte()); // du skal vælge det indeks du skal vælge
        }
    }

    public void removeMovie(String MovieNameToRemove){
        for (int i = 0; i <= movieCollection.size() -1; i++ ) {
            System.out.println("Movie " + movieCollection.get(i).getTilte() + " is index of " + i);
            if (MovieNameToRemove.equals(movieCollection.get(i).getTilte())){
                movieCollection.remove(i);
            }
        }
    }

    public void listsize() {
        System.out.println(movieCollection.size());
    }

    public void movieObjectindex() {
        for (int i = 0; i <= movieCollection.size() -1; i++ ){
            System.out.println("Movie "+ movieCollection.get(i).getTilte() + " is index of " + i);
        }
    }


}



//public void changeMovie();

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