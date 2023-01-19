package com.hillel.lessons.less9;

public class Person {
    public static void main(String[] args) {


        String resultPerson1 = personInfo("Alina", "Vinichenko", "Lviv", "5554726455");
        String resultPerson2 = personInfo("Taras", "Chmut", "Kyiv", "568995264");
        String resultPerson3 = personInfo("Veronika", "Hryschenko", "Brovary", "911");

        System.out.println(resultPerson1);
        System.out.println(resultPerson2);
        System.out.println(resultPerson3);

    }

    static String personInfo(String name, String surname, String city, String phoneNumber) {

        return "You can call a citizen " + name + " " + surname + " from " + city + " city by number " + phoneNumber;

    }

}