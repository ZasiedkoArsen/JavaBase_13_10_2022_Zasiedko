package com.hillel.zasiedko.homeworks.homeworks7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < team1.length ; i++){
            team1[i] = (int) ( 18 + Math.random() * 23);
            System.out.print(team1[i] + " ");
        }
        for (int value : team1) {
        sum += value;
        }
        System.out.println();
        System.out.println("Total age of players Team1 : " + sum);


        int[] team2 = new int[25];

        for (int i = 0; i < team2.length ; i++){
            team2[i] = (int) ( 18 + Math.random() * 23);
            System.out.print(team2[i] + " ");
        }
        for ( int value2 : team2 ) {
            sum1 += value2;
        }
        System.out.println();
        System.out.println("Total age of players Team2 : " + sum1);

        double averageAgeTeam1 = sum / 25;
        double averageAgeTeam2 = sum1 / 25;

        System.out.println("Average Age Team1 : " + averageAgeTeam1);
        System.out.println("Average Age Team2 : " + averageAgeTeam2);


    }
}
