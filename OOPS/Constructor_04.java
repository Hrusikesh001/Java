public class Constructor_04 {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}

class Student {
    String name;
    int age;
    
    Student() {
        System.out.println("Constructor called...");
    }
}