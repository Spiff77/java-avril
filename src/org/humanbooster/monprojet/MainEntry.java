package org.humanbooster.monprojet;

import com.sun.tools.javac.Main;
import org.humanbooster.monprojet.model.CleanDay;
import org.humanbooster.monprojet.model.House;
import org.humanbooster.monprojet.model.resto.Dessert;
import org.humanbooster.monprojet.model.resto.Drink;
import org.humanbooster.monprojet.model.resto.MainCourse;
import org.humanbooster.monprojet.model.resto.Order;


public class MainEntry {

    public static void main(String[] args) {

        Order o = new Order("OD4987", Drink.Beer, MainCourse.Beef, Dessert.ChocoSnack);
        System.out.println("Prix total de la commande: " + o.totalPrice());

    }

}


// 0003
// 0004
// 0005 --> deux versions
