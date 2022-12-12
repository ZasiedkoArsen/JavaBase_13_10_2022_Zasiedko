package com.hillel.zasiedko.homeworks.homeworks13;

public class Androids implements Smartphones,LinuxOS{
    private String name;

    public Androids(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void LinuxOS() {
        System.out.println("4) LinuxOS");
    }

    @Override
    public void sms() {
        System.out.println("1) SMS");
    }

    @Override
    public void call() {
        System.out.println("2) Call");
    }

    @Override
    public void internet() {
        System.out.println("3) Internet");
    }

    public void phonesInfo(){
        System.out.println(getName() + " has the following functions :");
    }
}
