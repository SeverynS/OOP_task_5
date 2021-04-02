package com.models;

public class Manager extends Employee{

    public int salaryCalculation(){
        return salary = 13000;
    }

    @Override
    public String toString() {
        return "com.models.Manager, " +
                "salary = " + salaryCalculation();
    }
}
