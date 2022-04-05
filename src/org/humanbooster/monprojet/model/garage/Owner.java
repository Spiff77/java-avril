package org.humanbooster.monprojet.model.garage;

import java.util.ArrayList;

public class Owner {
    private String name;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }

    public void add(Vehicle v){
        this.vehicles.add(v);
    }

    public int countByBrand(String brand){
        return (int) this.vehicles.stream().filter(v -> v.brand.equalsIgnoreCase(brand)).count();
    }

    public void startAll(){
        for (Vehicle vehicle : this.vehicles) {
            vehicle.start();

            if(vehicle instanceof Plane){
                ((Plane) vehicle).fly();
            }
            if(vehicle instanceof Boat b){
                b.sail();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Owner{");
        sb.append("name='").append(name).append('\'');
        sb.append(", vehicles=").append(vehicles);
        sb.append('}');
        return sb.toString();
    }
}
