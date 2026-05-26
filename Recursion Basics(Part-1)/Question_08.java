//WAF to find the last occurrence of an element in an array using recursion.
public class Question_08 {
    public static int lastOccurrence(int[] arr, int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int rest = lastOccurrence(arr, key, i + 1);
        if(rest != -1) {
            return rest;
        }
        if(arr[i] == key) {
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccurrence(arr, 5, 0));
    }
}
