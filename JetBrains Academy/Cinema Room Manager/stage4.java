//package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class stage4 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Write your code here
        System.out.println("Enter the number of rows:");
        int noRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int noSeat = scanner.nextInt();

        char[][] seats = new char[noRows][noSeat];

        for(char[] row: seats){
            Arrays.fill(row,'S');
        }
        boolean flag = true;
        do {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    printSeatingArrangement(seats);
                    break;
                case 2:
                    buyTicket(seats, noRows,noSeat);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("You choosed invalid option");
            }
        }
        while (flag==true);
    }

    public static void printSeatingArrangement(char[][] seats){
        int noRows = seats.length;
        int noSeat = seats[0].length;
        System.out.println("Cinema:");
        for(int i=0;i<=noSeat;i++){
            if(i==0) System.out.print("  ");
            else{
                System.out.print(i + " ");
            }
        }
        for(int i=1;i<=noRows;i++){
            System.out.println();
            System.out.print(i +" ");
            for(int j=0;j<noSeat;j++){
                System.out.print(seats[i-1][j] + " ");
            }
        }
        System.out.println();
    }

    public static void buyTicket(char[][] seats, int noRows, int noSeat){
        System.out.println("Enter a row number:");
        int rowNo = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int seatNo = scanner.nextInt();

        if(noRows*noSeat < 60){
            System.out.println("Ticket price: $10");
        }
        else{
            if(rowNo <= noRows/2) System.out.println("Ticket price: $10");
            else System.out.println("Ticket price: $8");
        }
        seats[rowNo-1][seatNo-1] = 'B';
    }
}