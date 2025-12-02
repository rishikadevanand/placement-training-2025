public class Problem_14 {
    public static void main(String[] args) {
        
        StringBuffer sbf = new StringBuffer("Mutable");

        System.out.println("Original StringBuffer: " + sbf);

        sbf.append(" String");
        System.out.println("After append: " + sbf);

        
        sbf.insert(7, "Buffer ");
        System.out.println("After insert: " + sbf);

        
        sbf.replace(0, 7, "Changed");
        System.out.println("After replace: " + sbf);

        
        sbf.delete(0, 7);
        System.out.println("After delete: " + sbf);

        
        sbf.reverse();
        System.out.println("After reverse: " + sbf);

        
        System.out.println("Length: " + sbf.length());
        System.out.println("Capacity: " + sbf.capacity());

        
        sbf.setLength(5);
        System.out.println("After setLength(5): " + sbf);

        
        System.out.println("CharAt(2): " + sbf.charAt(2));
        System.out.println("IndexOf(\"r\"): " + sbf.indexOf("r"));
    }
}
