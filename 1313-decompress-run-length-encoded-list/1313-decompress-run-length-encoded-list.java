class Solution {
    public int[] decompressRLElist(int[] nums) {
        int f = 0;
        int v = f+1;
        int l=0;
        while(f<nums.length && v<nums.length){
            l+=nums[f];
            f+=2;
            v=f+1;
        }
        int[] arr = new int[l];
        int k = arr.length-1;
        while(k>=0){
            while(nums[f-2]>0){
                arr[k]=nums[v-2];
                nums[f-2]--;
                k--;
            }
            f-=2;
            v-=2;
        }
       return arr;
    }
}