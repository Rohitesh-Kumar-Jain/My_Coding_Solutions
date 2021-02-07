class Solution {
    public int maximumScore(int a, int b, int c) {
        int ans=0;
        Queue<Integer> pq = new PriorityQueue<>((a1,b1)-> b1-a1);
        if(a > 0) pq.add(a);
        if(b > 0) pq.add(b);
        if(c > 0) pq.add(c);
        while(pq.size() >1){
            int high = pq.poll();
            int shigh = pq.poll();
            ans++;
            if(--high>0) pq.add(high);
            if(--shigh>0) pq.add(shigh);
        }
        return ans;
    }
}


//  https://leetcode.com/problems/maximum-score-from-removing-stones/discuss/1053597/C%2B%2BJava-a-greater-b-greater-c
int maximumScore(int a, int b, int c) {
    if (a < b)
        return maximumScore(b, a, c);
    if (b < c)
        return maximumScore(a, c, b);
    if (a < c)
        return maximumScore(c, b, a);
    if (b == 0)
        return 0;
    return 1 + maximumScore(a - 1, b - 1, c); 
}


// https://leetcode.com/problems/maximum-score-from-removing-stones/discuss/1053516/JAVA-or-Math-or-100-or
class Solution {
    public int maximumScore(int a, int b, int c) {
        //strategy: Math
        int[] data = new int[]{a, b, c};
        //sort piles of stones into increasing amts
        Arrays.sort(data);
        //the largest pile can only take up the min between itself or the sum of the other two piles
        int answer = Math.min(data[0] + data[1], data[2]);
        //we can find a way to decrease the other piles until it has equal amts
        //we want equal amts in the two smallest piles to ensure maximum points obtained
        //divide by 2 because each pile can only have half of the total remaining
        return answer + Math.max(0, (data[0] + data[1] - data[2]) / 2);
    }
}