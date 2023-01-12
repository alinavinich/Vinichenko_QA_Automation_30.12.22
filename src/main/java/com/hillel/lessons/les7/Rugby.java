package com.hillel.lessons.les7;

public class Rugby {
    public static void main(String[] args) {


        int lowerLimit = 18;
        int upperLimit = 40;
        int playersCount = 25;


        int[] firstTeamAges = new int[playersCount];
        int[] secondTeamAges = new int[playersCount];

        for (int i = 0; i < playersCount; i++) {
            firstTeamAges[i] = (int) Math.round(Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit);
        }
        for (int i = 0; i < playersCount; i++) {
            System.out.print(firstTeamAges[i] + ((firstTeamAges.length - 1 == i) ? "" : ", "));
        }
        System.out.println();

        for (int j = 0; j < playersCount; j++) {
            secondTeamAges[j] = (int) Math.round(Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit);
        }
        for (int j = 0; j < playersCount; j++) {
            System.out.print(secondTeamAges[j] + ((secondTeamAges.length - 1 == j) ? "" : ", "));

        }
        System.out.println();

        double sum1 = 0;
        for (int x : firstTeamAges) {
            sum1 += x;
        }
        int arithmeticMean1 = (int) Math.round(sum1 / firstTeamAges.length);

        System.out.println(arithmeticMean1);

        double sum2 = 0;
        for (int x : secondTeamAges) {
            sum2 += x;
        }
        int arithmeticMean2 = (int) Math.round(sum2 / secondTeamAges.length);

        System.out.println(arithmeticMean2);


    }
}
