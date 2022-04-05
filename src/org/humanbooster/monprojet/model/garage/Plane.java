package org.humanbooster.monprojet.model.garage;

public class Plane extends Vehicle{

    public Plane(int engine, String brand) {
        super(engine, brand);
    }

    @Override
    public void start() {
        System.out.printf("L'avion %s décolle", brand);

    }

    @Override
    public void stop() {
        System.out.printf("L'avion %s attérit", brand);
    }
}
