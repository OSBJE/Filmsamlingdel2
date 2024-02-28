import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

// spørgsmål til i morgen kan man lave en main in sin test.

    @Test
    void tilFøjMovie() {


        // Arrange -
        // bruger taster input ind og vi så tester up imod vores hardcode.

        ArrayList<Movie> movie = new ArrayList<>();

        MovieCollection film = new MovieCollection();

        String title = "DieHard";
        String director = "Lord Hard";
        int year = 2004;
        boolean color = true;
        double runtime = 20;
        String genre = "Action";

        film.tilFøjMovie(title, director, year, color, runtime, genre);

        String actualMovie = film.getMovietitles();

        // act


        ArrayList<Movie> movieActual = new ArrayList<>();

        MovieCollection actualFilm = new MovieCollection();

        actualFilm.tilFøjMovie("DieHard","Lord Hard",2004, true, 20, "Action");

        String expectedMovies = actualFilm.getMovietitles();


        // assert

        assertEquals(expectedMovies, actualMovie);


    }

    @Test
    void getMovietitles() {


        // Arrange -
        // set det up.
    ArrayList<Movie> movie = new ArrayList<>();

    MovieCollection film = new MovieCollection();



    film.tilFøjMovie("DieHard","Lord Hard",2004, true, 20, "Action");
    film.tilFøjMovie("Lovepotion","Jacob Clienton",1992, false, 32, "Drama");
    film.tilFøjMovie("Kitler","Hitler",1992, false, 32, "Drama");

    // Act -
        // lave en string med input.
    ArrayList<Movie> movieActual = new ArrayList<>();

    MovieCollection actualFilm = new MovieCollection();

    actualFilm.tilFøjMovie("DieHard","Lord Hard",2004, true, 20, "Action");
    actualFilm.tilFøjMovie("Lovepotion","Jacob Clienton",1992, false, 32, "Drama");
    actualFilm.tilFøjMovie("Kitler","Hitler",1992, false, 32, "Drama");


            String currentMovies = film.getMovietitles();

        // Assert

        String wantedMovies = actualFilm.getMovietitles();

        assertEquals(wantedMovies, currentMovies);

    }
}