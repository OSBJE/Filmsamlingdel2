package SortMethods;

import domain_model.Movie;

import java.util.Comparator;

public enum ParameterComparator {

    TITLE((o1, o2) -> {
        int results = o1.getTitle().compareTo(o2.getTitle());
        return results;
    }),
    DIRECTOR(Comparator.comparing(Movie::getDirector)),
    YEAR((o1, o2) -> {
        int resullts = o1.getYear() - o2.getYear();
        return resullts;
    }),
    LENGTHINMIN(Comparator.comparingDouble(Movie::getLengthinMin)),
    GENRE((o1, o2) -> {
        int results = o1.getGenre().compareTo(o2.getGenre());
        return results;
    });

    private Comparator<Movie> comp;


    //*** Konstruktor ***//
    ParameterComparator(Comparator<Movie> comp) {
        this.comp = comp;
    }

    public Comparator<Movie> getComparator() {
        return comp;
    }
}
