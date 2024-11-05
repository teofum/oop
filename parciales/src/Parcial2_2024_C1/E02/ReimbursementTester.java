package Parcial2_2024_C1.E02;

import java.time.YearMonth;

public class ReimbursementTester {
    public static void main(String[] args) {
        YearMonth june2024 = YearMonth.of(2024, 6);
        System.out.println(june2024);
        System.out.println(june2024.compareTo(YearMonth.of(2024, 7)));

        ReimbursementTracker rT = new ReimbursementTracker();

        rT.registerClient("Sam", 10_000);

        System.out.println(rT.getRemainingReimbursement("Sam", june2024));
        System.out.println(rT.getRemainingReimbursement("Sam", YearMonth.of(2024, 7)));

        rT.addReimbursement("Sam", june2024, 3_000);

        System.out.println(rT.getRemainingReimbursement("Sam", june2024));
        System.out.println(rT.getRemainingReimbursement("Sam", YearMonth.of(2024, 7)));

        rT.addReimbursement("Sam", june2024, 1_000);
        rT.addReimbursement("Sam", YearMonth.of(2024, 7), 7_000);

        System.out.println(rT.getRemainingReimbursement("Sam", june2024));
        System.out.println(rT.getRemainingReimbursement("Sam", YearMonth.of(2024, 7)));

        try {
            rT.addReimbursement("Sam", june2024, 7_000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        rT.addReimbursement("Sam", YearMonth.of(2024, 3), 5_000);

        for (var samReimbursements : rT.getReimbursements("Sam",
                YearMonth.of(2024, 1), YearMonth.of(2024, 7))) {
            System.out.printf("Client Sam earned $%d in %s\n", samReimbursements.getValue(), samReimbursements.getKey().toString());
        }

        System.out.println(rT.getReimbursements("Sam", june2024, june2024).isEmpty());

        rT.registerClient("Ben", 5_000);
        System.out.println(rT.getRemainingReimbursement("Ben", june2024));
        System.out.println(rT.getReimbursements("Ben", june2024, YearMonth.of(2025, 12)).isEmpty());

        try {
            rT.registerClient("Ben", 5_000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            rT.addReimbursement("Adam", YearMonth.of(2000, 1), 1_000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            rT.getRemainingReimbursement("Adam", YearMonth.of(2000, 1));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            rT.getReimbursements("Adam", YearMonth.of(2000, 1), YearMonth.of(2001, 1));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
