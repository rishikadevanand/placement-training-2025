public class Problem_12 {

    // Overloaded method 1: add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method 2: add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method 3: add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Problem_12 obj = new Problem_12();

        System.out.println("Add(10, 20): " + obj.add(10, 20));
        System.out.println("Add(10, 20, 30): " + obj.add(10, 20, 30));
        System.out.println("Add(5.5, 4.5): " + obj.add(5.5, 4.5));
    }
}
