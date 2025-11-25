class Person {

    String name;
    int age;
    String city;

    // Constructor
    Person(String n, int a, String c) {
        name = n;
        age = a;
        city = c;
    }

    // Method to display details
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("City : " + city);
    }
}

public class Problem_18 {
    public static void main(String[] args) {

        // creating an object using constructor
        Person p1 = new Person("Karthi", 19, "Coimbatore");

        // print details
        p1.display();
    }
}
