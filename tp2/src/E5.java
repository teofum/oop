public class E5 {
    public static void main(String[] args) {
        String phrase = String.join(" ", args);

        System.out.println(isPalindrome(phrase) ? "Palindrome" : "Not a palindrome");
    }

    public static boolean isPalindrome(String phrase) {
        char[] chars = phrase.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) return false;
        }

        return true;
    }
}
