package org.humanbooster.monprojet.model.garage;

public abstract class Vehicle {

    private int engine;
    protected String brand;

    public Vehicle(int engine, String brand) {
        this.engine = engine;
        this.brand = brand;
    }

    public abstract void start();
    public abstract void stop();

    public final void displayEngine(){
        System.out.println(this.brand + " à pour engine: "+this.engine);
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append("engine=").append(engine);
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
