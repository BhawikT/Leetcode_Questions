class Solution {
    public int maximumCount(int[] nums) {
        int neg = first(nums,0);
        int firstpos = first(nums,1);
        int pos = nums.length-firstpos;
        return Math.max(pos,neg);
    }
    public int first(int[] arr,int t){
        int s = 0;
        int e = arr.length-1;
        int ans= arr.length;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>=t){
                ans=m;
                e=m-1;
            }
            else{
                s=m+1;
            }
            
        }
        return ans;
    }
}