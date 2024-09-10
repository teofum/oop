package E05;

public abstract class BaseText implements HTMLText {
    @Override
    public String toString() {
        return source();
    }
}
