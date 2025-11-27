class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Roll Number: " + rollNumber);
    }
}

class CollegeStudent extends Student {
    String branch;
    int semester;

    CollegeStudent(String name, int age, int rollNumber, String branch, int semester) {
        super(name, age, rollNumber);
        this.branch = branch;
        this.semester = semester;
    }

    void displayCollegeStudent() {
        displayStudent();
        System.out.println("Branch: " + branch);
        System.out.println("Semester: " + semester);
    }
}

public class Problem_03 {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent("Pranesh", 18, 25, "CSE", 3);

        System.out.println("College Student Details:");
        cs.displayCollegeStudent();
    }
}
