class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3[]= new int[nums1.length+nums2.length];
        int x=0;
        while(x<nums1.length){
            nums3[x]=nums1[x];
            x++;
        }
        x=0;
        int value=nums1.length;
        while(x<nums2.length){
            nums3[value]=nums2[x];
            x++;
            value++;
        }

        Arrays.sort(nums3);
        if(nums3.length%2==1){
 int  val=nums3.length/2;
double value2= nums3[val];
return value2;
        }else{
           int  val=nums3.length/2;
            double value2=0.0000;
           value2 = (nums3[val]+nums3[val-1]);
           value2=value2/2;
            return value2;
        }
    }
}
