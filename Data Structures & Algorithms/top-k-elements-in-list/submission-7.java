class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(nums.length == 1){
            return nums;
        }
        

        Map<Integer, Integer> valueKeyMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(valueKeyMap.containsKey(nums[i])){
               int count = valueKeyMap.get(nums[i]);
               count++;
               valueKeyMap.put(nums[i], count);
            }else{
                valueKeyMap.put(nums[i], 1);
            }
        }

        
    List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>   (valueKeyMap.entrySet());
    Collections.sort(entryList, (a, b) ->                           b.getValue().compareTo(a.getValue()));

    
    int[] newNums = new int[k];
    
    for (int i = 0; i < k; i++) {
        newNums[i] = entryList.get(i).getKey();
    }           

        return newNums;
    }
}
