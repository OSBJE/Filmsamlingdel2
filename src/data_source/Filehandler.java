package data_source;
import domain_model.*;
import java.io.File;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Filehandler {
    String filePath = "movieCollection.csv";
    Scanner sc;


    public Filehandler() {

    }

        public void loadMovieCollection(MovieCollection collection) {
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
            collection.getMovieCollection().add(data);
        }
        sc.close();
        }


        public void saveMovieCollection(MovieCollection collection) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (Movie movie : collection.getMovieCollection()) {
                printWriter.println("");
                printWriter.print(movie.saveFormat());
            }
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }

        // *** Helper method *** //




//Noget der indlæser




// Noget der gemmer




//Husk ikke at bruge memory på at gemme ingen ændringer




    //****************** testing ************************************* //




}

