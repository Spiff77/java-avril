package org.humanbooster.monprojet.model.Bank;

public class CompteSimple extends Compte{

    private float decouvert;

    public CompteSimple(float solde, float decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(float montant) {
        if(montant > solde + this.decouvert){
            System.out.println("Fonds insufisant");
        }else{
            System.out.println("Transaction ok");
            this.solde -= montant;
        }
    }

    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompteSimple{");
        sb.append("solde=").append(solde);
        sb.append(", decouvert=").append(decouvert);
        sb.append('}');
        return sb.toString();
    }
}
