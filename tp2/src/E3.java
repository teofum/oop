import java.util.Arrays;

public class E3 {
    public static void main(String[] args) {
        for (String arg : args) {
            StringBuilder sb = new StringBuilder(arg.substring(0, 1));
            for (char c : Arrays.copyOfRange(arg.toCharArray(), 1, arg.length())) {
                sb.append('-');
                sb.append(c);
            }

            System.out.println(sb);
        }
    }
}
