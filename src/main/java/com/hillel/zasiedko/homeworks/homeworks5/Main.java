package com.hillel.zasiedko.homeworks.homeworks5;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Team1

        System.out.println("Please enter your team name");
        Scanner scanner = new Scanner(System.in);
        String dennvi = scanner.nextLine();
        System.out.println("Team 1 = " + dennvi);


        System.out.println("Please, write your number of kills");
        Scanner scanner1 = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int kills1 = scanner.nextInt();
            System.out.println(kills1);
            System.out.println("shuhehu = " + kills1);
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }

        Scanner scanner2 = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int kills2 = scanner.nextInt();
            System.out.println(kills2);
            System.out.println("bk9 = " + kills2);
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }

        Scanner scanner3 = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int kills3 = scanner.nextInt();
            System.out.println(kills3);
            System.out.println("c4rlwow = " + kills3);
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }

        Scanner scanner4 = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int kills4 = scanner.nextInt();
            System.out.println(kills4);
            System.out.println("colltheboy = " + kills4);
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }

        Scanner scanner5 = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int kills5 = scanner.nextInt();
            System.out.println(kills5);
            System.out.println("p1eckFinger = " + kills5);
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }

        int shuhehu = 29;
        int bk9 = 27;
        int c4rlwow = 18;
        int colltheboy = 16;
        int p1eckFinger = 10;

        int numberOfPlayers1 = 5;

        int teamKills1 = shuhehu + bk9 + c4rlwow + colltheboy + p1eckFinger;

        int avg1 = teamKills1 / numberOfPlayers1;

        System.out.println();

        System.out.println(" Team Kills1 = " + teamKills1);
        System.out.println(" Team AVG1 = " + avg1);

        //Team 2

        System.out.println("Please enter your team name");
        Scanner scannerteam = new Scanner(System.in);
        String pikantni = scanner.nextLine();
        System.out.println("Team 2 = " + pikantni);


        System.out.println("Please, write your number of kills");
        Scanner scanner6 = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int kills6 = scanner.nextInt();
            System.out.println(kills6);
            System.out.println("callmedaddey = " + kills6);
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }

        Scanner scanner7 = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int kills7 = scanner.nextInt();
            System.out.println(kills7);
            System.out.println("glaadii = " + kills7);
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }

        Scanner scanner8 = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int kills8 = scanner.nextInt();
            System.out.println(kills8);
            System.out.println("koury = " + kills8);
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }

        Scanner scanner9 = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int kills9 = scanner.nextInt();
            System.out.println(kills9);
            System.out.println("abohadid = " + kills9);
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }

        Scanner scanner10 = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int kills10 = scanner.nextInt();
            System.out.println(kills10);
            System.out.println("hr_o = " + kills10);
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart application");
            System.exit(0);
        }

        int callmedaddey = 17;
        int glaadii = 17;
        int koury = 13;
        int abohadid = 12;
        int hr_o = 11;

        int numberOfPlayers2 = 5;

        int teamKills2 = callmedaddey + glaadii + koury + abohadid + hr_o;

        int avg2 = teamKills2 / numberOfPlayers2;

        System.out.println();

        System.out.println(" Team Kills2 = " + teamKills2);
        System.out.println(" Team AVG2 = " + avg2);

        if (avg1 > avg2) {
            System.out.println(" AVG1 > AVG2 ");
        } else {
            System.out.println(" AVG1 <= AVG2 ");
        }

        System.out.println(" Перемогла команда " + dennvi + " набрала " + avg1 + " очків ");
    }
}


