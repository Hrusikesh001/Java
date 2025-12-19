public class else_if_06 {
    public static void main(String[] args) {
        // Print the largest of three numbers
        int A = 1, B = 3, C = 6;

        if (A >= B && A >= C) {
            System.out.println("Largest: " + A);
        } else if (B >= A && B >= C) {
            System.out.println("Largest: " + B);
        } else {
            System.out.println("Largest: " + C);
        }
    }
}
