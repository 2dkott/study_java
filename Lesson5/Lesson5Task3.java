import java.util.*;

public class Lesson5Task3 {

    public static void main(String[] args) {
        ChessGame chessGame = new ChessGame();
        chessGame.generateQueens();
    }
}

class ChessGame {
    String [][] board = new String[8][8];
    String EMPTY_FIELD = "|_|";
    String QUEEN_FIELD = "|Q|";

    public ChessGame() {
        for(int i = 0; i<8; i++) {
            for (int j = 0; j<8; j++) {
                board[i][j] = EMPTY_FIELD;
            }
        }
    }

    public void printBoard(String [][] board) {
        String stringBoard = Arrays.deepToString(board)
                .replace("], ", "\n")
                .replace("[", "").replace("]]", "")
                .replace(", ", "");
        System.out.println(stringBoard);
    }

    public void generateQueens() {
        for(int i = 0; i<8; i++){
            for (int j = 0; j<8; j++){
                if(board[i][j].equals(EMPTY_FIELD)) {
                    board[i][j] = QUEEN_FIELD;
                    Queen queen = new Queen(i,j);
                    queen.markStrikeFields(board);
                    printBoard(board);
                    System.out.println("");
                };
            }
        }
    }
}

class Queen{
    private int x;
    private int y;

    String EMPTY_FIELD = "|_|";
    String STRIKE_FIELD = "|*|";

    public Queen(int y, int x) {
        this.x = x;
        this.y = y;
    }

    public void markStrikeFields(String [][] board) {
        markVertical(board);
        markHorizontal(board);
        markDiagonal(board, 1);
        markDiagonal(board, -1);
    }

    private void markHorizontal(String [][] board) {
        for (int i = 0; i<8; i++){
            if(board[y][i].equals(EMPTY_FIELD)) {
                board[y][i] = STRIKE_FIELD;
            };
        }
    }

    private void markVertical(String [][] board) {
        for (int i = 0; i<8; i++){
            if(board[i][x].equals(EMPTY_FIELD)) {
                board[i][x] = STRIKE_FIELD;
            };
        }
    }

    private void markDiagonal(String [][] board, int xDirection) {
        int tempX = x+xDirection;
        for (int i = y+1; i<8; i++) {
            if(tempX > 7 || tempX < 0) return;
            if (board[i][tempX].equals(EMPTY_FIELD)) {
                    board[i][tempX] = STRIKE_FIELD;
            }
            tempX = tempX+xDirection;
        }
    }
}



