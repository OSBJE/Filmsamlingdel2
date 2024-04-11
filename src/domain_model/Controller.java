package domain_model;

import SortMethods.ParameterComparator;
import data_source.Filehandler;

import javax.naming.ldap.SortControl;
import java.util.ArrayList;


public class Controller {

    private MovieCollection movieCollection;
    private Filehandler filehandler;



    public Controller()  {
        this.movieCollection = new MovieCollection();
        this.filehandler = new Filehandler();
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

    public String removeMovie(String MovieNameToRemove){
        return movieCollection.removeMovie(MovieNameToRemove);
    }

    public void updateMovie(int attributeToUpdate, String movieEdit, String valueToUpdate) {
        movieCollection.attributeToUpdate(attributeToUpdate, movieEdit, valueToUpdate);
    }

    public ArrayList<Movie> getMovieCollection (){
       return movieCollection.getMovieCollection();
    }



    //****************** testing ************************************* //

    public void saveMovieCollection (boolean isChanged) {
        filehandler.saveMovieCollection(movieCollection, isChanged);
    }

    public ArrayList<Movie> readCsvFile()  {
        return filehandler.readCsvFile();
    }

    public void loadMovieCollection() {
        filehandler.loadMovieCollection(movieCollection);
    }

    public boolean doesCollectionsDiffer() {
        return movieCollection.doesCollectionsDiffer(getMovieCollection(), readCsvFile());
    }

    public void sortComparator(ArrayList<Movie> movie, String title) {
        movieCollection.sortComparator(movie, title);
        System.out.println("I am jumping into the controller");
    }
}







