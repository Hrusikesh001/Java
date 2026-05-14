public class Type_of_Constructor_05 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Hrusikesh");
        Student s3 = new Student(101);
    }
}

class Student {
    String name;
    int age;
    int roll;

    Student() {
        System.out.println("Constructor called...");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}