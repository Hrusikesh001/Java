public class Question_18 {
    public static void main(String[] args) {
        int n = 6;
        int inis = 0;

        // Upper part
        for (int i = 0; i < n; i++) {

            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            inis += 2;
            System.out.println();
        }

        // Lower part
        inis = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            inis -= 2;
            System.out.println();
        }
    }
}