package E08;

import java.util.Arrays;

public class CellPhoneBill {
    private String number;
    private FriendNumberList friends;
    protected Call[] calls;
    protected int callsIndex;

    private static final int DEFAULT_SIZE = 10;
    private static final double FRIEND_PRICE_MULT = 0.7;

    CellPhoneBill(String number) {
        this.number = number;
        this.calls = new Call[DEFAULT_SIZE];
        this.friends = new FriendNumberList();
    }

    public void registerCall(String toNumber, int duration) {
        addCall(new Call(number, toNumber, duration));
    }

    private void addCall(Call call) {
        if (callsIndex == calls.length) {
            resize();
        }
        calls[callsIndex++] = call;
    }

    public double processBill() {
        double total = 0;
        for (int i = 0; i < callsIndex; i++) {
            double cost = calls[i].getCost();
            if (friends.contains(calls[i].getTo())) cost *= FRIEND_PRICE_MULT;
            
            total += cost;
        }
        return total;
    }

    private void resize() {
        calls = Arrays.copyOf(calls, calls.length + DEFAULT_SIZE);
    }

    public FriendNumberList getFriends() {
        return friends;
    }
}
