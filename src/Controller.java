public class Controller {
    MovieCollection yourMovieCollection = new MovieCollection();
    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre) {
        yourMovieCollection.addMovie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
    }

    public String showMovieCollection(){
        return yourMovieCollection.toString();
    }
}
//Controller har en metoder som returerer en string tilbage