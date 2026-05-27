//Optimized Power Calculation
public class Question_10 {
    public static int optimizedPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        // int halfPowerSq = optimizedPower(x, n / 2) * optimizedPower(x, n / 2);
        int halfPowerSq = optimizedPower(x, n / 2);
        halfPowerSq = halfPowerSq * halfPowerSq;

        if(n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 5));
    }
}
