package com.hillel.lessons.less11Part2;

public class Data {

    private String name;

    private int dateOfBirth;
    private String monthOfBirth;
    private int yearOfBirth;
    private String email;
    private int phoneNumber;

    String surname;
    int weight;
    String pressure;
    int steps;

    private int age;

    private final int year = 2023;


    public Data(String name, int dateOfBirth, String monthOfBirth, int yearOfBirth, String email, int phoneNumber, String surname, int weight, String pressure, int steps) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = year - yearOfBirth;
    }





    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println("First user: "+ getName() + " " + surname + ", " + getDateOfBirth() + " " + getMonthOfBirth() + " "
                + getYearOfBirth() + " year of birth. Age - " + getAge() + ". Email - " + getEmail() + ". Phone number - "
        + getPhoneNumber() + ". Weight - " + weight + ". Pressure - " + pressure + ". Steps - " + steps);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        this.age = year - yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "UnchangedData{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", monthOfBirth='" + monthOfBirth + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", pressure='" + pressure + '\'' +
                ", steps=" + steps +
                '}';
    }


}
