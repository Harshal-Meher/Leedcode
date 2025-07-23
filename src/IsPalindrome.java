public class IsPalindrome {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuilder stringBuilder =new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(s);
            }
        }
        String original = stringBuilder.toString();
        String reversed = stringBuilder.reverse().toString();
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        IsPalindrome palindrome = new IsPalindrome();
        String input = "HAH";
        boolean result = palindrome.isPalindrome(input);
        System.out.println("Is \"" + input + "\" a palindrome? " + result);

    }
}