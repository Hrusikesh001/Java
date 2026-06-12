
import java.util.ArrayList;
public interface Operation_02 {
    public static void main(String args[]) {
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(2, 50);
        
        System.out.println(list);

        //Get operation - o(1)
        int element = list.get(2);
        System.out.println(element); 

        //Delete operation 
        list.remove(3);
        System.out.println(list);

        //Set operation - 
        list.set(0, 10);
        System.out.println(list);

        //Contains operation 
        boolean ans = list.contains(10);
        System.out.println(ans);
        System.out.println(list.contains(1));
    }
}
