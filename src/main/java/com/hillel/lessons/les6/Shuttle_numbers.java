package com.hillel.lessons.les6;

public class Shuttle_numbers {
    public static void main(String[] args){

        int alreadyNumbered = 0;
        int lastNumbered = 0;

        while (alreadyNumbered < 100) {
            lastNumbered++;
            String result = Integer.toString(lastNumbered);
            if (!(result.contains("4") || result.contains("9"))){
                System.out.println(lastNumbered);
                alreadyNumbered++;
            }
        }
    }
}
