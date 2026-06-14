import java.util.ArrayList;
public class Pair_Sum_2_12 {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1; // breaking point
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }
        int left = bp + 1; // smallest element
        int right = bp; // largest element
        while(left != right) {
            if(list.get(left) + list.get(right) == target) {
                return true;
            } else if(list.get(left) + list.get(right) < target) {
                left = (left + 1) % list.size();
            } else {
                right = (right - 1 + list.size()) % list.size();
            }
        }
        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        int target = 16;
        System.out.println(pairSum2(list, target));
    }
}
