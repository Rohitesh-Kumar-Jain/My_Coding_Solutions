package bullscows;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String guess;
    static String secretCode;
    static int secretCodeLength;
    public static void main(String[] args) {
        generateSecretRandomCode();
        //guess = scanner.nextLine();
        //grader();
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

    public static void generateSecretRandomCode() {
        StringBuilder randomCode = new StringBuilder();
        boolean invalidNo;
        do {
            invalidNo = false;
            secretCodeLength = scanner.nextInt();
            if (secretCodeLength > 10) {
                System.out.println("Error: can't generate a secret number with a length of 11 because there aren't enough unique digits.");
                invalidNo = true;
            }
        }
        while (invalidNo);
        boolean randomNumberLacks;
        do {
            randomNumberLacks = false;
            long pseudoRandomNumber = System.nanoTime();
            HashSet<Long> numbers = new HashSet<>();
//            System.out.print(pseudoRandomNumber + " digits: ");
            while (pseudoRandomNumber > 0 && numbers.size() < secretCodeLength){
                long digit = pseudoRandomNumber%10;
//                System.out.print("  " + digit);
                if(!numbers.contains(digit)){
                    randomCode.append(digit);
                    numbers.add(digit);
                }
                pseudoRandomNumber = pseudoRandomNumber/10;
            }
            if (randomCode.length()!=secretCodeLength) {
                randomNumberLacks = true;
            }
//            System.out.println();
        }
        while (randomNumberLacks);
        secretCode = randomCode.toString();
        System.out.printf("The random secret number is %s",secretCode);
    }
}
