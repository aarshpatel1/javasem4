// WAP TO PERFORM IF…ELSE STATEMENT

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is not less than b");
        }

        scanner.close();
    }
}