public class Question_16 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i - 1; j++) {
                System.out.print(" ");
            }
            for (char k = 'c'; k < 2 * i + 2; k++) {
                System.out.print(k);
            }
            for (int j = 0; j < 4 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
