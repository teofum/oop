package Parcial2_2024_C1.E02;

import java.time.YearMonth;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ReimbursementTracker {
    private final Map<String, Client> clients = new HashMap<>();

    public ReimbursementTracker() {
    }

    public void registerClient(String name, int monthlyReimbursementCap) {
        if (clients.putIfAbsent(name, new Client(monthlyReimbursementCap)) != null) {
            throw new RuntimeException("Client already registered.");
        }
    }

    public int getRemainingReimbursement(String name, YearMonth ym) {
        return getClient(name).getRemainingReimbursement(ym);
    }

    public void addReimbursement(String name, YearMonth ym, int amount) {
        getClient(name).addReimbursement(ym, amount);
    }

    public Collection<Map.Entry<YearMonth, Integer>> getReimbursements(String name, YearMonth from, YearMonth to) {
        return getClient(name).getReimbursements(from, to);
    }

    private Client getClient(String name) {
        var client = clients.get(name);
        if (client != null) {
            return client;
        }
        throw new RuntimeException("Client is not registered.");
    }

    static private class Client {
        private final Map<YearMonth, Integer> reimbursements = new HashMap<>();
        private final int monthlyReimbursementCap;

        public Client(int monthlyReimbursementCap) {
            this.monthlyReimbursementCap = monthlyReimbursementCap;
        }

        public int getRemainingReimbursement(YearMonth ym) {
            var reimbursement = reimbursements.get(ym);
            var amount = reimbursement == null ? 0 : reimbursement;

            return monthlyReimbursementCap - amount;
        }

        public void addReimbursement(YearMonth ym, int amount) {
            var newAmount = reimbursements.getOrDefault(ym, 0) + amount;
            if (newAmount > monthlyReimbursementCap) {
                throw new RuntimeException("Reimbursement surpasses month cap.");
            }

            reimbursements.put(ym, newAmount);
        }

        public Collection<Map.Entry<YearMonth, Integer>> getReimbursements(YearMonth from, YearMonth to) {
            // Haha streams go brr
            return reimbursements.entrySet()
                    .stream()
                    .filter((entry) -> entry.getKey().isBefore(to) && !entry.getKey().isBefore(from))
                    .collect(Collectors.toCollection(() -> new TreeSet<>(Map.Entry.comparingByKey())));
        }
    }
}
