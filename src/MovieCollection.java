import java.util.ArrayList;
// MovieCollection er information expert

//ATTRIBUTES
public class MovieCollection {
    ArrayList<Movie> movieArr;
    //Der står <Movie> fordi Movie er datatypen

    //CONSTRUCTOR
    public MovieCollection() {
        movieArr = new ArrayList<Movie>();
    }

    public ArrayList<Movie> getMovieArr() {
        return movieArr;
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

    public ArrayList<Movie> searchMovie(String charInput) {
        ArrayList<Movie> filmSearchMatches = new ArrayList<>();

        for (Movie m : movieArr) {
            if (m.getTitle().toLowerCase().contains(charInput.toLowerCase())) {
                filmSearchMatches.add(m);
            }
        }
        if (filmSearchMatches.isEmpty()) {
            System.out.println("Filmen du søger efter findes ikke i samlingen.");
        }
        return filmSearchMatches;
    }
    //TODO: lav pænere så filmene ikke printes i [].

}


