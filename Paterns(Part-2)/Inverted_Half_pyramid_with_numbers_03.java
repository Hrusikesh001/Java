public class Inverted_Half_pyramid_with_numbers_03 {
    public static void inverted_half_pyramid_numbers(int n) {
         for(int i=1; i<=n; i++) {
             for(int j=1; j<=n-i+1; j++) {
                System.out.print(j + " ");
            }
                 System.out.println();
             }
        }
            public static void main(String[] args) {
                inverted_half_pyramid_numbers(5);

        }
}