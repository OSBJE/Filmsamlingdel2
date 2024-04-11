package SortMethods;

import domain_model.Movie;

import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*

// Interface
public interface Sort<Movie> {

    public abstract void sort(ArrayList<Movie> movie);
}

// Interface controller

class SortController<Movie> {

    private Sort<Movie> sort;

    public SortController(Sort<Movie> sort){
        this.sort = sort;
    }

    public void sort(ArrayList<Movie> movie) {
        sort.sort(movie);
    }
}


// workers or task solvers
public class SortTitle implements Sort<Movie> {

    @Override
    public void sort(ArrayList<Movie> movie) {
        Collections.sort(movie, new Comparator<Movie>() {
            public int compare(Movie o1, Movie o2) {
                int results = o1.getTitle().compareTo(o2.getTitle());
                return results;
            }
        });
    }
}

class SortYear implements Sort<Movie> {

    @Override
    public void sort(ArrayList<Movie> movie) {
        Collections.sort(movie, new Comparator<Movie>() {
            public int compare(Movie o1, Movie o2) {
                double results = (o1.getLenghtinMin() - o2.getLenghtinMin());
                return (int) results;
            }
        });
    }
    */

