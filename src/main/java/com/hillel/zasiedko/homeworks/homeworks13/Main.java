package com.hillel.zasiedko.homeworks.homeworks13;

public class Main {
    public static void main(String[] args) {

        Androids androids = new Androids("Android");

        androids.phonesInfo();
        androids.sms();
        androids.call();
        androids.internet();
        androids.LinuxOS();

        Iphones iphones = new Iphones("Iphone");

        iphones.phonesInfo2();
        iphones.sms();
        iphones.call();
        iphones.internet();
        iphones.IOS();



    }
}
