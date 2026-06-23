
import java.util.*;
public class Assign_Cookies_01 {
    public static int assignCookies(int[] greed, int[] size) {
        int n, m, l, r;
        n = greed.length;
        m = size.length;
        l = 0;
        r = 0;
        Arrays.sort(greed);
        Arrays.sort(size);
        while (l < m && r < n){
            if(greed[r] <= size[l]) {
                r = r + 1;
                
            }
            l = l + 1;
        }
        return r;
    }
    public static void main(String[] args) {
        int greed[] = {1,5,3,3,4};
        int size[] = {4,2,1,2,1,3};
        System.out.println(assignCookies(greed, size));
    }
}
