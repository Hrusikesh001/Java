public class Question_16 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(ch);
                if (k < breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            for (int j = 0; j < 4 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
