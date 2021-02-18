class Solution {
    public int maxArea(int[] height) {
        int area=1,result=0;
        int left = 0, right = height.length-1;
        while(left<right)
        {
            area = (right-left) * Math.min(height[left],height[right]);
            result = Math.max(area,result);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return result;
    }
}