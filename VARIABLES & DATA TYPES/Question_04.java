import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 10000;
        float f = 5.67f;
        double d = 0.123456;

        float result =  (f * b) + (i % c) - (d * s);
        System.out.println(result);
    }
}
