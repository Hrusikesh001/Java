import java.util.Scanner;

public class Arithmetic_Opearators_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println("Sum of A & B is "+ (A + B));
        System.out.println("Diff between A & B is "+ (A - B));
        System.out.println("Multiplication of A & B is "+ (A * B));

    }
}