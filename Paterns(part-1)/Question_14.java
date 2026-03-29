public class Question_14 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for(char j = 'A'; j <= n-i+'A'; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
