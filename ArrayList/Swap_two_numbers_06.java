import java.util.ArrayList;
public class Swap_two_numbers_06 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(1);

        // Swap two numbers in the arraylist
        int temp = list.get(0); // store the first element in a temporary variable
        list.set(0, list.get(1)); // set the first element to the second element
        list.set(1, temp); // set the second element to the temporary variable

        // print the arraylist after swapping
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
