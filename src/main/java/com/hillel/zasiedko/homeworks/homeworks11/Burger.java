package com.hillel.zasiedko.homeworks.homeworks11;

public class Burger {

    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    String porkMeat;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise){
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

       System.out.println("Classic burger recipe: " + this.bun + " + " +  this.meat + " + "
                + this.cheese + " + " + this.greens + " + " + this.mayonnaise);

    }

    public Burger(String bun, String meat, String cheese, String greens){
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;


        System.out.println("Diet burger recipe: " + this.bun + " + " +  this.meat + " + "
                + this.cheese + " + " + this.greens);

    }
    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, String porkMeat){
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.porkMeat = porkMeat;

        System.out.println("Rich burger recipe: " + this.bun + " + " +  this.meat + " + "
                + this.cheese + " + " + this.greens + " + " + this.mayonnaise + " + " + this.porkMeat);

    }




}
