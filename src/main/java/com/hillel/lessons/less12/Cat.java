package com.hillel.lessons.less12;

public class Cat {

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {
    }

    public void sayMeow() {
        System.out.println("Meow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error! Wrong data!");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (age >= 0) {
            this.weight = age;
        } else {
            System.out.println("Error! Wrong data!");
        }
    }
}




