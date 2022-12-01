package com.hillel.zasiedko.homeworks.homeworks10;

public class Person {
    public static void main(String[] args) {
        String person = personinfo("Will", "Smith", "New York","+380980231234");
        System.out.println(person);
        System.out.println(personinfo("Jackie", "Chan", "Shanghai", "+380680111141"));
        System.out.println(personinfo("Sherlock", "Holmes", "London", "+380501233921"));
    }

    static String personinfo(String name, String surname, String city, String phonenumber){
        return "You can call the citizens of " + name + " " + surname + " from the city of " + city + " at the number " + phonenumber;
    }



}
