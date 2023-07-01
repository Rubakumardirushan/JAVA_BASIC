class Solution {
    public int[] closestPrimes(int left, int right) {
        int num[]=new int[2];
        if(right-left==2|| right-left==1){
            num[0]=-1;
            num[1]=-1;
            return num;
        }
int check=left+1;
int x=right-left;
int y=0;
for(int i=0;i<x-1;i++){
if(check%3==0 || check%2==0 ||check%5==0 || check%7==0){
check++;
}else{
    num[y]=check;
    y++;
    check++;
    if(y==2){
        return num;
    }
}
}
return num;
    }
}
