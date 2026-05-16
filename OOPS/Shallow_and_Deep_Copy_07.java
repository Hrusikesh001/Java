public class Shallow_and_Deep_Copy_07 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Hrusikesh";
        s1.roll = 101;
        s1.password = "abc123";
        s1.marks[0] = 85;
        s1.marks[1] = 90;
        s1.marks[2] = 95;

        Student s2 = new Student(s1);
        s2.password = "xyz456";
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy Constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("Constructor called...");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
