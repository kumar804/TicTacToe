package Tictactoe;

import java.util.Scanner;

public class TicTacToe {
    char[] board = createBoard();
    public static void main(String[] args) {
        System.out.println("Welcome To TicTacToe");

    }
    /*craeting board for TicTacToe of size 10 and ignoring
    0th index
     */
    public static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }
        /*
        creating a function to chose letter x or o if user chose x then computer variable will be
        x
         */
    public static void choose()
    {
        //takin user input to chose letter
        Scanner sc = new Scanner(System.in);
        char computerVariable = 0 ;
        System.out.println("Enter the characater 'X' OR 'O' to play");
        char playerChoose =  sc. next().charAt(0);
        if(playerChoose == 'X')
        {
            computerVariable = 'O';
            System.out.println("Player input is :" +playerChoose);
            System.out.println("Computer input is :" +computerVariable);
        }
        else if(playerChoose == 'O')
        {
            computerVariable = 'X';
            System.out.println("Player input is :" +playerChoose);
            System.out.println("Computer input is :" +computerVariable);
        }

        else
        {
            System.out.println("Invalid input please input the valid charcter");
        }


    }
}
