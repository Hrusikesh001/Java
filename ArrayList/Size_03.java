import java.util.ArrayList;
public class Size_03 {
    public static void main(String args[]) {
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.size());

        //print the arraylist
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" "); 
        }
    }
}
