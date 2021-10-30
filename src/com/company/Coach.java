package com.company;

public class Coach extends Staff{
    private double salary;
    private String type;

    public Coach(String name, int age, double salary, String type) {
        super(name, age, salary);
        this.type = type;
    }

    @Override
    public double getBonus() {
        return getSalary() + (getSalary() * 0.2);
    }
}