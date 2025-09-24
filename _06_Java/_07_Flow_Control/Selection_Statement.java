package _07_Flow_Control;

public class Selection_Statement {
    public static void main(String[] args) {

//  1. if Statement
        int num = 10;
        if (num > 0) {
            System.out.println("Positive number");
        }

//  2. if-else Statement
        int age = 16;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

//  3. if-else-if Ladder
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

//  4.Nested if Statement
        int number = 25;
        if (number > 0) {
            if (number % 5 == 0) {
                System.out.println("Positive and divisible by 5");
            }
        }

//  5. switch Statement
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid day");
        }

    }
}
