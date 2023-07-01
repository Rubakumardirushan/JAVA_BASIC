class Solution {
    public int maxSubArray(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
if(nums.length==2){
    if(nums[0]<0){
return nums[1];

    }else if(nums[1]<0){
       return nums[0];
    }else if(nums[0]>0 && nums[1]>0){
        return nums[0]+nums[1];
    }
}
        for(int i=0;i<nums.length;i++){
            for(int y=i+1;y<nums.length;y++){
                if(nums[i]==nums[y])
                    
                    nums[y]=0;
                    
                }
            }
        

for(int x:nums){
    if(x<-1){
        x=0;
    }
    
    sum=sum+x;
}
return sum;
    }
}
