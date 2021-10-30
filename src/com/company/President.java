package com.company;

public class President extends Staff{
    private double salary;
    private double numOfProcesses;

    public President(String name, int age, double salary, int numOfProcesses) {
        super(name, age, salary);
        this.numOfProcesses = numOfProcesses;
    }

    @Override
    public double getBonus() {
        return getSalary() + (getSalary() * 0.1);
    }
}
