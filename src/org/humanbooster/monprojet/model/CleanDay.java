package org.humanbooster.monprojet.model;

public enum CleanDay {

    LUN(100, "Lundi"),
    MAR(100, "Mardi"),
    MER(100, "Mercredi"),
    JEU(100, "Jeudi");

    int price;
    String name;
    private CleanDay(int price, String name){
        this.price = price;
        this.name=name;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CleanDay{("+ this.name());
        sb.append(") price=").append(this.price);
        sb.append('}');
        return sb.toString();
    }
}
