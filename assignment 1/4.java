// WAP TO PERFORM NESTED IF ELSE STATEMENT

public class Main {
    public static void main(String[] args) {
        int a = 10, b = 20;
        if (a == b) {
            System.out.println("a is equal to b");
        } else {
            if (a < b) {
                System.out.println("a is less than b");
            } else {
                System.out.println("a is greater than b");
            }
        }
    }
}