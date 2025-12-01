enum Operation {
    ADD {
        double apply(double a, double b) {
            return a + b;
        }
    },
    SUB {
        double apply(double a, double b) {
            return a - b;
        }
    },
    MUL {
        double apply(double a, double b) {
            return a * b;
        }
    },
    DIV {
        double apply(double a, double b) {
            return a / b;
        }
    };

    abstract double apply(double a, double b);
}

public class Problem_08 {
    public static void main(String[] args) {
        System.out.println(Operation.ADD.apply(10, 5));
        System.out.println(Operation.SUB.apply(10, 5));
        System.out.println(Operation.MUL.apply(10, 5));
        System.out.println(Operation.DIV.apply(10, 5));
    }
}