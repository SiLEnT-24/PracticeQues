class Employee {
    String name;
    String department;

    {
        System.out.println("Employee Registration Started");
    }

    Employee() {
        this("Unknown", "General");
    }

    Employee(String name) {
        this(name, "General");
    }

    Employee(String name, String department) {
        this.name = name;
        this.department = department;

        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        new Employee("Raj", "IT");
    }
}