
// best solution (rock's solution)


class Solution {
    public String getSmallestString(int n, int k) {
        int z = (k - n) / 25, r = (k - n) % 25;
        return (z == n ? "" : "a".repeat(n - z - 1) + (char)('a' + r)) + "z".repeat(z);
    }
}





//mine solution.

/**
* Intuition, first insert z's at the end of the array and we need to insert a's at the beginning also there will be 
* a character in mid of a's and z's, we need to find it as well. 
*/

class Solution {
    public String getSmallestString(int n, int k) {
        char[] arr = new char[n];
        int z = k/26;              // calculating no of z to be inserted at behind. 
        int rem = k%26;
        while(n-z >= rem){
            z--;                    // adjusting the no of z to meet the required lenght.
            rem+=26;
        }
        int i=n-1;
        int bor = rem - (n-z-1);   // bor will help us find out the character that will lie bw a's and z's .
        while(z>0){
            arr[i]='z';
            i--;
            z--;
        }
        arr[i]= (char)(bor+96);
        i--;
        while(i>=0){    // now inserting a's till the start of the array. 
            arr[i]='a';
            i--;
        }
        return new String(arr);  //converting array to a string. 
    }
}


// rock's another solution:
public String getSmallestString(int n, int k) {
        char[] ca = new char[n];
        Arrays.fill(ca, 'a');
        k -= n; // Guarantee each character value is at least 1.
        for (int i = n - 1; i >= 0 && k > 0; --i) {
            ca[i] += Math.min(25, k);
            k -= Math.min(k, 25);
        }
        return String.valueOf(ca);
    }