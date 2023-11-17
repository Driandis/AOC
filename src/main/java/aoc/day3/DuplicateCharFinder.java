package aoc.day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharFinder {
    public static void main(String[] args) {
        String input = "TVDvVCvppvTDmzZVTbZpTzBBNQQQJlJBBJBNNJmRBwRH";
        char uniqueChar = findUniqueCharInBothHalves(input);

        if (uniqueChar != '\0') {
            System.out.println("The unique character in both halves: " + uniqueChar);
        } else {
            System.out.println("No unique character found in both halves.");
        }
    }

    private static char findUniqueCharInBothHalves(String str) { // make to StringArray and loop till end
        if (str == null || str.length() % 2 != 0) {
            return '\0';
        }
        int midIndex = str.length() / 2;
        String firstHalf = str.substring(0, midIndex);
        String secondHalf = str.substring(midIndex);

        Map<Character, Integer> firstHalfCharCount = getCharCountMap(firstHalf);
        Map<Character, Integer> secondHalfCharCount = getCharCountMap(secondHalf);

        for (Map.Entry<Character, Integer> entry : firstHalfCharCount.entrySet()) {
            char ch = entry.getKey();
            if (entry.getValue() == 1 && secondHalfCharCount.getOrDefault(ch, 0) == 1) {
                return ch;
            }
        }

        return '\0';
    }

    private static Map<Character, Integer> getCharCountMap(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.merge(ch, 1, Integer::sum);
        }
        return charCountMap;
    }

    private static ArrayList<String> readFile(String filePath) {
        ArrayList<String> result = null;
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return result;
    }
}