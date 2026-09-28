class Solution {
    public int[] twoSum(int[] nums, int target) {
        // value , index
        Map<Integer,Integer> valueIndexMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
           int valueWeAreFinding = target - nums[i];
            if(valueIndexMap.containsKey(valueWeAreFinding)){
                return new int[]{valueIndexMap.get(valueWeAreFinding), i};
            }else{
                valueIndexMap.put(nums[i], i);
                continue;
            }
        }

        return new int[]{};
    }
}
