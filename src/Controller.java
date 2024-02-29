import java.util.ArrayList;
//Controller har en metode som returerer en string tilbage
//Controller har en metode som returerer en string tilbage

public class Controller {
    MovieCollection yourMovieCollection = new MovieCollection();

    //CONSTRUCTOR
    public Controller() {
        yourMovieCollection = new MovieCollection();
    }

    //Metode som tilføjer argumenter fra mail til yourMovieCollection
    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre) {
        yourMovieCollection.addMovie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
    }

    public String showMovieCollection() {
        return yourMovieCollection.toString();
    }

    public ArrayList<Movie> showSearch(String charInput) {
        return yourMovieCollection.searchMovie(charInput);
    }

}


