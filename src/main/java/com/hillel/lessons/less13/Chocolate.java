package com.hillel.lessons.less13;

public class Chocolate extends Product implements Sweets {

    private String type;

    private int quantity;

    public Chocolate(double weight, int price, String country, String type, int quantity) {
        super(weight, price, country);
        this.type = type;
        this.quantity = quantity;
    }


    public void priceAll() {
        int price = (getPrice());
        setPrice(price * quantity);
    }


    public String getDescription() {
        return "Chocolate:" + type + " Country - " + getCountry();
    }

    @Override
    public void sugar() {
        System.out.println("Chocolate " + type + " contains sugar");
    }
}
