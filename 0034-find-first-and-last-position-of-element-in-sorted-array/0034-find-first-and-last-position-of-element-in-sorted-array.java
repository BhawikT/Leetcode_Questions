class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int f = first(nums,target);
        int l = last(nums,target);
        
        int[] ans = {f,l};
        return ans;
    }
    private int first(int[] arr,int n){
        int s = 0;
        int e = arr.length-1;
        int ans=-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]>n){
                e=m-1;
            }
            else if(arr[m]==n){
                ans=m;
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
       return ans;
        
    }
     private int last(int[] arr,int n){
        int s = 0;
        int e = arr.length-1;
        int ans=-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]>n){
                e=m-1;
            }
            else if(arr[m]==n){
                ans=m;
                s=m+1;
            }
            else{
                s=m+1;
            }
        }
       return ans;
        
    }
}