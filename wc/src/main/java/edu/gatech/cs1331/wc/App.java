package edu.gatech.cs1331.wc;

import java.util.Iterator;
import java.util.Set;

public class App {

    public static void main(String[] args) throws Exception {
        WordCounter wc = new BasicWordCounter(args[0]);

        // Set<String> words = wc.words();
        // Iterator<String> it  = wc.words().iterator();
        // while (it.hasNext()) {
        //     String word = it.next();
        //     System.out.printf("%s: %d", word, wc.count(word));
        // }

        // the for each below is syntax sugar for ^

        for (String word: wc.words()) {
            System.out.printf("%s: %d%n", word, wc.count(word));
        }
    }
}
