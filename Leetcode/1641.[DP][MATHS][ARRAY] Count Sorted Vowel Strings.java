// This is my solution. 

class Solution {
    public int countVowelStrings(int n) {
        int[][] array = new int[n+1][6];
        array[1][0]=5; array[1][1]=1; array[1][2]=1; array[1][3]=1; array[1][4]=1; array[1][5]=1;
        for(int i=2;i<=n;i++){
            array[i][1]= array[i-1][0];
            array[i][2]= array[i-1][0] - array[i-1][1];
            array[i][3]= array[i-1][0] - array[i-1][1] - array[i-1][2];
            array[i][4]= array[i-1][0] - array[i-1][1] - array[i-1][2] - array[i-1][3];
            array[i][5]= array[i-1][0] - array[i-1][1] - array[i-1][2] - array[i-1][3] - array[i-1][4];
            
            array[i][0]= array[i][1] + array[i][2] + array[i][3] + array[i][4] + array[i][5];
        }
        return array[n][0];
    }
}





// I think MaxLu implemented the same idea in a better way...

class Solution {
    public int countVowelStrings(int n) {
        int a = 1, e = 1, i = 1, o = 1, u = 1;
        while(n > 1) {
            // add new char before prev string
            a = (a + e + i + o + u); // a, e, i, o, u -> aa, ae, ai, ao, au
            e = (e + i + o + u); // e, i, o, u -> ee, ei, eo, eu
            i = (i + o + u); // i, o, u -> ii, io, iu
            o = (o + u); // o, u -> oo, ou
            u = (u);; // u -> uu
            n--;
        }
        
        return a + e + i + o + u;
    }
}



// lee215 is on another level I guess, here his yet another one liner ....

    public int countVowelStrings(int n) {
        return (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24;
    }


/* his explanation ...
Solution 4: Combination number

Now we have n characters, we are going to insert 4 l inside.
We can add in the front, in the middle and in the end.
How many ways do we have?
For the 1st l, we have n+1 position to insert.
For the 2nd l, we have n+2 position to insert.
For the 3rd l, we have n+3 position to insert.
For the 4th l, we have n+4 position to insert.
Also 4 l are the same,
there are (n + 1) * (n + 2) * (n + 3) * (n + 4) / 4! ways.

The character before the 1st l, we set to a.
The character before the 2nd l, we set to e.
The character before the 3rd l, we set to i.
The character before the 4th l, we set to o.
The character before the 5th l, we set to u.

We get the one result for the oringinal problem.

Time O(1)
Space O(1)
*/