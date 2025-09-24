<<<<<<< HEAD
package _18_Collections;

import java.util.HashSet;
import java.util.Iterator;

// hashSet is not prevent order of element

public class _04_hashset {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> hs = new HashSet<>();

        // Adding elements
        hs.add("Java");
        hs.add("Python");
        hs.add("C++");
        hs.add("Java"); // Duplicate, will be ignored

        System.out.println("After add(): " + hs);

        // Checking size
        System.out.println("Size: " + hs.size());

        // Checking if empty
        System.out.println("Is empty? " + hs.isEmpty());

        // Checking containment
        System.out.println("Contains 'Python'? " + hs.contains("Python"));

        // Removing an element
        hs.remove("C++");
        System.out.println("After remove(): " + hs);

        // Iterating using for-each
        System.out.print("Using for-each: ");
        for (String lang : hs) {
            System.out.print(lang + " ");
        }
        System.out.println();

        // Iterating using iterator
        System.out.print("Using Iterator: ");
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Converting to array
        Object[] arr = hs.toArray();
        System.out.print("Converted to Array: ");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // Cloning
        HashSet<String> clone = (HashSet<String>) hs.clone();
        System.out.println("Cloned HashSet: " + clone);

        // Adding all elements from another collection
        HashSet<String> newSet = new HashSet<>();
        newSet.add("Go");
        newSet.add("Rust");
        hs.addAll(newSet);
        System.out.println("After addAll(): " + hs);

        // Retaining only common elements
        hs.retainAll(newSet);
        System.out.println("After retainAll(): " + hs);

        // Clearing all elements
        hs.clear();
        System.out.println("After clear(): " + hs);
    }
=======
package _18_Collections;

import java.util.HashSet;
import java.util.Iterator;

// hashSet is not prevent order of element

public class _04_hashset {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> hs = new HashSet<>();

        // Adding elements
        hs.add("Java");
        hs.add("Python");
        hs.add("C++");
        hs.add("Java"); // Duplicate, will be ignored

        System.out.println("After add(): " + hs);

        // Checking size
        System.out.println("Size: " + hs.size());

        // Checking if empty
        System.out.println("Is empty? " + hs.isEmpty());

        // Checking containment
        System.out.println("Contains 'Python'? " + hs.contains("Python"));

        // Removing an element
        hs.remove("C++");
        System.out.println("After remove(): " + hs);

        // Iterating using for-each
        System.out.print("Using for-each: ");
        for (String lang : hs) {
            System.out.print(lang + " ");
        }
        System.out.println();

        // Iterating using iterator
        System.out.print("Using Iterator: ");
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Converting to array
        Object[] arr = hs.toArray();
        System.out.print("Converted to Array: ");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // Cloning
        HashSet<String> clone = (HashSet<String>) hs.clone();
        System.out.println("Cloned HashSet: " + clone);

        // Adding all elements from another collection
        HashSet<String> newSet = new HashSet<>();
        newSet.add("Go");
        newSet.add("Rust");
        hs.addAll(newSet);
        System.out.println("After addAll(): " + hs);

        // Retaining only common elements
        hs.retainAll(newSet);
        System.out.println("After retainAll(): " + hs);

        // Clearing all elements
        hs.clear();
        System.out.println("After clear(): " + hs);
    }
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
}