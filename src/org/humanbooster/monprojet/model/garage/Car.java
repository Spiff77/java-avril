package org.humanbooster.monprojet.model.garage;

public class Car extends Vehicle{

    public Car(int engine, String brand) {
        super(engine, brand);
    }

    @Override
    public void start() {
        System.out.printf("La voiture %s prend la route", brand);

    }

    @Override
    public void stop() {
        System.out.printf("La voiture %s se gare sur le bas côté", brand);
    }
}
