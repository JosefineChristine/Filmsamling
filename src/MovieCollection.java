import java.util.ArrayList;

// MovieCollection er information expert

//En tostring som looper over filmene

//ATTRIBUTES
public class MovieCollection {
    ArrayList<Movie> movieArr = new ArrayList<>();
    //Der står <Movie> fordi Movie er datatypen

    //METODE som modtager data om film
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
            boolean result = movie.getTitle().contains(charInput);

            if (result) {
                return movie.toString();
            }
        }
        return "Søgningen gav ingen resultater";
    }
}

   /*//CONSTRUCTOR
    public MovieCollection () {
    }*/
