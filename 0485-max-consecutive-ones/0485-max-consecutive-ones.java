class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len=0;
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                len++;
            }
            else{
                len=0;
            }
            maxlen=Math.max(len,maxlen);
        }
        return maxlen;
    }
}