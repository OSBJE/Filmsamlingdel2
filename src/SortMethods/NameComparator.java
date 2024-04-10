package SortMethods;
import domain_model.*;
import domain_model.MovieCollection;
import data_source.Filehandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NameComparator implements Comparator<Movie> {


    @Override
    public int compare(Movie o1, Movie o2) {
        int results = o1.getTitle().compareTo(o2.getTitle());
        return results;
    }



    public void customCompare (ArrayList<Movie> movie) {
        Collections.sort(movie, new Comparator<Movie>() {
            public int compare(Movie o1, Movie o2) {
                int results = o1.getDirector().compareTo(o2.getDirector());
                return results;
            }
        });
    }




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


}
