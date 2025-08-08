import java.util.HashMap;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<>();

        // Count occurrences
        for (char ch : s.toCharArray()) {
            hashmap.put(ch, hashmap.getOrDefault(ch, 0) + 1);
        }

        // Get the first occurrence count
        int expected = hashmap.values().iterator().next();

        // Compare all counts with the expected value
        for (int count : hashmap.values()) {
            if (count != expected) return false;
        }

        return true;
    }
}