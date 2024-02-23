import java.util.ArrayList;
// MovieCollection er information expert

//ATTRIBUTES
public class MovieCollection {
    ArrayList<Movie> movieArr;
    //Der står <Movie> fordi Movie er datatypen

    //CONSTRUCTOR
    public MovieCollection () {
        movieArr = new ArrayList<Movie>();
    }

    //METODE
    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre) {
        Movie movie1 = new Movie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
        movieArr.add(movie1);
    }

    @Override
    public String toString() {
        String result = "";

        for (Movie m : movieArr) {
            result += m.toString();
        }
        return result;
    }

    public String searchMovie(String charInput) {
        for (Movie movie : movieArr) {
            boolean result = movie.getTitle().contains(charInput.toLowerCase());

            if (result) {
                return movie.toString();
            }
        }
        return "\nSøgningen gav ingen resultater";
    }
}


