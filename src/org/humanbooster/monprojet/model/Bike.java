package org.humanbooster.monprojet.model;

public class Bike {

    private String model;
    private String color = "red";
    private int size = 26;

    public Bike(String model, int size){
        System.out.println("Appel du constructeur (String, int)");
        this.model = model;
        this.size = size;
    }

    public Bike(String model, int size, String color){
        this(model, size);
        System.out.println("Appel du constructeur (String, int, String)");
        this.color = color;
    }

    public void display(){
        System.out.println("Le vélo " + this.model + " " + this.color + " est de taille " + this.size + " pouces");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
