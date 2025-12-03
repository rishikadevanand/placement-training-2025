import java.util.ArrayList;
public class Problem_01 {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<>();
        colour.add("red");
        colour.add("blue");
        colour.add("green");

        colour.forEach(item -> System.out.println(item));
        // using lambda exp
    }
}
