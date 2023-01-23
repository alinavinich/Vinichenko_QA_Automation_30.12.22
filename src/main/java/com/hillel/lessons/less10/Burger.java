package com.hillel.lessons.less10;

public class Burger {

    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    String spices;


    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, String spices) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.spices = spices;


        System.out.println("Classic burger - " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise + ", " + spices);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Diet burger - " + bun + ", " + meat + ", " + cheese + ", " + greens);
    }

    public Burger(String bun, String cheese, String greens, String mayonnaise, String spices) {
        this.bun = bun;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.spices = spices;
        System.out.println("Vegetarian burger - " + bun + ", " + cheese + ", " + greens + ", " + mayonnaise + ", " + spices);
    }


}
