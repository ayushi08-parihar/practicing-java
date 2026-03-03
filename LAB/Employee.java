class Employee {
    int empID;
    String empName;
    String empDesignation;

    // Constructor to initialize attributes
    Employee(int empID, String empName, String empDesignation) {
        this.empID = empID;
        this.empName = empName;
        this.empDesignation = empDesignation;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Designation: " + empDesignation);
        System.out.println("-----------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Creating three Employee objects
        Employee emp1 = new Employee(101, "Alice", "Manager");
        Employee emp2 = new Employee(102, "Bob", "Software Engineer");
        Employee emp3 = new Employee(103, "Charlie", "HR Executive");

        // Displaying details
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}