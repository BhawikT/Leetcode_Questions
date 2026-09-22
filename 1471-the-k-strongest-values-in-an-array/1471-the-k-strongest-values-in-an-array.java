class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int[] ans = new int[k];
        int l=0;
        int m=arr[(arr.length-1)/2];
        int i=0;
        int j=arr.length-1;
        while(l<k){
            int a = Math.abs(arr[i]-m);
            int b = Math.abs(arr[j]-m); 
            if(a>b){
                ans[l]=arr[i];
                i++;
                l++;
            }
            else{
                ans[l]=arr[j];
                j--;
                l++;
            }
        }
        return ans;
       
    }
}