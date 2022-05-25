package arrayobject;

import arrayobject.Student.Student;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student();
        s2.setName("Sherry");
        s2.setAge(18);

        Student s3 = new Student();
        s3.setName("Rajvir");
        s3.setAge(19);

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("We are doing a pull operation");

    }
}
