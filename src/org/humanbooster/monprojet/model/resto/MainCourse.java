package org.humanbooster.monprojet.model.resto;

public enum MainCourse {
    Chicken(10), Beef(14), Salad(8);

    private int price;

    MainCourse(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MainCourse{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
