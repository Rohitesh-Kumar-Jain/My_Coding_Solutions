import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.printf("%d  %d   %d\n",n,a,b);
        Random random = new Random(a+b);
        int sum = 0;
        for (int i=1;i<=n;i++) {
            sum += random.nextInt(b - a + 1) + a;
        }
        System.out.println(sum);
    }
}