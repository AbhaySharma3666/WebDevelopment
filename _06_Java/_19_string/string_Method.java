package _19_string;

public class string_Method {
    public static void main(String[] args) {
        String original = "  Hello, Java World!  ";
        String another = "hello.txt, java world!";

        // Length and character access
        System.out.println("Length: " + original.length());
        System.out.println("Char at index 7: " + original.charAt(7));

        // Case conversion
        System.out.println("Upper case: " + original.toUpperCase());
        System.out.println("Lower case: " + original.toLowerCase());

        // Trimming and substring
        System.out.println("Trimmed: '" + original.trim() + "'");
        System.out.println("Substring (7 to 11): " + original.substring(7, 11));

        // Comparison
        System.out.println("Equals: " + original.equals(another));
        System.out.println("Equals ignore case: " + original.equalsIgnoreCase(another));

        // Searching
        System.out.println("Index of 'Java': " + original.indexOf("Java"));
        System.out.println("Contains 'World': " + original.contains("World"));

        // Replacing
        System.out.println("Replace 'Java' with 'String': " + original.replace("Java", "String"));

        // Splitting
        String[] parts = original.trim().split(" ");
        System.out.print("Split words: ");
        for (String word : parts) {
            System.out.print("'" + word + "' ");
        }
        System.out.println();

        // Start/End checks
        System.out.println("Starts with '  He': " + original.startsWith("  He"));
        System.out.println("Ends with 'ld!  ': " + original.endsWith("ld!  "));

        // Concatenation
        String joined = original.trim().concat(" Enjoy coding!");
        System.out.println("Concatenated: " + joined);

        // Intern and identity
        String interned = original.intern();
        System.out.println("Interned string: " + interned);

        // Empty check
        System.out.println("Is empty: " + original.isEmpty());

    }
}
