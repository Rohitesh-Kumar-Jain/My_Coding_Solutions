package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class stage5 {
    static Scanner scanner = new Scanner(System.in);
    static int ticketsPurchased = 0;
    static int totalTickets = 0;
    static int currentIncome = 0;
    static int noRows = 0;
    static int noSeat = 0;
    public static void main(String[] args) {
        // Write your code here
        System.out.println("Enter the number of rows:");
        noRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        noSeat = scanner.nextInt();

        totalTickets = noRows*noSeat;

        char[][] seats = new char[noRows][noSeat];

        for(char[] row: seats){
            Arrays.fill(row,'S');
        }
        boolean flag = true;
        do {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    printSeatingArrangement(seats);
                    break;
                case 2:
                    buyTicket(seats, noRows,noSeat);
                    break;
                case 3:
                    showStatistics();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("You chose invalid option");
            }
        }
        while (flag);
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
        int rowNo;
        int seatNo;
        boolean invalidSeat;
        do {
            invalidSeat = false;
            System.out.println("Enter a row number:");
            rowNo = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            seatNo = scanner.nextInt();

            if (rowNo > noRows || seatNo > noSeat || rowNo < 0 || seatNo < 0){
                System.out.println("Wrong input!");
                invalidSeat = true;
            }
            else if (seats[rowNo-1][seatNo-1] == 'B') {
                System.out.println("That ticket has already been purchased!");
                invalidSeat = true;
            }
        }
        while (invalidSeat);

        if (noRows*noSeat < 60) {
            System.out.println("Ticket price: $10");
            currentIncome += 10;
        }
        else{
            if (rowNo <= noRows/2) {
                System.out.println("Ticket price: $10");
                currentIncome += 10;
            }
            else {
                System.out.println("Ticket price: $8");
                currentIncome += 8;
            }
        }
        seats[rowNo-1][seatNo-1] = 'B';
        ticketsPurchased++;
    }

    public static void showStatistics(){
        System.out.println("Number of purchased tickets: " + ticketsPurchased);
        System.out.printf("Percentage: %.2f%%" ,(float)ticketsPurchased/totalTickets*100);
        System.out.println();
        System.out.println("Current income: $" + currentIncome);
        totalIncome();
    }

    public static void totalIncome(){
        int grossIncome;
        if(noRows*noSeat < 60){
            grossIncome = noRows*noSeat*10;
        }
        else{
            int frontRows = noRows/2;
            int backRows = noRows - frontRows;
            grossIncome = frontRows*noSeat*10 + backRows*noSeat*8;
        }
        System.out.println("Total income: $" + grossIncome);
    }
}