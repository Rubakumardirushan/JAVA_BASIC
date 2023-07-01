class Solution {
    public void nextPermutation(int[] nums) {
        int temp=nums[0];
        Random rand = new Random();
        int x=rand.nextInt(10);
        if(x%2==0){
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]=temp;
    }else{
        int teo=nums[nums.length-2];
        nums[nums.length-2]=nums[nums.length-1];
        nums[nums.length-1]=temp;
    }
}
}
