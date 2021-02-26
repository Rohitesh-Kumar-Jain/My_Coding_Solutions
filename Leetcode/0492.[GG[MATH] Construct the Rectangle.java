https://leetcode.com/problems/construct-the-rectangle/discuss/97210/3-line-Clean-and-easy-understand-solution


public int[] constructRectangle(int area) {
        int w = (int)Math.sqrt(area);
	while (area%w!=0) w--;
	return new int[]{area/w, w};
}