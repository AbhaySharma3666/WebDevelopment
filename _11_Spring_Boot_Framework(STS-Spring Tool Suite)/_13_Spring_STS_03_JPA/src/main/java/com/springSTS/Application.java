package com.springSTS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(Application.class, args);
        StudentRepo repo = run.getBean(StudentRepo.class);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean go1 = true;

        while (go1) {
            System.out.println("\n=========== MENU ===========");
            System.out.println("Press 0 To Exit");
            System.out.println("Press 1 To Add New Student Data");
            System.out.println("Press 2 To Display All Student Data");
            System.out.println("Press 3 To Delete Single Student Data");
            System.out.println("Press 4 To Delete All Student Data");
            System.out.println("Press 5 To Update Student Data");
            System.out.println("============================");

            try {
                int choice = Integer.parseInt(br.readLine());
                switch (choice) {
                    case 0:
                        go1 = false;
                        System.out.println("Exiting program...");
                        break;

                    case 1:
                        // Add student
                        System.out.print("Enter Student Name: ");
                        String name = br.readLine();

                        System.out.print("Enter Student City: ");
                        String city = br.readLine();

                        Student s = new Student();
                        s.setName(name);
                        s.setCity(city);

                        Student save = repo.save(s);
                        System.out.println(save + " ✅ Student added successfully!");
                        break;

                    case 2:
                        // Display all students
                        Iterable<Student> findall = repo.findAll();
                        Iterator<Student> iterator = findall.iterator();
                        while (iterator.hasNext()) {
							Student next = iterator.next();
							System.out.println(next);
						}
                        break;

                    case 3:
                        // Delete single student
                        System.out.print("Enter Student ID to delete: ");
                        int delId = Integer.parseInt(br.readLine());
                        if (repo.existsById(delId)) {
                            repo.deleteById(delId);
                            System.out.println("🗑 Student deleted successfully!");
                        } else {
                            System.out.println("⚠ Student with ID " + delId + " not found!");
                        }
                        break;

                    case 4:
                        // Delete all students
                    	Iterable<Student> findall1 = repo.findAll();
                        repo.deleteAll(findall1);
                        System.out.println("🗑 All student data deleted!");
                        break;

                    case 5:
                        // Update student
                        System.out.print("Enter Student ID to update: ");
                        int updId = Integer.parseInt(br.readLine());

                        Optional<Student> optionalStudent = repo.findById(updId);
                        if (optionalStudent.isPresent()) {
                            Student existing = optionalStudent.get();

                            System.out.print("Enter New Name (leave blank to keep current: " + existing.getName() + "): ");
                            String newName = br.readLine();
                            if (!newName.trim().isEmpty()) {
                                existing.setName(newName);
                            }

                            System.out.print("Enter New City (leave blank to keep current: " + existing.getCity() + "): ");
                            String newCity = br.readLine();
                            if (!newCity.trim().isEmpty()) {
                                existing.setCity(newCity);
                            }

                            repo.save(existing);
                            System.out.println("✅ Student updated successfully!");
                        } else {
                            System.out.println("⚠ Student with ID " + updId + " not found!");
                        }
                        break;

                    default:
                        System.out.println("Invalid Choice!!!!");
                }
            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
        }
    }
}
