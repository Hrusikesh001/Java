public class String_Concatenate_03 {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
    String firstName = "Hrusikesh";
    String lastName = "Sahu";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);
    //String ChatAt Method
    System.out.println(fullName.charAt(0));
    printLetters(fullName);
    }
}
