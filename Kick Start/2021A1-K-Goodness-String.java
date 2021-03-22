import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String Times[] = sc.nextLine().split(" ");
        int T = Integer.parseInt(Times[0]);
        for(int i=1;i<=T;i++){
            String ar[] = sc.nextLine().split(" ");
            int N= Integer.parseInt(ar[0]);
            int K= Integer.parseInt(ar[1]);
            String s = sc.nextLine();
            int goodness=0;
            int count=0;
            int len = s.length();
            for(int j=0;j<len/2;j++){
                if(s.charAt(j)!=s.charAt(len-j-1)) {
                    count++;
                }
            }
            goodness = Math.abs(K-count);
            System.out.println("Case #"+i+": "+goodness);
        }
    }
}
