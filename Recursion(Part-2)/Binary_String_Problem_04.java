//Print all binary strings of size n without consecutive 1's.
public class Binary_String_Problem_04 {
    public static void printbinaryStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printbinaryStrings(n-1, 0, str+"0");
        if (lastPlace == 0) {
            printbinaryStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printbinaryStrings(3, 0, "");
    }
}