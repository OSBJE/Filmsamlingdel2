package data_source;
import domain_model.*;
import interface_classes.fileHandlerInteface;

import java.io.File;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Filehandler implements fileHandlerInteface{
    String filePath = "movieCollection.csv";
    Scanner sc;


    public Filehandler() {

    }

    //Loader method that puts the content from the readCsvFile method into the movieCollection ArrayList. This happens in the controller.
    @Override
        public void loadMovieCollection(MovieCollection collection) {
        collection.getMovieCollection().addAll(readCsvFile());
        }


        //refactor til at save automatisk ved exit
    @Override
        public void saveMovieCollection(MovieCollection collection, boolean isChanged) {
            if (!isChanged) {
                System.out.println("No changes made - not saving"); //Only here to give feedback if the program saves or not - will be refactored to return a string later
            } else {
                System.out.println("changes made - saving"); //Only here to give feedback if the program saves or not - will be refactored to return a string later
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
        }


        // *** Helper method *** //
        //Helper method to read the CSV file and put the objects in an ArrayList with movie objects
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

    //****************** testing ************************************* //




}

