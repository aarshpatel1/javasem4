// WAP TO EXCEPTION HANDLERS.
// 1.try
// 2.catch
// 3.throw
// 4.throws
// 5.finally

public class Main {

    // 4. throws
    public static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // 3. throw
            throw new ArithmeticException("Access denied - You must be 18 or older.");
        } else {
            System.out.println("Access granted - You are old enough.");
        }
    }

    public static void main(String[] args) {
        try {
            // 1. try block
            int[] arr = new int[3];
            arr[3] = 10; // This will throw ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            // 2. catch block
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            // Calling method that may throw an exception
            checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // 5. finally block
            System.out.println("Execution of try-catch block finished.");
        }
    }
}
