package interface_classes;

import domain_model.Movie;
import domain_model.MovieCollection;

import java.util.ArrayList;

public interface fileHandlerInteface {

    void loadMovieCollection (MovieCollection movieCollection);

    void saveMovieCollection(MovieCollection movieCollection, boolean isChanged);

    ArrayList<Movie> readCsvFile();


}
