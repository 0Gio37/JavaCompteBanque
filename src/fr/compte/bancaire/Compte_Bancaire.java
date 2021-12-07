package fr.compte.bancaire;

import java.util.Random;

public class Compte_Bancaire {

    private float solde;
    private String code;

    public Compte_Bancaire(){
        this.solde = 0;
        this.code = (new Random().nextInt(9)+1)+""+
                (new Random().nextInt(9)+1)+""+
                (new Random().nextInt(9)+1)+""+
                (new Random().nextInt(9)+1);
    }

    public Compte_Bancaire(float solde){
        this.solde = solde;
        this.code = (new Random().nextInt(9)+1)+""+
                (new Random().nextInt(9)+1)+""+
                (new Random().nextInt(9)+1)+""+
                (new Random().nextInt(9)+1);
    }

    public String getCode(){
        return this.code;
    }

    public float getSolde(){
        return this.solde;
    }
    public void setSolde(float val){
        this.solde = val;
    }
    public void depositMoney(float val){
        this.solde += val;
    }
    public void takeMoney(float val){
        this.solde -= val;
    }






}
