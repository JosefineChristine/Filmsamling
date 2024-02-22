public class Movie {

    //Her er vores dataobjekt

    //ATTRIBUTTER
    private String title;
    private String director;
    private int yearCreated;
    private boolean isInColor;
    private int lenghtInMinutes;
    private String genre;

    //CONSTRUCTOR som bruger this
    public Movie(String title, String director, int yearCreated, boolean isInColor,
                 int lenghtInMinutes, String genre){
        this.title = title;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lenghtInMinutes = lenghtInMinutes;
        this.genre = genre;
    }

    //METODE
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean getIsInColor() {
        return isInColor;
    }

    public int getLenghtInMinutes() {
        return lenghtInMinutes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString(){
        String result = "";
        result += title + ", " + director + ", " + yearCreated + ", ";

        if (isInColor) {
            result += "filmen er i farve";
        } else {
            result += "filmen er ikke i farve";
        }

        result +=  ", " + lenghtInMinutes + ", " + genre;
        return result;
    }
}
