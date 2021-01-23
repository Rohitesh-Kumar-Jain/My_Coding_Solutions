import java.util.Scanner;
import java.lang.*;
public class Main {
    public static void main(String[] args){
        char C1, C2, C3;
        Scanner s = new Scanner(System.in);
        String str=s.next();
        C1 = str.charAt(0);
        C2 = str.charAt(1);
        C3 = str.charAt(2);

        if(C1==C2 && C2==C3) System.out.println("Won");
        else System.out.println("Lost");

    }
}
