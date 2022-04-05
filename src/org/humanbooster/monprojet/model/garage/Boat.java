package org.humanbooster.monprojet.model.garage;

public class Boat extends Vehicle{

    public Boat(int engine, String brand) {
        super(engine, brand);
    }

    @Override
    public void start() {
        System.out.printf("Le bateau %s lèvre l'ancre", brand);
    }

    @Override
    public void stop() {
        System.out.printf("Le bateau %s jette l'ancre", brand);

    }
}
