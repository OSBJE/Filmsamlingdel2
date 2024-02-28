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


    public String getMovietitles () {
        String list = "";
        for (int i = 0; i <= movieCollection.size() - 1; i++){
            //System.out.println(movieCollection.get(i).toString()); // du skal vælge det indeks du skal vælge
            list += movieCollection.get(i).toString();
        } return list;
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

    ///////////////// working on updating different values in movies /////////////////////////////////

    public int movieToUpdate(String updateMovie) {
        int index = 0;
        for (int i = 0; i <= movieCollection.size() -1; i++ ) {
            if (updateMovie.equals(movieCollection.get(i).getTitle())){
            index = i;
            }
        } return index;
    }

    public void movieDirectorUpdate() {
        Movie object = movieCollection.get(movieToUpdate("DieHard"));
        object.setDirector("Johnson");


        //int index =  1 ;//movieToUpdate("DieHard");
        //movieCollection.get(index).setDirector(DirectorUpdate); // = movieCollection.get(index).setDirector(DirectorUpdate);
        //System.out.println("djasda" + movieCollection.get(index).getDirector());
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