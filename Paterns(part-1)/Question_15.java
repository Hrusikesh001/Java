// public class Question_15 {
//     public static void main(String[] args) {
//         int n = 5;
//         for(char i = 'A'; i < 'A'+n; i++){
//             for(char j = 'A'; j <= i; j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }

public class Question_15 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            char ch = (char)('A'+i);
            for(int j=0; j <= i; j++){
                System.out.print(ch+" ");
            
            }
            System.out.println();
        }
    }
}