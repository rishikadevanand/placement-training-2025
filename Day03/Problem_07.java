class Temperature {

    // private variable
    private double celsius;

    // constructor
    Temperature(double celsius) {
        this.celsius = celsius;
    }

    // getter for Fahrenheit
    public double getFahrenheit() {
        return (celsius * 9/5) + 32;        // °F = (°C × 9/5) + 32
    }

    // getter for Kelvin
    public double getKelvin() {
        return celsius + 273.15;            // K = °C + 273.15
    }

    // method to display
    public void display() {
        System.out.println("Celsius     : " + celsius + "°C");
        System.out.println("Fahrenheit  : " + getFahrenheit() + "°F");
        System.out.println("Kelvin      : " + getKelvin() + " K");
    }
}

public class Problem_07 {
    public static void main(String[] args) {

        Temperature t = new Temperature(25.0);   // example value
        t.display();
    }
}
