package org.humanbooster.monprojet;

import org.humanbooster.monprojet.model.animal.Animal;
import org.humanbooster.monprojet.model.animal.Cheval;
import org.humanbooster.monprojet.model.animal.Tigre;
import org.humanbooster.monprojet.model.garage.Boat;
import org.humanbooster.monprojet.model.garage.Car;
import org.humanbooster.monprojet.model.garage.Owner;
import org.humanbooster.monprojet.model.garage.Plane;

import java.util.ArrayList;

public class MainEntry {

    public static void main(String[] args) {

        Owner o = new Owner("JeanJean");
        o.add(new Boat(20, "Yamaha"));
        o.add(new Plane(1000, "Boeing"));
        o.add(new Car(2, "Fiat"));
        o.add(new Plane(2100, "Fiat"));

        System.out.println(o.countByBrand("fiat"));

    }
}
