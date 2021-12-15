package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(anagrams(strs));
    }

    public static List<List<String>> anagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] array = word.toCharArray();
            Arrays.sort(array);
            String a = new String(array);

            List<String> list = map.get(a);
            if (list == null) {
                list = new ArrayList<>();
                map.put(a, list);
            }
            list.add(word);
        }
        return map.values().stream().collect(Collectors.toList());
    }
}
