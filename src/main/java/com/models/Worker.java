package com.models;

public class Worker extends Employee{

    protected int workingHours;

    public Worker(int workingHours) {
        this.workingHours = workingHours;
    }

    public int salaryCalculation(){
       return this.salary = workingHours * 100;
    }

    @Override
    public String toString() {
        return "com.models.Worker, " +
                "salary = " + salaryCalculation();
    }
}
