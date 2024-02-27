import java.util.ArrayList;
//Controller har en metode som returerer en string tilbage
//Controller har en metode som returerer en string tilbage

public class Controller {
    MovieCollection yourMovieCollection = new MovieCollection();

    //CONSTRUCTOR
    public Controller() {
        yourMovieCollection = new MovieCollection();
    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre) {
        yourMovieCollection.addMovie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
    }

    public String showMovieCollection() {
        return yourMovieCollection.toString();
    }

    public String showSearch(String charInput) {
        return yourMovieCollection.searchMovie(charInput);
    }

}


