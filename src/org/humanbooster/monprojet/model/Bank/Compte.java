package org.humanbooster.monprojet.model.Bank;

public abstract class Compte {

    private int id;
    protected float solde;
    public static int countComptes;

    public Compte(float solde) {
        this.solde = solde;
        this.id = ++countComptes;
    }

    public void verser(float montant){
        this.solde += montant;
    }

    public void retirer(float montant){
        if(montant > solde){
            System.out.println("Fonds insufisant");
        }else{
            System.out.println("Transaction ok");
            this.solde -= montant;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Compte{");
        sb.append("id=").append(id);
        sb.append(", solde=").append(solde);
        sb.append('}');
        return sb.toString();
    }
}
