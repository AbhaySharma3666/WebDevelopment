<<<<<<< HEAD
package _18_Collections;

import java.util.LinkedList;

public class _02_linkedlist {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(); // Create an empty LinkedList

        // Add elements to the list
        l1.add("java");      // Index 0
        l1.add(23);          // Index 1
        l1.add("java");      // Index 2
        l1.add(87);          // Index 3
        l1.add(null);        // Index 4 (null values are allowed)

        System.out.println(l1); // Print entire list: ["java", 23, "java", 87, null]

        l1.set(2,"Python5"); // Replace value at index 2 with "Python5"
        System.out.println(l1); // ["java", 23, "Python5", 87, null]

        l1.removeLast(); // Remove the last element (null)
        System.out.println(l1); // ["java", 23, "Python5", 87]

        l1.removeFirst(); // Remove the first element ("java")
        System.out.println(l1); // [23, "Python5", 87]

        l1.addFirst("SpringBoot"); // Add "SpringBoot" at the beginning
        System.out.println(l1); // ["SpringBoot", 23, "Python5", 87]

        l1.addLast(null); // Add null at the end
        System.out.println(l1); // ["SpringBoot", 23, "Python5", 87, null]
    }
=======
package _18_Collections;

import java.util.LinkedList;

public class _02_linkedlist {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList(); // Create an empty LinkedList

        // Add elements to the list
        l1.add("java");      // Index 0
        l1.add(23);          // Index 1
        l1.add("java");      // Index 2
        l1.add(87);          // Index 3
        l1.add(null);        // Index 4 (null values are allowed)

        System.out.println(l1); // Print entire list: ["java", 23, "java", 87, null]

        l1.set(2,"Python5"); // Replace value at index 2 with "Python5"
        System.out.println(l1); // ["java", 23, "Python5", 87, null]

        l1.removeLast(); // Remove the last element (null)
        System.out.println(l1); // ["java", 23, "Python5", 87]

        l1.removeFirst(); // Remove the first element ("java")
        System.out.println(l1); // [23, "Python5", 87]

        l1.addFirst("SpringBoot"); // Add "SpringBoot" at the beginning
        System.out.println(l1); // ["SpringBoot", 23, "Python5", 87]

        l1.addLast(null); // Add null at the end
        System.out.println(l1); // ["SpringBoot", 23, "Python5", 87, null]
    }
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
}