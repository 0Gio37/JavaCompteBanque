package fr.compte.bancaire.entreprise;

public class Employe implements Salaire{

    private final String name;
    protected float heureHebdo;
    protected float caHebdo;
    protected float tarifHoraire = 10;
    private float salaire;
    protected float basePaieHebdo;

    public Employe(String name){
        this.name = name;
    }
    public Employe(String name, float caHebdo, float heureHebdo){
        this.name = name;
        this.caHebdo = caHebdo;
        this.heureHebdo = heureHebdo;
        this.basePaieHebdo = this.tarifHoraire * this.heureHebdo;
    }

    public String getName(){
        return this.name;
    }
    public float getSalaire(){
        return this.salaire;
    }
    public float getCaHebdo(){
        return this.caHebdo;
    }
    public float getHeureHebdo(){
        return this.heureHebdo;
    }

}
