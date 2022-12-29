package com.hillel.zasiedko.homeworks.homeworks16;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        double avg;
        double sum = 0;
        int square = 0;

        int n, m;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter array rows: ");
        int row = s.nextInt();

        System.out.println("Enter array columns: ");
        int column = s.nextInt();

        System.out.println();

        int array[][] = new int[row][column];

        avg = (array.length * array[0].length);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
                System.out.print(array[i][j] + "\t");
                sum += array[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Arithmetic average of the array: " + sum / avg);
        System.out.println();

        for (int k = 0; k < array.length; k++) {
            if (array.length != array[k].length) {
                System.out.println("The array is not square");
                square = 1;
                break;
            }
        }

        if (square == 0) {
            System.out.println("The array is square");
        }

    }
}