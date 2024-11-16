package org.example.services;

import org.example.util.StringUtils;

public class StringService {

    private StringUtils stringUtils;

    public StringService() {

        stringUtils = new StringUtils();
    }

    public boolean isPalindrome(String word) {

        if (word == null || word.length() <= 1) {
            return false;
        }
        word = stringUtils.convertToLowerCase(word);
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public String createPalindrome(String word) {

        if (word == null || word.isEmpty()) {
            return null;
        }
        return word + StringUtils.reverse(word);
    }

}
