package _20_File_handling;

import java.io.*;

public class creating_file {
    public static void main(String[] args) {
        // 📂 Creating file objects inside the _20_File_handling package folder
        File f = new File("src/_20_File_handling/hello.txt");
        File f1 = new File("src/_20_File_handling/hello1.txt");
        File f2 = new File("src/_20_File_handling/hello2.txt");

        // 🛠️ Create files if they don't already exist
        try {
            if (!f.exists()) {
                f.createNewFile();
                f1.createNewFile();
                f2.createNewFile();
                System.out.println("Files created successfully inside _20_File_handling.");
            } else {
                System.out.println("File already exists.");
            }
            // ✅ Confirm file creation
            System.out.println("File check: " + f.exists());
            System.out.println("File check: " + f1.exists());
            System.out.println("File check: " + f2.exists());
        } catch (IOException e) {
            System.out.println("Error creating the file.");
            e.printStackTrace();
        }

        // ✏️ Writing using FileWriter (basic writer)
        try {
            FileWriter fw = new FileWriter(f); // Overwrites content
            fw.write(65);           // Writes ASCII code 65 → 'A'
            fw.write("India");      // Writes string
            fw.write(new char[]{'J', 'a', 'v', 'a'}); // Writes char array
            fw.flush();
            fw.close();
            System.out.println("Successfully written using FileWriter.");
        } catch (IOException e) {
            System.out.println("Error writing with FileWriter.");
            e.printStackTrace();
        }

        // ✏️ Writing using BufferedWriter (adds buffering & newLine support)
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
            bw.write(65);             // Writes ASCII code 65 → 'A'
            bw.newLine();
            bw.write("India");        // Writes string
            bw.newLine();
            bw.write("65");           // Writes "65" as string
            bw.newLine();
            bw.write(new char[]{'J', 'a', 'v', 'a'}); // Writes char array
            bw.newLine();
            bw.write("12.3");         // Can't write double directly, so written as string
            bw.flush();
            bw.close();
            System.out.println("Successfully written using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("Error writing with BufferedWriter.");
            e.printStackTrace();
        }

        // ✏️ Writing using PrintWriter (supports most data types & automatic line breaks)
        try {
            PrintWriter pw = new PrintWriter(f2);
            pw.write(65);         // Writes ASCII code → 'A'
            pw.println();         // Adds a newline
            pw.println(65);       // Writes integer
            pw.println(34.54);    // Writes double
            pw.println('P');      // Writes character
            pw.println("Java");   // Writes string
            pw.flush();
            pw.close();
            System.out.println("Successfully written using PrintWriter.");
        } catch (IOException e) {
            System.out.println("Error writing with PrintWriter.");
            e.printStackTrace();
        }
    }
}