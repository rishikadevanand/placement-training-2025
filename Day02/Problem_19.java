class Rectangle {

    int length;
    int breadth;

    // Constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area
    int area() {
        return length * breadth;
    }

    // Method to calculate perimeter
    int perimeter() {
        return 2 * (length + breadth);
    }

    // Method to display details
    void display() {
        System.out.println("Length     : " + length);
        System.out.println("Breadth    : " + breadth);
        System.out.println("Area       : " + area());
        System.out.println("Perimeter  : " + perimeter());
    }
}

public class Problem_19 {
    public static void main(String[] args) {

        // Create object using constructor
        Rectangle rect = new Rectangle(10, 5);

        // Print results
        rect.display();
    }
}
