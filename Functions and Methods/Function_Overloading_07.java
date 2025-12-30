public class Function_Overloading_07 {
    //function to sum two integers
    public static int sum(int a, int b) {
        return a + b;
    }
    //function to sum three integers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
    }
}
