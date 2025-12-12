import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student  student1 = new Student("student1");
        Student  student2 = new Student("student2");

        ArrayList<Enrollment> enrollments = new ArrayList<>();
        Course course1 = new Course("1", "ФКН", 2,enrollments );
        Enrollment e1 = new Enrollment(EnrollmentStatus.COMPLETED,student1, course1);
        Enrollment e2 = new Enrollment(EnrollmentStatus.COMPLETED,student2, course1);

        enrollments.add(e1);
        enrollments.add(e2);

        System.out.println(course1.isFull());
    }
}

