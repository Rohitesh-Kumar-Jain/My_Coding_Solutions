package cinema;

import java.util.Scanner;

public class Stage2 {  // change class name to cinema in order to successfully submit to the task.

    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int noRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int noSeat = scanner.nextInt();

        if(noRows*noSeat < 60){
            System.out.println("Total income:");
            System.out.println("$" + noRows*noSeat*10);
        }
        else{
            int frontRows = noRows/2;
            int backRows = noRows - frontRows;
            System.out.println("Total income:");
            int grossIncome = frontRows*noSeat*10 + backRows*noSeat*8;
            System.out.println("$" + grossIncome);
        }
    }
}