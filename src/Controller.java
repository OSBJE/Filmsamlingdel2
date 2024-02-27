import java.util.ArrayList;

public class Controller {

        private MovieCollection movieCollection;


        public Controller() {
            this.movieCollection = new MovieCollection();
        }

        public void tilFøjMovie(String tilte, String director, int year, boolean IsInColor, double lenghtinMin, String genre) {
            movieCollection.tilFøjMovie(tilte, director, year, IsInColor, lenghtinMin, genre);
        }

        public String searchMovieCollection(String tilte){
            return movieCollection.searchMovieCollection(tilte);
        }

        public void getMovietitles (){
            movieCollection.getMovietitles();
        }

        public void removeMovie(String MovieNameToRemove){
            movieCollection.removeMovie(MovieNameToRemove);
        }

        public void listsize(){
            movieCollection.listsize();
        }

        public void movieObjectindex() {
            movieCollection.movieObjectindex();
        }


}







