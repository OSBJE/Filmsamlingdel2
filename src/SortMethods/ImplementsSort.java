package SortMethods;

import domain_model.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
public abstract class ImplementsSort {
    //Empty class for structor porpuse

    }


class title extends SortInterface{

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

class director extends SortInterface{

    @Override
    public void sort(ArrayList<Movie> movie) {
        Collections.sort(movie, new Comparator<Movie>() {
            public int compare(Movie o1, Movie o2) {
                int results = o1.getDirector().compareTo(o2.getDirector());
                return results;
            }
        });
    }
}

class year extends SortInterface{

    @Override
    public void sort(ArrayList<Movie> movie) {
        Collections.sort(movie, new Comparator<Movie>() {
            public int compare(Movie o1, Movie o2) {
                double results = (o1.getLenghtinMin() - o2.getLenghtinMin());
                return (int) results;
            }
        });
    }
}

class lenghtinmin extends SortInterface{

    @Override
    public void sort(ArrayList<Movie> movie) {
        Collections.sort(movie, new Comparator<Movie>() {
            public int compare(Movie o1, Movie o2) {
                double results = (o1.getLenghtinMin() - o2.getLenghtinMin());
                return (int) results;
            }
        });
    }
}

class genre extends SortInterface{

    @Override
    public void sort(ArrayList<Movie> movie) {
        Collections.sort(movie, new Comparator<Movie>() {
            public int compare(Movie o1, Movie o2) {
                int results = o1.getGenre().compareTo(o2.getGenre());
                return results;
            }
        });
    }

 */




/*
    public void userInputSort (ArrayList<Movie> list) { // String attribute
        final String attribute = "getDirector"; // for example. Also, this is case-sesitive
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                try{
                    Method m = o1.getClass().getMethod(attribute);
                    // Assume String type. If different you must handle each type.
                    String s1 = (String) m.invoke(o1);
                    String s2 = (String) m.invoke(o2);
                    return s1.compareTo(s2);
                } catch (SecurityException | NoSuchMethodException | IllegalAccessException |
                         InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }
 */