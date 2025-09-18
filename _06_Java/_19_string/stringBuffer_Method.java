package _19_string;

public class stringBuffer_Method {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        // Append
        sb.append(", Java!");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, " World");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(6, 11, "Universe");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(6, 14);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Capacity
        System.out.println("Capacity: " + sb.capacity());

        // Length
        System.out.println("Length: " + sb.length());

        // Set Length
        sb.setLength(5);
        System.out.println("After setLength: " + sb);

        // Ensure Capacity
        sb.ensureCapacity(30);
        System.out.println("New Capacity after ensureCapacity(30): " + sb.capacity());
    }
}
