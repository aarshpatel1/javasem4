// WAP TO PERFORM DO... WHILE LOOP.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int i = 1;
        do {
            System.out.println("Hello World " + i);
            i++;
        } while (i <= number);
    }
}