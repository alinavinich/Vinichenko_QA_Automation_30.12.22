package com.hillel.lessons.less13;

public abstract class Product {

    private double weight;
    private int price;
    private String country;

    public Product(double weight, int price, String country) {
        this.weight = weight;
        this.price = price;
        this.country = country;
    }

    public void setWeight(double weight) {

    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public abstract String getDescription();


}
