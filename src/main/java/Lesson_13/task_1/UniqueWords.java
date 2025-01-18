package main.java.Lesson_13.task_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWords {
    public void processWords(String[] words) {
        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            uniqueWords.add(word);
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова:");
        uniqueWords.forEach(System.out::println);

        System.out.println("Частота слов:");
        wordFrequency.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
