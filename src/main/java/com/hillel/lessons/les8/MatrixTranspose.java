package com.hillel.lessons.les8;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;


        while (true) {
            System.out.println("Enter the size of the matrix (MxN):");
            System.out.print("M = ");
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                if (m >= 1 && m <= 100) {
                    break;
                }
            }
            System.out.println("Invalid input. Please enter a number between 1 and 100.");
            scanner.nextLine();
        }

        while (true) {
            System.out.print("N = ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n >= 1 && n <= 100) {
                    break;
                }
            }
            System.out.println("Invalid input. Please enter a number between 1 and 100.");
            scanner.nextLine();
        }

        int[][] matrix = new int[m][n];
        int[][] transposedMatrix = new int[n][m];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }


        System.out.println("Original matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }


        System.out.println("\nTransposed matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

