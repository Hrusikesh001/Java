// Type Promotion in Expressions

// public class javaBasics_12 {
//     public static void main(String args[]) {
//         char a = 'a';
//         char b = 'b';
//         System.out.println((int)(b));
//         System.out.println((int)(a));
//         System.out.println(a);
//         System.out.println(b-a);
//     }
// }


// import java.util.Scanner;

// public class javaBasics_12 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         short a = 5;
//         byte b = 10;
//         char c = 'c';
//         byte bt = (byte)(a + b + c);
//         System.out.println(bt);
//     }
// }




// public class javaBasics_12 {
//     public static void main(String args[]) {
//         int a = 10;
//         float b = 20.5f;
//         long c = 25;
//         double d = 30.5;
//         double result = a + b + c + d;
//         System.out.println(result);
//     }
// } 

public class javaBasics_12 {
    public static void main(String args[]) {
        byte b = 42;
        byte a = (byte)(b * 2);
        System.out.println(a);
    }
}