class Solution {
    public String longestCommonPrefix(String[] strs) {
        
         StringBuilder maxPrefix = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {

            String str = strs[0];
            char[] charArray = str.toCharArray();

            for (int j = 1; j < strs.length; j++) {

                String str1 = strs[j];
                char[] charArray1 = str1.toCharArray();

                if (i >= charArray1.length || charArray[i] != charArray1[i]) {
                    return maxPrefix.toString();
                }
            }

            maxPrefix.append(charArray[i]);
        }

        return maxPrefix.toString();
    }
}