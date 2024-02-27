import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // instance / lave et film object
        // laver en ny film

        Controller film = new Controller();

        int sentinal = 2;
        int userChoice = 0;

        while (userChoice != sentinal) {
            System.out.println("Velkommen til min filmsamling!");
            System.out.println(" 1. Opret en film");
            System.out.println(" 2. afslut");
            userChoice = input.nextInt();

            if ( userChoice == 2){
                break;
            }

            boolean dummyVar = true;

            while (dummyVar) {
                System.out.println("Please type in the title");
                String title = input.next();
                System.out.println("Please type in who directed it");
                String director = input.next();
                System.out.println("year");
                int year = input.nextInt();
                System.out.println("Are the movie in color (true) else (false)");
                boolean IsInColor = input.nextBoolean();
                System.out.println("How long is the movie in min");
                double LenghtinMin = input.nextDouble();
                System.out.println("what genre is it ?");
                String genre = input.next();
                film.tilFøjMovie(title, director, year, IsInColor, LenghtinMin, genre);
                System.out.println("Movie was added to libary");
                System.out.println("want to add another type true, else false");
                boolean dummyVarUpdate = input.nextBoolean();
                dummyVar = dummyVarUpdate;
            }
        }


        film.tilFøjMovie("DieHard","Lord Hard",2004, true, 20, "Action");
        film.tilFøjMovie("Lovepotion","Jacob Clienton",1992, false, 32, "Drama");
        film.tilFøjMovie("Kitler","Hitler",1992, false, 32, "Drama");

        film.listsize();

        film.movieObjectindex();

        film.removeMovie("Lovepotion"); // Den her er problem fjerner index 1

        film.getMovietitles();

    }

}
