package com.hillel.zasiedko.homeworks.homeworks13;

public class Main {
    public static void main(String[] args) {

        Androids androids = new Androids("Android");
        Iphones iphones = new Iphones("Iphone");

        androids.phonesInfo();
        androids.sms();
        androids.call();
        androids.internet();
        androids.LinuxOS();
        System.out.println();
        iphones.phonesInfo2();
        iphones.sms();
        iphones.call();
        iphones.internet();
        iphones.IOS();



    }
}
