package org.humanbooster.monprojet.model.animal;

public class Tigre extends Animal{

    private int nbRayures;
    private int vitesse;

    public Tigre(String name, int age, int nbRayures, int vitesse) {
        super(name, age);
        this.nbRayures = nbRayures;
        this.vitesse = vitesse;
    }

    public void bondit(){
        System.out.println("Le tigre bondit à une vitesse de "+vitesse);
    }

    @Override
    public void manger() {
        System.out.println("Le tigre mange un steak");
    }
}
