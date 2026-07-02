class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int res[]= new int [m+n];
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                res[k]=nums1[i];
                i--;
            

            }else if(nums2[j]>=nums1[i]){
                res[k]=nums2[j];
                j--;
                
            }
            k--;

            
          }
          while(i>=0){
            res[k]=nums1[i];
            i--;
            k--;
          }
           while(j>=0){
            res[k]=nums2[j];
            j--;
            k--;
          }
          for(int x=0; x<m+n; x++){
            nums1[x]=res[x];
          }
    }
}