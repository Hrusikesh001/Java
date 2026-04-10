import java.util.Arrays;
import java.util.Collections;
public class Inbuilt_Sort_04 {
    public static void main(String args[]) {
        Integer arr[] = {5, 4, 1, 3, 2};
        
        // Ascending sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // Ascending sort (partial)
        Arrays.sort(arr,0,3);
        System.out.println(Arrays.toString(arr));
        
        // Descending sort
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}
