class Employee {

    private String employeeName;
    private double salary;
    private int yearsOfService;

    public void setEmployeeName(String name) {
        employeeName = name;
    }

    public void setSalary(double sal) {
        salary = sal;
    }

    public void setYearsOfService(int years) {
        yearsOfService = years;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getFinalSalary() {

        double bonus;

        if (yearsOfService >= 10)
            bonus = salary * 20 / 100;
        else if (yearsOfService >= 5)
            bonus = salary * 10 / 100;
        else
            bonus = salary * 5 / 100;

        return salary + bonus;
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {

        Employee e = new Employee();

        e.setEmployeeName("Amit");
        e.setSalary(50000);
        e.setYearsOfService(8);

        System.out.println("Employee : " + e.getEmployeeName());
        System.out.println("Final Salary : " + e.getFinalSalary());
    }
}