package E08;

import java.util.HashSet;
import java.util.Set;

public class FriendNumberList {
    private static final int MAX_FRIENDS_COUNT = 3;

    private Set<String> friends;

    public FriendNumberList() {
        friends = new HashSet<>();
    }

    public void add(String friendNumber) throws TooManyFriendsException {
        if (friends.size() >= MAX_FRIENDS_COUNT) throw new TooManyFriendsException();

        friends.add(friendNumber);
    }

    public void remove(String friendNumber) {
        friends.remove(friendNumber);
    }

    public boolean contains(String friendNumber) {
        return friends.contains(friendNumber);
    }
}
