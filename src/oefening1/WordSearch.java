package oefening1;

import java.util.*;

public class WordSearch {
    private int resultCount;
    private HashSet<String> result = new HashSet<>();
    private ArrayList<String> vowels =
            new ArrayList<>(Arrays.asList("A", "E", "I", "O", "U", "Y"));
    private ArrayList<String> consonants =
            new ArrayList<>(Arrays.asList("B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "R", "S", "T", "V", "W", "Z"));
    private HashMap<String, Integer> list = new HashMap<>();

    public WordSearch() {
        loadVowels();
        loadConsonants();
    }

    private void loadVowels() {
        list.put(vowels.get(0), 2);
        list.put(vowels.get(1), 3);
        list.put(vowels.get(2), 1);
        list.put(vowels.get(3), 1);
        list.put(vowels.get(4), 1);
        list.put(vowels.get(5), 1);
    }

    private void loadConsonants() {
        Random r = new Random();
        for (int i=0; i<25; i++) {
            int index = r.nextInt(consonants.size());
            list.put(consonants.get(index), list.getOrDefault(consonants.get(index), 0) + 1);
        }
    }

    public void showConsonantsInList() {
        for (String i : list.keySet()) {
            System.out.println("'" + i + "' occurs " + list.get(i) + " times.");
        }

    }

    public void showConsonantsNotInList() {

    }

    public void characterMinimalOccurence(int count) {

    }

    public void checkWord(String word) {

    }

    public void showList() {
        System.out.println(list);
    }
}
