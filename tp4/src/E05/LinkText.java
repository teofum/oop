package E05;

public class LinkText extends FormatText {
    private String href;
    private static final String TAG = "a";

    public LinkText(HTMLText content, String href) {
        super(content, TAG);
        this.href = href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String source() {
        return "<a href=\"" + href + "\">" + getContent() + "</i>";
    }
}
