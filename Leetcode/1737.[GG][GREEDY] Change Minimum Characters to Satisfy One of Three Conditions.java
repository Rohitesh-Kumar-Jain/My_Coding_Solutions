// This is lee215's solutino : https://leetcode.com/problems/change-minimum-characters-to-satisfy-one-of-three-conditions/discuss/1032070/JavaC%2B%2BPython-Clean-Solution


public int minCharacters(String a, String b) {
        int m = a.length(), n = b.length(), res = m + n;
        int[] c1 = new int[26], c2 = new int[26];
        for (int i = 0; i < m; ++i)
            c1[a.charAt(i) - 'a']++;
        for (int i = 0; i < n; ++i)
            c2[b.charAt(i) - 'a']++;

        for (int i = 0; i < 26; ++i) {
            res = Math.min(res, m + n - c1[i] - c2[i]); // condition 3
            if (i > 0) {
                c1[i] += c1[i - 1];
                c2[i] += c2[i - 1];
            }
            if (i < 25) {
                res = Math.min(res, m - c1[i] + c2[i]); // condition 1
                res = Math.min(res, n - c2[i] + c1[i]); // condition 2
            }
        }
        return res;
    }


/* Here's what he had to say about this 

Explanation

Count the frequcy of each character in a and b.
Find the most common characters most_common = max((c1 + c2).values()),
this help meet the condition 3 with m + n - most_common.

The we calculate the accumulate prefix sum of count.
This help finding the number of smaller characters in O(1) time.

Enumerate the character i a,b,c...x,y,
To meet condition 1,
which is a < b,
we need (m - c1[i]) + c2[i]

To meet condition 2,
which is a > b,
we need n - c2[i] + c1[i]

Complexity

Time O(m + n)
Space O(26)



// My reaction on this solution : 

Literally, his java solution is a big brain time.

For those who still wondering why

To meet condition 1,
which is a < b,
we need (m - c1[i]) + c2[i]

we did that because, if we want to convert a smaller than b, at the ith iteration,
 the element in the c1 after the i will be required to be changed to smaller letter, 
 no of such letters will -> total no of element - total no of elements before the ith and 
 hence m - c1[i], also we need to change the letters in C2 which are smaller than ith in C1, 
 and the no of such elements will be C2[i], hence we did + c2[i]



Honestly you can take time to understand this, it took me 10 mins to figure this out xD

*/


