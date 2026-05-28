//Given a "2 x n" board and tiles of size "2 x 1", count the number of ways to tile the given board using the 2 x 1 tiles. A tile can either be placed horizontally or vertically.
public class Tiling_Problem_01 {
    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        //vertical choice
        int fnm1 = tilingProblem(n - 1);

        //horizontal choice
        int fnm2 = tilingProblem(n - 2);
        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
