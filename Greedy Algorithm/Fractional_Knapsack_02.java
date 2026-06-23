import java.util.*;

public class Fractional_Knapsack_02{
    static class Item {
        int value;
        int weight;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {

        int n = val.length;

        Item[] arr = new Item[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Item(val[i], wt[i]);
        }

        // Sort by value/weight ratio in descending order
        Arrays.sort(arr, (a, b) -> Double.compare(
                (double) b.value / b.weight,
                (double) a.value / a.weight));

        double totalValue = 0.0;

        for (int i = 0; i < n; i++) {

            if (arr[i].weight <= capacity) {
                totalValue += arr[i].value;
                capacity -= arr[i].weight;
            } else {
                totalValue += ((double) arr[i].value / arr[i].weight) * capacity;
                break;
            }
        }

        return Math.round(totalValue * 1000000.0) / 1000000.0;
    }
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int capacity = 50;
        Fractional_Knapsack_02 obj = new Fractional_Knapsack_02();
        System.out.println(obj.fractionalKnapsack(val, wt, capacity));
    }
}