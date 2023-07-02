class Solution {
    public int maxArea(int[] height) {
        int x=0;
        int k=0;
        int pos=0;
        int max=0;
        int distance=0;
        x=height.length;
  int fact=0;
  int value=x;
  while(value>0){
    fact=fact+value;
    value--;
  }


        int maxarr[]=new int [fact];
        for(int i=0;i<x;i++){
            for(int j=i+1;j<x;j++){
if(height[i]<height[j]){
    k=height[i];
}else{
    k=height[j];
}
distance=j-i;
if(max<distance*k){
    max=distance*k;
}
else{
    max=max;
}



            }
            
            pos++;
        }
return max;

    }
}
