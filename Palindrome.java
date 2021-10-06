package PalindromeCheck;

import java.text.Normalizer;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Are they palindromes?\n");
        System.out.println(isAPalindrome("Élu par cette crapule !") + " -> Élu par cette crapule !");
        System.out.println(isAPalindrome("I did, did I?") + " -> I did, did I?");
        System.out.println(isAPalindrome("racecar") + " -> racecar");
        System.out.println(isAPalindrome(12321) + " -> 12321");
        System.out.println(isAPalindrome("palindrome") + " -> palindrome");
    }

    static boolean isAPalindrome(String string) {
        if (string != null && string.length() > 2) {
            string = normalize(string);
            return string.equals(new StringBuilder(string).reverse().toString());
        }
        return false;
    }

    static boolean isAPalindrome(Object object) {
        return isAPalindrome(object.toString());
    }

    /**
     * Change accented letters to normal letters, remove spaces and punctuation marks.
     * @param string String to be normalized.
     * @return Normalized string in lower case.
     */
    static String normalize(String string) {
        string = Normalizer.normalize(string, Normalizer.Form.NFD).replaceAll("[^a-zA-Z0-9]", "");
        return string.toLowerCase();
    }
}
