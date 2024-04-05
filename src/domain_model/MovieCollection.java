package domain_model;

import domain_model.Movie;

import java.util.ArrayList;

public class MovieCollection {

    //****************** ATTRIBUTES **************************************************//
    private ArrayList<Movie> movieCollection;

    // ***************** Constructor *********************************************** ///
    public MovieCollection() {
        this.movieCollection = new ArrayList<>();
    }


    /// ************************* Setter methods **********************************////

    // --- Helper method new object --- //
    public void tilFøjMovie(String title, String director, int year, boolean IsInColor, double lenghtinMin, String genre) {
        movieCollection.add(new Movie(title, director, year, IsInColor, lenghtinMin, genre));

    }


    /// *********************** Movie collection navigation **********************************////

    public String searchMovieCollection (String title) {
        String result = "";
        for (Movie movie : movieCollection) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result += movie + "\n";
            } else {
                return "No movie by title " + title + " found.";
            }
        } return result;
    }


//    //public String searchMovieCollection(String title) {
//        String result = "";
//        for (Movie movie : movieCollection) {
//            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
//                result += movie.toString() + "\n";
//            } else {
//                System.out.println("No movie by title " + title + " found.");
//                break;
//            }
//        }
//        if (!result.isEmpty()) {
//            System.out.println(result);
//        } else {
//            System.out.println("You haven't added any movies to your collection");
//        }
//        return result;
//    } // ---> bad design pattern system.out.printLN

    public String getMovietitles() {
        String list = "";
        for (int i = 0; i <= movieCollection.size()-1 ; i++) {
            //System.out.println(movieCollection.get(i).toString()); // du skal vælge det indeks du skal vælge
            list += movieCollection.get(i).toString();
        }
        return list;
    }

    public String removeMovie(String title) {
        for (Movie movie : movieCollection) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                movieCollection.remove(movie);
                return movie.getTitle() + " has been removed";
            }

        } return "No movie by that title found";
    }


//    public String removeMovie(String MovieNameToRemove) {
//        for (int i = 0; i <= movieCollection.size()-1; i++) {
//            if ((movieCollection.get(i).getTitle()).equalsIgnoreCase(MovieNameToRemove)) {
//                movieCollection.remove(i);
//            } else {
//                return "No movie by that title found";
//            }
//        } return "Movie has been deleted";
//    }


    /// *********************** Movie collection update / delete movie **********************************////

    // --- helper Switch to overload what value to update in --- //
    public void attributeToUpdate(int attribute, String title, String value) {
        // int att = attribute;
        switch (attribute) {
            case 1: // Director
                movieValueUpdate(title, value);
                break;
            case 2: // year
                movieValueUpdate(title, Integer.valueOf(value));
                break;
            case 3: // IsInColor
                movieValueUpdate(title, Boolean.valueOf(value));
                break;
            case 4: // Length
                movieValueUpdate(title, Double.valueOf(value));
                break;
            case 5: // genre
                movieValueGenre(title, value);
                break;
        }
    }

    // --- Helper method to get index of movie to update --- //
    public int movieToUpdate(String updateMovie) {
        int index = 0;
        for (int i = 0; i <= movieCollection.size()-1; i++) {
            if (updateMovie.equals(movieCollection.get(i).getTitle())) {
                index = i;
            }
        }
        return index;
    }

    // --- Helper method with overload function --- //
    public void movieValueUpdate(String movieEdit, String updateValue) { // director
        Movie object = movieCollection.get(movieToUpdate(movieEdit));
        object.setDirector(updateValue);
    }

    public void movieValueUpdate(String movieEdit, int updateValue) { // year
        Movie object = movieCollection.get(movieToUpdate(movieEdit));
        object.setYear(updateValue);
    }

    public void movieValueUpdate(String movieEdit, boolean updateValue) { // IsInColor
        Movie object = movieCollection.get(movieToUpdate(movieEdit));
        object.setIsInColor(updateValue);
    }

    public void movieValueUpdate(String movieEdit, double updateValue) { // LenghtInMin
        Movie object = movieCollection.get(movieToUpdate(movieEdit));
        object.setLenghtinMin(updateValue);
    }

    public void movieValueGenre(String movieEdit, String updateValue) { // Genre
        Movie object = movieCollection.get(movieToUpdate(movieEdit));
        object.setGenre(updateValue);
    }

    //****************** testing ************************************* //


}

