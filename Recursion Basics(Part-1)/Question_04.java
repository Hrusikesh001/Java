// Print sum of first n natural numbers using recursion.
public class Question_04 {
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        int sumOfNMinus1 = sum(n - 1);
        int totalSum = n + sumOfNMinus1;
        return totalSum;

    }


public static void main (String[] args) {
    int n = 5;
    System.out.println(sum(n));
    }
}