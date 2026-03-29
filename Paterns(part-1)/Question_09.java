// public class Question_09 {
//     public static void main(String[] args) {
//         for (int i = 0; i < 6; i++) {
//             for (int j = 0; j < i ; j++) {
//                 System.out.print("*");
//             }
//             for (int k = 0; k < 6-i; k++) {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5 - i - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




public class Question_09 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 2*n-1; i++) {
            int stars = i;
            if (i > n) stars = 2*n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}