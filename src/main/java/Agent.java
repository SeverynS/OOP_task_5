public class Agent extends Employee{

    int sumOfSales;

    public int salaryCalculation(){
        return this.salary += this.sumOfSales * 0.05;
    }

    @Override
    public String toString() {
        return "Agent, " +
                "salary = " + "" + this.salaryCalculation();
    }

    public Agent(int sumOfSales) {
        this.sumOfSales = sumOfSales;
    }
}
