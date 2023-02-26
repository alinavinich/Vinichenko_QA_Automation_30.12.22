package com.hillel.lessons.less17;

import java.util.ArrayList;
import java.util.Collections;

public class ProductMarket {

    ArrayList<Product> products;

    public ProductMarket(ArrayList<Product> products) {
        this.products = products;
    }

    public String productsNames() {
        ArrayList<String> productsNameList = new ArrayList<>();

        for (Product product : products) {
            productsNameList.add(product.getName());
        }
        return productsNameList.toString();
    }

    public String productsNameAlphabetically() {
        ArrayList<String> productsNameList = new ArrayList<>();

        for (Product product : products) {
            productsNameList.add(product.getName());
        }
        Collections.sort(productsNameList, String.CASE_INSENSITIVE_ORDER);
        return productsNameList.toString();
    }

    public String pricesMoreThan(int price) {
        ArrayList<Double> resultProductsListPrices = new ArrayList<>();

        for (Product product : products) {
            if (product.getPrice() > price) {
                resultProductsListPrices.add(product.getPrice());
            }
        }
        return resultProductsListPrices.toString();
    }

    public String pricesLessThan(int price) {
        ArrayList<Double> resultProductsListPrices = new ArrayList<>();

        for (Product product : products) {
            if (product.getPrice() < price) {
                resultProductsListPrices.add(product.getPrice());
            }
        }
        return resultProductsListPrices.toString();
    }

    public String allPrices() {
        ArrayList<Double> allPrices = new ArrayList<>();
        for (Product product : products) {
            allPrices.add(product.getPrice());
        }
        return allPrices.toString();
    }

}
