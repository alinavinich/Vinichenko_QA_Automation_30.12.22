package com.hillel.lessons.les4;

public class Chinese_Dynasties {
    public static void main(String[] args) {

        int li_warrior = 13;
        int li_archer = 24;
        int li_rider = 46;

        int li_number = 860;

        int li_attack_rate = (li_archer + li_rider + li_warrior) * li_number;

        System.out.println("General attack of Li Army = " + li_attack_rate);

        int min_warrior = 9;
        int min_archer = 35;
        int min_rider = 12;

        double min_number = li_number * 1.5;

        double min_attack_rate = (min_warrior + min_archer + min_rider) * min_number;

        System.out.print("General attack of Min Army = ");

        System.out.println((int) +min_attack_rate);
    }
}
