public class String_Function_06 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = new String("Hello World");

        // if(s1 == s2) {
        //     System.out.println("s1 and s2 are equal");
        // } else {
        //     System.out.println("s1 and s2 are not equal");
        // }
        // if(s1 == s3) {
        //     System.out.println("s1 and s3 are equal");
        // } else {
        //     System.out.println("s1 and s3 are not equal");
        // }
        if(s1.equals(s3)) {
            System.out.println("s1 and s3 are equal");
        } else {
            System.out.println("s1 and s3 are not equal");
        }
    }
}

