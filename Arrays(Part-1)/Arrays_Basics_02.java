// Input Output and Update of Array Elements
import java.util.*;

public class Arrays_Basics_02 {
    public static void main(String[] args) {
        int[] marks = new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //maths

        System.out.println("Phy marks: " + marks[0]);
        System.out.println("Chem marks: " + marks[1]);
        System.out.println("Maths marks: " + marks[2]);

        marks[2] = 100; //updating marks in maths
        System.out.println("Updated Maths marks: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage: " + percentage + "%");

        System.out.println("length of array: " + marks.length);
    }
}
