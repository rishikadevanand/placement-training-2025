public class Problem_08 {

    static class Circle {

        private double radius;
        private double area;
        private double circumference;
        private double diameter;

        // Constructor to set radius and calculate values
        Circle(double radius) {
            this.radius = radius;
            this.area = Math.PI * radius * radius;
            this.circumference = 2 * Math.PI * radius;
            this.diameter = 2 * radius;
        }

        // Getters
        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return area;
        }

        public double getCircumference() {
            return circumference;
        }

        public double getDiameter() {
            return diameter;
        }
    }

    public static void main(String[] args) {

        Circle c = new Circle(7.0);

        System.out.println("Radius        : " + c.getRadius());
        System.out.println("Diameter      : " + c.getDiameter());
        System.out.println("Circumference : " + c.getCircumference());
        System.out.println("Area          : " + c.getArea());
    }
}
