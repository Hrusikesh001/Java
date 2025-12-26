import java.util.*;

public class Question_02 {
    public static void main(String[] args) {
        for(int line = 1; line <= 4; line++) {
            for(int s=1; s<=(4-line+1); s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
