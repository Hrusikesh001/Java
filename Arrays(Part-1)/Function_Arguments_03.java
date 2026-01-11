//Arrays as Function Arguments

public class Function_Arguments_03 {
    public static void updateArray(int marks[]) {
        for(int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        updateArray(marks);

        // print updated marks
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]+"");
        }
        System.out.println();
    }
}
