import java.util.*;

public class WordStat {

    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Create a set of all different words
        Set<String> uniqueWords = new HashSet<>(fantasyFormatData);
        System.out.println("Unique words:");
        System.out.println(uniqueWords);

        // Create a map with word length as key and word count as value
        Map<Integer, Integer> wordLengthCount = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthCount.put(length, wordLengthCount.getOrDefault(length, 0) + 1);
        }
        System.out.println("\nWord length count:");
        System.out.println(wordLengthCount);
    }
}