package org.example.util;

public class StringUtils {

    private static char toLowerCaseChar(char c) {

        if (c >= 'A' && c <= 'Z') {
            return (char) (c + ('a' - 'A'));
        }
        return c;
    }

    public static String reverse(String word) {

        StringBuilder result = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            result.append(word.charAt(i));
        }
        return result.toString();
    }

    public String convertToLowerCase(String word) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            result.append(toLowerCaseChar(word.charAt(i)));
        }
        return result.toString();
    }

}
