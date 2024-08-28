package E08;

public class TooManyFriendsException extends Exception {
    public TooManyFriendsException() {
    }

    @Override
    public String getMessage() {
        return "Too many friends: friend list already contains maximum amount of numbers";
    }
}
