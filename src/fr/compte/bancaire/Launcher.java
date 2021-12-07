package fr.compte.bancaire;

import fr.compte.bancaire.entreprise.Employe;
import fr.compte.bancaire.entreprise.Paie;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre de saisies");
        int nbSaisie = scanner.nextInt();

        int i = 0;
        while (i < nbSaisie){
            Paie.setInfoSalaire();
            i++;
        }
       Paie.DisplayInfoEmployes();

        scanner.close();

    }
}
