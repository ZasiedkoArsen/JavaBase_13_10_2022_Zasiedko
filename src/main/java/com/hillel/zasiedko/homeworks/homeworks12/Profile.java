package com.hillel.zasiedko.homeworks.homeworks12;

public class Profile {

    private final String name;
    private final int day;
    private final int month;
    private final int year;
    private final String email;
    private final String phoneNumber;
    private String lastName;
    private double weight;
    private String pressure;
    private int steps;

    private int a = 2020;
    private int age;



    public Profile(String name, String lastName, int day, int month, int year, String email, String phoneNumber,
                   double weight, String pressure, int steps) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = a - year;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public void setPressure() {
        this.pressure = pressure;
    }

    public void setSteps() {
        this.steps = steps;
    }

    void printAccountInfo() {
        System.out.println( "Account info: " + "\n" + "Name : " + getName() + "\n" + "Last name : " + lastName + "\n" + "Age : " + getAge() + "\n"
                + "Day : " + getDay() + "\n" + "Month : " + getMonth() + "\n" + "Year : " + getYear() + "\n" + "Email : "
                + getEmail() + "\n" + "Phone number : " + getPhoneNumber() + "\n" +  "Weight : " + weight + "\n"
                + "Pressure : " + pressure + "\n" + "Steps : " + steps);
    }

}






