//Print Nth Fibonacci number using recursion.

public class Question_05 {
    public static int fibonacci(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int fibOfNMinus1 = fibonacci(n - 1);
        int fibOfNMinus2 = fibonacci(n - 2);
        int fibOfN = fibOfNMinus1 + fibOfNMinus2;
        return fibOfN;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibonacci(n));
    }
}
