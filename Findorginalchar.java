public class letter {
   
    public int lengthOfLongestSubstring(String s) {
int count=s.length();
for(int x=0;x<s.length();x++)
{
    for(int y=x+1;y<s.length();y++){
    if(s.charAt(x)!='*'){
    if(s.charAt(x)==s.charAt(y)){
count--;

s = s.substring(0, y) + '*' + s.substring(y+1);

    }
}

}



    }
    if(count<0){
        count=1;
    }
    return count;
    
    }

}

