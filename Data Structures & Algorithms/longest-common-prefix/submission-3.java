class Solution {
    public String longestCommonPrefix(String[] strs) {
        List<String> strings = Arrays.stream(strs)
        .sorted(Comparator.comparing(String::length))
        .toList();

        // oth index -> lowest length
        StringBuilder smallest = new StringBuilder(strings.get(0));
        StringBuilder result = new StringBuilder();
        while (smallest.length() > 0) {

            boolean found = true;
            for (int i = 1; i < strs.length; i++) {
                if (strings.get(i).startsWith(smallest.toString())) {
                    continue;
                } else {
                    smallest.setLength(smallest.length() - 1);
                    found = false;
                    break;
                }
            }
            if (found) {
                result = smallest;
                break;
            }
            
        }

        return result.toString();
    }
}