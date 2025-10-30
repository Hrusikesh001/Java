// In a program,input the side of a square.You have to output the area of the square.

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println("Area of square is : " + area);
    }
}
