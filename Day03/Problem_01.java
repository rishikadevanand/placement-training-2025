// public class
public class Problem_01 {

    // public variables
    public String name;
    public int age;

    // public constructor
    public Problem_01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public method
    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public static void main(String[] args) {

        // accessing public members
        Problem_01 p = new Problem_01("Rishika", 18);

        p.display();   // public method
    }
}
