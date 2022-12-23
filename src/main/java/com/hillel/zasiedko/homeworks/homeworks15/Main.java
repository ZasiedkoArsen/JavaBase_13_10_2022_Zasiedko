package com.hillel.zasiedko.homeworks.homeworks15;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        DrinksMachine[] drinksMachines = DrinksMachine.values();

        int coffeeCounter = 0;
        int teaCounter = 0;
        int lemonadeCounter = 0;
        int mojitoCounter = 0;
        int waterCounter = 0;
        int colaCounter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a drink from the list: " + Arrays.toString(drinksMachines) + " or press 'STOP'");

        while (true) {
            String userInput = scanner.nextLine().toUpperCase();
            if (userInput == null || userInput.equals("STOP")) {
                break;
            }
            DrinksMachine userDrink = null;
            for (int i = 0; i < DrinksMachine.values().length; i++) {
                String userInputUpperCase = userInput.toUpperCase();
                if (DrinksMachine.values()[i].toString().equals(userInputUpperCase)) {
                    userDrink = DrinksMachine.valueOf(userInputUpperCase);
                    break;
                }
            }
            if (userDrink == null) {
                System.out.println("Drink " + userInput + " not available, please choose a drink from the list");
                continue;
            }

            switch (userDrink) {
                case COFFEE: {
                    System.out.println("Selected drink: " + userDrink.getType() + "\n" + "Sum: " + Drinks.COFFEE + "$"
                            + "\n" + "When you have selected the drink you want, press STOP to complete the operation. If not, continue. GL <3");
                    coffeeCounter++;
                    continue;
                }
                case TEA: {
                    System.out.println("Selected drink: " + userDrink.getType() + "\n" + "Sum: " + Drinks.TEA + "$"
                            + "\n" + "When you have selected the drink you want, press STOP to complete the operation. If not, continue. GL <3");
                    teaCounter++;
                    continue;
                }
                case WATER: {
                    System.out.println("Selected drink: " + userDrink.getType() + "\n" + "Sum: " + Drinks.WATER + "$"
                            + "\n" + "When you have selected the drink you want, press STOP to complete the operation. If not, continue. GL <3");
                    waterCounter++;
                    continue;
                }
                case COLA: {
                    System.out.println("Selected drink: " + userDrink.getType() + "\n" + "Sum: " + Drinks.COLA + "$"
                            + "\n" + "When you have selected the drink you want, press STOP to complete the operation. If not, continue. GL <3");
                    colaCounter++;
                    continue;
                }
                case MOJITO: {
                    System.out.println("Selected drink: " + userDrink.getType() + "\n" + "Sum: " + Drinks.MOJITO + "$"
                            + "\n" + "When you have selected the drink you want, press STOP to complete the operation. If not, continue. GL <3");
                    mojitoCounter++;
                    continue;
                }
                case LEMONADE: {
                    System.out.println("Selected drink: " + userDrink.getType() + "\n" + "Sum: " + Drinks.LEMONADE + "$"
                            + "\n" + "When you have selected the drink you want, press STOP to complete the operation. If not, continue. GL <3");
                    lemonadeCounter++;
                }
            }
        }

        System.out.println();

        int totalCounter = coffeeCounter + teaCounter + lemonadeCounter + mojitoCounter + waterCounter + colaCounter;
        int totalPrice = coffeeCounter * Drinks.COFFEE + teaCounter * Drinks.TEA + lemonadeCounter * Drinks.LEMONADE
                + mojitoCounter * Drinks.MOJITO + waterCounter * Drinks.WATER + colaCounter * Drinks.COLA;

        System.out.println("Bought:  " + totalCounter + "\n" + "Amount due: " + totalPrice + "\n" + "Have a nice day!");
    }
}
