package com.hillel.lessons.les5;

import java.util.Scanner;

public class Counter_Strike {
    public static void main(String[] args) {

        int player1team1 = 0;
        int player2team1 = 0;
        int player3team1 = 0;
        int player4team1 = 0;
        int player5team1 = 0;
        int player1team2 = 0;
        int player2team2 = 0;
        int player3team2 = 0;
        int player4team2 = 0;
        int player5team2 = 0;


        System.out.println("Please enter the name of team number 1");

        Scanner scanner = new Scanner(System.in);

        String team1 = scanner.nextLine();

        System.out.println("Thank you!");
        System.out.println("Enter the scores of the first player of " + team1 + " team");

        if (scanner.hasNextInt()) {
            player1team1 = scanner.nextInt();
            System.out.println("Thank you!");
            System.out.println("Enter the scores of the second player of " + team1 + " team");
        } else {
            System.out.println("Please, enter valid data");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            player2team1 = scanner.nextInt();
            System.out.println("Thank you!");
            System.out.println("Enter the scores of the third player of " + team1 + " team");
        } else {
            System.out.println("Please, enter valid data");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            player3team1 = scanner.nextInt();
            System.out.println("Thank you!");
            System.out.println("Enter the scores of the fourth player of " + team1 + " team");
        } else {
            System.out.println("Please, enter valid data");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            player4team1 = scanner.nextInt();
            System.out.println("Thank you!");
            System.out.println("Enter the scores of the fifth player of " + team1 + " team");
        } else {
            System.out.println("Please, enter valid data");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            player5team1 = scanner.nextInt();
            System.out.println("Thank you!");
            System.out.println("Please enter the data of team number 2");
        } else {
            System.out.println("Please, enter valid data");
            System.exit(0);
        }
        scanner.nextLine();

        String team2 = scanner.nextLine();

        System.out.println("Thank you!");
        System.out.println("Enter the scores of the first player of " + team2 + " team");

        if (scanner.hasNextInt()) {
            player1team2 = scanner.nextInt();
            System.out.println("Thank you!");
            System.out.println("Enter the scores of the second player of " + team2 + " team");
        } else {
            System.out.println("Please, enter valid data");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            player2team2 = scanner.nextInt();
            System.out.println("Thank you!");
            System.out.println("Enter the scores of the third player of " + team2 + " team");
        } else {
            System.out.println("Please, enter valid data");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            player3team2 = scanner.nextInt();
            System.out.println("Thank you!");
            System.out.println("Enter the scores of the fourth player of " + team2 + " team");
        } else {
            System.out.println("Please, enter valid data");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            player4team2 = scanner.nextInt();
            System.out.println("Thank you!");
            System.out.println("Enter the scores of the fifth player of " + team2 + " team");
        } else {
            System.out.println("Please, enter valid data");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            player5team2 = scanner.nextInt();
            System.out.println("Thank you!");
        } else {
            System.out.println("Please, enter valid data");
            System.exit(0);
        }


        int[] numTeam1 = {player1team1, player2team1, player3team1, player4team1, player5team1};
        double sum1 = 0;
        for (int x : numTeam1) {
            sum1 += x;
        }
        double resultTeam1 = sum1 / numTeam1.length;

        int[] numTeam2 = {player1team2, player2team2, player3team2, player4team2, player5team2};
        double sum2 = 0;
        for (int x : numTeam2) {
            sum2 += x;
        }
        double resultTeam2 = sum2 / numTeam2.length;

        if (resultTeam1 > resultTeam2) {
            System.out.println(team1 + " team won, by a score " + (int)sum1);
        } else if (resultTeam1 < resultTeam2) {
            System.out.println(team2 + " team won, by a score " + (int)sum2);
        } else if (resultTeam1 == resultTeam2) {
            System.out.println("Draw! Both teams scored " + (int)sum2);
        }

    }

}




