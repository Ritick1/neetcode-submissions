class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> count = new HashMap<>();
        char[] sCharArray = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            count.merge(sCharArray[i], 1, Integer::sum);
        }

        char[] tCharArray = t.toCharArray();
        for(int i = 0; i < t.length(); i++){
            if(count.containsKey(tCharArray[i])){
              int counts = count.get(tCharArray[i]);
              counts--;
              count.put(tCharArray[i], counts);
            }
        }

        for(Map.Entry<Character, Integer> s1 : count.entrySet()){
            if(s1.getValue() != 0){
                return false;
            }
        }

        return true;
    }
}
