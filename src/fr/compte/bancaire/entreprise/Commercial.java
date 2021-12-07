package fr.compte.bancaire.entreprise;

public class Commercial extends Employe{

    public Commercial(String name){
        super(name);
    }
    public Commercial(String name, float caHebdo, float heureHebdo){
        super(name, caHebdo, heureHebdo);
    }

    public float getSalaire(){
        float salaireFixe = 350;
        return salaireFixe + (this.caHebdo+((this.caHebdo*1)/100));
    }
}
