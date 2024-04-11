package ui;
import SortMethods.ParameterComparator;
import domain_model.*;


import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    ///********** Generate instance of Adventure Controler connect to game *************************///
    Scanner input = new Scanner(System.in);
    Controller film = new Controller();


    ///********** Game master this keeps game in a loop and calls methods *************************///

    public void startMenue(){

        film.loadMovieCollection(); //load the movies from the CSV-file on startup
        film.sortComparator(film.getMovieCollection(), "title"); // Sorter dem efter title


        int sentinal = 7;
        int userChoice = 0;

        while (userChoice != sentinal) {
            System.out.println("Welcome to my movie collection!");
            System.out.println(" ---- 1. Add a movie");
            System.out.println(" ---- 2. Search for a movie");
            System.out.println(" ---- 3. Show the movie collection");
            System.out.println(" ---- 4. Update a movie");
            System.out.println(" ---- 5. Delete a movie");
            System.out.println(" ---- 6. Sort movie collection");
            System.out.println(" ---- 7. Save movie collection and exit program");

            userChoice = readIntWithValidation("Please select a menu option by entering the corresponding number \n", 1, 7);
            //userChoice = input.nextInt();
            switch (userChoice){
                case 1 -> {
                    OpretEnFilm();
                    returMenue();
                }
                case 2 -> {
                    searchAmovie();
                    returMenue();
                }
                case 3 -> {
                    showMovieCollection();
                    returMenue();
                }
                case 4 -> {
                    updateMovie();
                    returMenue();
                }
                case 5 -> {
                    removeMovie();
                    returMenue();
                }
                case 6 -> {
                    selectSortMethod();
                    returMenue();
                }
                case 7 -> {
                    film.saveMovieCollection(film.doesCollectionsDiffer()); //program saves movieCollection on exit
                    System.out.println("Exiting....");
                }

                default -> {
                }
            }
        }
    }

    ///********** Helper methods and print out practical information  *******************************///

    // --- Helper method to get to start --- //
    public void returMenue() {
        boolean brugervalg = true;
        while (brugervalg) {
            System.out.println("Do you want to return to main menu? type yes or false");
            brugervalg = input.next().equalsIgnoreCase("yes");{
                brugervalg = false;
            }
        }
    }

    ///********** Methods to generate film   ****************************************************///

    public void OpretEnFilm(){

        boolean dummyVar = true;

        while (dummyVar) {
            System.out.println("Please type in the title");
            String title = input.next();
            System.out.println("Please type in who directed it");
            String director = input.next();
            System.out.println("Please type in the year the movie was released");
            int year = input.nextInt();
            System.out.println("Are the movie in color (true) else (false)");
            boolean IsInColor = input.nextBoolean();
            System.out.println("How long is the movie in minutes?");
            double LenghtinMin = input.nextDouble();
            System.out.println("what genre is it ?");
            String genre = input.next();
            film.tilFøjMovie(title, director, year, IsInColor, LenghtinMin, genre);
            System.out.println("Movie was added to your libary");
            System.out.println("If you want to add another type true, else false");
            boolean dummyVarUpdate = input.nextBoolean();
            dummyVar = dummyVarUpdate;
        }
    }

    ///********** Methods to handle movies ****************************************************///

    public void searchAmovie(){
        System.out.println("Please type in what movie you want to find");
        String userInput = input.next();
        System.out.println(film.searchMovieCollection(userInput));

    }

    public void showMovieCollection(){
        String film2 = film.getMovietitles();
        System.out.println(film2);
    }

    public void updateMovie (){
        System.out.println("to edit the sub categories type the corresponding number:" +
                "\n 1.Director " +
                "\n 2.Year " +
                "\n 3.Is in color " +
                "\n 4.Length in min " +
                "\n 5. Genre");

        int attribute = input.nextInt();
        System.out.println("Please type in the name of the movie you want to edit");
        String movieEdit = input.next();
        System.out.println("what do you want it to update to?");
        String updateValue = input.next();
        film.updateMovie(attribute, movieEdit, updateValue);
    }

    public void removeMovie() {
        System.out.println(film.getMovietitles());
        System.out.println("Please enter the title of the movie you want to remove");
        String title = input.nextLine();
        System.out.println(film.removeMovie(title));
    }

    /// *** Sorting methods *** ///
    public void sortMovieCollection() {

        String inputting = sortMovieCollectionhelper();

        film.sortComparator(film.getMovieCollection(), inputting);

    }

    public void sortOnMultipleInput(){
        System.out.println("Please choose which two inputs you want to sort your movieCollection on");
        String userInput1 = sortMovieCollectionhelper();

        System.out.println("Great next attribute");
        String userInput2 = sortMovieCollectionhelper();

        film.sortMultipleAttributes(film.getMovieCollection(),userInput1,userInput2);
    }

    // *** Helper method to sortMovieCollection *** //
    public String sortMovieCollectionhelper(){

        System.out.println("What attribute do you want to sort for? ( Title / Director / Year / Lengthinmin / Genre )");
        String userInput = input.nextLine();

        String userInputadj = "";

        switch (userInput.toLowerCase()) {
            case "title", "t", "tit":
                userInputadj = "title";
                break;
            case "director", "dir", "d":
                userInputadj = "director";
                break;
            case "year", "y", "ye":
                userInputadj = "year";
                break;
            case "length in minutes", "length", "l", "lengthinmin":
                userInputadj = "lengthinmin";
                break;
            case "genre", "g", "gen":
                userInputadj = "genre";
                break;
            default:
                System.out.println("Invalid input - please try again");

        }

        return userInputadj;

    }

    // *** Helper to choose which sorting method *** //
    public void selectSortMethod () {
        System.out.println("Please type 1 for sorting on 1 type and 2 for sorting of 2 types (doh)");
        int userInput = input.nextInt();
        input.nextLine();

        switch (userInput) {
            case 1 -> sortMovieCollection();
            case 2 -> sortOnMultipleInput();
            default -> System.out.println("Invalid input - please try again");
        }
    }


    ///********************* Error handling methods ********************************************///


    private int readIntWithValidation (String prompt, int min, int max) {
        int userInput = 0;
        boolean flagdown = false;

        while (!flagdown) {
            try {
                System.out.print(prompt);
                userInput = input.nextInt();
                input.nextLine();

                if(userInput>= min && userInput <= max){
                    flagdown = true;
                } else {
                    System.out.println("Error! Please input a number between " + min + " and " + max);
                }

            } catch (InputMismatchException ime){
                System.out.println("Error! Please input a valid number!");
                input.nextLine();
            }
        } return userInput;
    }

    private int validateUserInput (String prompt) {
        int userInput = 0;
        boolean flagdown = false;

        while (!flagdown) {
            try {
                System.out.print(prompt);
                userInput = input.nextInt();
                input.nextLine();
                flagdown = true;

            } catch (InputMismatchException ime){
                System.out.println("Error! Please input a valid number!");
                input.nextLine();

            }
        } return userInput;

        //Try catch metode til at fange InputMismatchException. Vi tilskriver den parameteren String prompt, så der kan udskrives en prompte string.
        //Herefter deklarer vi en int 'userInput' og en boolean 'flagdown'.
        //Samtidig bruger vi et while-loop med conditionen (!flagdown), så metoden bliver ved med genstarte indtil brugeren har indtastet en int værdi.
        //Når der bliver givet en int, vil flagdown blive true, hvilket gør vi bryder ud af while loopet.

    }

    //****************** testing ************************************* //

}
