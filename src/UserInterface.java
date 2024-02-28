import java.util.Scanner;

public class UserInterface {
    Scanner input = new Scanner(System.in);
    // instance / lave et film object
    // laver en ny film

    Controller film = new Controller();


    public void startMenue(){
        int sentinal = 4;
        int userChoice = 0;

        while (userChoice != sentinal) {

        System.out.println("Velkommen til min filmsamling!");
        System.out.println(" 1. Opret en film");
        System.out.println(" 2. search for movie");
        System.out.println(" 3. Show Movie Collection");
        System.out.println(" 4. step");

        userChoice = input.nextInt();

        if (userChoice == 1){
            OpretEnFilm();
            returMenue();
        } else if (userChoice == 2){
            searchAmovie();
            returMenue();
        } else if (userChoice == 3){
            showMovieCollection();
            returMenue();
        }
    }
    }

    // Methodes for our start menue

    public void OpretEnFilm(){

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

    public void searchAmovie(){
        System.out.println("please type it what movie you want to find");
        String userInput = input.next();
        film.searchMovieCollection(userInput);

    }

    public void showMovieCollection(){
        film.getMovietitles();
    }

    // General methods return to start

    public void returMenue() {
        boolean brugervalg = true;
        while (brugervalg) {
            System.out.println("Do you want to return to main menue, type yes or false");
            brugervalg = input.next().equalsIgnoreCase("yes");{
                brugervalg = false;
            }
        }
    }


}
