package com.hillel.lessons.less17;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Banana", 0.5));
        products.add(new Product("Watermelon", 5.5));
        products.add(new Product("Potato", 10.3));
        products.add(new Product("Chicken", 25.9));

        ProductMarket market = new ProductMarket(products);

        System.out.println(market.productsNames());
        System.out.println(market.productsNameAlphabetically());
        System.out.println(market.pricesMoreThan(10));
        System.out.println(market.pricesLessThan(5));
        System.out.println(market.allPrices());
    }
}
