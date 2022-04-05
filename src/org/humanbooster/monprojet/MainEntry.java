package org.humanbooster.monprojet;

import org.humanbooster.monprojet.model.animal.Animal;
import org.humanbooster.monprojet.model.animal.Cheval;
import org.humanbooster.monprojet.model.animal.Tigre;
import org.humanbooster.monprojet.model.garage.Voiture;

import java.util.ArrayList;

public class MainEntry {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Tigre("Sherkan", 20, 84, 50));
        animals.add(new Cheval("JJ", 19, 3));
        animals.add(new Tigre("Sherkan2", 20, 8 , 50));
        animals.add(new Cheval("JJ2", 19, 3));
        animals.add(new Tigre("Sherkan3", 20, 84, 50));
        animals.add(new Tigre("Sherkan4", 20, 84, 50));

        for (Animal animal : animals) {
            if(animal instanceof Tigre){
                ((Tigre)animal).bondit();
            }
            animal.manger();
        }

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
