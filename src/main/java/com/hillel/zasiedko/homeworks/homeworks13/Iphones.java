package com.hillel.zasiedko.homeworks.homeworks13;

public class Iphones implements Smartphones,IOS{

    private String name;

    public Iphones(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void IOS() {
        System.out.println("4) IOS");
    }

    @Override
    public void sms() {
        System.out.println("1) Sms");
    }

    @Override
    public void call() {
        System.out.println("2) Call");
    }

    @Override
    public void internet() {
        System.out.println("3) Internet");
    }

    public void phonesInfo2(){
        System.out.println(getName() + " has the following functions :");
    }
}
