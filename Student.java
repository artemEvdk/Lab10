import java.util.ArrayList;

public class Student extends UserAccount {
	private String studentId;
	public ArrayList<Enrollment> enrollment = new ArrayList<Enrollment>();

    public Student(String studentId) {
        this.studentId = studentId;

    }

    public void viewCourse() {
		throw new UnsupportedOperationException();
	}

	public void register(String aCourseId) {
		throw new UnsupportedOperationException();
	}
}