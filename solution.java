class Solution {
    public int divide(int dividend, int divisor) {
       int temp=dividend;
       int temp1=divisor;
       int count=0;
       if(temp<0){
           temp=temp*-1;

       }
       if(temp1<0){
           temp1=temp1*-1;

       }
while(temp>0){
    temp=temp-temp1;
    if(temp>0){
        count++;
    }
    if(temp==0){
        count++;
        
    }
}
if(divisor==1){
return dividend;
}

if(divisor==-1){
    if(dividend<0){
        return Math.abs(dividend);
    }else{
        return dividend*-1;
    }
}


if(dividend<0 && divisor<0){
    return count;
}else if(dividend<0 || divisor<0){
    return -count;
}else{
    return count;
}


    }
}
