public class EmployeeSalarySystem {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("Shyam", 100000, 10000);
        Employee partTimeEmployee = new PartTimeEmployee("Ram", 500, 4);
        Employee contractEmployee = new ContractEmployee("Mohan", 60000);
        Employee[] employees = {fullTimeEmployee, partTimeEmployee, contractEmployee};
        for(Employee emp : employees){
            emp.displaySalary();
        }
    }
}
abstract class Employee{
    private final String name;
    Employee(String name){
        if(name == null || name.isBlank()){
            throw new IllegalArgumentException("Employee name is required");
        }
        this.name = name;
    }
    abstract double calculateSalary();
    void displaySalary(){
        System.out.println(name + "'s salary is: " + calculateSalary());
    }
}
class FullTimeEmployee extends Employee{
    private final double monthlySalary;
    private final double bonus;
    FullTimeEmployee(String name, double monthlySalary, double bonus){
        super(name);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }
    @Override
    double calculateSalary(){
        return monthlySalary + bonus;
    }
}
class PartTimeEmployee extends Employee{
    private final double hourlyRate;
    private final int workedHours;
    PartTimeEmployee(String name, double hourlyRate, int workedHours){
        super(name);
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }
    @Override
    double calculateSalary(){
        return hourlyRate*workedHours;
    }
}
class ContractEmployee extends Employee{
    private final double contractAmount;
    ContractEmployee(String name, double contractAmount){
        super(name);
        this.contractAmount = contractAmount;
    }
    @Override
    double calculateSalary(){
        return contractAmount;
    }
}
