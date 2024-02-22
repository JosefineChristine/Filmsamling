import java.util.Scanner;
//Der er kun main der tager data ind og ud

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Movie collection objekt:
        Controller controller = new Controller();

        int userInput = 0;
        int SENTINEL = 3;

        while (userInput != SENTINEL) {
            System.out.println("Velkommen til min filmsamling!");
            System.out.println("1. Opret en film");
            System.out.println("2. Vis filmsamling");
            System.out.println("3. Afslut");

            userInput = scanner.nextInt();

            if (userInput == 1) {
                scanner.nextLine();
                System.out.println("Hvad er titlen på filmen?");
                String title = scanner.nextLine();
                System.out.println("Hvem har instrueret filmen?");
                String director = scanner.nextLine();
                System.out.println("Hvilket år er filmen lavet?");
                int yearCreated = scanner.nextInt();

                System.out.println("Er filmen i farver? Skriv ja eller nej");
                boolean isInColor = false;
                String erIFarve = scanner.next();
                erIFarve = erIFarve.toLowerCase();
                if (erIFarve.equals("ja")){
                    isInColor=true;
                }
                System.out.println("Hvor langt er filmen i minutter?");
                int lenghtInMinutes = scanner.nextInt();
                scanner.nextLine(); //pga. scanner bug, som gør at hvis man går fra int til String med nextLine så virker det ikke
                System.out.println("Hvilken genre er filmen?");
                String genre = scanner.nextLine();

                controller.addMovie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);

                System.out.println("Filmen er tilføjet til samlingen.");
                System.out.println();

            } else if (userInput == 2){
                System.out.println(controller.showMovieCollection());

            } else if (userInput == SENTINEL) {
                System.out.println("Oprettelse af film afsluttes.");
            }

        }

    }
}

