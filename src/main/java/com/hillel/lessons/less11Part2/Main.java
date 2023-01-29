package com.hillel.lessons.less11Part2;

public class Main {
    public static void main(String[] args) {

        Data firstUser = new Data("Alina", 21, "april", 1992, "vam@gmai.com",
                555444, "Vinichenko", 60, "120/80", 1425);

        firstUser.printAccountInfo();
        System.out.println();

        Data secondUser = new Data("Veronika", 20, "june", 1990, "hyd@kju.d",
                659487, "Popko", 55, "120/85", 666);

        secondUser.printAccountInfo();
        System.out.println();

        Data thirdUser = new Data("Iryna", 20, "september", 1988, "hfdkjf@hfj.dfdf",
                658947, "Prylipko", 80, "110/70", 1558);

        thirdUser.printAccountInfo();
        System.out.println();

        firstUser.setDateOfBirth(5);
        firstUser.setEmail("emailemail.email");

        firstUser.printAccountInfo();
        System.out.println();

        thirdUser.setYearOfBirth(1996);
        thirdUser.setPhoneNumber(111444);

        thirdUser.printAccountInfo();
    }

}
