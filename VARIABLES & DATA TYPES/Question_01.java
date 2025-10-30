// In a program,input 3 numbers:A,B and C.You have to output the average of these 3 numbers.
import java.util.*;
public class Question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float average = (A + B + C) / 3.0f;
        System.out.println("average is : " + average);
    }
}