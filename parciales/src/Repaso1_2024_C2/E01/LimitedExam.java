package Repaso1_2024_C2.E01;

import java.util.Arrays;

public class LimitedExam extends UniqueExam {
    private String[] pending;
    private int pendingDim;
    private final int maxEnrolled;
    private static final int INITIAL_PENDING_DIM = 5;

    public LimitedExam(String name, int maxEnrolled) {
        super(name);

        if (maxEnrolled <= 0) throw new IllegalArgumentException("maxEnrolled must be > 0");
        this.maxEnrolled = maxEnrolled;
        this.pending = new String[INITIAL_PENDING_DIM];
    }

    @Override
    public void enroll(String student) {
        if (getEnrolledCount() < maxEnrolled) {
            super.enroll(student);
        } else {
            addPending(student);
        }
    }

    @Override
    public void unenroll(String student) {
        for (int i = 0; i < pendingDim; i++) {
            if (pending[i].equals(student)) {
                System.arraycopy(pending, i + 1, pending, i, pendingDim - 1 - i);
                pendingDim--;
            }
        }

        super.unenroll(student);

        if (pendingDim > 0) enroll(popPending());
    }

    public int getPendingCount() {
        return pendingDim;
    }

    public String[] getPendingStudents() {
        return Arrays.copyOf(pending, pendingDim);
    }

    private void addPending(String student) {
        if (pendingDim == pending.length) {
            resizePending();
        }
        pending[pendingDim++] = student;
    }

    private String popPending() {
        if (pendingDim == 0) throw new IllegalStateException("No pending students");
        String firstPending = pending[0];
        pending = Arrays.copyOfRange(pending, 1, pendingDim);
        pendingDim--;

        return firstPending;
    }

    private void resizePending() {
        pending = Arrays.copyOf(pending, pending.length + INITIAL_PENDING_DIM);
    }
}
