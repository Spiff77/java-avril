package org.humanbooster.monprojet.model.resto;

public enum Drink {
    Water(2), Coke(3), Beer(4);

    private int price;

    Drink(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Drink{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
