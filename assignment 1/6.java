// WAP TO PERFROM SWITCH STATEMENT.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (A, B, C, D, F): ");
        char grade = scanner.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent! Keep it up.");
                break;
            case 'B':
                System.out.println("Good job! You can do even better.");
                break;
            case 'C':
                System.out.println("Fair performance. Work harder.");
                break;
            case 'D':
                System.out.println("Needs improvement. Put in more effort.");
                break;
            case 'F':
                System.out.println("Failed. Don't give up, try again.");
                break;
            default:
                System.out.println("Invalid grade entered.");
        }

        scanner.close();
    }
}