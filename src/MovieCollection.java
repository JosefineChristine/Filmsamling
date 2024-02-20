public class MovieCollection {
    private Movie[] listOfMovies;
    int count = 0;
    //Movie[] betyder at Movie er en array


    public MovieCollection() {
        this.listOfMovies = new Movie[5];
    }

//metode som modtager data om film
    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre) {
        listOfMovies[count++] = new Movie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
    }



}
