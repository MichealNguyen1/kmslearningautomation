package learning.variable.modifier.type;

/**
 * Created by trangtnnguyen on 1/30/2019.
 */
public class Employee {
    // this instance variable is visible for any child class.
    public String name;

    // salary  variable is visible in Employee class only.
    private double salary;

    // The name variable is assigned in the constructor.
    public Employee(String empName) {
        name = empName;
    }

    public static void main(String args[]) {
        Employee empOne = new Employee("Ransika");
        empOne.setSalary(1000);
        empOne.printEmp();
    }

    // The salary variable is assigned a value.
    public void setSalary(double empSal) {
        salary = empSal;
    }

    // This method prints the employee details.
    public void printEmp() {
        System.out.println("name : " + name);
        System.out.println("salary: " + salary);
    }
}
