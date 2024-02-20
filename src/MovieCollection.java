public class MovieCollection {

    private Movie[] MovieCollection;
    int count = 0;

    public MovieCollection() {
        this.MovieCollection = new Movie[5];
    }

    public void tilFøjMovie(String tilte, String director, int year, boolean IsInColor, String genre) {
        MovieCollection[count++] = new Movie(tilte, director,year, IsInColor, genre);

    }

    public void filmIdatabase(){
        for( String i : MovieCollection){
            System.out.println(i);
        }
    }

}




//for (Movie movieCollection : MovieCollection){
//        MovieCollection.getTitle();

//        for (int i = 0; i <MovieCollection.length()-1; i++){
//        System.out.println(Movie.getTilte());