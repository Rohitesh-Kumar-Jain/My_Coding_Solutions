// lee215's solution


    public int[] decode(int[] A, int first) {
        int n = A.length, res[] = new int[n + 1];
        res[0] = first;
        for (int i = 0; i < n; ++i)
            res[i + 1] = res[i] ^ A[i];
        return res;
    }

/*
    Explanation

cur means the current decoded element.

For each element we have
A[i] = res[i] ^ res[i+1]
A[i] ^ A[i] ^ res[i+1] = res[i] ^ res[i+1] ^ A[i] ^ res[i+1]
res[i+1] = res[i] ^ A[i]

So we use the conslusion above,
iterate the input encoded array A,
update res[i + 1] = res[i] ^ A[i].

Complexity

Time O(n)
Space O(n)

*/
