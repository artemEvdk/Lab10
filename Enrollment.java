public class Enrollment {
	private EnrollmentStatus status;
	private Student student;
	private Course course;

    public Enrollment(EnrollmentStatus status, Student student, Course course) {
        this.status = status;
        this.student = student;
        this.course = course;
    }

    public void approve() {
		throw new UnsupportedOperationException();
	}

	public void drop() {
		throw new UnsupportedOperationException();
	}
}