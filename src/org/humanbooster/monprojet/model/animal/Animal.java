package org.humanbooster.monprojet.model.animal;

public abstract class Animal {

    protected String name;
    protected int age;
    protected boolean vivant;

    public Animal(String name) {
        this.name = name;
        this.vivant = true;
    }

    public Animal(String name, int age) {
        this(name);
        this.age = age;
    }

    public Animal(String name, int age, boolean vivant) {
        this(name, age);
        this.vivant = vivant;
    }

    public void manger(){
        System.out.println("L'animal se baisse et mange de l'herbe bien fraîche");
    }

}

