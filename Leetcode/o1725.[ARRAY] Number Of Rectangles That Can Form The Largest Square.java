class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxCount=0;
        int maxLen=0;
        for(int i=0;i<rectangles.length;i++){
            int curLen = rectangles[i][0] < rectangles[i][1] ? rectangles[i][0] : rectangles[i][1];
            if(curLen == maxLen){
                maxCount++;
            }
            else if(curLen > maxLen){
                maxLen = curLen;
                maxCount=1;
            }
        }
        return maxCount;
    }
}