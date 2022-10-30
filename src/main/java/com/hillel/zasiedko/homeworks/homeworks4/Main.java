package com.hillel.zasiedko.homeworks.homeworks4;

public class Main {
    public static void main(String[] args) {
        // Exercise #1
        int front = 5;
        int back = 6;
        int FromTheSide = 8;
        int volume = front * back * FromTheSide;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        int length = 4 * (front + back + FromTheSide);
        System.out.println("Cумарна довжина всіх сторін = " + length);

        // Exercise #2

        // Li dynasty
        int warriorsLi = 13;
        int archersLi = 24;
        int ridersLi = 46;
        int numberLi = 860;

        int TotalPowerLi = numberLi * ( warriorsLi + archersLi + ridersLi );

        System.out.println("Загальна сила династії Лі = " + TotalPowerLi);

        // Miny dynasty
        int warriorsMiny = 9;
        int archersMiny = 35;
        int ridersMiny = 12;

        double numberMiny = numberLi * 1.5;
        System.out.println("Кількість воїнів кожного типу династії Мінь = " + numberMiny);

        double TotalPowerMiny = numberMiny * (warriorsMiny + archersMiny + ridersMiny);
        System.out.println("Загальна сила династії Мінь = " + TotalPowerMiny);

        System.out.println("Загальний показник атаки для обох династій = " + (TotalPowerMiny + TotalPowerLi));

        int x = 10; // x 12 y 4 (10 + 4 + 12 - 11 + 4)
        int y = 3;

        System.out.println("result = " + (x++ + ++y + ++x - --x + y++));



    }





}
