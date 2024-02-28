import java.util.ArrayList;
import java.util.Scanner;
//Der er kun main der tager data ind og ud

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.startProgram();
    }
}

// Planer for User Story 8:
// Nyt menupunkt med editfilm, lav metode til den
// Brugeren indtaster navn på film, hele navnet (søgefunktion - kode fra punkt 3)
// Bruge koden fra da vi kun kunne søge en film
// Vi skal bruge indexOF til at få indexpladsen på den film som skal rettes
// Brug vis-kode fra punkt 2 så brugeren kan se filminfo på film som er valgt til at rette
// Brugerinput -> lave en helt ny movie- som i punkt 1
// set()-metode
// (Vi skal vide hvilket index filmen er på)
// --> efter redigering, vis film (kode fra punkt 2)
//
// ArrayList metoder.. måske indexOf + set har genvejsmenu

