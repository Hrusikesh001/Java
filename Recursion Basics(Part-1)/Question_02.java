
//Print numbers from 1 to n in increasing order using recursion.
public class Question_02 {
    public static void printInc(int n) {
        if(n == 1 ) {
            System.out.print(n);
            return;
        }
        printInc(n-1);
        System.out.print(" " + n);
    }


public static void main (String[] args) {
    int n = 10;
    printInc(n);
    }

}