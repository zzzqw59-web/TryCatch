package test.system;

public class StudentTest {
    static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("이영희", 90);
        students[1] = new Student("김철수", 85);
        students[2] = new Student("최백한", 70);

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].getName());
            System.out.println(students[i].getScore());
        }
    }
}
