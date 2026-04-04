import java.util.*;
public class Question_18 {
    public static void main(String[] args) {
        int n = 6;
        int inis = 0;
        for(int i = 0; i < n; i++) {
            // Stars
            for(int j = 1; j < n-i; j++) {
                System.out.print("*");
        }
            // Spaces
            for(int j = 0; j <inis; j++) {
                System.out.print(" ");
            }
            // Stars
            for(int j = 1; j < n-i; j++) {
                System.out.print("*");
            }
            inis += 2;
            System.out.println();
        }
    }
}
