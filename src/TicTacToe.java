public class TicTacToe {
    public static void gameBoard() {s
        char[] gBoard = new char[10];
        for (int i = 1; i < gBoard.length; i++) {
            gBoard[i] = ' ';
        }
    }

    public static void main(String[] args) {
        System.out.println("**Game***");
         gameBoard();
    }
}

