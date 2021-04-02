package com.models;

public class Agent extends Employee{

    protected int sumOfSales;

    public Agent(int sumOfSales) {
        this.sumOfSales = sumOfSales;
    }

    public int salaryCalculation(){
        return this.salary += this.sumOfSales * 0.05;
    }

    @Override
    public String toString() {
        return "com.models.Agent, " +
                "salary = " + "" + this.salaryCalculation();
    }
}
