class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    
                    if (!arr.contains(nums1[i])) {
                        arr.add(nums1[i]);
                    }    
                    break;
                }
            }
        }
        int n=arr.size();
        int[] arrr= new int[n];
        for(int i=0;i<n;i++){
            arrr[i]=arr.get(i);
        }
        return arrr;

    }
}