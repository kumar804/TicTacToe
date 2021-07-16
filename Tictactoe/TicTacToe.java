package Tictactoe;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome To TicTacToe");
        char[] board = createBoard();
    }
    public static char[] createBoard(){
        char[] board = new char[10];
        for(int i = 1; i < board.length; i++)
        {
            board[i] = ' ';
        }
        return board;
    }
}
