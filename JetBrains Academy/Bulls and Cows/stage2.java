package bullscows;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String guess;
    static String secretCode;
    public static void main(String[] args) {
        secretCode = "9305";
        guess = scanner.nextLine();
        grader();
    }

    public static void grader(){
        int noCommonNos = 0;
        int noBulls = 0;
        int noCows;
        int[] secretCodeFreq = new int[10];
        int[] guessFreq = new int[10];
        for(int i=0;i<secretCode.length();i++){
            secretCodeFreq[secretCode.charAt(i) - '0']++;
        }
        for(int i=0;i<guess.length();i++){
            guessFreq[guess.charAt(i) - '0']++;
        }
        for(int i=0;i<10;i++){
            noCommonNos += Math.min(guessFreq[i], secretCodeFreq[i]);
        }
        for(int i=0;i<guess.length();i++){
            if (guess.charAt(i) == secretCode.charAt(i)) {
                noBulls++;
            }
        }
        noCows = noCommonNos - noBulls;
        System.out.print("Grade: ");
        if(noBulls > 0 && noCows > 0){
            System.out.printf("%d bull(s) and %d cow(s).",noBulls,noCows);
        }
        else if (noBulls > 0) {
            System.out.printf("%d bull(s).", noBulls);
        }
        else if (noCows > 0) {
            System.out.printf("%d cow(s).", noCows);
        }
        else {
            System.out.print("None.");
        }
        System.out.println(" The secret code is 9305.");
    }
}
