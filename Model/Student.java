package Model;

public class Student extends User {
    private static Integer idGenerator = 1;
    private final Integer studentId;

    public Student(String name, Integer bornYear) {
        super(name, bornYear);
        this.studentId = idGenerator++;
    }

    @Override
    public String toString() {
        return studentId + " " + super.toString();
    }

}
