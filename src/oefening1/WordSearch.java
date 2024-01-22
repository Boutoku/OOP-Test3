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
        for (int i = 0; i < 25; i++) {
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
        consonants.stream()
                .filter(consonant -> !list.containsKey(consonant))
                .forEach(consonant -> System.out.println(consonant + " doesn't occur"));
    }

    private void printResult() {
        System.out.println("These characters occur MINIMAL " + resultCount + " times");

        result.stream()
                .sorted()
                .forEach(character -> System.out.println("  " + character));
    }

    public void characterMinimalOccurence(int count) {
        resultCount = count;
        result.clear();

        list.keySet().stream()
                .filter(character -> list.get(character) >= count)
                .forEach(result::add);

        printResult();
    }

    public void checkWord(String word) {
        HashMap<String, Integer> tempList = new HashMap<>(list);

        for (char c : word.toCharArray()) {
            String character = String.valueOf(c);

            if (!tempList.containsKey(character) || tempList.get(character) == 0) {
                System.out.println(word + " is NOT possible");
                return;
            }

            tempList.put(character, tempList.get(character) - 1);
        }

        System.out.println(word + " is possible");
    }

    public void showList() {
        System.out.println(list);
    }
}
