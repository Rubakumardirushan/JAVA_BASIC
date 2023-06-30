class Solution {
    public void sortColors(int[] nums) {
        int red=0;
        int white=0;
        int blue=0;
        int x=0;
        while(x<nums.length){
            switch(nums[x]){
                case 0:
                red++;
                break;
                case 1:
                white++;
                break;
                 case 2:
                 blue++;
                 break;
            }
            x++;
        }
int k=0;
    while(red>0){
        nums[k]=0;
        k++;
        red--;
    }
    while(white>0){
        nums[k]=1;
        k++;
        white--;

    }
    while(blue>0){
        nums[k]=2;
        k++;
        blue--;
    }


    }
}
