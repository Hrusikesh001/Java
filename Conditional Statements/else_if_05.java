import java.util.Scanner;

public class else_if_05 {
    public static void main(String[] args) {
        // Income Tax Calculator
        Scanner scanner = new Scanner(System.in);
        int income = scanner.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;
        }
        else if (income >= 500000 && income < 1000000) {
            tax = (int)(income * 0.2);
        }
        else {
            tax = (int)(income * 0.3);
        }
        System.out.println("Income Tax: " + tax);

    }
}
