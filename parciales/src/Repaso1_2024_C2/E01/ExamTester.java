package Repaso1_2024_C2.E01;

import java.util.Arrays;

public class ExamTester {
    public static void main(String[] args) {
        Exam exam = new Exam("Primer Parcial PI");
        enrollTestStudents(exam);
        UniqueExam uniqueExam = new UniqueExam("Primer Parcial POO");
        enrollTestStudents(uniqueExam);
        LimitedExam limitedExam = new LimitedExam("TPE POD", 2);
        limitedExam.enroll("Matias");
        limitedExam.enroll("Matias");
        limitedExam.enroll("Natalia");
        limitedExam.enroll("Solange");
        limitedExam.enroll("Jose");
        limitedExam.enroll("Micaela");
        System.out.println("Enrolled Students: " + Arrays.toString(limitedExam.getEnrolledStrudents()));
        System.out.println("Pending Students: " + Arrays.toString(limitedExam.getPendingStudents()));
        limitedExam.unenroll("Matias");
        System.out.println("Enrolled Students: " + Arrays.toString(limitedExam.getEnrolledStrudents()));
        System.out.println("Pending Students: " + Arrays.toString(limitedExam.getPendingStudents()));
        limitedExam.unenroll("Jose");
        limitedExam.unenroll("Natalia");
        System.out.println("Enrolled Students: " + Arrays.toString(limitedExam.getEnrolledStrudents()));
        System.out.println("Pending Students: " + Arrays.toString(limitedExam.getPendingStudents()));
    }

    private static void enrollTestStudents(Exam exam) {
        exam.enroll("Matias");
        exam.enroll("Matias");
        exam.enroll("Natalia");
        System.out.println("Enrolled Students: " + Arrays.toString(exam.getEnrolledStrudents()));
        exam.unenroll("Matias");
        System.out.println("Enrolled Students: " + Arrays.toString(exam.getEnrolledStrudents()));
        System.out.println("##########");
    }
}
