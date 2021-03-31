public class Worker extends Employee{

    int workingHours;

    public int salaryCalculation(){
       return this.salary = workingHours * 100;
    }

    @Override
    public String toString() {
        return "Worker, " +
                "salary = " + salaryCalculation();
    }

    public Worker(int workingHours) {
        this.workingHours = workingHours;
    }
}
