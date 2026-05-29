public class Friends_Pairing_03 {
    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // // choice 1: single
        // int fnm1 = friendsPairing(n - 1);
        // // choice 2: pair up
        // int fnm2 = friendsPairing(n - 2);
        // int pairWays = (n - 1) * fnm2;
        // int totalWays = fnm1 + pairWays;
        // return totalWays;
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
