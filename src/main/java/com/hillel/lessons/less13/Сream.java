package com.hillel.lessons.less13;

public class Сream extends Product {

    private int fatness;
    private int quantity;

    public Сream(double weight, int price, String country, int fatness, int quantity) {
        super(weight, price, country);
        this.fatness = fatness;
        this.quantity = quantity;
    }

    public void priceCream() {
        int price = getPrice();
        setPrice(price * quantity);

    }

    public String getDescription() {
        return "Cream fatness: " + fatness + " Country - " + getCountry();
    }
}
