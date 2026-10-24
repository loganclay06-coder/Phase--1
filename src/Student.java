public class Student {

    private int studentId;
    private String firstName;
    private String lastName;

    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void registerCourse(String courseName) {
        System.out.println(firstName +
                " registered for " + courseName);
    }

    public void dropCourse(String courseName) {
        System.out.println(firstName +
                " dropped " + courseName);
    }

    public String displayInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId +
               ", Name: " + firstName + " " + lastName;
    }
}