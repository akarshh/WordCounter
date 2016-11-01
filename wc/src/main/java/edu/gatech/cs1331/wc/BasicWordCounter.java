package edu.gatech.cs1331.wc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BasicWordCounter implements WordCounter {

    private Map<String, Integer> wordCounts;

    public BasicWordCounter(String fileName) throws FileNotFoundException {
        File inFile = new File(fileName);
        Scanner scanner = new Scanner(inFile);
        wordCounts = new HashMap<String, Integer>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            word = normalize(word);
            if (wordCounts.keySet().contains(word)) {
                int curCount = wordCounts.get(word);
                wordCounts.put(word, curCount + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }
    }

    private String normalize(String word) {
        return word.trim().toLowerCase();
    }

    public Set<String> words() {
        return wordCounts.keySet();
    }
    public int count(String word) {
        return wordCounts.get(word);
    }
}
