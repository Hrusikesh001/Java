import java.util.*;
public class Question_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i*i <= n; i++) {
            if(n%i == 0) {
                count++;
                if((n/i)!=i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println("True"); // Prime
        } else {
            System.out.println("False"); // Not Prime
        }
    }
}
