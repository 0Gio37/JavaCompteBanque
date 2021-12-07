package fr.compte.bancaire;

public class Compte_Epargne extends Compte_Bancaire{

    private float interestRate =6;

    public Compte_Epargne(){
        super();
    }
    public Compte_Epargne(float solde){
        super(solde);
    }

    public float interestCalcul(){
        float newSolde = super.getSolde() + ((super.getSolde()*this.interestRate)/100);
        super.setSolde(newSolde);
        return super.getSolde();
    }





}
