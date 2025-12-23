import java.util.*;

public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n) {
            System.out.println(i);
            i++;
        }
        System.out.println("Printed numbers from 1 to n");
        
    }
}
