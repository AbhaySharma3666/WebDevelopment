<<<<<<< HEAD
package _19_string;

public class stringBuilder_Method {
    public static void main(String[] args) {
        // Create a StringBuilder with initial content
        StringBuilder sb = new StringBuilder("Java");

        // Append text
        sb.append(" Programming");

        // Insert text at index 5
        sb.insert(5, "Language ");

        // Replace a portion of the string
        sb.replace(0, 4, "Core");

        // Delete characters from index 5 to 13
        sb.delete(5, 13);

        // Reverse the entire string
        sb.reverse();

        // Get capacity and length
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());

        // Access and modify a character
        System.out.println("Char at index 2: " + sb.charAt(2));
        sb.setCharAt(2, 'X');

        // Extract substring
        String sub = sb.substring(2, 7);
        System.out.println("Substring (2 to 7): " + sub);

        // Final output
        System.out.println("Final StringBuilder: " + sb.toString());
    }
}
=======
package _19_string;

public class stringBuilder_Method {
    public static void main(String[] args) {
        // Create a StringBuilder with initial content
        StringBuilder sb = new StringBuilder("Java");

        // Append text
        sb.append(" Programming");

        // Insert text at index 5
        sb.insert(5, "Language ");

        // Replace a portion of the string
        sb.replace(0, 4, "Core");

        // Delete characters from index 5 to 13
        sb.delete(5, 13);

        // Reverse the entire string
        sb.reverse();

        // Get capacity and length
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());

        // Access and modify a character
        System.out.println("Char at index 2: " + sb.charAt(2));
        sb.setCharAt(2, 'X');

        // Extract substring
        String sub = sb.substring(2, 7);
        System.out.println("Substring (2 to 7): " + sub);

        // Final output
        System.out.println("Final StringBuilder: " + sb.toString());
    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
