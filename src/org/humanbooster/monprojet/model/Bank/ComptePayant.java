package org.humanbooster.monprojet.model.Bank;

public class ComptePayant extends Compte{

    @Override
    public void verser(float montant) {
        super.verser(montant);
        this.solde--;
    }

    @Override
    public void retirer(float montant) {
        if(montant + 1 <= this.solde){
            super.retirer(montant);
            this.solde--;
        }
    }
}
