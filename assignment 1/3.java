// WAP TO PERFORM IF…ELSE…IF…ELSE STATEMENT.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not equal to b");
        }

        scanner.close();
    }
}