import java.util.Arrays;

public class E7 {
    public static void main(String[] args) {
        int[] histogram = new int[10];
        for (String arg : args) {
            int n = Integer.parseInt(arg);
            if (n < 0 | n > 100) throw new IllegalArgumentException("Only numbers between 0 and 100 are accepted");

            int bucket = Math.min(n / 10, histogram.length - 1);
            histogram[bucket]++;
        }

        int maxBucket = Arrays.stream(histogram).reduce(0, Math::max);
        for (int i = maxBucket; i > 0; i--) {
            for (int k : histogram) {
                System.out.print(k >= i ? "| * " : "|   ");
            }
            System.out.println('|');
        }

        for (int ignored : histogram)
            System.out.print("+---");
        System.out.println('+');

        for (int j = 0; j < histogram.length; j++)
            System.out.printf("%-4d", j * 10);
        System.out.println("100");
    }
}
