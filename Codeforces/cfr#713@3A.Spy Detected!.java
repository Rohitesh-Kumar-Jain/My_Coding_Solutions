    import java.util.*;
    import java.io.*;
    public class Solution {
        public static void main(String[] args) {
            Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
            for (int i = 1; i <= t; ++i) {
                int n = in.nextInt();
                int ans = 0;
                int[] arr = new int[n];
                Map<Integer, Integer> map = new HashMap<>();
                for (int j = 0; j < n; j++) {
                    arr[j] = in.nextInt();
                    map.put(arr[j], map.getOrDefault(arr[j],0) + 1);
                }
    //            System.out.println(Arrays.toString(arr));
                for (int ki : map.keySet()) {
                    if (map.get(ki) == 1) {
                        ans = ki;
                    }
                }
                for (int j = 0; j < n; j++) {
                    if (arr[j] == ans) {
                        System.out.println(j + 1);
                        break;
                    }
                }
            }
        }
