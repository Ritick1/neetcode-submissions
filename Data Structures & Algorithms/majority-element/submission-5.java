class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        // 5 -> 3rd
        // 4 -> 3rd
        // 

        int index = nums.length % 2 == 0 ? nums.length / 2 : nums.length / 2; 
        return nums[index];

        // Map<Integer, Integer> valueKeyMap = new HashMap<>();
        // for(int i = 0; i < nums.length; i++){
        //     if(valueKeyMap.containsKey(nums[i])){
        //        int count = valueKeyMap.get(nums[i]);
        //        count++;
        //        valueKeyMap.put(nums[i], count);
        //     }else{
        //         valueKeyMap.put(nums[i], 1);
        //     }
        // }

        // int majorityElement = 0;
        // int maxCount = 0;
        // for(Map.Entry<Integer, Integer> s1 : valueKeyMap.entrySet()){
        //    int value = s1.getValue();
        //    if(value > maxCount){
        //         maxCount = value;
        //         majorityElement = s1.getKey();
        //    }
        // }

        // return majorityElement;

        
    }
}