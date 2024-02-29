import java.util.ArrayList;

public class Controller {

        private MovieCollection movieCollection;


        public Controller() {
            this.movieCollection = new MovieCollection();
        }

        public void tilFøjMovie(String title, String director, int year, boolean IsInColor, double lenghtinMin, String genre) {
            movieCollection.tilFøjMovie(title, director, year, IsInColor, lenghtinMin, genre);
        }

        public String searchMovieCollection(String title){
            return movieCollection.searchMovieCollection(title);
        }

        public String getMovietitles (){
            return movieCollection.getMovietitles();
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

        public void updateMovie(int attributeToUpdate, String movieEdit, String valueToUpdate) {
            movieCollection.attributeToUpdate(attributeToUpdate, movieEdit, valueToUpdate);
        }

}







