package E05;

public class PlainText extends BaseText {
    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String source() {
        return text;
    }
}
