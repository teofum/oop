package E08;

public class CellPhoneBillTester {
    public static void main(String[] args) {
        CellPhoneBill bill = new CellPhoneBill("1234-555-6789");
        bill.registerCall("1212-555-1212", 100);
        bill.registerCall("1212-555-9999", 200);
        System.out.printf("Total: $%.2f\n", bill.processBill()); // $3.00

        try {
            bill.getFriends().add("1212-555-1212");
        } catch (TooManyFriendsException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("Total: $%.2f\n", bill.processBill()); // $2.70

        try {
            bill.getFriends().add("1212-555-9999");
        } catch (TooManyFriendsException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("Total: $%.2f\n", bill.processBill()); // $2.10

        bill.registerCall("1212-555-3456", 500);
        System.out.printf("Total: $%.2f\n", bill.processBill()); // $7.10

        bill.getFriends().remove("1212-555-1212");
        System.out.printf("Total: $%.2f\n", bill.processBill()); // $7.40

        try {
            bill.getFriends().add("1212-555-1212");
            bill.getFriends().add("1212-555-1213");
            bill.getFriends().add("1212-555-3456"); // TooManyFriendsException
        } catch (TooManyFriendsException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("Total: $%.2f\n", bill.processBill()); // $7.10
    }
}
