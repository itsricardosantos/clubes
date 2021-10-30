package com.company;

public class Staff {
    private String name;
    private int age;
    private int yearsInClub;
    private double salary;
    private double bonus;

    public Staff (String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public double getAnnualSalary() {
        return getSalary() * 14;
    }

    public double getBonus() {
        return bonus;
    }
}
