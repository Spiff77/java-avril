package org.humanbooster.monprojet;

import org.humanbooster.monprojet.model.Bank.Compte;
import org.humanbooster.monprojet.model.Bank.CompteEpargne;
import org.humanbooster.monprojet.model.Bank.ComptePayant;
import org.humanbooster.monprojet.model.Bank.CompteSimple;

public class MainEntry {

    public static void main(String[] args) {

        ComptePayant c1 = new ComptePayant(5000);
        System.out.println(c1);
        c1.verser(1000);
        System.out.println(c1);
        c1.retirer(100);
        System.out.println(c1);

    }
}


// 0003
// 0004
// 0005 --> deux versions
/*

Animal
    - manger() --> L'animal broute de l'herbe fraiche


  Cheval extends Animal

  Tigre extends Animal
     - manger() --> Le tigre saute sur le zèbre
 */
