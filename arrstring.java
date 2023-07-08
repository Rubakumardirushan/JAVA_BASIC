class Solution {
    public String largestNumber(int[] nums) {
        String s1;
        String s2="";
        for(int x=0;x<nums.length;x++){
            for(int y=x+1;y<nums.length;y++){
                if(nums[x]%10>nums[y]%10){
                    
                    int temp=nums[x];
                    nums[x]=nums[y];
                    nums[y]=temp;

                }else{

                }
            }
        }
for(int val=nums.length-1;val>=0;val--){
s1=Integer.toString(nums[val]);
s2=s2+s1;
}

return s2;
    }



}
