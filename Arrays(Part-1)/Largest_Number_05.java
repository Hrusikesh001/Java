import java.util.*;
public class Largest_Number_05 {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number is: " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        int largest = getLargest(numbers);
        System.out.println("The largest number is: " + largest);
    }
}
