class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxArea = 0;
        while (l < r) {

            int area = Math.abs(l-r) * Math.min(heights[l], heights[r]);
            maxArea = Math.max(maxArea, area);

            if(heights[l] < heights[r])
                l++;
            else if (heights[l] > heights[r] ) {
                r--;
            } else {
                l++;
                r--;
            }
        }

        return maxArea;
    }
}
