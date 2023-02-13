package com.hillel.lessons.less13;

public class Cookies extends Product implements Sweets {

    private ShapeOfCookies shape;


    public Cookies(double weight, int price, String country, int quantity, ShapeOfCookies shape) {
        super(weight, price, country);
        this.shape = shape;

    }

    public String getDescription() {
        return "Cookies shape: " + shape.getShape() + " Country - " + getCountry();
    }

    @Override
    public String toString() {
        return "Cookies{" +
                "shape=" + shape.getShape() +
                '}';
    }


    @Override
    public void sugar() {
        System.out.println("Cookies " + shape.getShape() + " contains sugar");
    }
}
