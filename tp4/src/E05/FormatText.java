package E05;

public abstract class FormatText extends BaseText {
    private final HTMLText content;
    private final String tag;

    public FormatText(HTMLText content, String tag) {
        this.content = content;
        this.tag = tag;
    }

    protected HTMLText getContent() {
        return content;
    }

    @Override
    public String source() {
        return "<" + tag + ">" + getContent() + "</" + tag + ">";
    }
}
