package com.hillel.zasiedko.homeworks.homeworks8;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int result = 0;

        int[] lottery = new int[7];


        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(lottery);




        int[] player = new int[7];

        for (int i = 0; i < player.length; i++) {
            player[i] = (int) (Math.random() * 10);

        }
        Arrays.sort(player);


        for (int i = 0; i < lottery.length; i++) {
            if (lottery[i] == player[i]){
                result++;
            }

        }
        System.out.println("Кількість збігів : " + result);
    }
}
