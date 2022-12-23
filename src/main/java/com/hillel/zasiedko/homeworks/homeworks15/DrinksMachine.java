package com.hillel.zasiedko.homeworks.homeworks15;

public enum DrinksMachine {

    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    WATER("MINERAL WATER"),
    COLA("Coca-Cola");


    private String type;

    DrinksMachine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
