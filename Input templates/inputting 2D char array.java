import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Template for inputting 2D char array.
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            char[][] arr = new char[n][n];
            for (int x = 0; x < n; x++) {
                String s = in.next();
                for (int y = 0; y < n; y++) {
                    arr[x][y] = s.charAt(y);
                }
            }
//            System.out.println(Arrays.deepToString(arr));
        }
    }
}