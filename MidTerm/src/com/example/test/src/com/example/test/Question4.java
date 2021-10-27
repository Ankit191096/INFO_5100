package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class Question4 {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(getUniqueCharacterSubstring(s));
    }


    public static String getUniqueCharacterSubstring(String input) {
        Map<Character, Integer> characters = new HashMap<>();
        String output = "";
        for (int i = 0, j = 0; j < input.length(); j++) {
            char current = input.charAt(j);
            if (characters.containsKey(current)) {
                i = Math.max(characters.get(current)+1, i);
            }
            if (output.length() < j - i + 1) {
                output = input.substring(i, j + 1);
            }
            characters.put(current, j);
        }
        return output;
    }
}

