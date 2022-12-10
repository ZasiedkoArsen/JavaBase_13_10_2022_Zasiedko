package com.hillel.zasiedko.homeworks.homeworks12;

public class Main {
    public static void main(String[] args) {

        Profile profile1 = new Profile("Anastasiia", "Bzova",11,11,2003,"bzovaa@gmail.com",
                "+380501241390",55.2, "130/60",13422);

        Profile profile2 = new Profile("Arsen", "Zasiedko", 20, 6,2004,"arsenzasedko67@gmail.com",
                "+380685882382", 75,"150/70", 12522);

        Profile profile3 = new Profile("Rostuslav", "Zasiedvolk", 20, 12,2003,"roszas@gmail.com",
                "+380693315992", 75,"155/67", 11230);

        Profile profile4 = new Profile("Arsen", "Shevchuk", 24, 10,2003,"arshe@gmail.com",
                "+380682311042", 70,"158/69", 6300);

        Profile profile5 = new Profile("Andriy", "Maruch", 19, 12,2005,"maruch@gmail.com",
                "+380683310982", 82,"166/69", 10212);

        profile1.printAccountInfo();
        profile2.printAccountInfo();
        profile3.printAccountInfo();
        profile4.printAccountInfo();
        profile5.printAccountInfo();

    }
}
