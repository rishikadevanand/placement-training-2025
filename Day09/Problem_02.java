import java.util.ArrayList;
public class Problem_02 {
    public static void main(String[] args) {
        ArrayList<String> colour = new ArrayList<>();
        colour.add("red");
        colour.add("blue");
        colour.add("green");

        colour.forEach(System.out::println);
        //Using method reference
    }
}
