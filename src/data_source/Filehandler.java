package data_source;
import domain_model.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;


public class Filehandler { //refactor name
    private final File file = new File("movieCollection.csv");
    private ArrayList<Movie> movieCollection;
    private MovieCollection collection;
    //Lav global attribute ArrayList af Movie objekter


    public Filehandler() {
        this.movieCollection = new ArrayList<>();
        this.movieCollection = collection.getMovieCollection();
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


        //Load method
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
        //movieCollection = movieObject.getMovieCollection();
    for (Movie movie : movieCollection) {
        System.out.println("Jeg har fat i film listen");
        out.println(movie);
    }

    }



//Noget der indlæser




// Noget der gemmer




//Husk ikke at bruge memory på at gemme ingen ændringer




    //****************** testing ************************************* //

}

