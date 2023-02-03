import java.util.*;


public class TicTacToe {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the Tic-Tac-Toe game! To play, enter the row and column number of the space you want to place your X or O in."+"\n");
        playGame();
    }
    
    private static void showBoard(String[][] board) {
        System.out.println(board[0][0] + " " + board[0][1] + " " + board[0][2]);
        System.out.println(board[1][0] + " " + board[1][1] + " " + board[1][2]);
        System.out.println(board[2][0] + " " + board[2][1] + " " + board[2][2]);
    }

    private static boolean checkForWin(String[][] board) {
        boolean completed = false;
        // check for horizontal win
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && (board[i][0] != "-")) {
                System.out.println(board[i][0] + " WINS!!");
                completed = true;
            }
        }

        // check for vertical win
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && (board[0][i] != "-")) {
                System.out.println(board[0][i] + " WINS!!");
                completed = true;
            }
        }

        // check for diagonal win
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && (board[0][0] != "-")) {
            System.out.println(board[0][0] + " WINS!!");
            completed = true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && (board[0][2] != "-")) {
            System.out.println(board[0][2] + " WINS!!");
            completed = true;
        }

        // check for draw
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int i2 = 0; i2 < board[i].length; i2++) {
                if (board[i][i2] != "-") {
                    count++;
                }
            }
        }
        if (count == 9) {
            System.out.println("DRAW!");
            completed = true;
        }
        return completed;
    }

    private static void playGame() {
        String[][] board = new String[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int i2 = 0; i2 < board[i].length; i2++) {
                board[i][i2] = "-";
            }
        }
        showBoard(board);
        String turn = "X";
        while (true) {
            System.out.println(turn + "'s turn");
            System.out.print("Row #: ");
            int row = input.nextInt()-1;
            System.out.print("Column #: ");
            int column = input.nextInt()-1;
            if (board[row][column] == "-") {
                board[row][column] = turn;
                showBoard(board);
                if (turn == "X") {
                    turn = "O";
                } else {
                    turn = "X";
                }
            } else {
                System.out.println("Location already used!");
            }
            boolean completed = checkForWin(board);
            if (completed) {
                break;
            }
        }
        System.out.println("Play again? (y/n)");
        String answer = input.next();
        if (answer.equals("y")) {
            playGame();
        } else {
            System.out.println("Thanks for playing!");
        }
    }

}