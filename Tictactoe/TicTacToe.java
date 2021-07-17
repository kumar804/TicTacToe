package Tictactoe;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        System.out.println("Welcome To TicTacToe");
        char[] board = createBoard();
        char choice = choose();
        char[] ticBoard = showBoard(board);
        move(ticBoard , choice);
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
    public static char choose()
    {
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
        return playerChoose;
    }
    /*
    creating a function to show board of TicTacToe game at run
    tim
     */
    public static char[] showBoard(char[] board)
    {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("--------------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("--------------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
        System.out.println("--------------");
        return board;
    }
    /*
    creatin a fucntion  move of char type so user can make
    his move while playin game
     */
    public static char[] move(char[] board , char choose)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value between 1 to 9 to move");
        int value = sc.nextInt();
        if(board[value] == ' ')
        {
            System.out.println("Ready to move");
        }
        else
        {
            System.out.println("Your desired place is not empty");
        }
        if(value < 1 || value > 9)
        {
            System.out.println("Invalid input please input the valid digit");
        }
        return board;
    }
}
