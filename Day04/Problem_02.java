class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, String programmingLanguage) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class Problem_02 {
    public static void main(String[] args) {
        Manager m = new Manager("Ravi", 101, "HR");
        Developer d = new Developer("Arjun", 201, "Java");

        System.out.println("Manager Details:");
        m.displayManager();

        System.out.println("\nDeveloper Details:");
        d.displayDeveloper();
    }
}
