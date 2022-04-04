package org.humanbooster.monprojet.model.resto;

public enum Dessert {
    IceCream(2), ChocoSnack(3);

    private int price;

    Dessert(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dessert{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
