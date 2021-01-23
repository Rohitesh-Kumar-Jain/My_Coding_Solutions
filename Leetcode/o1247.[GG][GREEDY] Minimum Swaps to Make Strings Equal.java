I was clueless about the questions, then I read the hints.
I got the intuition form the hints, then I was able to implement this. 

I suggest you read the hints and give this question one more try, 

The solution based on those hints is: 

```
class Solution {
    public int minimumSwap(String s1, String s2) {
        int x1=0,y1=0,x2=0,y2=0;
        int ans=0;
        for(int i=0;i<s1.length();i++){      // counting the no of x and y in the two strings. 
            if(s1.charAt(i)!=s2.charAt(i)){
                if(s1.charAt(i)=='x') x1++;
                else y1++;
                if(s2.charAt(i)=='x') x2++;
                else y2++;
            }
        }
        if((x1+x2)%2!=0 || (y1+y2)%2!=0) return -1;  // checking for the unswapable case. 
        if(x1%2!=0){
            ans+=1 + (x1+y1)/2;   // 2 + (x1+y1) -1 
        }
        else ans=(x1+y1)/2;     // (x1 + y1)/2 is the number of combination which need 1 swap 
        return ans;
    }
}
```

I would like to give credit of this solution to the hint setter of this question : )