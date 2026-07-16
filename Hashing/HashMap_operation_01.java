import java.util.*;
public class HashMap_operation_01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insert
        map.put("India", 100);
        map.put("China", 200);
        map.put("USA", 300);

        System.out.println(map);

        //Get - 0(1)
        int population = map.get("India");
        System.out.println(population);

        System.out.println(map.get("Nepal"));
    }
}
