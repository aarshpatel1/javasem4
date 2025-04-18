// WAP TO PERFORM WHILE LOOP.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    System.out.println("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
      
        int i = 1;
        while (i <= number) {
            System.out.println("Hello World " + i);
            i++;
        }
    }
}