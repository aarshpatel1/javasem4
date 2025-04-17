// WAP TO STRING BUFFER METHOD.
// 1. append ( )
// 2.insert ( )
// 3.charat ( )
// 4.setcharat ( )
// 5.substring ( )
// 6.delete ( )
// 7.lenth ( )
// 8.capacity ( )
// 9.reverse ( )

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append()
        sb.append(" World");
        System.out.println("1. append(): " + sb); // Hello World

        // 2. insert()
        sb.insert(6, "Java ");
        System.out.println("2. insert(): " + sb); // Hello Java World

        // 3. charAt()
        char ch = sb.charAt(1);
        System.out.println("3. charAt(): " + ch); // e

        // 4. setCharAt()
        sb.setCharAt(6, 'X');
        System.out.println("4. setCharAt(): " + sb); // Hello Xava World

        // 5. substring()
        String sub = sb.substring(6, 10);
        System.out.println("5. substring(): " + sub); // Xava

        // 6. delete()
        sb.delete(6, 11);
        System.out.println("6. delete(): " + sb); // Hello World

        // 7. length()
        int length = sb.length();
        System.out.println("7. length(): " + length); // 11

        // 8. capacity()
        int capacity = sb.capacity();
        System.out.println("8. capacity(): " + capacity); // Default is 16 + length of initial string

        // 9. reverse()
        sb.reverse();
        System.out.println("9. reverse(): " + sb); // dlroW olleH
    }
}
