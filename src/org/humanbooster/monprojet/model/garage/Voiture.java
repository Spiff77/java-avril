package org.humanbooster.monprojet.model.garage;

public class Voiture extends Vehicule{

    public void honk(){
        System.out.println("HonkHonk");
    }

    @Override
    public int avancer() {
        distanceTotal += 7;
        return distanceTotal;
    }
}
