package _19_string;
/*
        String Constant Pool (SCP):
            This is a special memory area within the Java Heap where string literals are stored.
            Its purpose is to optimize memory usage by ensuring that only one copy of a unique
            string literal exists. When a string literal is created (e.g., String s = "hello.txt";),
            the Java Virtual Machine (JVM) first checks if an identical string already exists in
            the String Constant Pool. If it does, the existing string's reference is reused.
            If not, a new string object is created in the pool. This mechanism prevents redundant
            string objects from being created, saving memory and potentially improving performance for
            string operations.
 */
// through new keyword store at ===>  heap memory , scp (String Constant Pool)
//  through object ===> scp(String Constant Pool)

public class memory_concept {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        System.out.println(s1==s2);  // false

        String s3 = "java";
        System.out.println(s1==s3); // false

        String s4 = "java";
        System.out.println(s3==s4); // true

        String s5 = "ja"+"va";
        System.out.println(s4==s5); // true

        String s6 = "ja";
        String s7 = s6+"va";
        System.out.println(s4==s7); // false

        final String s8 = "ja";
        String s9 = s8+ "va";
        System.out.println(s8==s9);  // true
    }
}
