package com.hillel.lessons.les4;

public class Parallelepiped {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = 2;

        int volume = a * b * c;

        System.out.println("Volume of parallelepiped = " +volume);

        int length = (a + b +c) * 3;

        System.out.print("Length of sides = " +length);
    }
}