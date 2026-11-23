class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // sort the array
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
        if(nums[i] > 0) break;
        if(i > 0 && nums[i] == nums[i-1]) continue;

            int l = i + 1;
            int r = nums.length - 1;
            while(l < r) {

                if (nums[i] + nums[l] + nums[r] > 0) {
                    r--;
                } else if (nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                } else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);
                    result.add(triplet);
                    l++;
                    r--;

                    while (l < r && nums[l] == nums[l-1]) {
                        l++;
                    }
                }
            }
        }
     return result;
    }
}
