class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];

        for(int i = 0, j = 0; i < ans.length; i++) {
            if(j < nums.length) {
                ans[i] = nums[j];
                j++;
            } else {
                j = 0;
                ans[i] = nums[j];
                j++;
            }
        }
        return ans;
    }
}