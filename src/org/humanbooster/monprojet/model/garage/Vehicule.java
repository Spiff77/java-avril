package org.humanbooster.monprojet.model.garage;

public class Vehicule {

    protected int distanceTotal;

    public void start(){
        System.out.println("vroom");
    }

    public int avancer(){
        distanceTotal += 10;
        return distanceTotal;
    }

}
