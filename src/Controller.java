public class Controller {
    MovieCollection yourMovie = new MovieCollection();
    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre) {
        yourMovie.addMovie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
    }
}