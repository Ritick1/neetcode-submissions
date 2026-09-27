class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // a - 2, b -2
        Map<Character, Integer> sCount = new HashMap<>();
        for (char c: s.toCharArray()) {
            sCount.merge(c, 1, Integer::sum);
        }

        // a - 0, b - 1
        for (char c: t.toCharArray()) {
            if (sCount.containsKey(c)) {
                int value = sCount.get(c);
                sCount.put(c, value - 1);
            }
        }

        for (Map.Entry<Character, Integer> entry: sCount.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }
}
