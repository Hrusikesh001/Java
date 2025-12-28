import java.util.*;
public class Call_By_Value_03 { 
    public static void swap(int a , int b) {
        // sawp
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        // Swapping two numbers using call by value
        int a = 5;
        int b = 10;
        swap(a, b);
        
    }
}
