// public class Question_07 {
//     public static void main(String[] args) {
//         int a = 48, b = 18;

//         while (a>0 && b>0) {
//             if (a > b) a = a % b;
//             else b = b % a;
//         }
//         if(a == 0) {
//             System.out.println("GCD = " + b);
//         } else {
//             System.out.println("GCD = " + a);
//         }
//     }
// }


public class Question_07 {
      public static void main(String[] args) {
          int a = 48, b = 18;
          while (b != 0) {
              int temp = b;
              b = a % b;
              a = temp;
          }

          System.out.println("GCD = " + a);
      }
    }