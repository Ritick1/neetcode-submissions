class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> resultMap = new LinkedHashMap<>();

        for(int i = 0; i < strs.length; i++){
          char[] valueCharArray =  strs[i].toCharArray();

          Arrays.sort(valueCharArray);
          
          String key = new String(valueCharArray);

          if(resultMap.containsKey(key)){
             List<String> valueList = resultMap.get(key);
             valueList.add(strs[i]);
          }else{
            List<String> valueList = new ArrayList<>();
            valueList.add(strs[i]);
             resultMap.put(key, valueList);
          }

        }

        List<List<String>> resultList = new ArrayList<>();
        for(Map.Entry<String, List<String>> s1 : resultMap.entrySet()){
             resultList.add(s1.getValue());
        }
        return resultList;
        
    }
}
