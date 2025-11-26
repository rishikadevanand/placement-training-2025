class Student {   // default access class

    String name;   // default access variable
    int age;       // default access variable

    // default constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // default method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}
public class Problem_02
{
    public static void main(String[] args)
    {
        Student s = new Student ("Lakashanyaa", 18);
        s.display(); //defafult method
    }
}