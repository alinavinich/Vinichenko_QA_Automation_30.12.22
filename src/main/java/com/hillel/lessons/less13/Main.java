package com.hillel.lessons.less13;

public class Main {

    public static void main(String[] args) {

        Chocolate second = new Chocolate(2, 4, "UA", "black", 3);

        second.priceAll();

        System.out.println(second.getPrice());

        Cookies coolie = new Cookies(5.4, 10, "UA", 6, ShapeOfCookies.SQUARE);
        System.out.println(coolie.getDescription());

        coolie.sugar();


    }
}
