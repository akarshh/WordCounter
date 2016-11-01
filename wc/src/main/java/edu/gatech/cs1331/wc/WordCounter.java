package edu.gatech.cs1331.wc;

import java.util.Set;

public interface WordCounter {

    Set<String> words();
    int count(String word);
}
