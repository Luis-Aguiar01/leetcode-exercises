package algorithms.exercise;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter_2942 {

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                list.add(i);
            }
        }

        return list;
    }
}