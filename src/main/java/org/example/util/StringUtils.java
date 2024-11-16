package org.example.util;

public class StringUtils {

    public String convertToLowerCase(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            result.append(toLowerCaseChar(word.charAt(i)));
        }
        return result.toString();
    }

    private static char toLowerCaseChar(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char)(c + ('a' - 'A'));
        }
        return c;
    }

}
