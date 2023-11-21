package collection;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[][] board = new char[3][3];

        for(int i =0; i<3; i++){
            for (int j=0; j<3; j++){
                board[i][j] = '-';
            }
        }

        System.out.println("Tic Toc Teo");
        viewBoard(board);

        boolean hasWin = true;

        while (true){
            String val = in.next();



        }

    }

    public static void viewBoard(char[][] board){
        for(int i =0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

}
