public class Problem_14 {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sbf = new StringBuffer("Mutable");

        System.out.println("Original StringBuffer: " + sbf);

        // Append
        sbf.append(" String");
        System.out.println("After append: " + sbf);

        // Insert
        sbf.insert(7, "Buffer ");
        System.out.println("After insert: " + sbf);

        // Replace
        sbf.replace(0, 7, "Changed");
        System.out.println("After replace: " + sbf);

        // Delete
        sbf.delete(0, 7);
        System.out.println("After delete: " + sbf);

        // Reverse
        sbf.reverse();
        System.out.println("After reverse: " + sbf);

        // Capacity and Length
        System.out.println("Length: " + sbf.length());
        System.out.println("Capacity: " + sbf.capacity());

        // Set Length
        sbf.setLength(5);
        System.out.println("After setLength(5): " + sbf);

        // CharAt and IndexOf
        System.out.println("CharAt(2): " + sbf.charAt(2));
        System.out.println("IndexOf(\"r\"): " + sbf.indexOf("r"));
    }
}
