package fr.compte.bancaire.entreprise;

public class Employe30 extends Employe{

    public Employe30(String name){
        super(name);
    }
    public Employe30(String name, float caHebdo, float heureHebdo){
        super(name, caHebdo, heureHebdo);
    }

    public float getSalaire(){
        if(this.heureHebdo >40){
            float tauxMajoration = 30;
            float heureSupp = ((this.heureHebdo-40)*(this.tarifHoraire+(this.tarifHoraire* tauxMajoration)/100));
            return this.basePaieHebdo+heureSupp;
        }else{
            return basePaieHebdo;
        }
    }
}
