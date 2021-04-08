package bullscows;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String guess;
    static String secretCode;
    static int secretCodeLength;
    static boolean gameInProgress = true;
    public static void main(String[] args) {
        generateSecretRandomCode();
        System.out.println("Okay, let's start a game!");
        int i = 1;
        do {
            System.out.printf("Turn %d:\n",i);
            guess = scanner.nextLine();
            grader();
            i++;
        }
        while (gameInProgress);
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
            System.out.printf("%d bull(s) and %d cow(s).\n",noBulls,noCows);
        }
        else if (noBulls > 0) {
            System.out.printf("%d bull(s).\n", noBulls);
        }
        else if (noCows > 0) {
            System.out.printf("%d cow(s).\n", noCows);
        }
        else {
            System.out.print("None.\n");
        }
        if (noBulls == secretCodeLength) {
            gameInProgress = false;
            System.out.println("Congratulations! You guessed the secret code.");
        }
    }

    public static void generateSecretRandomCode() {
        StringBuilder randomCode = new StringBuilder();
        boolean invalidNo;
        do {
            invalidNo = false;
            System.out.println("Please, enter the secret code's length:");
            secretCodeLength = scanner.nextInt();
            if (secretCodeLength > 10) {
                System.out.println("Error: can't generate a secret number with a length of 11 because there aren't enough unique digits.");
                invalidNo = true;
            }
        }
        while (invalidNo);

        Random random = new Random();
        int firstSecretDigit = random.nextInt(9) + 1;
        randomCode.append(firstSecretDigit);
        if (secretCodeLength > 1) {
            do {
                int currentDigit = random.nextInt(10);
                if (!randomCode.toString().contains(Integer.toString(currentDigit))) {
                    randomCode.append(currentDigit);
                }
            } while (randomCode.length() != secretCodeLength);
        }
        secretCode = randomCode.toString();
        scanner.nextLine();
//        System.out.printf("The random secret number is %s",secretCode);
    }
}
