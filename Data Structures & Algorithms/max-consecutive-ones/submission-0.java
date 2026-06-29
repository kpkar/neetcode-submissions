class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = Integer.MIN_VALUE;
        int count = 0;
        if(nums != null) {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == 1) {
                    count++;
                } else {
                    maxCount = Math.max(count, maxCount);
                    count = 0;
                }
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}