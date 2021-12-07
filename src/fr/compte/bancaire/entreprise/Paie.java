package fr.compte.bancaire.entreprise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Paie {

    private static final List<Employe> employeList = new ArrayList<>();

    public static void setInfoSalaire(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel est le nom ?");
        String name = scanner.next();

        System.out.println("combien d'heures hebdo ?");
        float heureHebdo = scanner.nextFloat();

        System.out.println("Quel est le CA hebdo?");
        float caHebdo = scanner.nextFloat();

        System.out.println("Quel est le type d'employé ?");
        System.out.println(" - 1 -> Employé à +30% sur les heures supp");
        System.out.println(" - 2 -> Employé à +50% sur les heures supp");
        System.out.println(" - 3 -> Commercial");
        switch (scanner.nextInt()){
            case 1:
                Employe employe30 = new Employe30(name, caHebdo, heureHebdo);
                employeList.add(employe30);
                break;
            case 2:
                Employe employe50 = new Employe50(name, caHebdo, heureHebdo);
                employeList.add(employe50);
                break;
            case 3:
                Employe commercial = new Commercial(name, caHebdo, heureHebdo);
                employeList.add(commercial);
                break;
        }
        //scanner.close();
    }

    public static void DisplayInfoEmployes(){
        for (Employe employe : employeList){
            System.out.println(employe.getName()+" a travaillé "+employe.getHeureHebdo()+"H hebdo pour un CA de "+employe.getCaHebdo()+" et un salaire de "+employe.getSalaire()+"€");
        }
    }

}
