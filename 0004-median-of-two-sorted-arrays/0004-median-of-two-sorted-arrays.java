class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) return findMedianSortedArrays(nums2,nums1);
        int n1=nums1.length;
        int n2=nums2.length;
        int low=0;
        int high=n1;
        while(low<=high){
            int cut1=low+(high-low)/2;
            int cut2=(n1+n2+1)/2-cut1;
            int left1=Integer.MIN_VALUE;
            int left2=Integer.MIN_VALUE;
            int right1=Integer.MAX_VALUE;
            int right2=Integer.MAX_VALUE;
            if(cut1!=0){
                left1=nums1[cut1-1];
            }
            if(cut2!=0){
                left2=nums2[cut2-1];
            }
            if(cut1!=n1){
                right1=nums1[cut1];
            }
            if(cut2!=n2){
                right2=nums2[cut2];
            }
            if(left1<=right2 && left2<=right1){
                if((n1+n2)%2==0){
                    return (Math.max(left1,left2)+ Math.min(right1,right2))/2.0;
                }else{
                    return Math.max(left1,left2);
                }
            }
            else if(left1>right2){
                high=cut1-1;
            }else{
                low=cut1+1;
            }
        }return 0.0;
    }
}