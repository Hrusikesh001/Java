import java.util.Scanner;

public class Unary_operator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int A = scanner.nextInt();
        // int B = ++A;
        // System.out.println("Value of A after pre-increment is: " + A);
        // System.out.println("Value of B assigned from pre-incremented A is: " + B);

        // int X = scanner.nextInt();
        // int Y = X++;
        // System.out.println("Value of X after post-increment is: " + X);
        // System.out.println("Value of Y assigned from post-incremented X is: " + Y);

        // int M = scanner.nextInt();
        // int N = --M;
        // System.out.println("Value of M after pre-decrement is: " + M);
        // System.out.println("Value of N assigned from pre-decremented M is: " + N);

        int P = scanner.nextInt();
        int Q = P--;
        System.out.println("Value of P after post-decrement is: " + P);
        System.out.println("Value of Q assigned from post-decremented P is: " + Q);
    }
}
