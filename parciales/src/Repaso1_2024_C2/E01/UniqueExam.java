package Repaso1_2024_C2.E01;

public class UniqueExam extends Exam {
    public UniqueExam(String name) {
        super(name);
    }

    @Override
    public void enroll(String student) {
        if (isEnrolled(student)) return;
        super.enroll(student);
    }
}
