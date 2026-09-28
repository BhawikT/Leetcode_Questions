class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            if(height[i]>height[j]){
                maxarea=Math.max(maxarea,height[j]*(j-i));
                j--;
            }
            else{
                maxarea=Math.max(maxarea,height[i]*(j-i));
                i++;
            }
        }
        return maxarea;
    }
}