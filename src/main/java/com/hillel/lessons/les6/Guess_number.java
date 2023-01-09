package com.hillel.lessons.les6;

import java.util.Scanner;

public class Guess_number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int user_number;
        int random = (int) (Math.round(Math.random() * 10));
        int attempts = 1;

        System.out.println("Guess the number from 0 to 10");

        while (attempts != 4) {
            if (scanner.hasNextInt()) {
                user_number = scanner.nextInt();
                if (user_number < 0 || user_number > 10) {
                    System.out.println("Denis, don't break my program. Please enter the number from 0 to 10 :) ");
                    scanner.nextLine();
                    continue;
                }
            } else {
                System.out.println("Denis, don't break my program. Please enter the number from 0 to 10 :) ");
                scanner.nextLine();
                continue;
            }

            if (user_number == random) {
                System.out.println("You are win!!!");
                break;
            } else if (attempts == 3) {
                System.out.println("You lost the game");
                break;

            } else {
                System.out.println("Wrong. You used " + attempts + " out of 3 attempts");
                attempts++;
                scanner.nextLine();
            }
        }


    }
}




