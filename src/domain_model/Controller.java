package domain_model;

import data_source.Filehandler;


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



    //****************** testing ************************************* //

    public void saveMovieCollection () {
        filehandler.saveMovieCollection(movieCollection);
    }

    public void loadMovieCollection()  {
        filehandler.loadMovieCollection(movieCollection);
    }

}







