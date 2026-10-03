class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] newArray1 = new int[nums.length+1];
        int[] newArray2 = new int[nums.length+1];

        int numsIndex = 0;
        for(int i = 0; i < newArray1.length; i++){
            if(i == 0){
                newArray1[i] = 1;
                continue;
            }

            newArray1[i] = newArray1[i - 1] * nums[numsIndex];
            numsIndex++;
        }

        int numsIndex1 = nums.length - 1;
        for(int i = newArray2.length - 1; i >= 0; i--){
            if(i == newArray2.length - 1){
                newArray2[i] = 1;
                continue;
            }

            newArray2[i] = newArray2[i+1] * nums[numsIndex1];
            numsIndex1--;
        }


        int[] result = new int[nums.length];

        for(int i = 0; i < result.length; i++){
            result[i] = newArray1[i] * newArray2[i+1];
        }
        
        return result;



    }
}  
