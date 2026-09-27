class Solution {
    public int[] twoSum(int[] nums, int target) {
        // given a array of nums
        // target int
        // return the i and j index
        // num[i] + nums[j] == target
        // i != j
        
        for(int i = 0; i < nums.length; i++){

            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return nums = new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
