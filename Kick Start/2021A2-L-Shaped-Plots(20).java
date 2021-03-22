import java.util.*;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt();
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] matrix = new int[n][m];
            int count=0;
            for(int j=0;j<n;j++){
                for(int k=0;k<m;k++){
                    matrix[j][k]= in.nextInt();
                }
            }
            for(int j=0;j<n;j++){
                for(int k=0;k<m;k++){
                    if(matrix[j][k]==1){
                        int a=1,b=1,c=1,d=1;
                        for(int B=j-1;B>=0;B--){
                            if(matrix[B][k]==1) b++;
                            else break;
                        }
                        for(int D=j+1;D<n;D++){
                            if(matrix[D][k]==1) d++;
                            else break;
                        }
                        for(int A=k-1;A>=0;A--){
                            if(matrix[j][A]==1) a++;
                            else break;
                        }
                        for(int C=k+1;C<m;C++){
                            if(matrix[j][C]==1) c++;
                            else break;
                        }
                        if(a>=2 && b>=2) count = count + lshapes(a,b);
                        if(b>=2 && c>=2) count = count + lshapes(b,c);
                        if(c>=2 && d>=2) count += lshapes(c,d);
                        if(d>=2 && a>=2) count += lshapes(d,a);
                    }
                }
            }
            System.out.println("Case #" + i + ": " + count);
        }
    }
    public static int lshapes(int x, int y){
        int lcount=0;
        for(int r=2;r<=x;r++){
            if(r<=y/2) lcount++;
            else break;
        }
        for(int s=2;s<=y;s++){
            if(s<=x/2) lcount++;
        }
        return lcount;
    }
}