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
    //override fordi den har en  indbygget toString som udskriver volapyk,
    //derfor overrider vi det med en String vi vil have udskrevet.
    //I nogle tilfælde (det her fx her) behøver man ikke skrive @override, andre gange er det vigtigt.
    public String toString(){
        String result = "";
        result += "\n" + title + "\n" + director + "\n" + yearCreated + "\n";

        if (isInColor) {
            result += "filmen er i farve";
        } else {
            result += "filmen er ikke i farve";
        }

        result +=  "\n" + lenghtInMinutes + "\n" + genre + " \n" + "\n";
        return result;
    }
}

//+=: bruges her som ''alt det før plus det her''
