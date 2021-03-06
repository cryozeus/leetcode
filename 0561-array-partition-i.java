class Solution {
    public int arrayPairSum(int[] nums) {
        
        if(nums.length == 0) return 0;
        
        Arrays.sort(nums);
        int res = 0;
        
        //counter updates by 2, take just the first out of every pair of elements in sorted array
        for(int i = 0; i < nums.length; i=i+2) {
            res += nums[i];
        }
        
        return res;
        
    }
}