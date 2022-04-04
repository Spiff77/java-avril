package org.humanbooster.monprojet.model;

public class Person {

    private String name;
    private int age = 20;
    private Horse horse;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public void displayInfos(){
        System.out.println("La personne " + this.name + " à " + this.age + " ans ");
    }

    public void addToAge(int age) {
        this.age += age;
    }

    public boolean isMajeur(){
        return age >= 18 ? true : false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}

// Définir toString de Personne

// une methode getStatus doit retrouner une chaine en fonction de si la personne est majeur ou mineur
// getStatus() --> "MAJEUR" || "MINEUR"
