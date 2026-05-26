// Check if a given array is sorted or not.

public class Question_06 {
    public static void isSorted(int[] arr, int i) {
        if(i == arr.length - 1) {
            System.out.println("Array is sorted");
            return;
        }
        if(arr[i] > arr[i + 1]) {
            System.out.println("Array is not sorted");
            return;
        }
        isSorted(arr, i + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        isSorted(arr, 0);
    }
}

