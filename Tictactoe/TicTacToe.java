package Tictactoe;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        System.out.println("Welcome To TicTacToe");
        char[] board = createBoard();
        choose();
        showBoard(board);
    }
    /*
    craeting board for TicTacToe of size 10 and ignoring
    0th index
     */
    public static char[] createBoard()
    {
        char[] board = new char[10];
        for(int i = 1; i < board.length; i++)
        {
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
        //takin input from user so user can chose letter of his own choice
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
    /*
    creating a function to show board of TicTacToe game at run
    time
     */
    public static void showBoard(char[] board)
    {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("--------------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("--------------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
        System.out.println("--------------");
    }
}
