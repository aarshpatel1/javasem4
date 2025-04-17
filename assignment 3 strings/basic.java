// WAP BASIC STRING METHODS.
// 1.concat ( )
// 2.charat ( )
// 3.equal ( )
// 4.indexof ( )
// 5.isempty ( )
// 6.join ( )
// 7.lastindexof ( )
// 8.split ( )
// 9.substring ( )
// 10.trim ( )
// 11.replace ( )

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";

        // 1. concat()
        String result = str1.concat(str2);
        System.out.println("1. concat(): " + result); // Hello World

        // 2. charAt()
        char ch = str1.charAt(1);
        System.out.println("2. charAt(): " + ch); // e

        // 3. equals()
        boolean isEqual = str1.equals("Hello");
        System.out.println("3. equals(): " + isEqual); // true

        // 4. indexOf()
        int index = result.indexOf('o');
        System.out.println("4. indexOf(): " + index); // 4

        // 5. isEmpty()
        String emptyStr = "";
        System.out.println("5. isEmpty(): " + emptyStr.isEmpty()); // true

        // 6. join()
        String joined = String.join("-", "Java", "is", "fun");
        System.out.println("6. join(): " + joined); // Java-is-fun

        // 7. lastIndexOf()
        int lastIndex = result.lastIndexOf('o');
        System.out.println("7. lastIndexOf(): " + lastIndex); // 7

        // 8. split()
        String sentence = "apple,banana,grape";
        String[] fruits = sentence.split(",");
        System.out.print("8. split(): ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 9. substring()
        String sub = result.substring(6, 11);
        System.out.println("9. substring(): " + sub); // World

        // 10. trim()
        String spaced = "   Java   ";
        System.out.println("10. trim(): '" + spaced.trim() + "'"); // 'Java'

        // 11. replace()
        String replaced = result.replace("World", "Java");
        System.out.println("11. replace(): " + replaced); // Hello Java
    }
}
