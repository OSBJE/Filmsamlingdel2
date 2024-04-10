package data_source;
import domain_model.*;
import domain_model.MovieCollection;
import SortMethods.NameComparator;


import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;
public class Filehandler { //refactor name

    //****************** ATTRIBUTES **************************************************//

    private final File file = new File("movieCollection.csv");
    private final MovieCollection movieCollection;

    ArrayList<Movie> movieData =loadAllMovies();





    // ***************** Constructor *********************************************** ///
    public Filehandler(MovieCollection movieCollection) {
        this.movieCollection = movieCollection;
    }


    public void loadmethod() {
        //1 opret en arraylist til at opbevare resultater
        //2 Skal kunne læse CSV fil og "oversætte" til objekter
        //3 Skal returnere en arrayList
        //4 SKAL IKKE HÅNDTERE MOVIECOLLECTION DATA, SKAL KUN RETURNERE NOGET MOVIECOLLECTION KAN BRUGE
        //DONE - Revisit later, LMOD
    }

    public void saveMethod() {
        //1 Modtager movieCollection arraylist med getter metode
        //2 Skal kunne override CSV fil (To be improved!)
        //3 Returnerer void, da den ikke skal give noget videre i systemet

    }


    /// *********************** Load and save functions **********************************////

    // *** Load method *** //
    public ArrayList<Movie> loadAllMovies() {
        ArrayList<Movie> movieData = new ArrayList();
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            sc.nextLine(); //skipper første linje

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Movie data = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] attributes = line.split(";");
            data = new Movie(attributes[0], attributes[1], Integer.parseInt(attributes[2]),
                    Boolean.parseBoolean(attributes[3]), Double.parseDouble(attributes[4]), (attributes[5]));

            movieData.add(data);

        }
        sc.close();
        return movieData;
    }

    public void saveMovieCollection() {
        areListsEqual(movieData, movieCollection.getMovieCollection());

        String filepath = "movieCollection.csv";

            try {
                FileWriter fw = new FileWriter(filepath); // Skriver til .csv file
                PrintWriter pw = new PrintWriter(fw);  // bliver connected til vores stig

                pw.println("title;director;year;IsInColor;lenghtInMin;genre");

                for (Movie movie : movieCollection.getMovieCollection()) {
                    System.out.println("are you going in?");
                    pw.println(movie.saveFormat());
                }
                pw.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }


    /*public void areListsEqual (ArrayList<Movie> movieData, ArrayList<Movie> movieCollection2) {
      movieData.sort(new NameComparator());
      movieCollection2.sort(new NameComparator());

      System.out.println(movieData.equals(movieCollection2));

    }*/

    public boolean areListsEqual (ArrayList<Movie> movieData, ArrayList<Movie> movieCollection2) {
        Boolean results = true;

        Collections.sort(movieData, new NameComparator());
        Collections.sort(movieCollection2, new NameComparator());

        for (Movie movie : movieCollection2) {
            System.out.println(movie);

        }

        for (Movie movie : movieData) {
            System.out.println(movie);
        }

        if (movieData.size() != movieCollection2.size()) {
            results = false;
            return results;
        }

        for (int i = 0; i < movieCollection2.size() - 1; i++) {
            Movie obj1 = movieData.get(i);
            Movie obj2 = movieCollection2.get(i);

            if (obj1.equals(obj2)) {
                System.out.println("it is matching objects");
                results = false;
                return results;
            }
        }
        return results;
    }


}

        /*
        public void saveMovieCollection() {
        try {
            PrintStream output = new PrintStream(file);
            helperSaveMethod(output);
            System.out.println("Jeg har skrevet til filen!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        }


        // *** Helper method *** //
    private void helperSaveMethod (PrintStream out) {
        ArrayList<Movie> movieSamling2 = movieSamling.getMovieCollection();
        for (Movie movie : movieSamling2) {
        System.out.println("Jeg har fat i film listen");
        out.println(movie);
    }



        MovieCollection movieSamling = new MovieCollection();

        movieSamling.tilFøjMovie("DieHard","Lord Hard",2004, true, 20, "Action");
        movieSamling.tilFøjMovie("Lovepotion","Jacob Clienton",1992, false, 32, "Drama");
        movieSamling.tilFøjMovie("Kitler","Hitler",1992, false, 32, "Drama");
         */





//Noget der indlæser




// Noget der gemmer




//Husk ikke at bruge memory på at gemme ingen ændringer




    //****************** testing ************************************* //



