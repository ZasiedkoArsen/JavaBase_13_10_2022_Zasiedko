package com.hillel.zasiedko.homeworks.homeworks16;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        int n, m;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter array rows: ");
        int row = s.nextInt();

        System.out.println("Enter array columns: ");
        int column = s.nextInt();

        int array[][] = new int[row][column];

        System.out.println("Enter matrix:");

        for(n = 0; n < row; n++) {
            for(m = 0; m < column; m++)
            {
                array[n][m] = s.nextInt();
                System.out.print(" ");
            }
        }

        System.out.println("Matrix before transposition ");

        for(n = 0; n < row; n++) {
            for(m = 0; m < column; m++)
            {
                System.out.print(array[n][m] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Matrix after transposition ");

        for(n = 0; n < column; n++) {
            for(m = 0; m < row; m++)
            {
                System.out.print(array[m][n] + " ");
            }
            System.out.println(" ");
        }
    }
}
