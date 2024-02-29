import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Controller controller = new Controller();
    Scanner scanner = new Scanner(System.in);

    public void startProgram() {
        int userInput = 0;
        int SENTINEL = 5;

        while (userInput != SENTINEL) {
            showMenu();
            userInput = scanner.nextInt();

            if (userInput == 1) {
                addMovie();
            } else if (userInput == 2) {
                showMovies();
            } else if (userInput == 3) {
                searchMovies();
            } else if (userInput == 4) {
                editMovie();
            } else if (userInput == SENTINEL) {
                System.out.println("Oprettelse af film afsluttes.");
            }
        }
    }

    public void showMenu() {
        System.out.println("Velkommen til min filmsamling!");
        System.out.println("1. Opret en film");
        System.out.println("2. Vis filmsamling");
        System.out.println("3. Søgefunktion");
        System.out.println("4. Rediger i film");
        System.out.println("5. Afslut\n");
    }

    public void addMovie() {
        System.out.println("Hvad er titlen på filmen?");
        String title = scanner.next();
        System.out.println("Hvem har instrueret filmen?");
        String director = scanner.next();
        System.out.println("Hvilket år er filmen lavet?");
        int yearCreated = scanner.nextInt();

        System.out.println("Er filmen i farver? Skriv ja eller nej");
        scanner.next();
        boolean isInColor = false;
        String erIFarve = scanner.nextLine();
        erIFarve = erIFarve.toLowerCase();
        if (erIFarve.equals("ja")) {
            isInColor = true;
        }
        //TODO: Få farve til at virke

        System.out.println("Hvor langt er filmen i minutter?");
        int lenghtInMinutes = scanner.nextInt();
        System.out.println("Hvilken genre er filmen?");
        String genre = scanner.next();

        controller.addMovie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);

        int userInput2 = 0;

        System.out.println("Filmen er tilføjet til samlingen.");
        System.out.println();
        System.out.println("Vil du tilbage til menuen? Skriv 1");
        System.out.println("Vil du afslutte? Skriv 5");
        userInput2 = scanner.nextInt();
    }

    public void showMovies() {
        System.out.println(controller.showMovieCollection());
    }

    public void searchMovies() {
        System.out.println("Indtast et eller flere bogstaver i en filmtitel?");
        String userSearchWord = scanner.next();
        System.out.println(controller.showSearch(userSearchWord.toLowerCase()));
    }

    public void editMovie() {
        System.out.println("Skriv titlen på den film, du vil redigere.");
        String userSearchWord = scanner.next();

        /* //en metode med en lokal arrayliste til controller.showSearch(userSearchWord.toLowerCase()
        ArrayList<Movie> searchResults = controller.showSearch(userSearchWord.toLowerCase());

        if (searchResults.size() > 1){
            System.out.println("Hvilken film vil du ændre?" + searchResults);
        }

        //et loop der går igennem listen med søgeresultaterne, og tilføjer et nummer ud fra hver film.
        // Derefter en switch case hvor brugeren kan vælge */

        ArrayList<Movie> movieArr = controller.yourMovieCollection.getMovieArr();

        for (Movie editMovieArr : movieArr) {
            if (editMovieArr.getTitle().equals(userSearchWord)) {
                System.out.println("Hvad vil du redigere, skriv et tal mellem 1 og 6 for at vælge:");
                System.out.println("1. Titel");
                System.out.println("2. Instruktør");
                System.out.println("3. Årstal");
                System.out.println("4. Om filmen er i farver");
                System.out.println("5. Længde i minutter");
                System.out.println("6. Genre");

                int editChoice = scanner.nextInt();

                if (editChoice == 1) {
                    System.out.println("Hvad vil du ændre titlen til?");
                    String titleEdit = scanner.next();
                    editMovieArr.setTitle(titleEdit);

                } else if (editChoice == 2) {
                    System.out.println("Hvad vil du ændre instruktøren til?");
                    String directorEdit = scanner.next();
                    editMovieArr.setDirector(directorEdit);

                } else if (editChoice == 3) {
                    System.out.println("Hvad vil du ændre årstallet til?");
                    int yearCreatedEdit = scanner.nextInt();
                    editMovieArr.setYearCreated(yearCreatedEdit);

                } else if (editChoice == 4) {
                    System.out.println("Er filmen i farver skriv ja, ellers skriv nej.");
                    scanner.next();
                    boolean isInColorEdit = false;
                    String erIFarve2 = scanner.nextLine();
                    erIFarve2 = erIFarve2.toLowerCase();
                    if (erIFarve2.equals("ja")) {
                        isInColorEdit = true;
                    }
                    editMovieArr.setIsInColor(isInColorEdit);
                    //TODO: Få farve til at virke

                } else if (editChoice == 5) {
                    System.out.println("Hvad vil du ændre filmens længde i minutter til?");
                    int lenghtInMinutesEdit = scanner.nextInt();
                    editMovieArr.setLenghtInMinutes(lenghtInMinutesEdit);

                } else if (editChoice == 6) {
                    System.out.println("Hvad vil du ændre genren til?");
                    String genreEdit = scanner.next();
                    editMovieArr.setGenre(genreEdit);
                }

                int userInput3 = 0;

                System.out.println("Din ændring er gemt.");
                System.out.println();
                System.out.println("Vil du tilbage til menuen? Skriv 1");
                System.out.println("Vil du afslutte? Skriv 5");
                userInput3 = scanner.nextInt();

            }

        }

    }
}
