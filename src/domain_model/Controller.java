package domain_model;
import SortMethods.NameComparator;
import data_source.Filehandler;

import java.util.ArrayList;

public class Controller {


    //****************** ATTRIBUTES **************************************************//
        private final MovieCollection movieCollection;
        private final Filehandler fh;
        private final NameComparator NC;


    // ***************** Constructor *********************************************** ///
        public Controller()  {
            this.NC = new NameComparator();
            this.movieCollection = new MovieCollection();
            this.fh = new Filehandler(movieCollection);
        }

    /// ************************* create and modify movies **********************************////
        public void tilFøjMovie(String title, String director, int year, boolean IsInColor, double lenghtinMin, String genre) {
            movieCollection.tilFøjMovie(title, director, year, IsInColor, lenghtinMin, genre);
        }

        public String removeMovie(String MovieNameToRemove){
        return movieCollection.removeMovie(MovieNameToRemove);
        }

        public void updateMovie(int attributeToUpdate, String movieEdit, String valueToUpdate) {
        movieCollection.attributeToUpdate(attributeToUpdate, movieEdit, valueToUpdate);
    }

    /// ************************* Search and get information **********************************////
        public String searchMovieCollection(String title){
            return movieCollection.searchMovieCollection(title);
        }

        public String getMovietitles (){
            return movieCollection.getMovietitles();
        }

    /// ************************* File handling and save function **********************************////




        //****************** testing ************************************* //

    public void loadMovice (){
            movieCollection.setMovieCollection(fh.loadAllMovies());
    }

    public void saveMovies (){
        fh.saveMovieCollection();
    }


    public void userInputSort () {
            NC.userInputSort(movieCollection.getMovieCollection());
    }

}







