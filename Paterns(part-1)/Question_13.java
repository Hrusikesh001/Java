public class Question_13 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for(char j = 'A'; j <= i+'A'; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
