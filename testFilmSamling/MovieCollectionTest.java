import data_source.Filehandler;
import domain_model.Movie;
import domain_model.MovieCollection;
import interface_classes.fileHandlerInteface;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest implements fileHandlerInteface{

    //mock file
    String filePath = "test.csv";

    File file = new File(filePath);
    Scanner sc;

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
        actualFilm.tilFøjMovie("Kitler","Hitler",1992, false, 32, "Drama"); // Man kan ikke bytte om på objecterne.
        actualFilm.tilFøjMovie("Lovepotion","Jacob Clienton",1992, false, 32, "Drama");


        // String currentMovies = film.getMovietitles();

            // Assert

            //String wantedMovies = actualFilm.getMovietitles();

            //assertEquals(wantedMovies, currentMovies);

    }




    @Test
    void loadMovieCollection(){

        //Arrange



        //Act


        //Assert


    }

    @Test
    void saveMovicCollection(){


        //Arrange
        MovieCollection movieCollection = new MovieCollection();
        movieCollection.tilFøjMovie("hans", "jensen", 1999, true, 92, "action");
        movieCollection.tilFøjMovie("john", "hansen", 1989, true, 98, "kkkkkk");

        boolean isChanged = true;


        //Act
        saveMovieCollection(movieCollection, true);
        ArrayList<Movie> actualMovieCollection = movieCollection.getMovieCollection();
        ArrayList<Movie> loadedMovieCollection = readCsvFile();

        Collections.sort(actualMovieCollection);
        Collections.sort(loadedMovieCollection);


        //Assert
        assertTrue(file.exists()); //check for if file exists
        assertEquals(actualMovieCollection.size(), loadedMovieCollection.size()); //check for the size of the 2 arrayLists
        //Loop over the arraylist
        for (int i = 0; i < actualMovieCollection.size(); i++) {
            assertEquals(0, actualMovieCollection.get(i).compareTo(loadedMovieCollection.get(i)));
            //check for the contents of the 2 arraylist utilising the compareTo method in Movie class.
            // The '0' is the expected result, as the compareTo method in Movie will return 0 if the contents is the same
        }


    }

    @Test
    void dontDoubleSave(){

        //Arrange


        //Act


        //Assert


    }

    @Test
    void sortByName(){

        //Arrange


        //Act


        //Assert


    }

    @Test
    void sortByAttributes(){

        //Arrange


        //Act


        //Assert


    }

    @Test
    void sortByMultiplyAttributes(){

        //Arrange


        //Act


        //Assert


    }


    @Override
    public void loadMovieCollection(MovieCollection movieCollection) {
        movieCollection.getMovieCollection().addAll(readCsvFile());
    }

    @Override
    public void saveMovieCollection(MovieCollection movieCollection, boolean isChanged) {
        if (!isChanged) {
        } else {
            try {
                FileWriter fileWriter = new FileWriter(filePath);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                for (Movie movie : movieCollection.getMovieCollection()) {
                    printWriter.println("");
                    printWriter.print(movie.saveFormat());
                }
                printWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    @Override
    public ArrayList<Movie> readCsvFile() {
        ArrayList<Movie> loadedMovie = new ArrayList<>();
        sc = null;
        try {
            sc = new Scanner(new File(filePath), StandardCharsets.UTF_8);
            sc.nextLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] attributes = line.split(",");
            Movie data = null;
            data = new Movie(
                    attributes[0],
                    attributes[1],
                    Integer.parseInt(attributes[2]),
                    Boolean.parseBoolean(attributes[3]),
                    Double.parseDouble(attributes[4]),
                    attributes[5]);
            loadedMovie.add(data);
        }
        sc.close();
        return loadedMovie;
    }









}