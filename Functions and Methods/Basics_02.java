import java.util.*;

public class Basics_02 {
    public static void calculaeSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculaeSum(a, b);
    }
}
