public class Problem_13
{
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Original StringBuilder: " + sb);

        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(6, 10, "Programming");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(5, 16);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Length and Capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        // Set Char At
        sb.reverse(); // reverse back
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);

        // Substring
        System.out.println("Substring(0,5): " + sb.substring(0, 5));

        // Ensure Capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // Trim to Size
        sb.trimToSize();
        System.out.println("Capacity after trimToSize: " + sb.capacity());
    }
}
