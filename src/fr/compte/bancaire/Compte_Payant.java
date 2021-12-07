package fr.compte.bancaire;

public class Compte_Payant extends Compte_Bancaire{

    private float takingTaxes = 5;

    public Compte_Payant(){
        super();
    }
    public Compte_Payant(float solde){
        super(solde);
    }

    public void depositMoney(float val){
        float newSolde = super.getSolde() +val - this.takingTaxes;
        super.setSolde(newSolde);
    }

    public void takeMoney(float val){
        float newSolde = super.getSolde() - val - this.takingTaxes;
        super.setSolde(newSolde);
    }

}
