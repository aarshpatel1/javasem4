// WAP TO STRING COMPARSION.
// 1. equalsignorecase ( )
// 2.regionmatches ( )
// 3.upper case ( )
// 4.lower case ( )
// 5.search string ( )

public class Main {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = "helloworld";

        // 1. equalsIgnoreCase()
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("1. equalsIgnoreCase(): " + isEqualIgnoreCase); // true

        // 2. regionMatches()
        boolean regionMatch = str1.regionMatches(0, str2, 0, 5);
        System.out.println("2. regionMatches(): " + regionMatch); // false (case-sensitive)

        // Case-insensitive region match
        boolean regionMatchIgnoreCase = str1.regionMatches(true, 0, str2, 0, 5);
        System.out.println("   regionMatches(ignoreCase): " + regionMatchIgnoreCase); // true

        // 3. toUpperCase()
        String upper = str1.toUpperCase();
        System.out.println("3. toUpperCase(): " + upper); // HELLOWORLD

        // 4. toLowerCase()
        String lower = str1.toLowerCase();
        System.out.println("4. toLowerCase(): " + lower); // helloworld

        // 5. Search string using contains(), startsWith(), endsWith()
        String searchText = "World";
        boolean contains = str1.contains(searchText);
        boolean startsWith = str1.startsWith("Hello");
        boolean endsWith = str1.endsWith("World");

        System.out.println("5. contains(): " + contains); // true
        System.out.println("   startsWith(): " + startsWith); // true
        System.out.println("   endsWith(): " + endsWith); // true
    }
}
