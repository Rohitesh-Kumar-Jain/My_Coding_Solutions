package tictactoe;

import java.util.Scanner;
public class Main {
    static char[] grid;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter cells: ");
        String input = scanner.next();
        grid = input.toCharArray();
        showGame();
        analyzeGame();
    }

    public static void showGame() {
        System.out.println("---------");
        System.out.printf("| %c %c %c |\n", grid[0], grid[1], grid[2]);
        System.out.printf("| %c %c %c |\n", grid[3], grid[4], grid[5]);
        System.out.printf("| %c %c %c |\n", grid[6], grid[7], grid[8]);
        System.out.println("---------");
    }

    public static void analyzeGame() {
        boolean impossible;
        boolean threeX;
        boolean threeO;
        boolean aGridEmpty;

        impossible = invalidGrid();
        threeO = isThree('O');
        threeX = isThree('X');
        aGridEmpty = isAGridEmpty();

        if (impossible || (threeO && threeX)) {
            System.out.println("Impossible");
        }
        else if (threeO) {
            System.out.println("O wins");
        }
        else if (threeX) {
            System.out.println("X wins");
        }
        else if (aGridEmpty) {
            System.out.println("Game not finished");
        }
        else {
            System.out.println("Draw");
        }
    }

    public static boolean isThree(char element) {
        if(isTreeInARow(grid[0],grid[4],grid[8],element) || isTreeInARow(grid[6],grid[4],grid[2],element)){
            return true;
        }
        for (int i=0;i<3;i++){
            if(isTreeInARow(grid[i],grid[i+3],grid[i+6],element)) return true;
            if(isTreeInARow(grid[i*3],grid[i*3 + 1],grid[i*3 + 2],element)) return true;
        }
        return false;
    }

    public static boolean isTreeInARow(char a, char b, char c, char element) {
        if(a == b && b == c && b == element) return true;
        return false;
    }

    public static boolean invalidGrid(){
        int countO = 0;
        int countX = 0;
        for(char ch: grid){
            if(ch == 'O') {
                countO++;
            }
            else if (ch == 'X'){
                countX++;
            }
        }
        if (Math.abs(countO - countX) > 1) return true;
        return false;
    }

    public static boolean isAGridEmpty(){
        for(char ch: grid){
            if (ch == '_') return true;
        }
        return false;
    }
}