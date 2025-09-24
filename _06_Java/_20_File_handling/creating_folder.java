<<<<<<< HEAD
package _20_File_handling;

import java.io.File;

public class creating_folder {
    public static void main(String[] args) {
        // 📁 Create a File object representing the target folder path
        File f1 = new File("src/_20_File_handling/MyFolder");

        // 🛠️ Check if folder already exists; if not, create it
        if (f1.exists()) {
            System.out.println("Folder already exists.");
        } else {
            f1.mkdir(); // Creates single-level directory
            System.out.println("Folder created successfully inside _20_File_handling.");
        }

        // ✅ Confirm folder status
        System.out.println("Folder check: " + f1.exists());
        System.out.println();

        // 📃 List and display contents of the folder
        String[] contents = f1.list();

        if (contents != null && contents.length > 0) {
            System.out.println("Contents of MyFolder:");
            for (String item : contents) {
                System.out.print(item + " , ");
            }
        } else {
            System.out.println("MyFolder is currently empty.");
        }
    }
=======
package _20_File_handling;

import java.io.File;

public class creating_folder {
    public static void main(String[] args) {
        // 📁 Create a File object representing the target folder path
        File f1 = new File("src/_20_File_handling/MyFolder");

        // 🛠️ Check if folder already exists; if not, create it
        if (f1.exists()) {
            System.out.println("Folder already exists.");
        } else {
            f1.mkdir(); // Creates single-level directory
            System.out.println("Folder created successfully inside _20_File_handling.");
        }

        // ✅ Confirm folder status
        System.out.println("Folder check: " + f1.exists());
        System.out.println();

        // 📃 List and display contents of the folder
        String[] contents = f1.list();

        if (contents != null && contents.length > 0) {
            System.out.println("Contents of MyFolder:");
            for (String item : contents) {
                System.out.print(item + " , ");
            }
        } else {
            System.out.println("MyFolder is currently empty.");
        }
    }
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
}