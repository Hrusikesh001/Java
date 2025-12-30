public class Overloading_datatype_08 {
    
        // function to sum two integers
        public static int sum(int a, int b) {
            return a + b;
        }

        // function to sum two floats
        public static float sum(float a, float b) {
            return a + b;
        }

        public static void main(String[] args) {
            System.out.println(sum(10, 20));
            System.out.println(sum(1.9f, 2.3f));
        }
    }


