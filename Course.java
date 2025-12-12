import java.util.ArrayList;

public class Course {
    private String courseId;
    private String title;
    private int capacity;
    public Lector lector;
    public ArrayList<Enrollment> enrollment = new ArrayList<Enrollment>();

    public boolean isFull() {
        return enrollment.size() == capacity;
    }

    public Course(String courseId, String title, int capacity,  ArrayList<Enrollment> enrollment) {
        this.courseId = courseId;
        this.title = title;
        this.capacity = capacity;
       this.enrollment = enrollment;

    }

    public void addStudent(Student aStudent) {
        throw new UnsupportedOperationException();
    }
}