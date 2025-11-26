// Base class
class Employee {

    public String empName = "John";       // public → accessible everywhere
    protected double salary = 50000;      // protected → accessible in subclass
    int empId = 101;                      // default → accessible in same package
    private String password = "admin123"; // private → accessible ONLY inside class

    // public getter for private data
    public String getPassword() {
        return password;
    }

    public void displayEmployee() {
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee ID   : " + empId);
        System.out.println("Salary        : " + salary);
        System.out.println("Password      : " + password); // private allowed here
    }
}


// Subclass
class Manager extends Employee {

    public void displayManagerAccess() {
        System.out.println("\n--- Accessing from Manager subclass ---");

        // public → accessible
        System.out.println("Name (public): " + empName);

        // protected → accessible in subclass
        System.out.println("Salary (protected): " + salary);

        // default → accessible because same package
        System.out.println("ID (default): " + empId);

        // private → NOT accessible (uncomment to see error)
        // System.out.println(password);

        // but private can be accessed via public getter
        System.out.println("Password (via getter): " + getPassword());
    }
}


// Main Class
public class Problem_03 {
    public static void main(String[] args) {

        Employee e = new Employee();
        Manager m = new Manager();

        System.out.println("--- Accessing from Main (same package) ---");
        System.out.println("Name (public): " + e.empName);
        System.out.println("ID (default): " + e.empId);
        System.out.println("Salary (protected): " + e.salary);

        // private → NOT accessible directly
        // System.out.println(e.password);

        System.out.println("Password (via getter): " + e.getPassword());

        m.displayManagerAccess();
    }
}
