package org.humanbooster.monprojet.model.animal;

public class Cheval extends Animal{

    private int hauteurSaut;

    public Cheval(String name, int age, int hauteurSaut) {
        super(name, age);
        this.hauteurSaut = hauteurSaut;
    }
}
