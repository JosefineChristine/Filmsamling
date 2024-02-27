import java.util.Scanner;
public class UserInterface {
    Controller controller = new Controller();
    Scanner scanner = new Scanner(System.in);
    public void startProgram() {
        int userInput = 0;
        int SENTINEL = 4;

        while (userInput != SENTINEL) {
            System.out.println("Velkommen til min filmsamling!");
            System.out.println("1. Opret en film");
            System.out.println("2. Vis filmsamling");
            System.out.println("3. Søgefunktion");
            System.out.println("4. Afslut\n");

            userInput = scanner.nextInt();
            scanner.next();

            if (userInput == 1) {
                addMovie();
            } else if (userInput == 2) {
                showMovies();
            } else if (userInput == 3) {
                searchMovies();
            } else if (userInput == SENTINEL) {
                System.out.println("Oprettelse af film afsluttes.");
            }
        }
    }
    public void addMovie(){
        System.out.println("Hvad er titlen på filmen?");
        String title = scanner.nextLine();
        System.out.println("Hvem har instrueret filmen?");
        String director = scanner.nextLine();
        scanner.next();
        System.out.println("Hvilket år er filmen lavet?");
        int yearCreated = scanner.nextInt();
        scanner.next();

        System.out.println("Er filmen i farver? Skriv ja eller nej");
        boolean isInColor = false;
        String erIFarve = scanner.nextLine();
        erIFarve = erIFarve.toLowerCase();
        if (erIFarve.equals("ja")) {
            isInColor = true;
        }
        System.out.println("Hvor langt er filmen i minutter?");
        int lenghtInMinutes = scanner.nextInt();
        System.out.println("Hvilken genre er filmen?");
        String genre = scanner.next();

        controller.addMovie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);

        int userInput2 = 0;

        System.out.println("Filmen er tilføjet til samlingen.");
        System.out.println();
        System.out.println("Vil du tilbage til menuen? Skriv 1");
        System.out.println("Vil du afslutte? Skriv 4");
        userInput2 = scanner.nextInt();
    }

    public void showMovies() {
        System.out.println(controller.showMovieCollection());
    }

    public void  searchMovies() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast et eller flere bogstaver i en filmtitel?");
        String userSearchWord = scanner.next();
        System.out.println(controller.showSearch(userSearchWord.toLowerCase()));
    }

}
