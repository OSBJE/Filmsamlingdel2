import data_source.Filehandler;
import domain_model.Movie;
import domain_model.MovieCollection;
import ui.UserInterface;
import java.util.ArrayList;

import java.io.File;

public class Main {

    public static void main(String[] args)  {

        UserInterface ui = new UserInterface();
        ui.startMenue();




        /*
        MovieCollection film = new MovieCollection();
        Filehandler fh = new Filehandler();
//        ArrayList<Movie> datar = fh.loadAllMovies();
//        for (Movie data : datar){
//            System.out.println(data);
//        }
        film.tilFøjMovie("DieHard","Lord Hard",2004, true, 20, "Action");
        film.tilFøjMovie("Lovepotion","Jacob Clienton",1992, false, 32, "Drama");
        film.tilFøjMovie("Kitler","Hitler",1992, false, 32, "Drama");

        for (Movie movie : film.getMovieCollection()) {
            System.out.println(movie);
        }
        fh.saveMovieCollection();


//        UserInterface ui = new UserInterface();
//        ui.startMenue();
*/


    }

}
