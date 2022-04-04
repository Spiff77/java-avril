package org.humanbooster.monprojet.model;

import java.util.Objects;

public class Car {

    public String marque;
    private int speed;
    public static final int MAX_SPEED = 200;

    public Car(String marque, int speed) {
        this.marque = marque;
        this.setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = Math.min(speed, MAX_SPEED);
    }

}
