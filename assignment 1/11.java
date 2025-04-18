// WAP TO PERFORM CONTINUE STATEMENT.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the number you want to skip: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (i == number) {
                continue; // Skip the rest of the loop when i is 5
            }
            System.out.println(i);
        }
    }
}
