import java.util.ArrayList;

public class MovieCollection {

    private final ArrayList<Movie> movieCollection;

    public MovieCollection() {
        this.movieCollection = new ArrayList<>();
    }

    public void tilFøjMovie(String title, String director, int year, boolean IsInColor, double lenghtinMin, String genre) {
        movieCollection.add(new Movie(title, director, year, IsInColor, lenghtinMin, genre));

    }

    public String searchMovieCollection(String title) {
        String result = "";
               for (Movie movie : movieCollection) {
                   if(movie.getTitle().toLowerCase().contains(title.toLowerCase())){
                       result += movie.toString() + "\n";
                   } else {
                    System.out.println("No movie by title " + title + " found.");
                    break;
                   }
        } if (!result.isEmpty()) {
            System.out.println(result);
        } else {
                   System.out.println("You haven't added any movies to your collection");
        }
               return result;
    }


    public void getMovietitles () {
        for (int i = 0; i <= movieCollection.size() - 1; i++){
            System.out.println(movieCollection.get(i).toString()); // du skal vælge det indeks du skal vælge
        }
    }

    public void removeMovie(String MovieNameToRemove){
        for (int i = 0; i <= movieCollection.size() -1; i++ ) {
            // System.out.println("Movie " + movieCollection.get(i).getTitle() + " is index of " + i);
            if (MovieNameToRemove.equals(movieCollection.get(i).getTitle())){
                movieCollection.remove(i);
            }
        }
    }

    public void listsize() {
        System.out.println(movieCollection.size());
    }

    public void movieObjectindex() {
        for (int i = 0; i <= movieCollection.size() -1; i++ ){
            System.out.println("Movie "+ movieCollection.get(i).getTitle() + " is index of " + i);
        }
    }

    public void updateMovie(String updateMovie) {
        for (int i = 0; i <= movieCollection.size() -1; i++ ) {
            if (updateMovie.equals(movieCollection.get(i).getTitle())){


            }
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