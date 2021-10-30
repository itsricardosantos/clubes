package com.company;

public class Player extends Staff {
    private String position;
    private double salary;
    private int shirtNumber;

    public Player(String name, int age, String position, int shirtNumber, double salary) {
        super(name, age, salary);
        this.position = position;
        this.shirtNumber = shirtNumber;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public double getBonus() {
        return getSalary() + (getSalary() * 0.05);
    }
}
