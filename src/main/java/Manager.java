public class Manager extends Employee{

    int salary = 13000;

    public int salaryCalculation(){
        return salary;
    }

    @Override
    public String toString() {
        return "Manager, " +
                "salary = " + salaryCalculation();
    }
}
