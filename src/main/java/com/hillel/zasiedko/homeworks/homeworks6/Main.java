package com.hillel.zasiedko.homeworks.homeworks6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercise № 7

        Random random = new Random();

        int numb = random.nextInt(10) + 1;

        boolean victory = false;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Спроба № " + (i + 1) + ": введіть число від 1 до 10");
            int n = scanner.nextInt();
            victory = n == numb;
            if (victory) {
                scanner.nextLine();
                break;
            }
        }

        scanner.close();
        System.err.println(victory ? " Перемога!" : " Поразка!");

            //Exercise 8

        int counter1 = 0;
        int counter2 = 0;


        while (counter1 != 100) {
            if (!(counter2 / 10 == 4) && !(counter2 / 10 == 9) && !(counter2 % 10 == 4) && !(counter2 % 10 == 9) && !(counter2 / 10 == 14)) {
                counter1++;
                System.out.println(" Shutle number : " + counter2++);
            } else {
                counter2++;
            }

        }
        System.out.println(counter1);
    }
}




